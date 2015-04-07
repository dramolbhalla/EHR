package persistance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static Log log = LogFactory.getLog(HibernateUtil.class);

    private static final SessionFactory sessionFactory;

    static {
        try {
                Configuration cfg = new Configuration()
                                .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                                .setProperty("hibernate.connection.url", "jdbc:mysql://192.168.0.34:3306/ssh?zeroDateTimeBehavior=convertToNull")
                                .setProperty("hibernate.connection.driver_class", "org.hsqldb.jdbcDriver")
                                .setProperty("hibernate.connection.username", "abhalla")
                                .setProperty("hibernate.connection.password", "!Notoca0980!")
                                .setProperty("hibernate.c3p0.min_size", "5")
                                .setProperty("hibernate.c3p0.max_size", "20")
                                .setProperty("hibernate.c3p0.timeout", "1800")
                                .setProperty("hibernate.c3p0.max_statements", "50")
                                .setProperty("hibernate.show_sql", "true");
            // Create the SessionFactory
            sessionFactory = cfg.configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            log.error("Initial SessionFactory creation failed.", ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static final ThreadLocal session = new ThreadLocal();

    public static Session currentSession()  {
        Session s = (Session) session.get();
        // Open a new Session, if this Thread has none yet
        if (s == null) {
            s = sessionFactory.openSession();
            session.set(s);
        }
        return s;
    }

    public static void closeSession() {
        Session s = (Session) session.get();
        if (s != null)
            s.close();
        session.set(null);
    }
}