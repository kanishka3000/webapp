package lk.icta.comp;

import org.apache.log4j.Logger;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyCtxListen implements ServletContextListener {

    Logger logger = Logger.getLogger(MyCtxListen.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("Context Initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("Context Destroyed");
    }
}
