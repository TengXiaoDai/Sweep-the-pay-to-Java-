package RequestResponseMessage;

public class RequestPicker {
    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getAPIVer() {
        return APIVer;
    }

    public void setAPIVer(String APIVer) {
        this.APIVer = APIVer;
    }

    public String getComNum() {
        return ComNum;
    }

    public void setComNum(String comNum) {
        ComNum = comNum;
    }

    public String getBizContent() {
        return BizContent;
    }

    public void setBizContent(String bizContent) {
        BizContent = bizContent;
    }

    public String getReqFlow() {
        return ReqFlow;
    }

    public void setReqFlow(String reqFlow) {
        ReqFlow = reqFlow;
    }

    public String getRKey() {
        return RKey;
    }

    public void setRKey(String RKey) {
        this.RKey = RKey;
    }

    public String getSign() {
        return Sign;
    }

    public void setSign(String sign) {
        Sign = sign;
    }

    public String Action;
    public String APIVer;
    public String ComNum;
    public String BizContent;
    public String ReqFlow;
    public String RKey;
    public String Sign;
}
