package demo.webservice.service.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElementWrapper;

import demo.bean.soap.adapter.ObjectAdapter;
import demo.bean.soap.adapter.ObjectListAdapter;

@WebService
public interface TypeHandlerService {
	
	/**
	 * 获取对象，里面包含集合
	 */
	@WebMethod(operationName="object")
	@WebResult(name="obj") ObjectAdapter getObject();
	
	/**
	 * 获取对象的集合
	 */
	@WebMethod(operationName="objectList")
	@XmlElementWrapper(name="arrays") // 返回的xml外层添加元素
	@WebResult(name="objList") List<ObjectListAdapter> getObjectList();
	
	/**
	 * 获取字符串
	 */
	@WebMethod(operationName="string")
	@WebResult(name="str") String getString(String str);
	
	/**
	 * 返回list
	 */
	@WebMethod(operationName="stringList")
	@XmlElementWrapper(name="arrays")
	@WebResult(name="str") List<String> getStringList();
	
}
