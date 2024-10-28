package com.codermaycry.dip;

import java.time.MonthDay;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final Clock clock;
    private static final String SMTP_SERVER = "smtp.somesever.com";

    public BirthdayGreeter(EmployeeRepository employeeRepository, Clock clock) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        employeeRepository.findEmployeesBornOn(today)
                .stream()
                .map(this::buildEmailForEmployee)
                .forEach(email -> new EmailSender(SMTP_SERVER).send(email));
    }

    private Email buildEmailForEmployee(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.firstName());
        return new Email(employee.email(), "Happy birthday!", message);
    }

}