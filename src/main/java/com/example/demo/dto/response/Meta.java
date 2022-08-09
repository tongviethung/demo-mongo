package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Meta {

  @JsonProperty("request_id")
  private String requestId;

  @JsonProperty("code")
  private int code;

  @JsonProperty("message")
  private String message;
  
  public Meta() {}

  public Meta(String requestId) {
    this.requestId = requestId;
  }

  public Meta(String requestId, int code, String message) {
    this.requestId = requestId;
    this.code = code;
    this.message = message;
  }

}
