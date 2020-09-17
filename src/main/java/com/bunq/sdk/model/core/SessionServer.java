package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.UserApiKey;
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProvider;
import com.bunq.sdk.model.generated.endpoint.UserPerson;
import com.bunq.sdk.util.BunqUtil;

import java.util.HashMap;

public class SessionServer extends BunqModel {
    /**
     * Endpoint name.
     */
    private static final String ENDPOINT_URL_POST = "session-server";

    /**
     * Field constants.
     */
    private static final String FIELD_SECRET = "secret";

    private final Id id;
    private final SessionToken sessionToken;
    private UserCompany userCompany;
    private UserPerson userPerson;
    private UserApiKey userApiKey;
    private UserPaymentServiceProvider userPaymentServiceProvider;

    public SessionServer(Id id, SessionToken sessionToken, UserCompany userCompany) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userCompany = userCompany;
    }

    public SessionServer(Id id, SessionToken sessionToken, UserPerson userPerson) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userPerson = userPerson;
    }

    public SessionServer(Id id, SessionToken sessionToken, UserPaymentServiceProvider userPaymentServiceProvider) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userPaymentServiceProvider = userPaymentServiceProvider;
    }

    public SessionServer(Id id, SessionToken sessionToken, UserApiKey userApiKey) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userApiKey = userApiKey;
    }

    /**
     * Create a new session for a DeviceServer. Provide the Installation token
     * in the "X-Bunq-Client-Authentication" header. And don't forget to create
     * the "X-Bunq-Client-Signature" header. The response contains a Session
     * token that should be used for as the "X-Bunq-Client-Authentication" header
     * for all future API calls. The ip address making this call needs to match
     * the ip address bound to your API key.
     */
    public static BunqResponse<SessionServer> create(ApiContext apiContext) {
        ApiClient apiClient = new ApiClient(apiContext);
        byte[] requestBytes = generateRequestBodyBytes(apiContext.getApiKey());
        BunqResponseRaw responseRaw = apiClient.post(
                ENDPOINT_URL_POST,
                requestBytes,
                new HashMap<String, String>()
        );

        return fromJsonArrayNested(SessionServer.class, responseRaw);
    }

    private static byte[] generateRequestBodyBytes(String apiKey) {
        HashMap<String, Object> sessionServerRequestBody = new HashMap<>();
        sessionServerRequestBody.put(FIELD_SECRET, apiKey);

        return gson.toJson(sessionServerRequestBody).getBytes();
    }

    public Id getId() {
        return id;
    }

    public SessionToken getSessionToken() {
        return sessionToken;
    }

    public UserPerson getUserPersonOrNull() {
        return userPerson;
    }

    public UserCompany getUserCompanyOrNull() {
        return userCompany;
    }

    public UserApiKey getUserApiKeyOrNull() {
        return userApiKey;
    }

    public UserPaymentServiceProvider getUserPaymentServiceProviderOrNull() {
        return userPaymentServiceProvider;
    }

    @Override
    public boolean isAllFieldNull() {
        if (this.id == null) {
            return false;
        }

        if (this.sessionToken != null) {
            return false;
        }

        if (this.userCompany != null) {
            return false;
        }

        if (this.userPerson != null) {
            return false;
        }

        return this.userApiKey == null;
    }

    public BunqModel getReferencedUser() {
        return BunqUtil.getReferencedUser(userPerson, userCompany, userApiKey, userPaymentServiceProvider);
    }
}
