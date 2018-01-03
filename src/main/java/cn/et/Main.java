package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//必须添加SpringBootApplication 启用spring的自动配置功能
@SpringBootApplication
//扫描类路径的包
//@ComponentScan("cn.et.lesson02.mapper")
public class Main {
	/**
	 * just run springboot启动的方法
	 */
	public static void main(String[] args) {
		//启动会加载自动配置 
		SpringApplication.run(Main.class, args);
	}
}