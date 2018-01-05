/*
 * 文件名：${XmlResponseVO}
 * 作者：${tree}
 * 版本：
 * 时间：${2014.7.29}
 * 修改：
 * 描述：文件夹中的文件对象
 *
 *
 * 版权：亚略特
 */
package com.aratek.model.vo;


import com.aratek.model.Person;

import java.util.List;

public class ResponseWsVO {
	//基本元素
	private int resultCode;
	private String resultMsg;
	private String sessionId;
	private String dataFlag;
	private String dataVersion;
	private String receiptId;
	private String Cipher;
	private String reqFingerId;
	private int personCount;
	private String fpPackage;
	private String signData;
	private String certData;
	private List<Person> personList;
	private String fingerData;

    public ResponseWsVO() {
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getDataFlag() {
        return this.dataFlag;
    }

    public String getDataVersion() {
        return this.dataVersion;
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public String getCipher() {
        return this.Cipher;
    }

    public String getReqFingerId() {
        return this.reqFingerId;
    }

    public int getPersonCount() {
        return this.personCount;
    }

    public String getFpPackage() {
        return this.fpPackage;
    }

    public String getSignData() {
        return this.signData;
    }

    public String getCertData() {
        return this.certData;
    }

    public List<Person> getPersonList() {
        return this.personList;
    }

    public String getFingerData() {
        return this.fingerData;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public void setCipher(String Cipher) {
        this.Cipher = Cipher;
    }

    public void setReqFingerId(String reqFingerId) {
        this.reqFingerId = reqFingerId;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public void setFpPackage(String fpPackage) {
        this.fpPackage = fpPackage;
    }

    public void setSignData(String signData) {
        this.signData = signData;
    }

    public void setCertData(String certData) {
        this.certData = certData;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setFingerData(String fingerData) {
        this.fingerData = fingerData;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseWsVO)) return false;
        final ResponseWsVO other = (ResponseWsVO) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getResultCode() != other.getResultCode()) return false;
        final Object this$resultMsg = this.getResultMsg();
        final Object other$resultMsg = other.getResultMsg();
        if (this$resultMsg == null ? other$resultMsg != null : !this$resultMsg.equals(other$resultMsg)) return false;
        final Object this$sessionId = this.getSessionId();
        final Object other$sessionId = other.getSessionId();
        if (this$sessionId == null ? other$sessionId != null : !this$sessionId.equals(other$sessionId)) return false;
        final Object this$dataFlag = this.getDataFlag();
        final Object other$dataFlag = other.getDataFlag();
        if (this$dataFlag == null ? other$dataFlag != null : !this$dataFlag.equals(other$dataFlag)) return false;
        final Object this$dataVersion = this.getDataVersion();
        final Object other$dataVersion = other.getDataVersion();
        if (this$dataVersion == null ? other$dataVersion != null : !this$dataVersion.equals(other$dataVersion))
            return false;
        final Object this$receiptId = this.getReceiptId();
        final Object other$receiptId = other.getReceiptId();
        if (this$receiptId == null ? other$receiptId != null : !this$receiptId.equals(other$receiptId)) return false;
        final Object this$Cipher = this.getCipher();
        final Object other$Cipher = other.getCipher();
        if (this$Cipher == null ? other$Cipher != null : !this$Cipher.equals(other$Cipher)) return false;
        final Object this$reqFingerId = this.getReqFingerId();
        final Object other$reqFingerId = other.getReqFingerId();
        if (this$reqFingerId == null ? other$reqFingerId != null : !this$reqFingerId.equals(other$reqFingerId))
            return false;
        if (this.getPersonCount() != other.getPersonCount()) return false;
        final Object this$fpPackage = this.getFpPackage();
        final Object other$fpPackage = other.getFpPackage();
        if (this$fpPackage == null ? other$fpPackage != null : !this$fpPackage.equals(other$fpPackage)) return false;
        final Object this$signData = this.getSignData();
        final Object other$signData = other.getSignData();
        if (this$signData == null ? other$signData != null : !this$signData.equals(other$signData)) return false;
        final Object this$certData = this.getCertData();
        final Object other$certData = other.getCertData();
        if (this$certData == null ? other$certData != null : !this$certData.equals(other$certData)) return false;
        final Object this$personList = this.getPersonList();
        final Object other$personList = other.getPersonList();
        if (this$personList == null ? other$personList != null : !this$personList.equals(other$personList))
            return false;
        final Object this$fingerData = this.getFingerData();
        final Object other$fingerData = other.getFingerData();
        if (this$fingerData == null ? other$fingerData != null : !this$fingerData.equals(other$fingerData))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getResultCode();
        final Object $resultMsg = this.getResultMsg();
        result = result * PRIME + ($resultMsg == null ? 43 : $resultMsg.hashCode());
        final Object $sessionId = this.getSessionId();
        result = result * PRIME + ($sessionId == null ? 43 : $sessionId.hashCode());
        final Object $dataFlag = this.getDataFlag();
        result = result * PRIME + ($dataFlag == null ? 43 : $dataFlag.hashCode());
        final Object $dataVersion = this.getDataVersion();
        result = result * PRIME + ($dataVersion == null ? 43 : $dataVersion.hashCode());
        final Object $receiptId = this.getReceiptId();
        result = result * PRIME + ($receiptId == null ? 43 : $receiptId.hashCode());
        final Object $Cipher = this.getCipher();
        result = result * PRIME + ($Cipher == null ? 43 : $Cipher.hashCode());
        final Object $reqFingerId = this.getReqFingerId();
        result = result * PRIME + ($reqFingerId == null ? 43 : $reqFingerId.hashCode());
        result = result * PRIME + this.getPersonCount();
        final Object $fpPackage = this.getFpPackage();
        result = result * PRIME + ($fpPackage == null ? 43 : $fpPackage.hashCode());
        final Object $signData = this.getSignData();
        result = result * PRIME + ($signData == null ? 43 : $signData.hashCode());
        final Object $certData = this.getCertData();
        result = result * PRIME + ($certData == null ? 43 : $certData.hashCode());
        final Object $personList = this.getPersonList();
        result = result * PRIME + ($personList == null ? 43 : $personList.hashCode());
        final Object $fingerData = this.getFingerData();
        result = result * PRIME + ($fingerData == null ? 43 : $fingerData.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResponseWsVO;
    }

    public String toString() {
        return "ResponseWsVO(resultCode=" + this.getResultCode() + ", resultMsg=" + this.getResultMsg() + ", sessionId=" + this.getSessionId() + ", dataFlag=" + this.getDataFlag() + ", dataVersion=" + this.getDataVersion() + ", receiptId=" + this.getReceiptId() + ", Cipher=" + this.getCipher() + ", reqFingerId=" + this.getReqFingerId() + ", personCount=" + this.getPersonCount() + ", fpPackage=" + this.getFpPackage() + ", signData=" + this.getSignData() + ", certData=" + this.getCertData() + ", personList=" + this.getPersonList() + ", fingerData=" + this.getFingerData() + ")";
    }
}
