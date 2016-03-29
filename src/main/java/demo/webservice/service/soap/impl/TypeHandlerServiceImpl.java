package demo.webservice.service.soap.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import demo.bean.soap.adapter.ObjectAdapter;
import demo.bean.soap.adapter.ObjectListAdapter;
import demo.webservice.service.soap.TypeHandlerService;


// SEI (Service  Endpoint Interface 发布的服务接口)
@WebService(endpointInterface = "demo.webservice.service.soap.TypeHandlerService",
targetNamespace="tns", portName="typeHandlerPort", serviceName="typeHandlerService")
@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING) // 指定soap 1.2
public class TypeHandlerServiceImpl implements TypeHandlerService {
	
	public List<ObjectListAdapter> getObjectList() {
		List<ObjectListAdapter> list = new ArrayList<ObjectListAdapter>();
		for (int i = 0; i < 5; i++) {
			ObjectListAdapter obj = new ObjectListAdapter();
			obj.setField1(i);
			obj.setField2("str" +  i);
			obj.setField3("@XmlTransient" + i);
			list.add(obj);
		}
		return list;
	}
	
	public String getString(String str) {
//		return "hello " + str;
		return "</return>";
	}
	
	public ObjectAdapter getObject() {
		ObjectAdapter obj = new ObjectAdapter();
		obj.setField1("field1");
		obj.setField2("field2");
		obj.setList(getObjectList());
		return obj;
	}
	
	public List<String> getStringList() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		return list;
	}
}
