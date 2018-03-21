package InterfaceMessage;

import java.io.Serializable;

public class ResponseQueryOrder implements Serializable {
    private String OrderID;
    private String OutOrderID;
    private String Amount;
    private String Status;

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

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    private String ErrorCode;
}
