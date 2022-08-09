package com.example.demo.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonResponse implements Serializable {

    String name;

    int gender;

    String dateOfBirth;

    String nationality;

    String position;

    int typeOfPaper;

    String identityCard;

    Date issueDate;

    String issueAt;

    String address;

    String phoneNumber;

    String fax;

    String email;
}
