package com.acme.spring.inject.service;

import com.acme.spring.inject.Deployments;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.spring.integration.test.annotation.SpringConfiguration;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@RunWith(Arquillian.class)
@SpringConfiguration("applicationContext.xml")
//@SpringConfiguration("META-INF/spring/applicationContext.xml")
public class DomainServiceFuncTestCase implements ApplicationContextAware {

    @Deployment
    public static Archive createTestArchive() {
        return Deployments.createDeployment();
    }

//    @Deployment
//    public static Archive createTestArchive() {
//        return ShrinkWrap.create(JavaArchive.class, "domain-service.jar")
//                .addAsResource(
//                        "META-INF/spring/core-service_applicationContext-test.xml",
//                        "META-INF/spring/applicationContext.xml")
//                .addAsResource(
//                        "META-INF/spring/database.properties",
//                        "META-INF/spring/database.properties")
//                .addClasses(
//                        ILangDao.class,
//                        LangDao.class,
//                        IPropertyDao.class,
//                        PropertyDao.class,
//                        IDomainService.class,
//                        DomainService.class)
//                ;
//    }

    public DomainServiceFuncTestCase() {
    }

    private ApplicationContext applicationContext;

//    @Value("${database.hibernate.dialect}")
//    private String dialect;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    public void testPropertyPlaceholders() {
        System.out.println("testPropertyPlaceholders()");
//        assert "org.hibernate.dialect.H2Dialect".equals(dialect);
//        assert applicationContext.getEnvironment().resolvePlaceholders("database.hibernate.dialect").equals(dialect);

    }
}