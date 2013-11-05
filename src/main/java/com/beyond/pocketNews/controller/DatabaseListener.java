package com.beyond.pocketNews.controller;



import com.beyond.pocketNews.model.HibernateSessionFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DatabaseListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
//		try {
//			DatabaseFactory.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		System.out.println("[DatabaseFactory closed...]");
	}

	public void contextInitialized(ServletContextEvent arg0) {
//		 try {
//			DatabaseFactory.registerFromDefaultProperties();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

        HibernateSessionFactory.rebuildSessionFactory();

		System.out.println("[DatabaseFactory register...]");

	}

}
