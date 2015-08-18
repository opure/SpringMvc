package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import springmvc.model.User;

@SuppressWarnings("deprecation")
public class MyAbstractCommandController extends AbstractCommandController{
   
	public MyAbstractCommandController() {
		super();
		// TODO Auto-generated constructor stub
		setCommandClass(springmvc.model.User.class);
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		User user=(User)command;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("abstractCommand");
		mv.addObject("user",user);
		return mv;
	}

}
