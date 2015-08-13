package com.oneler.freemarker;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.javassist.bytecode.analysis.Analyzer;

import com.oneler.freemarker.util.FreeMarkertUtil;

public class Test1 {
	public static void main(String[] args) {
		User user = new User();
        user.setUserName("测试");
        user.setUserPassword("123");
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("user", user);
        FreeMarkertUtil.analysisTemplate("user.ftl", "UTF-8", root);
	}

}
