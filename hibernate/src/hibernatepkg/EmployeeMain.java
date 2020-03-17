package hibernatepkg;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
//import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class EmployeeMain {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.xml").build();  
           org.hibernate.boot.Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
         Employee e1=new Employee();    
            e1.setId("3");    
            e1.setFirstname("Ganesh");    
            e1.setLastname("Mehta");    
         
       session.save(e1);
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  
