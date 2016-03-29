package demo.webservice.service.rest.impl;

import java.util.ArrayList;
import java.util.List;

import demo.bean.rest.json.adapter.JsonAdapter;
import demo.bean.soap.adapter.ObjectAdapter;
import demo.bean.soap.adapter.ObjectListAdapter;
import demo.webservice.service.rest.JsonRest;

public class JsonRestImpl implements JsonRest {

	public ObjectAdapter getCustomer(String id) {
		ObjectAdapter obj = new ObjectAdapter();
		obj.setField1("field1");
		obj.setField2("field2");
		obj.setList(getObjectList());
		return obj;
	}
	
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

	public JsonAdapter getJson(String id) {
		return new JsonAdapter();
	}
}
