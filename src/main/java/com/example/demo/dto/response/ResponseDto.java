package com.example.demo.dto.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class ResponseDto.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDto implements Serializable {

  private static final long serialVersionUID = -7722151281558476839L;

  private Meta metaM;
  
  private Object dataM;

  public ResponseDto() {}
  
  public ResponseDto(String requestId, int code, String message, Object data) {
    this.metaM = new Meta(requestId, code, message);
    this.dataM = data;
  }

  public ResponseDto(String requestId) {
    metaM = new Meta(requestId);
    metaM.setCode(200000);
  }

  public Meta getMeta() {
    return metaM;
  }

  public void setMeta(Meta meta) {
    this.metaM = meta;
  }

  public Object getData() {
    return dataM;
  }

  public void setData(Object data) {
    this.dataM = data;
  }

}
