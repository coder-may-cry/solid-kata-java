package com.codermaycry.dip;

import java.time.MonthDay;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final Clock clock;
    private final EmailSender emailSender;

    public BirthdayGreeter(EmployeeRepository employeeRepository, Clock clock, EmailSender emailSender) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.emailSender = emailSender;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        employeeRepository.findEmployeesBornOn(today)
                .stream()
                .map(this::buildEmailForEmployee)
                .forEach(emailSender::send);
    }

    private Email buildEmailForEmployee(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.firstName());
        return new Email(employee.email(), "Happy birthday!", message);
    }

}