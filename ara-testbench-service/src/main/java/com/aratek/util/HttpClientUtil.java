/**
 * @author: tree
 * @version: 1.0
 * date: 2017/9/4 11:54
 * @description:
 * own: Aratek
 */
package com.aratek.util;

import com.aratek.exception.InternalServiceException;
import com.aratek.model.TasPersonEntity;
import com.aratek.model.vo.ResponseWsVO;
import com.util.CommonStringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Slf4j
@Component
public class HttpClientUtil {

    @Value("${webservice.ip}")
    private String webServiceIP;
    @Value("${webservice.port}")
    private String webServicePort;
    @Value("${webservice.pid}")
    private String webServicePID;

    public static final Map<String, String> MAP_DATA = new LinkedHashMap<>();

    /**
     * 0 : ResultCode,1: ResultMsg,2 : SessionId
     * 3 : ReceiptId,4 : FingerId,5 : ReqFingerId,6 : Account
     * 7 : Password,8 : FingerPackage,9 : PassportNum,10 : FamilyName
     * 11 : MiddleName,12 : FirstName,13 : NationalName,14 : ChineseName
     * 15 : NationCode,16 : NationIDNum,17 : Gender,18 : Birthday
     * 19 : ResultType,20 : PersonCount,21 : CreateDate,22 : TimeArea
     * 23 : SourceFlag  ,24 : Cipher,25 : FingerData,26: ExportRule
     */
    private  final String[] dataTag = {"ResultCode", "ResultMsg", "SessionId", "ReceiptId", "FingerId", "ReqFingerId", "Account", "Password", "FingerPackage", "PassportNum",
            "FamilyName", "MiddleName","FirstName", "NationalName", "ChineseName", "NationCode", "NationIDNum", "Gender", "Birthday", "ResultType", "PersonCount", "CreateDate",
            "TimeArea","SourceFlag","Cipher","FingerData","ExportRule"};

    /**
     * 授权登录接口
     *
     * @param account 账户
     * @param password 密码
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisLogin(String account, String password) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisLogin][{}][{}]",account,password);
        //添加报文数据
        MAP_DATA.put(dataTag[6], account);
        MAP_DATA.put(dataTag[7], password);
        //构造请求报文数据
        String TASRequest = doWsXMLWork(1, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);
        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisLogin"));
    }

    /**
     * 指纹数据注销接口
     *
     * @param sessionId 交互令牌
     * @param fingerId  指纹编号
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisDeleteFP(String sessionId, String fingerId) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisDeleteFP][{}][{}]",sessionId,fingerId);
        //添加报文数据
        MAP_DATA.put(dataTag[4], fingerId);
        MAP_DATA.put(dataTag[2], sessionId);
        //构造请求报文数据
        String TASRequest = doWsXMLWork(7, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);

        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisDeleteFP"));
    }

    /**
     * 指纹数据注销接口
     *
     * @param sessionId 交互令牌
     * @param passNum   护照号
     * @param nationCode    国籍编号
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisDeletePerson(String sessionId, String passNum, String nationCode) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisDeletePerson][{}][{}][{}]",sessionId,passNum,nationCode);
        //添加报文数据
        MAP_DATA.put(dataTag[9], passNum);
        MAP_DATA.put(dataTag[15], nationCode);
        MAP_DATA.put(dataTag[2], sessionId);

        //构造请求报文数据
        String TASRequest = doWsXMLWork(6, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);

        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisDeletePerson"));
    }

    /**
     * 指纹数据注销接口
     *
     * @param sessionId 交互令牌
     * @param passNum 护照号
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisDelete(String sessionId, String passNum) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisDelete][{}][{}][{}]",sessionId,passNum);
        //添加报文数据
        MAP_DATA.put(dataTag[9], passNum);
        MAP_DATA.put(dataTag[2], sessionId);

        //构造请求报文数据
        String TASRequest = doWsXMLWork(8, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);

        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisDelete"));
    }

    /**
     * 十指指纹注册接口
     *
     * @param fpPackage  十指指纹数据包
     * @param sessionId  交互令牌
     * @param passNum    护照号
     * @param familyName 姓
     * @param middleName 中间名
     * @param firstName 名
     * @param nationName 国籍国姓名
     * @param chineseName 中文名
     * @param nationCode 国籍编码
     * @param nationIDNum 国籍国ID编号
     * @param gender 性别
     * @param birthday 出生日期
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisEnroll(String fpPackage, String sessionId, String fpSourceCode, String passNum, String familyName, String middleName, String firstName, String nationName, String chineseName, String nationCode, String nationIDNum, String gender, String birthday) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisEnroll][{}][{}][{}][{}][{}][{}][{}][{}][{}][{}][{}][{}][{}]",fpPackage.length(),sessionId,fpSourceCode,passNum,
                familyName,middleName,firstName,nationName,chineseName,nationCode,nationIDNum,gender,birthday);
        //添加报文数据
        MAP_DATA.put(dataTag[2], sessionId);
        MAP_DATA.put(dataTag[8], fpPackage);
        MAP_DATA.put(dataTag[9], passNum);
        MAP_DATA.put(dataTag[10], familyName);
        MAP_DATA.put(dataTag[11], middleName);
        MAP_DATA.put(dataTag[12], firstName);
        MAP_DATA.put(dataTag[13], nationName);
        MAP_DATA.put(dataTag[14], chineseName);
        MAP_DATA.put(dataTag[15], nationCode);
        MAP_DATA.put(dataTag[16], nationIDNum);
        MAP_DATA.put(dataTag[17], gender);
        MAP_DATA.put(dataTag[18], birthday);
        MAP_DATA.put(dataTag[23], fpSourceCode);
        //构造请求报文数据
        String TASRequest = doWsXMLWork(2, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);
        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisEnroll"));
    }

    /**
     * 指纹采集编号比对
     *
     * @param sessionId 交互令牌
     * @param fingerId 指纹编号
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisVerifyFPID(String sessionId, String fingerId) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisVerifyFPID][{}][{}][{}]",sessionId,fingerId);
        //添加报文数据
        MAP_DATA.put(dataTag[4], fingerId);
        MAP_DATA.put(dataTag[2], sessionId);
        //构造请求报文数据
        String TASRequest = doWsXMLWork(9, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);
        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisVerifyFPID"));
    }

    /**
     * 十指指纹图像导入接口
     * @param sessionId 令牌
     * @param fingerId 指纹编号
     * @param cipher 加密后的SM4随机密钥
     * @param fingerData 十指指纹数据包密文串
     * @param sourceFlag 指纹来源标志
     * @return ResponseWsVO 响应对象
     */
    public  ResponseWsVO wsAfisImport(String fingerId, String cipher, String fingerData, String sourceFlag, String sessionId) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisImport][{}][{}][{}][{}][{}]",fingerId,cipher,fingerData.length(),sourceFlag,sessionId);
        //添加报文数据
        MAP_DATA.put(dataTag[2],sessionId);
        MAP_DATA.put(dataTag[4], fingerId);
        MAP_DATA.put(dataTag[23], sourceFlag);
        MAP_DATA.put(dataTag[24], cipher);
        MAP_DATA.put(dataTag[25], fingerData);
        //构造请求报文数据
        String TASRequest = doWsXMLWork(5, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);

        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisImport"));
    }

    /**
     * 十指指纹图像导出接口
     *
     * @param sessionId 交互令牌
     * @param fingerId 指纹编号
     * @param TimeArea 时间区段
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisExport(String sessionId, String fingerId, String exportRule, String TimeArea) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisExport][{}][{}][{}][{}][{}]",sessionId,fingerId,exportRule,TimeArea);
        //添加报文数据
        MAP_DATA.put(dataTag[2], sessionId);
        MAP_DATA.put(dataTag[4], fingerId);
        MAP_DATA.put(dataTag[22], TimeArea);
        MAP_DATA.put(dataTag[26], exportRule);

        //构造请求报文数据
        String TASRequest = doWsXMLWork(4, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);

        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisExport"));
    }

    /**
     * 请求结果获取接口
     *
     * @param receiptId  回执号
     * @param sessionId  交互令牌
     * @return String   成功 ： xml报文   失败 ： null
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisGetResult(String receiptId, String sessionId) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisGetResult][{}][{}]",receiptId,sessionId);
        //添加报文数据
        MAP_DATA.put(dataTag[3], receiptId);
        MAP_DATA.put(dataTag[2], sessionId);

        //构造请求报文数据
        String TASRequest = doWsXMLWork(3, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);

        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisGetResult"));
    }

    /**
     * 签证人员信息变更接口
     *
     * @param sessionId  交互令牌
     * @param person   签证人员信息
     * @return ResponseWsVO 响应对象
     * @throws InternalServiceException
     */
    public  ResponseWsVO wsAfisUpdatePerson(String sessionId, TasPersonEntity person) throws InternalServiceException {
        log.info("[SYS_LOG][wsAfisUpdatePerson][{}][{}]",sessionId,person.toString());
        //添加报文数据
        MAP_DATA.put(dataTag[2], sessionId);
        MAP_DATA.put(dataTag[4], person.getFpExchageFileId());
        MAP_DATA.put(dataTag[9], person.getPersonEid());
        MAP_DATA.put(dataTag[10], person.getFamilyName());
        MAP_DATA.put(dataTag[11], person.getMiddleName());
        MAP_DATA.put(dataTag[12], person.getFirstName());
        MAP_DATA.put(dataTag[13], person.getNationalName());
        MAP_DATA.put(dataTag[14], person.getCnName());
        MAP_DATA.put(dataTag[15], person.getNationCode());
        MAP_DATA.put(dataTag[16], person.getNationIdNum());
        MAP_DATA.put(dataTag[17], person.getSex());
        MAP_DATA.put(dataTag[18], person.getBirthDate());

        //构造请求报文数据
        String TASRequest = doWsXMLWork(10, MAP_DATA);
        log.debug("[SYS_LOG][REQ_XML][{}]",TASRequest);

        //发出报文请求
        Map<String, String> patameterMap = new HashMap<>();
        patameterMap.put("TASRequest", TASRequest);
        return XmlUtil.parseTasXml(getServiceResult(patameterMap, "wsAfisUpdatePerson"));
    }

    //访问webservice
    private  String getServiceResult(Map<String, String> patameterMap, String method) throws InternalServiceException {
        String tasResponse = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //读取Webservice的配置信息
        HttpPost httpPost = new HttpPost("http://" + webServiceIP + ":" + webServicePort + "/" + webServicePID);
        httpPost.setHeader("Content-Type","application/soap+xml; charset=UTF-8");
        //拼接参数
        StringEntity entity;
        entity = new StringEntity(buildRequestData(patameterMap,method), StandardCharsets.UTF_8);
        httpPost.setEntity(entity);
        try (CloseableHttpResponse response = httpclient.execute(httpPost)) {
            if (response.getStatusLine().getStatusCode() == 200) {
                tasResponse = CommonStringUtil.subStringByRule(EntityUtils.toString(response.getEntity(),"UTF-8"), "<ns:return>", "</ns:return>").replaceAll("&lt;", "<");
            }
            EntityUtils.consume(entity);
        }  catch (Exception e) {
            e.printStackTrace();
            throw new InternalServiceException("Webservice访问失败,请检查Webservice参数的配置," + e.getMessage());
        }
        log.debug("[SYS_LOG][RES_XML][{}]",tasResponse);
        return tasResponse;
    }

    /**
     * 构建请求XML报文数据
     *
     * @param actionType 业务编号
     * @param mapData   业务数据
     * @return String 报文数据
     */
    public  String doWsXMLWork(int actionType, Map<String, String> mapData) {
        //构建请求XML报文数据
        //报文头
        StringBuffer sbData = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?><TASRequest><ActionParam>");
        //根据请求类型，构造数据体
        switch (actionType) {
            // 授权登录
            case 1:
                sbData = appendXML(sbData, mapData, 6, 7);
                break;
            // 指纹注册
            case 2:
                sbData = appendXML(sbData, mapData, 8);
                sbData.append("<PersonInfo>");
                sbData = appendXML(sbData, mapData, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
                sbData.append("</PersonInfo>");
                sbData = appendXML(sbData, mapData, 23);
                sbData = appendXML(sbData, mapData, 2);
                break;
            // 结果获取
            case 3:
                sbData = appendXML(sbData, mapData, 3, 2);
                break;
            case 4:
                sbData.append("<FingerIds>");
                sbData = appendXML(sbData, mapData, 4);
                sbData.append("</FingerIds>");
                if (!("".equals(mapData.get(dataTag[26])))) {
                    sbData = appendXML(sbData, mapData, 26);
                }
                sbData = appendXML(sbData, mapData, 22);
                sbData = appendXML(sbData, mapData, 2);
                break;
            case 5:
                sbData.append("<Envelope>");
                sbData= appendXML(sbData, mapData, 24);
                sbData.append("</Envelope>");
                sbData.append("<FingerDatasList>");
                sbData.append("<FingerDatas>");
                sbData = appendXML(sbData, mapData, 4);
                sbData.append("<FingerDataList>");
                sbData=appendXML(sbData,mapData,25);
                sbData.append("</FingerDataList>");
                sbData.append("</FingerDatas>");
                sbData.append("</FingerDatasList>");
                sbData= appendXML(sbData, mapData, 23,2);
                break;
            case 6:
                sbData.append("<FingerIds>");
                sbData = appendXML(sbData, mapData, 9);
                sbData = appendXML(sbData, mapData, 15);
                sbData.append("</FingerIds>");
                sbData = appendXML(sbData, mapData, 2);
                break;
            case 7:
                sbData.append("<FingerIds>");
                sbData = appendXML(sbData, mapData, 4);
                sbData.append("</FingerIds>");
                sbData = appendXML(sbData, mapData, 2);
                break;
            case 8:
                sbData.append("<FingerIds>");
                sbData = appendXML(sbData, mapData, 9);
                sbData.append("</FingerIds>");
                sbData = appendXML(sbData, mapData, 2);
                break;
            //指纹采集编号比对
            case 9:
                sbData = appendXML(sbData, mapData, 4);
                sbData = appendXML(sbData, mapData, 2);
                break;
            // 签证人员信息变更
            case 10:
                sbData = appendXML(sbData, mapData, 4);
                sbData.append("<PersonInfo>");
                sbData = appendXML(sbData, mapData, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
                sbData.append("</PersonInfo>");
                sbData = appendXML(sbData, mapData, 2);
                break;
            default:
                break;
        }
        //报文尾
        sbData.append("</ActionParam></TASRequest>");
        //返回报文数据
        return sbData.toString();
    }

    /**
     * 动态拼凑XML报文数据
     *
     * @param sbData 拼接数据
     * @param mapData 业务数据
     * @param values 业务标志值
     * @return StringBuffer
     */
    public  StringBuffer appendXML(StringBuffer sbData, Map<String, String> mapData, int... values) {
        for (int value : values) {
            sbData.append("<").append(dataTag[value]).append(">").append(mapData.get(dataTag[value])).append("</").append(dataTag[value]).append(">");
        }
        return sbData;
    }

    public  String buildRequestData(Map<String, String> patameterMap,String methodName) {
        StringBuilder soapRequestData = new StringBuilder();
        soapRequestData.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        soapRequestData.append("<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:impl=\"").append("http://impl.webservice.support.trustafis.aratek.com").append("\">");
        soapRequestData.append("<soap:Header/>");
        soapRequestData.append("<soap:Body>");
        soapRequestData.append("<impl:").append(methodName).append(">");
        Set<String> nameSet = patameterMap.keySet();
        for (String name : nameSet) {
            soapRequestData.append("<impl:").append(name).append("><![CDATA[").append(patameterMap.get(name)).append("]]></impl:").append(name).append(">");
        }
        soapRequestData.append("</impl:").append(methodName).append(">");
        soapRequestData.append("</soap:Body>");
        soapRequestData.append("</soap:Envelope>");
        return soapRequestData.toString();
    }
}
