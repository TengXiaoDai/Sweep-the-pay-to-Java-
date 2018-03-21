package InterfaceMessage;

import java.io.Serializable;

public class RequestBindChannelQuery implements Serializable {
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

    private String ChannelID;
}
