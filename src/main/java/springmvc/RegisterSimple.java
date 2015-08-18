package springmvc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import springmvc.model.User;


public class RegisterSimple extends SimpleFormController {
	

	public RegisterSimple() {
		super();
		// TODO Auto-generated constructor stub
		setCommandClass(User.class);
		setCommandName("user");
 	}
	@Override
    protected Object formBackingObject(HttpServletRequest request) {
        User user=new User();
        user.setName("请输入名字");
        return user;
		
	}
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("citylist",Arrays.asList("beijing","shanghai","henan"));
		return map;
	}

	@Override
	protected void doSubmitAction(Object command) throws Exception {
		// TODO Auto-generated method stub
		  User user=(User)command;
		  System.out.println(user);
	}
	
	

}
