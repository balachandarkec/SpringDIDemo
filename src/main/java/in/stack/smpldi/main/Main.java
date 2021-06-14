package in.stack.smpldi.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.stack.smpldi.model.Department;
import in.stack.smpldi.model.Student;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r=new ClassPathResource("appContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(r);
		
		Department dept=(Department) factory.getBean("dept2");
		
		System.out.println(dept.toString());

	}

}
