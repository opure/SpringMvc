package com.oneler.freemarker.util;

import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.Locale;

import com.mysql.jdbc.Buffer;
import com.oneler.freemarker.Dao.TemplateRender;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class ClassPathTemplateRender implements TemplateRender {
	   private static Configuration config=null;
	   public static ClassPathTemplateRender getInstance(){
		   return new ClassPathTemplateRender();
	   }
	   public ClassPathTemplateRender(){
		   if(config==null){
			   config=new Configuration();
			   config.setClassForTemplateLoading(this.getClass(), "/com/oneler/freemarker/template");
			   try {
				config.setSetting("datetime_format", "yyyy-MM-dd HH:mm:ss");
			} catch (TemplateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   config.setLocale(Locale.CHINA);
		   }
	   }
	@Override
	public String render(Object dataModel, String template) throws Exception {
		// TODO Auto-generated method stub
		StringWriter stringWriter=new StringWriter();
		BufferedWriter write=new BufferedWriter(stringWriter);
		Template template1=config.getTemplate("test.ftl",Locale.CHINA,"UTF-8");
		template1.process(dataModel, write);
		write.flush();
		return stringWriter.toString();
	}

}
