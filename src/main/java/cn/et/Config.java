package cn.et;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class Config {
	
	@Value("${driverClass}")
	private String driverClass;
	@Value("${password2}")
	private String password2;
	@Value("${url}")
	private String url;
	@Value("${userid}")
	private String userid;
	
	@Bean
	public DruidDataSource myDataSource(){
		DruidDataSource dds=new DruidDataSource();
		dds.setDriverClassName(driverClass);
		dds.setPassword(password2);
		dds.setUrl(url);
		dds.setUsername(userid);
		return dds;
		
	}
}
