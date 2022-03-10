package com.redhat.cloud.notifications.recipients.itservice.pojo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountRelationship {

    public List<String> allOf;
    public AccountRelationshipBy by;
}