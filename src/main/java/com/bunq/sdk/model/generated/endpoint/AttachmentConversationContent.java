package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Fetch the raw content of an attachment with given ID. The raw content is the base64 of a
 * file, without any JSON wrapping.
 */
public class AttachmentConversationContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation/%s/attachment/%s/content";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "AttachmentConversationContent";

  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId, Integer chatConversationId, Integer attachmentId) {
    return list(apiContext, userId, chatConversationId, attachmentId, new HashMap<>());
  }

  /**
   * Get the raw content of a specific attachment.
   */
  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId, Integer chatConversationId, Integer attachmentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, chatConversationId, attachmentId), new HashMap<>(), customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

}