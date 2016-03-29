package demo.bean.soap.adapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlAccessorType(XmlAccessType.FIELD)// 根据属性上的注解生成
public class ObjectListAdapter {

	@XmlElement(name="int")
	private Integer field1;

	@XmlElement(name="str") // xml元素 <str>.</str>
	private String field2;
	
	@XmlTransient // xml中不显示此字段
	private String field3;

	public Integer getField1() {
		return field1;
	}

	public void setField1(Integer field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

}
