package com.jubao.common.generator;
/**  
* @Title: GeneratorTest.java  
* @Package test  
* @Description: 运行该测试方法，根据 generatorConfig.xml
* 	生成entity,dao,dao.xml,service,serviceImpl
* @author: yuanxianchu  
* @date 2018年8月28日   
* @version V1.0  
*/

import com.jubao.common.utils.BaseJunit;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* @Title: GeneratorTest.java  
* @Package test  
* @Description:  根据generatorConfig.xml，
* 	执行测试方法自动生成entity,dao,dao.xml,service,serviceImpl
* @author: yuanxianchu 
* @date 2018年9月29日  
* @version V1.0
 */
public class GeneratorTest extends BaseJunit {

	@Test
	public void generatorTest() {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config;
		try {
			config = cp.parseConfiguration(
					GeneratorTest.class.getResourceAsStream("/generator/generatorConfig.xml"));
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
