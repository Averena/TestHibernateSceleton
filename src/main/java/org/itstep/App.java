package org.itstep;

import java.util.Date;

import org.hibernate.Session;
import org.itstep.model.Account;
import org.itstep.util.HibernateUtil;

/**
 * @author Alex Ignatenko
 */
public class App {
 public static void main(String[] args) {
  Account account = new Account("ignatenko207", "123456", "Alex", "Ignatenko", new Date(82, 7, 22).getTime());

  HibernateUtil hUtil = new HibernateUtil();
  
  Session session = hUtil.getSessionFactory().openSession();

  session.getTransaction().begin();

  session.save(account);

  session.getTransaction().commit();

  session.close();


 }
}