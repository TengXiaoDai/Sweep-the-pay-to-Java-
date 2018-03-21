package InterfaceMessage;

import java.io.Serializable;

public class RequestQueryOrder implements Serializable {
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getOutOrderID() {
        return OutOrderID;
    }

    public void setOutOrderID(String outOrderID) {
        OutOrderID = outOrderID;
    }

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String orderTime) {
        OrderTime = orderTime;
    }

    private String OrderID;
    private String OutOrderID;
    private String OrderTime;
}
