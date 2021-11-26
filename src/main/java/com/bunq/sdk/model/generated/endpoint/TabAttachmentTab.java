package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Attachment;
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
 * This call is used to view an attachment that is linked to a tab.
 */
public class TabAttachmentTab extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "tab/%s/attachment/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TabAttachmentTab";

  /**
   * The id of the attachment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the attachment's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the attachment's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The attachment.
   */
  @Expose
  @SerializedName("attachment")
  private Attachment attachment;

  /**
   * Get a specific attachment. The header of the response contains the content-type of the
   * attachment.
   */
  public static BunqResponse<TabAttachmentTab> get(String tabUuid, Integer tabAttachmentTabId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, tabUuid, tabAttachmentTabId), params, customHeaders);

    return fromJson(TabAttachmentTab.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<TabAttachmentTab> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<TabAttachmentTab> get(String tabUuid) {
    return get(tabUuid, null, null, null);
  }

  public static BunqResponse<TabAttachmentTab> get(String tabUuid, Integer tabAttachmentTabId) {
    return get(tabUuid, tabAttachmentTabId, null, null);
  }

  public static BunqResponse<TabAttachmentTab> get(String tabUuid, Integer tabAttachmentTabId, Map<String, String> params) {
    return get(tabUuid, tabAttachmentTabId, params, null);
  }

  /**
   * The id of the attachment.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the attachment's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the attachment's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The attachment.
   */
  public Attachment getAttachment() {
    return this.attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
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

    if (this.attachment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TabAttachmentTab fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabAttachmentTab.class, reader);
  }

}
