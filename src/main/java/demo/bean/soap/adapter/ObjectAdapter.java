package demo.bean.soap.adapter;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectAdapter {

	@XmlElement(name="str1")
	private String field1;
	
	@XmlElement(name="str2")
	private String field2;
	
	@XmlElementWrapper(name="arrays")
	@XmlElement(name="element")
	private List<ObjectListAdapter> list;

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public List<ObjectListAdapter> getList() {
		return list;
	}

	public void setList(List<ObjectListAdapter> list) {
		this.list = list;
	}
}
