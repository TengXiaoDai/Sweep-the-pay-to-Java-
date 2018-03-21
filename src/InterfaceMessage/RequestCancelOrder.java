package InterfaceMessage;

import java.io.Serializable;

public class RequestCancelOrder implements Serializable {
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getOutCancelOID() {
        return OutCancelOID;
    }

    public void setOutCancelOID(String outCancelOID) {
        OutCancelOID = outCancelOID;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String orderTime) {
        OrderTime = orderTime;
    }

    private String OrderID;
    private String OutCancelOID;
    private String Amount;
    private String OrderTime;
}
