package com.oneler.freemarker.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import freemarker.cache.TemplateLoader;

public class StringTemplateLoader implements TemplateLoader{

	@Override
	public Object findTemplateSource(String name) throws IOException {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public long getLastModified(Object templateSource) {
		// TODO Auto-generated method stub
		return System.currentTimeMillis();
	}

	@Override
	public Reader getReader(Object templateSource, String encoding)
			throws IOException {
		// TODO Auto-generated method stub
	    String ftlString = (String)templateSource;  
        return new StringReader(ftlString);
	}

	@Override
	public void closeTemplateSource(Object templateSource) throws IOException {
		// TODO Auto-generated method stub
		return;
		
	}

}
