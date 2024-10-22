package org.ilya.spring_dz.DTO;

public class Response {
    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private String balance;
    private String maxLimit;

    public Response() {
    }

    public Response(String rqUID, String clientId, String account, String currency, String balance, String maxLimit) {
        this.rqUID = rqUID;
        this.clientId = clientId;
        this.account = account;
        this.currency = currency;
        this.balance = balance;
        this.maxLimit = maxLimit;
    }

    public String getRqUID() {
        return rqUID;
    }

    public void setRqUID(String rqUID) {
        this.rqUID = rqUID;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(String maxLimit) {
        this.maxLimit = maxLimit;
    }

    @Override
    public String toString() {
        return "Response{" +
                "rqUID='" + rqUID + '\'' +
                ", clientId='" + clientId + '\'' +
                ", accountId='" + account + '\'' +
                ", currency='" + currency + '\'' +
                ", balance='" + balance + '\'' +
                ", maxLimit='" + maxLimit + '\'' +
                '}';
    }
}
