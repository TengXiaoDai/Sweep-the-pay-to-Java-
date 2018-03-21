package InterfaceMessage;

import java.io.Serializable;

public class RateMessage implements Serializable {
    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public String getRateType() {
        return RateType;
    }

    public void setRateType(String rateType) {
        RateType = rateType;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public String getCap() {
        return Cap;
    }

    public void setCap(String cap) {
        Cap = cap;
    }

    private String CardType;
    private String RateType;
    private String Rate;
    private String Cap;
}
