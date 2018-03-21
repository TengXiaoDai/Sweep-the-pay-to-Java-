package InterfaceMessage;

import java.io.Serializable;

public class RequestMerQuery implements Serializable {
    private String MerNum;

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

    private String ComMerNum;
}
