package springmvc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import springmvc.model.UserModel;

import com.oneler.freemarker.User;

public class InfoFillWizardFormController extends AbstractWizardFormController {
	

	public InfoFillWizardFormController() {
		super();
		// TODO Auto-generated constructor stub
		setCommandClass(UserModel.class);
		setCommandName("user");
	}

	@Override
	protected ModelAndView processFinish(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println(command);  
        return new ModelAndView("redirect:/success");  
	}

	@Override
	protected Map referenceData(HttpServletRequest request, int page)
			throws Exception {
		// TODO Auto-generated method stub
		Map map=new HashMap();
			if(page==1){
				map.put("schoolTypeList", Arrays.asList("本科,专科","中学"));
			}
			if(page==2){
				map.put("cityList",Arrays.asList("beijing","tianjiang","shanghai"));
			}
		return map;
	}

	@Override
	protected void validatePage(Object command, Errors errors, int page) {
		// TODO Auto-generated method stub
		
		super.validatePage(command, errors, page);
	}

	@Override
	protected void postProcessPage(HttpServletRequest request, Object command,
			Errors errors, int page) throws Exception {
		// TODO Auto-generated method stub
		super.postProcessPage(request, command, errors, page);
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println(command);  
        return new ModelAndView("redirect:/cancel"); 
	}
	

}
