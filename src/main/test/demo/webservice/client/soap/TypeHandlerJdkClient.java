package demo.webservice.client.soap;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

public class TypeHandlerJdkClient {
	
	public static void main(String[] args) throws Exception {
        String wsdlUrl = "http://localhost:8780/services/typeHandlerService?wsdl";
        //1、创建服务(Service)  
        URL url = new URL(wsdlUrl);  
		QName sname = new QName("tns", "typeHandlerService");
		Service service = Service.create(url, sname);
	                      
        //2、创建Dispatch  
        Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName("tns", "typeHandlerPort"), SOAPMessage.class, Service.Mode.MESSAGE);  
                      
        //3、创建SOAPMessage  
        SOAPMessage msg = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL).createMessage();  
        SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();  
        SOAPBody body = envelope.getBody();  
                      
        //4、创建QName来指定消息中传递数据  
        QName ename = new QName("http://soap.service.webservice.demo/", "stringList");//<nn:add xmlns="xx"/>  // {5}
        @SuppressWarnings("unused")
		SOAPBodyElement ele = body.addBodyElement(ename);  
        // 传递参数  
//	        ele.addChildElement("strMobiles", "tem").setValue("151****3701");    
//	        ele.addChildElement("strMSg", "tem").setValue("测试!");    
        msg.writeTo(System.out);  
        System.out.println("\n invoking.....");  
                              
        //5、通过Dispatch传递消息,会返回响应消息  
        SOAPMessage response = dispatch.invoke(msg);  
        response.writeTo(System.out);  
        System.out.println();  
//	                      
	}
	
}
