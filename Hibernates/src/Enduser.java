import org.hibernate.*;

import org.hibernate.cfg.*;

public class Enduser {

  public static void main(String[] args) {
  
        Configuration cfg = new Configuration();
    
    cfg.configure("hibernate.cfg.xml");
      
    SessionFactory sf=cfg.buildSessionFactory();
    
    Session session=sf.openSession();
    
    Query qry=session.createQuery("update faculty set name=:v1 where fid=:v2 ");
    
    qry.setParameter("v1","KL#");
    qry.setParameter("v2", 1234);
    int n= qry.executeUpdate();
    System.out.println(n+"  object(s)  Updated");
    
         Transaction txt=session.beginTransaction();
    
    
     txt.commit();
     session.close();
    
     sf.close();
    

  }

}