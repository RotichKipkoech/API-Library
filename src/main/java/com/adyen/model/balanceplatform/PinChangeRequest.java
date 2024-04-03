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
 * PinChangeRequest
 */
@JsonPropertyOrder({
  PinChangeRequest.JSON_PROPERTY_ENCRYPTED_KEY,
  PinChangeRequest.JSON_PROPERTY_ENCRYPTED_PIN_BLOCK,
  PinChangeRequest.JSON_PROPERTY_PAYMENT_INSTRUMENT_ID,
  PinChangeRequest.JSON_PROPERTY_TOKEN
})

public class PinChangeRequest {
  public static final String JSON_PROPERTY_ENCRYPTED_KEY = "encryptedKey";
  private String encryptedKey;

  public static final String JSON_PROPERTY_ENCRYPTED_PIN_BLOCK = "encryptedPinBlock";
  private String encryptedPinBlock;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  private String paymentInstrumentId;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public PinChangeRequest() { 
  }

  public PinChangeRequest encryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
    return this;
  }

   /**
   * The symmetric session key that you encrypted with the [public key](https://docs.adyen.com/api-explorer/balanceplatform/2/get/publicKey) that you received from Adyen.
   * @return encryptedKey
  **/
  @ApiModelProperty(required = true, value = "The symmetric session key that you encrypted with the [public key](https://docs.adyen.com/api-explorer/balanceplatform/2/get/publicKey) that you received from Adyen.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedKey() {
    return encryptedKey;
  }


 /**
  * The symmetric session key that you encrypted with the [public key](https://docs.adyen.com/api-explorer/balanceplatform/2/get/publicKey) that you received from Adyen.
  *
  * @param encryptedKey
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
  }


  public PinChangeRequest encryptedPinBlock(String encryptedPinBlock) {
    this.encryptedPinBlock = encryptedPinBlock;
    return this;
  }

   /**
   * The encrypted [PIN block](https://www.pcisecuritystandards.org/glossary/pin-block).
   * @return encryptedPinBlock
  **/
  @ApiModelProperty(required = true, value = "The encrypted [PIN block](https://www.pcisecuritystandards.org/glossary/pin-block).")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_PIN_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedPinBlock() {
    return encryptedPinBlock;
  }


 /**
  * The encrypted [PIN block](https://www.pcisecuritystandards.org/glossary/pin-block).
  *
  * @param encryptedPinBlock
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_PIN_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedPinBlock(String encryptedPinBlock) {
    this.encryptedPinBlock = encryptedPinBlock;
  }


  public PinChangeRequest paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the payment instrument, which is the card for which you are managing the PIN.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the payment instrument, which is the card for which you are managing the PIN.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


 /**
  * The unique identifier of the payment instrument, which is the card for which you are managing the PIN.
  *
  * @param paymentInstrumentId
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public PinChangeRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The 16-digit token that you used to generate the &#x60;encryptedPinBlock&#x60;.
   * @return token
  **/
  @ApiModelProperty(required = true, value = "The 16-digit token that you used to generate the `encryptedPinBlock`.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


 /**
  * The 16-digit token that you used to generate the &#x60;encryptedPinBlock&#x60;.
  *
  * @param token
  */ 
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  /**
   * Return true if this PinChangeRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinChangeRequest pinChangeRequest = (PinChangeRequest) o;
    return Objects.equals(this.encryptedKey, pinChangeRequest.encryptedKey) &&
        Objects.equals(this.encryptedPinBlock, pinChangeRequest.encryptedPinBlock) &&
        Objects.equals(this.paymentInstrumentId, pinChangeRequest.paymentInstrumentId) &&
        Objects.equals(this.token, pinChangeRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedKey, encryptedPinBlock, paymentInstrumentId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinChangeRequest {\n");
    sb.append("    encryptedKey: ").append(toIndentedString(encryptedKey)).append("\n");
    sb.append("    encryptedPinBlock: ").append(toIndentedString(encryptedPinBlock)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
   * Create an instance of PinChangeRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PinChangeRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PinChangeRequest
   */
  public static PinChangeRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PinChangeRequest.class);
  }
/**
  * Convert an instance of PinChangeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

