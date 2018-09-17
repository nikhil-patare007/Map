package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fs =new FileInputStream("/home/nikhil/IdeaProjects/Map/src/config.properties");
        p.load(fs);
        System.out.println(p);

        Enumeration e =p.propertyNames();
        String pass =p.getProperty("password");
        System.out.println(pass);
     while (e.hasMoreElements()){
         System.out.println(p.getProperty((String)e.nextElement()));
     }
    p.setProperty("user","root");
        FileOutputStream fo=new FileOutputStream("/home/nikhil/IdeaProjects/Map/src/config.properties");
    p.store(fo,"updated by niks");
    }
}
