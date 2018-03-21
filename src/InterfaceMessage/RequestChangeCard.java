package InterfaceMessage;

import java.io.Serializable;

public class RequestChangeCard implements Serializable {
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

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String accType) {
        AccType = accType;
    }

    public String getBProvince() {
        return BProvince;
    }

    public void setBProvince(String BProvince) {
        this.BProvince = BProvince;
    }

    public String getBCity() {
        return BCity;
    }

    public void setBCity(String BCity) {
        this.BCity = BCity;
    }

    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getSubName() {
        return SubName;
    }

    public void setSubName(String subName) {
        SubName = subName;
    }

    public String getBankAllName() {
        return BankAllName;
    }

    public void setBankAllName(String bankAllName) {
        BankAllName = bankAllName;
    }

    public String getBankNumber() {
        return BankNumber;
    }

    public void setBankNumber(String bankNumber) {
        BankNumber = bankNumber;
    }

    public String getBankUser() {
        return BankUser;
    }

    public void setBankUser(String bankUser) {
        BankUser = bankUser;
    }

    public String getBankUserCard() {
        return BankUserCard;
    }

    public void setBankUserCard(String bankUserCard) {
        BankUserCard = bankUserCard;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    private String MerNum;
    private String DevNumber;
    private String AccType;
    private String BProvince;
    private String BCity;
    private String BankCode;
    private String CardNumber;
    private String BranchName;
    private String SubName;
    private String BankAllName;
    private String BankNumber;
    private String BankUser;
    private String BankUserCard;
    private String MobileNumber;
}
