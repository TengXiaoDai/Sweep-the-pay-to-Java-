package InterfaceMessage;

import java.io.Serializable;

public class ResponseChangeQuery implements Serializable {
    public String getMerNum() {
        return MerNum;
    }

    public void setMerNum(String merNum) {
        MerNum = merNum;
    }

    public String getPOID() {
        return POID;
    }

    public void setPOID(String POID) {
        this.POID = POID;
    }

    public String getChangeType() {
        return ChangeType;
    }

    public void setChangeType(String changeType) {
        ChangeType = changeType;
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

    private String MerNum;
    private String POID;
    private String ChangeType;
    private String Status;
    private String Reason;
}
