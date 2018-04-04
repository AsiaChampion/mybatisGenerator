/*
 * feiniu.com Inc.
 * Copyright (c) 2013-2018. All Rights Reserved.
 */

package com.feiniu.pmadmin.mybatisGenerator;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <B>Description:</B> <br>
 * <B>Create on:</B> 2016年4月26日 下午5:18:54<br>
 *
 * @author yajun.he
 * @version 1.0
 */
public class GeneratorMyBatisObject {
    private final static String pathname = "D:/space/mybatisGenerator/src/main/resources/" +
            "generatorConfigLocal.xml";

	public static void main(String[] args) {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //读取配置文件
        File configFile = new File(pathname);
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config;
		try {
			config = cp.parseConfiguration(configFile);

			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator;
			try {
				myBatisGenerator = new MyBatisGenerator(config, callback,
						warnings);
				myBatisGenerator.generate(null);
				
				//打印结果
				for(String str : warnings){
					System.out.println(str);
				}
				
				System.out.println("done!");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (IOException | XMLParserException e) {
			e.printStackTrace();
		}
    }
	
}
