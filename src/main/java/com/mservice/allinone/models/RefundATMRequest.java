package com.mservice.allinone.models;

import lombok.Builder;

public class RefundATMRequest extends PayGateRequest {

    private String transId;
    private String bankCode;

    @Builder
    public RefundATMRequest(String partnerCode, String orderId, String orderInfo, String accessKey, String amount, String signature, String extraData, String requestId, String notifyUrl, String returnUrl, String requestType, String transId, String bankCode) {
        super(partnerCode, orderId, orderInfo, accessKey, amount, signature, extraData, requestId, notifyUrl, returnUrl, requestType);
        this.transId = transId;
        this.bankCode = bankCode;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

}
