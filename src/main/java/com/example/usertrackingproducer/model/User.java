package com.example.usertrackingproducer.model;

import com.example.usertrackingproducer.enums.UserId;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class User {
    private UserId userId;
    private String username;
    private Date dateOfBirth;

}
