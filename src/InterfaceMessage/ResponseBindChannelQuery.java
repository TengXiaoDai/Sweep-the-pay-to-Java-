package InterfaceMessage;

import java.io.Serializable;

public class ResponseBindChannelQuery implements Serializable {
    private String MerNum;

    public String getMerNum() {
        return MerNum;
    }

    public void setMerNum(String merNum) {
        MerNum = merNum;
    }

    public String getChannelID() {
        return ChannelID;
    }

    public void setChannelID(String channelID) {
        ChannelID = channelID;
    }

    public String getDevNumber() {
        return DevNumber;
    }

    public void setDevNumber(String devNumber) {
        DevNumber = devNumber;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    private String ChannelID;
    private String DevNumber;
    private String Status;
    private String Reason;
}
