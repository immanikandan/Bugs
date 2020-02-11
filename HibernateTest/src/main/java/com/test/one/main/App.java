package com.test.one.main;

import org.hibernate.Session;

import com.test.one.model.Stock;
import com.test.one.util.HibernateUtill;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtill.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        session.save(stock);
        session.getTransaction().commit();
    }
}