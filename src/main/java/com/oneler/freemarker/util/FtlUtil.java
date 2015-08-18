package com.oneler.freemarker.util;

public class FtlUtil {
	public static String renderFile(Object dataModel, String ftlFile)throws Exception{
		String ret = ClassPathTemplateRender.getInstance().render(dataModel, ftlFile);
		return ret;
	}
	
}
