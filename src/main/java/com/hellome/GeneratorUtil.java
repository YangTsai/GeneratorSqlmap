package com.hellome;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorUtil {

	private static void generator()  throws Exception{
	    List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
		// 指定逆向工程配置文件
		File configFile = new File("D:\\Java\\workspace\\GeneratorSqlMap\\src\\main\\resources\\generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		System.out.println("ok");
	}

	public static void main(String[] args) {
		try {
			generator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
