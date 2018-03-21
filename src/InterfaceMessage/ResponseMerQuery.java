package InterfaceMessage;

import java.io.Serializable;

public class ResponseMerQuery implements Serializable {
    public String getMerNum() {
        return MerNum;
    }

    public void setMerNum(String merNum) {
        MerNum = merNum;
    }

    public String getComMerNum() {
        return ComMerNum;
    }

    public void setComMerNum(String comMerNum) {
        ComMerNum = comMerNum;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    private String MerNum;
    private  String ComMerNum;
    private String Status;

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    private  String Reason;
}
