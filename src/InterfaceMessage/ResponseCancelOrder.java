package InterfaceMessage;

import java.io.Serializable;

public class ResponseCancelOrder implements Serializable {
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

    public String getCancelOID() {
        return CancelOID;
    }

    public void setCancelOID(String cancelOID) {
        CancelOID = cancelOID;
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

    private String OrderID;
     private String OutCancelOID;
    private String CancelOID;
    private String Amount;
    private String Status;
}
