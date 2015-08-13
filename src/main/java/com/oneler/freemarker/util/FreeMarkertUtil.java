package com.oneler.freemarker.util;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
 public class FreeMarkertUtil {
	  public static void analysisTemplate(String templateName,
	             String templateEncoding, Map<?, ?> root) {
	        try {
	             Configuration config = new Configuration();
                File file = new File("d:\\templates");
	            config.setDirectoryForTemplateLoading(file);
	            config.setObjectWrapper(new DefaultObjectWrapper());
	          Template template = config.getTemplate(templateName,templateEncoding);
	             Writer out = new OutputStreamWriter(System.out);
	             template.process(root, out);
	             out.flush();
	            out.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (TemplateException e) {
             e.printStackTrace();
	        }
	 
	     }
 }