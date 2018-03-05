package fm.config;

import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
//@EnableTransactionManagement
public class DatabaseConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        PGSimpleDataSource dataSource = new PGSimpleDataSource();
//        dataSource.setURL("jdbc:postgresql://localhost:5432/");
//        dataSource.setUser("farid");
//        dataSource.setPassword("farid");
//        dataSource.setDatabaseName("mydb");
//
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setDatabase(Database.POSTGRESQL);
//        vendorAdapter.setShowSql(true);
//
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setJpaVendorAdapter(vendorAdapter);
//        emf.setDataSource(dataSource);
//        emf.setPackagesToScan("fm.app.model");
//
//        return emf;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//        JpaTransactionManager transactionManager = new JpaTransactionManager(emf);
//
//        return transactionManager;
//    }



}
