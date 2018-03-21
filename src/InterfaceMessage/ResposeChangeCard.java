package InterfaceMessage;

import java.io.Serializable;

public class ResposeChangeCard implements Serializable {
    public String getMerNum() {
        return MerNum;
    }

    public void setMerNum(String merNum) {
        MerNum = merNum;
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

    public String getPOID() {
        return POID;
    }

    public void setPOID(String POID) {
        this.POID = POID;
    }

    private String MerNum;
    private String DevNumber;
    private String Status;
    private String POID;
}
