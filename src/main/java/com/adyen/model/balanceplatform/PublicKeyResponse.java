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
 * PublicKeyResponse
 */
@JsonPropertyOrder({
  PublicKeyResponse.JSON_PROPERTY_PUBLIC_KEY,
  PublicKeyResponse.JSON_PROPERTY_PUBLIC_KEY_EXPIRY_DATE
})

public class PublicKeyResponse {
  public static final String JSON_PROPERTY_PUBLIC_KEY = "publicKey";
  private String publicKey;

  public static final String JSON_PROPERTY_PUBLIC_KEY_EXPIRY_DATE = "publicKeyExpiryDate";
  private String publicKeyExpiryDate;

  public PublicKeyResponse() { 
  }

  public PublicKeyResponse publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * The public key you need for encrypting a symmetric session key.
   * @return publicKey
  **/
  @ApiModelProperty(required = true, value = "The public key you need for encrypting a symmetric session key.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicKey() {
    return publicKey;
  }


 /**
  * The public key you need for encrypting a symmetric session key.
  *
  * @param publicKey
  */ 
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public PublicKeyResponse publicKeyExpiryDate(String publicKeyExpiryDate) {
    this.publicKeyExpiryDate = publicKeyExpiryDate;
    return this;
  }

   /**
   * The expiry date of the public key.
   * @return publicKeyExpiryDate
  **/
  @ApiModelProperty(required = true, value = "The expiry date of the public key.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicKeyExpiryDate() {
    return publicKeyExpiryDate;
  }


 /**
  * The expiry date of the public key.
  *
  * @param publicKeyExpiryDate
  */ 
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKeyExpiryDate(String publicKeyExpiryDate) {
    this.publicKeyExpiryDate = publicKeyExpiryDate;
  }


  /**
   * Return true if this PublicKeyResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKeyResponse publicKeyResponse = (PublicKeyResponse) o;
    return Objects.equals(this.publicKey, publicKeyResponse.publicKey) &&
        Objects.equals(this.publicKeyExpiryDate, publicKeyResponse.publicKeyExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKey, publicKeyExpiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKeyResponse {\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    publicKeyExpiryDate: ").append(toIndentedString(publicKeyExpiryDate)).append("\n");
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
   * Create an instance of PublicKeyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PublicKeyResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to PublicKeyResponse
   */
  public static PublicKeyResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PublicKeyResponse.class);
  }
/**
  * Convert an instance of PublicKeyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

