package mokumoku.boot.config;


import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean("dataSource")
    @Profile({"production", "staging", "testing"})
    @Primary
    public DataSource dataSource() {
        JndiDataSourceLookup jndiDataSourceLookup = new JndiDataSourceLookup();
        String defaultDataSourceJndiName = "jndi/database";

        return jndiDataSourceLookup.getDataSource(defaultDataSourceJndiName);
    }

    @Bean("dataSource")
    @Profile({"default", "local"})
    @Primary
    @ConfigurationProperties("datasource.default")
    public DataSource localDataSource() {
        return DataSourceBuilder.create().build();
    }
}
