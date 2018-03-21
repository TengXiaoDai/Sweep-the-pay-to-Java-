package InterfaceMessage;


import java.io.Serializable;
import java.util.List;

public class RequestChangeRate implements Serializable {
    private String MerNum;

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

    public List<RateMessage> getRates() {
        return Rates;
    }

    public void setRates(List<RateMessage> rates) {
        Rates = rates;
    }

    private String DevNumber;
    private List<RateMessage>Rates;
}
