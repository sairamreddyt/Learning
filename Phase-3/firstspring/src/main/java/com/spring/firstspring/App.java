package com.spring.firstspring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        
        Student s1=(Student) context.getBean("s");
        Marks m1=(Marks) context.getBean("m");
        System.out.println("phy: "+m1.getPhy());
        System.out.println("chem: "+m1.getChem());
        System.out.println("math: "+m1.getMath());
        System.out.println("Id: "+s1.getId());
        System.out.println("Name: "+s1.getName());
        
        Student s2=(Student) context.getBean("s");
        
        System.out.println(s1==s2);// both are same instances
    }
}
