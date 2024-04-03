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
import com.adyen.model.balanceplatform.NetworkToken;
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
 * GetNetworkTokenResponse
 */
@JsonPropertyOrder({
  GetNetworkTokenResponse.JSON_PROPERTY_TOKEN
})

public class GetNetworkTokenResponse {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private NetworkToken token;

  public GetNetworkTokenResponse() { 
  }

  public GetNetworkTokenResponse token(NetworkToken token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkToken getToken() {
    return token;
  }


 /**
  * token
  *
  * @param token
  */ 
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(NetworkToken token) {
    this.token = token;
  }


  /**
   * Return true if this GetNetworkTokenResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNetworkTokenResponse getNetworkTokenResponse = (GetNetworkTokenResponse) o;
    return Objects.equals(this.token, getNetworkTokenResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNetworkTokenResponse {\n");
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
   * Create an instance of GetNetworkTokenResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetNetworkTokenResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetNetworkTokenResponse
   */
  public static GetNetworkTokenResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetNetworkTokenResponse.class);
  }
/**
  * Convert an instance of GetNetworkTokenResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

