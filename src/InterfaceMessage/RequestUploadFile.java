package InterfaceMessage;

import java.io.Serializable;

public class RequestUploadFile implements Serializable {
    public String getMerNum() {
        return MerNum;
    }

    public void setMerNum(String merNum) {
        MerNum = merNum;
    }

    public String getFileType() {
        return FileType;
    }

    public void setFileType(String fileType) {
        FileType = fileType;
    }

    public String getFileDes() {
        return FileDes;
    }

    public void setFileDes(String fileDes) {
        FileDes = fileDes;
    }

    private String MerNum;
    private String FileType;
    private String FileDes;
}
