package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;
  public class HelloWorld extends AbstractController implements LastModified{
     private long lastModified;
	@Override
	public long getLastModified(HttpServletRequest request) {
		// TODO Auto-generated method stub
		if(lastModified==0L){
			lastModified=System.currentTimeMillis();
		}
		
		return lastModified;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
        response.getWriter().write("<a href=''>this</a>");
		return null;
	}
	  
  }



