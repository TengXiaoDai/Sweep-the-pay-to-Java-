package InterfaceMessage;


import java.io.Serializable;
import java.util.List;

public class ResponseBindChannel implements Serializable {
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

    private String MerNum;
    private String ChannelID;
    private String DevNumber;
    private String Status;
}
