package demo.webservice.client.soap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.webservice.service.soap.TypeHandlerService;

public class TypeHandlerSpringClient {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"spring-cxf-client.xml"});
		TypeHandlerService service = context.getBean(TypeHandlerService.class);
		
		System.out.println(service.getString("s"));
		
		System.out.println(service.getObjectList().size());
		
		System.out.println(service.getObject().getList().size());
		
		System.out.println(service.getStringList().size());
	}

}
