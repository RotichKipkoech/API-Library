/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.Address;
import com.adyen.model.configurationwebhooks.Name;
import com.adyen.model.configurationwebhooks.PersonalData;
import com.adyen.model.configurationwebhooks.PhoneNumber;
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
 * Contact
 */
@JsonPropertyOrder({
  Contact.JSON_PROPERTY_ADDRESS,
  Contact.JSON_PROPERTY_EMAIL,
  Contact.JSON_PROPERTY_FULL_PHONE_NUMBER,
  Contact.JSON_PROPERTY_NAME,
  Contact.JSON_PROPERTY_PERSONAL_DATA,
  Contact.JSON_PROPERTY_PHONE_NUMBER,
  Contact.JSON_PROPERTY_WEB_ADDRESS
})

public class Contact {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FULL_PHONE_NUMBER = "fullPhoneNumber";
  private String fullPhoneNumber;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name name;

  public static final String JSON_PROPERTY_PERSONAL_DATA = "personalData";
  private PersonalData personalData;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private PhoneNumber phoneNumber;

  public static final String JSON_PROPERTY_WEB_ADDRESS = "webAddress";
  private String webAddress;

  public Contact() { 
  }

  public Contact address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


 /**
  * address
  *
  * @param address
  */ 
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public Contact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The e-mail address of the contact.
   * @return email
  **/
  @ApiModelProperty(value = "The e-mail address of the contact.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


 /**
  * The e-mail address of the contact.
  *
  * @param email
  */ 
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Contact fullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
    return this;
  }

   /**
   * The phone number of the contact provided as a single string.  It will be handled as a landline phone. **Examples:** \&quot;0031 6 11 22 33 44\&quot;, \&quot;+316/1122-3344\&quot;, \&quot;(0031) 611223344\&quot;
   * @return fullPhoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the contact provided as a single string.  It will be handled as a landline phone. **Examples:** \"0031 6 11 22 33 44\", \"+316/1122-3344\", \"(0031) 611223344\"")
  @JsonProperty(JSON_PROPERTY_FULL_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullPhoneNumber() {
    return fullPhoneNumber;
  }


 /**
  * The phone number of the contact provided as a single string.  It will be handled as a landline phone. **Examples:** \&quot;0031 6 11 22 33 44\&quot;, \&quot;+316/1122-3344\&quot;, \&quot;(0031) 611223344\&quot;
  *
  * @param fullPhoneNumber
  */ 
  @JsonProperty(JSON_PROPERTY_FULL_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
  }


  public Contact name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Name getName() {
    return name;
  }


 /**
  * name
  *
  * @param name
  */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name name) {
    this.name = name;
  }


  public Contact personalData(PersonalData personalData) {
    this.personalData = personalData;
    return this;
  }

   /**
   * Get personalData
   * @return personalData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PersonalData getPersonalData() {
    return personalData;
  }


 /**
  * personalData
  *
  * @param personalData
  */ 
  @JsonProperty(JSON_PROPERTY_PERSONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonalData(PersonalData personalData) {
    this.personalData = personalData;
  }


  public Contact phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }


 /**
  * phoneNumber
  *
  * @param phoneNumber
  */ 
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public Contact webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

   /**
   * The URL of the website of the contact.
   * @return webAddress
  **/
  @ApiModelProperty(value = "The URL of the website of the contact.")
  @JsonProperty(JSON_PROPERTY_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebAddress() {
    return webAddress;
  }


 /**
  * The URL of the website of the contact.
  *
  * @param webAddress
  */ 
  @JsonProperty(JSON_PROPERTY_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }


  /**
   * Return true if this Contact object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.address, contact.address) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.fullPhoneNumber, contact.fullPhoneNumber) &&
        Objects.equals(this.name, contact.name) &&
        Objects.equals(this.personalData, contact.personalData) &&
        Objects.equals(this.phoneNumber, contact.phoneNumber) &&
        Objects.equals(this.webAddress, contact.webAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, fullPhoneNumber, name, personalData, phoneNumber, webAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullPhoneNumber: ").append(toIndentedString(fullPhoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    personalData: ").append(toIndentedString(personalData)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
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
   * Create an instance of Contact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Contact
   * @throws JsonProcessingException if the JSON string is invalid with respect to Contact
   */
  public static Contact fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Contact.class);
  }
/**
  * Convert an instance of Contact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

