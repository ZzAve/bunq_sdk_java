package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Manage the chat connected to a request inquiry. In the same way a request inquiry and a
 * request response are created together, so that each side of the interaction can work on a
 * different object, also a request inquiry chat and a request response chat are created at the
 * same time. See 'request-response-chat' for the chat endpoint for the responding user.
 */
public class RequestInquiryChat extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry/%s/chat";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry/%s/chat/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry/%s/chat";

  /**
   * Field constants.
   */
  public static final String FIELD_LAST_READ_MESSAGE_ID = "last_read_message_id";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE_GET = "RequestInquiryChat";

  /**
   * The id of the newly created chat conversation.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the chat was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the chat was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The total number of messages in this conversation.
   */
  @Expose
  @SerializedName("unread_message_count")
  private Integer unreadMessageCount;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer requestInquiryId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, requestInquiryId, new HashMap<>());
  }

  /**
   * Create a chat for a specific request inquiry.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer requestInquiryId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId, requestInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer requestInquiryId, Integer requestInquiryChatId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, requestInquiryId, requestInquiryChatId, new HashMap<>());
  }

  /**
   * Update the last read message in the chat of a specific request inquiry.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer requestInquiryId, Integer requestInquiryChatId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, requestInquiryId, requestInquiryChatId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<List<RequestInquiryChat>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer requestInquiryId) {
    return list(apiContext, userId, monetaryAccountId, requestInquiryId, new HashMap<>());
  }

  public static BunqResponse<List<RequestInquiryChat>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer requestInquiryId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, requestInquiryId, params, new HashMap<>());
  }

  /**
   * Get the chat for a specific request inquiry.
   */
  public static BunqResponse<List<RequestInquiryChat>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer requestInquiryId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, requestInquiryId), params, customHeaders);

    return fromJsonList(RequestInquiryChat.class, responseRaw, OBJECT_TYPE_GET);
  }

  /**
   * The id of the newly created chat conversation.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the chat was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the chat was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The total number of messages in this conversation.
   */
  public Integer getUnreadMessageCount() {
    return this.unreadMessageCount;
  }

  public void setUnreadMessageCount(Integer unreadMessageCount) {
    this.unreadMessageCount = unreadMessageCount;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.unreadMessageCount != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RequestInquiryChat fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestInquiryChat.class, reader);
  }

}
