package org.ilya.spring_dz.DTO;

public class Request {
    private String rqUID;
    private String clientId;
    private String account;
    private String openDate;
    private String closeDate;

    public Request() {
    }

    public Request(String rqUId, String clientId, String account, String openDate, String closeDate) {
        this.rqUID = rqUId;
        this.clientId = clientId;
        this.account = account;
        this.openDate = openDate;
        this.closeDate = closeDate;
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

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "rqUId='" + rqUID + '\'' +
                ", clientId='" + clientId + '\'' +
                ", accountId='" + account + '\'' +
                ", openDate='" + openDate + '\'' +
                ", closeDate='" + closeDate + '\'' +
                '}';
    }
}
