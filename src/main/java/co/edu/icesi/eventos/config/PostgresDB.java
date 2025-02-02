//package co.edu.icesi.eventos.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories( entityManagerFactoryRef = "postgresEntityManagerFactory",
//        transactionManagerRef = "postgresTransactionManager",
//        basePackages = {"co.edu.icesi.eventos.repository.postgres"})
//public class PostgresDB {
//
//    @Value("${postgres.jpa.database-platform}")
//    private String dialect;
//
//    @Bean(name = "postgresDataSource")
//    @ConfigurationProperties(prefix = "postgres.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "postgresEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            @Qualifier("postgresDataSource") DataSource dataSource){
//        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setPackagesToScan("co.edu.icesi.eventos.domain.postgres");
//        HibernateJpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
//        factoryBean.setJpaVendorAdapter(vendor);
//        Map<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.dialect", dialect);
//        factoryBean.setJpaPropertyMap(properties);
//        return factoryBean;
//    }
//
//    @Bean("postgresTransactionManager")
//    public PlatformTransactionManager platformTransactionManager(
//            @Qualifier("postgresEntityManagerFactory") EntityManagerFactory entityManagerFactory){
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}