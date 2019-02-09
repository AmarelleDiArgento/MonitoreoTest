/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author almoreno
 */
public class SessionMonitoreo {

    private final Session session;

    public SessionMonitoreo() {

        Configuration conf = new Configuration();
        conf.configure();

        ServiceRegistry rs = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(rs);
        session = (Session) sf.openSession();
        session.beginTransaction();

    }

    public Session getSession() {
        return session;
    }

}
