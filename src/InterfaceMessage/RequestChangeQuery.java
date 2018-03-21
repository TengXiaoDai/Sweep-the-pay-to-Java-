package InterfaceMessage;

import java.io.Serializable;

public class RequestChangeQuery implements Serializable {
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

    private String MerNum;
    private String POID;
}
