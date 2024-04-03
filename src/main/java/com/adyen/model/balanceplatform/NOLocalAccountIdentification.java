/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * NOLocalAccountIdentification
 */
@JsonPropertyOrder({
  NOLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  NOLocalAccountIdentification.JSON_PROPERTY_FORM_FACTOR,
  NOLocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class NOLocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_FORM_FACTOR = "formFactor";
  private String formFactor = "physical";

  /**
   * **noLocal**
   */
  public enum TypeEnum {
    NOLOCAL("noLocal");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = TypeEnum.NOLOCAL;

  public NOLocalAccountIdentification() { 
  }

  public NOLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The 11-digit bank account number, without separators or whitespace.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The 11-digit bank account number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


 /**
  * The 11-digit bank account number, without separators or whitespace.
  *
  * @param accountNumber
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public NOLocalAccountIdentification formFactor(String formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * The form factor of the account.  Possible values: **physical**, **virtual**. Default value: **physical**.
   * @return formFactor
  **/
  @ApiModelProperty(value = "The form factor of the account.  Possible values: **physical**, **virtual**. Default value: **physical**.")
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormFactor() {
    return formFactor;
  }


 /**
  * The form factor of the account.  Possible values: **physical**, **virtual**. Default value: **physical**.
  *
  * @param formFactor
  */ 
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFactor(String formFactor) {
    this.formFactor = formFactor;
  }


  public NOLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **noLocal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**noLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **noLocal**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this NOLocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NOLocalAccountIdentification noLocalAccountIdentification = (NOLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, noLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.formFactor, noLocalAccountIdentification.formFactor) &&
        Objects.equals(this.type, noLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, formFactor, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NOLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of NOLocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NOLocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to NOLocalAccountIdentification
   */
  public static NOLocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NOLocalAccountIdentification.class);
  }
/**
  * Convert an instance of NOLocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

