package org.printassist.jobsender.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Job {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
}
