package com.scp.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.hibernate.entity.Car;
import com.scp.hibernate.entity.Model;

public class ManyToOneBidirectionalDemo 
{
    public static void main( String[] args )
    {
        
        
        Configuration configuration = new Configuration();
        configuration.configure();
        
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction= session.beginTransaction();
        Car  car = new Car();
        car.setName("BMW1");
        car.setTotal(15222);
        
        Car  car1 = new Car();
        car1.setName("BMW2");
        car1.setTotal(18542);
        
        
        Model model1 = new Model();
        model1.setModel_total(10000);
        model1.setQuantity(10);
        
        Model model2 = new Model();
        model2 .setModel_total(20000);
        model2.setQuantity(20);
       
        Model model3 = new Model();
        model3.setModel_total(30000);
        model3.setQuantity(30);
        
        model1.setCar(car);
        model2.setCar(car);
        model3.setCar(car);
        
        
        Model model4 = new Model();
        model4.setModel_total(40000);
        model4.setQuantity(100);
        
        Model model5 = new Model();
        model5.setModel_total(50000);
        model5.setQuantity(500);
       
        Model model6 = new Model();
        model6.setModel_total(60000);
        model6.setQuantity(600);
        
        model1.setCar(car);
        model1.setCar(car);
        model3.setCar(car);
        
        
        
        
        
        
        
        model4.setCar(car1);
        model5.setCar(car1);
        model6.setCar(car1);
        
        session.save(car);
        session.save(car1);
        session.save(model1);
        session.save(model2);
        session.save(model3);
        
        session.save(model4);
        session.save(model5);
        session.save(model6);
        
        
        session.flush();   
        transaction.commit();
        session.close();
    }
}
	