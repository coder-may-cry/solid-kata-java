package com.codermaycry.dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@DisplayName("Birthday Greeter")
class BirthdayGreeterTest {
    private static final int CURRENT_MONTH = 7;
    private static final int CURRENT_DAY_OF_MONTH = 9;
    private static final MonthDay TODAY = MonthDay.of(CURRENT_MONTH, CURRENT_DAY_OF_MONTH);
    private final ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private Clock clock;
    private final EmailSender emailSender = new EmailSender("smtp.somesever.com");

    @Test
    @DisplayName("should send greeting email to employee")
    void should_send_greeting_email_to_employee() {
        System.setOut(new PrintStream(consoleContent));
        given(clock.monthDay()).willReturn(TODAY);
        String recipientEmail = "john.doe@foobar.com";
        Employee employee = new Employee("John", "Doe", LocalDate.of(1980, 9, 10), recipientEmail);
        given(employeeRepository.findEmployeesBornOn(MonthDay.of(CURRENT_MONTH, CURRENT_DAY_OF_MONTH))).willReturn(Collections.singletonList(employee));
        var birthdayGreeter = new BirthdayGreeter(employeeRepository, clock, emailSender);

        birthdayGreeter.sendGreetings();

        String actual = consoleContent.toString();
        assertThat(actual)
            .isEqualTo(
                String.format("To: %s, Subject: Happy birthday!, Message: Happy birthday, dear %s! Using SMTP Server smtp.somesever.com", recipientEmail, employee.firstName())
            );
    }
}