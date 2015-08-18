package com.oneler.freemarker;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.javassist.bytecode.analysis.Analyzer;

import com.oneler.freemarker.util.FreeMarkertUtil;
import com.oneler.freemarker.util.FtlUtil;

public class Test1 {
	public static void main(String[] args) {
		User user = new User();
        user.setUserName("测试");
        user.setUserPassword("123");
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("user", user);
        FreeMarkertUtil.analysisTemplate("user.ftl", "UTF-8", root);
        Map dataModel = new HashMap();  
        dataModel.put("username", "张三");  
        dataModel.put("content", "您提交的申请我们正在处理中，感谢您的支持！");  
          
        try {
			FtlUtil.renderFile(dataModel, "test.ftl");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
