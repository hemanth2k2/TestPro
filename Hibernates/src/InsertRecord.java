import org.hibernate.*;
import org.hibernate.cfg.*;
public class InsertRecord {

  public static void main(String[] args) {
    
    Configuration cfg = new Configuration();
    
    cfg.configure("hibernate.cfg.xml");
      
    SessionFactory sf=cfg.buildSessionFactory();
    
    Session session=sf.openSession();
    
    //Employee emp =new Employee();
    //emp.setId(101);
    //emp.setName("venkatesh");
    //emp.setGender("Male");
    //emp.setSalary(353443.23);
    faculty Faculty =new faculty();
      
    Faculty.setFid(1234);
    Faculty.setName("hemanth");
    Faculty.setDepartment("cse");
    Faculty.setDesignation("M.Tech");
    Faculty.setAge(23);
    Faculty.setSalary(454657);
    
    Faculty.setFid(120);
    Faculty.setName("BSR");
    Faculty.setDepartment("cse");
    Faculty.setDesignation("M.Tech");
    Faculty.setAge(23);
    Faculty.setSalary(12345);
    
    Faculty.setFid(163);
    Faculty.setName("Bv");
    Faculty.setDepartment("cse");
    Faculty.setDesignation("M.Tech");
    Faculty.setAge(23);
    Faculty.setSalary(12344);
    
    
    Transaction txt=session.beginTransaction();
    
    session.save(Faculty);
    
    txt.commit();
    
    System.out.println("Object saved");
    
    session.close();
    
    sf.close();
  }

}