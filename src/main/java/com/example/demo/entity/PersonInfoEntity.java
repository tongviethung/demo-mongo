package com.example.demo.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@SuperBuilder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "person_info")
public class PersonInfoEntity extends BaseEntity {

    @Column(name = "name")
    String name;

    @Column(name = "gender")
    int gender;

    @Column(name = "date_of_birth")
    String dateOfBirth;

    @Column(name = "nationality")
    String nationality;

    @Column(name = "position")
    String position;

    @Column(name = "type_of_paper")
    int typeOfPaper;

    @Column(name = "identity_card")
    String identityCard;

    @Column(name = "issue_date")
    Date issueDate;

    @Column(name = "issue_at")
    String issueAt;

    @Column(name = "address")
    String address;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "fax")
    String fax;

    @Column(name = "email")
    String email;

    @Column(name = "status")
    int status;

}
