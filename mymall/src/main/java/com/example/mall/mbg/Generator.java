package com.example.mall.mbg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @Classname Generator
 * @Description mbg 代码生成器，运行即可自动生成代码
 * @Date 2020/8/18 11:31
 * @Created by v_geeliu
 */
public class Generator {

  public static void main(String[] args) throws Exception {

    // 执行过程中警告信息
    List<String> warnings = new ArrayList<>();
    boolean overwrite = true;
    //当生成的代码重复时，覆盖原代码
    InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(is);
    is.close();
    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    //创建
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    //执行生成代码
    myBatisGenerator.generate(null);
    //输出警告信息
    for (String waring : warnings) {
      System.out.println(waring);
    }
  }

}
