/*
 * Adyen Recurring API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.RecurringDetailWrapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * RecurringDetailsResult
 */
@JsonPropertyOrder({
  RecurringDetailsResult.JSON_PROPERTY_CREATION_DATE,
  RecurringDetailsResult.JSON_PROPERTY_DETAILS,
  RecurringDetailsResult.JSON_PROPERTY_LAST_KNOWN_SHOPPER_EMAIL,
  RecurringDetailsResult.JSON_PROPERTY_SHOPPER_REFERENCE
})

public class RecurringDetailsResult {
  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<RecurringDetailWrapper> details = null;

  public static final String JSON_PROPERTY_LAST_KNOWN_SHOPPER_EMAIL = "lastKnownShopperEmail";
  private String lastKnownShopperEmail;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public RecurringDetailsResult() { 
  }

  public RecurringDetailsResult creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date when the recurring details were created.
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date when the recurring details were created.")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


 /**
  * The date when the recurring details were created.
  *
  * @param creationDate
  */ 
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public RecurringDetailsResult details(List<RecurringDetailWrapper> details) {
    this.details = details;
    return this;
  }

  public RecurringDetailsResult addDetailsItem(RecurringDetailWrapper detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Payment details stored for recurring payments.
   * @return details
  **/
  @ApiModelProperty(value = "Payment details stored for recurring payments.")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecurringDetailWrapper> getDetails() {
    return details;
  }


 /**
  * Payment details stored for recurring payments.
  *
  * @param details
  */ 
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(List<RecurringDetailWrapper> details) {
    this.details = details;
  }


  public RecurringDetailsResult lastKnownShopperEmail(String lastKnownShopperEmail) {
    this.lastKnownShopperEmail = lastKnownShopperEmail;
    return this;
  }

   /**
   * The most recent email for this shopper (if available).
   * @return lastKnownShopperEmail
  **/
  @ApiModelProperty(value = "The most recent email for this shopper (if available).")
  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastKnownShopperEmail() {
    return lastKnownShopperEmail;
  }


 /**
  * The most recent email for this shopper (if available).
  *
  * @param lastKnownShopperEmail
  */ 
  @JsonProperty(JSON_PROPERTY_LAST_KNOWN_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastKnownShopperEmail(String lastKnownShopperEmail) {
    this.lastKnownShopperEmail = lastKnownShopperEmail;
  }


  public RecurringDetailsResult shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The reference you use to uniquely identify the shopper (e.g. user ID or account ID).
   * @return shopperReference
  **/
  @ApiModelProperty(value = "The reference you use to uniquely identify the shopper (e.g. user ID or account ID).")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperReference() {
    return shopperReference;
  }


 /**
  * The reference you use to uniquely identify the shopper (e.g. user ID or account ID).
  *
  * @param shopperReference
  */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  /**
   * Return true if this RecurringDetailsResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDetailsResult recurringDetailsResult = (RecurringDetailsResult) o;
    return Objects.equals(this.creationDate, recurringDetailsResult.creationDate) &&
        Objects.equals(this.details, recurringDetailsResult.details) &&
        Objects.equals(this.lastKnownShopperEmail, recurringDetailsResult.lastKnownShopperEmail) &&
        Objects.equals(this.shopperReference, recurringDetailsResult.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, details, lastKnownShopperEmail, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetailsResult {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    lastKnownShopperEmail: ").append(toIndentedString(lastKnownShopperEmail)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
   * Create an instance of RecurringDetailsResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RecurringDetailsResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to RecurringDetailsResult
   */
  public static RecurringDetailsResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RecurringDetailsResult.class);
  }
/**
  * Convert an instance of RecurringDetailsResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

