package com.bunq.sdk.model.generated.object;

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

/**
 */
public class TranslinkTransactionEntry extends BunqModel {

  /**
   * The id of the payment entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The amount of the payment.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * payment.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the payment.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The description for the payment. Maximum 140 characters for payments to external IBANs, 9000
   * characters for payments to only other bunq MonetaryAccounts.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * Optional data to be included with the Payment specific to the merchant.
   */
  @Expose
  @SerializedName("merchant_reference")
  private String merchantReference;

  /**
   * The type of the payment entry.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The Attachments attached to the payment.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentMonetaryAccountPayment> attachment;

  /**
   * The amount of the payment.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * The Alias of the party we are transferring the money to. Can be an Alias of type EMAIL or
   * PHONE_NUMBER (for bunq MonetaryAccounts or bunq.to payments) or IBAN (for external bank
   * account).
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The description for the payment. Maximum 140 characters for payments to external IBANs, 9000
   * characters for payments to only other bunq MonetaryAccounts. Field is required but can be an
   * empty string.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * Optional data to be included with the Payment specific to the merchant.
   */
  @Expose
  @SerializedName("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /**
   * The Attachments to attach to the payment.
   */
  @Expose
  @SerializedName("attachment_field_for_request")
  private List<AttachmentMonetaryAccountPayment> attachmentFieldForRequest;

  public TranslinkTransactionEntry() {
  this(null, null, null, null, null);
  }

  public TranslinkTransactionEntry(Amount amount) {
  this(amount, null, null, null, null);
  }

  public TranslinkTransactionEntry(Amount amount, Pointer counterpartyAlias) {
  this(amount, counterpartyAlias, null, null, null);
  }

  public TranslinkTransactionEntry(Amount amount, Pointer counterpartyAlias, String description) {
  this(amount, counterpartyAlias, description, null, null);
  }

  public TranslinkTransactionEntry(Amount amount, Pointer counterpartyAlias, String description, String merchantReference) {
  this(amount, counterpartyAlias, description, merchantReference, null);
  }

  public TranslinkTransactionEntry(Amount amount, Pointer counterpartyAlias, String description, String merchantReference, List<AttachmentMonetaryAccountPayment> attachment) {
    this.amountFieldForRequest = amount;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.descriptionFieldForRequest = description;
    this.merchantReferenceFieldForRequest = merchantReference;
    this.attachmentFieldForRequest = attachment;
  }

  /**
   * The id of the payment entry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The amount of the payment.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * payment.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the payment.
   */
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description for the payment. Maximum 140 characters for payments to external IBANs, 9000
   * characters for payments to only other bunq MonetaryAccounts.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Optional data to be included with the Payment specific to the merchant.
   */
  public String getMerchantReference() {
    return this.merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  /**
   * The type of the payment entry.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The Attachments attached to the payment.
   */
  public List<AttachmentMonetaryAccountPayment> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMonetaryAccountPayment> attachment) {
    this.attachment = attachment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.merchantReference != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TranslinkTransactionEntry fromJsonReader(JsonReader reader) {
    return fromJsonReader(TranslinkTransactionEntry.class, reader);
  }

}
