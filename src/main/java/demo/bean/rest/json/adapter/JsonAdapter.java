package demo.bean.rest.json.adapter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement // xml根元素,rest生成json时必需要有的注解
@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
public class JsonAdapter {
	
	@XmlElement(name="f1")
	private String field1="a";
	@XmlElement(name="f2")
	private String field2="b";
	@XmlTransient
	private String field3="c";
	
	
	@XmlElement(name="childrens0")
	private List<Node> lis0 = new ArrayList<Node>();
	
	@XmlElement(name="childrens1")
	private List<Node> list1 = new ArrayList<Node>() {
		{
			add(new Node());
		}
	};
	
	@XmlElement(name="childrens2")
	private List<Node> list2 = new ArrayList<Node>() {
		{
			add(new Node());
			add(new Node());
		}
	};

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

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public List<Node> getLis0() {
		return lis0;
	}

	public void setLis0(List<Node> lis0) {
		this.lis0 = lis0;
	}

	public List<Node> getList1() {
		return list1;
	}

	public void setList1(List<Node> list1) {
		this.list1 = list1;
	}

	public List<Node> getList2() {
		return list2;
	}

	public void setList2(List<Node> list2) {
		this.list2 = list2;
	}
}
