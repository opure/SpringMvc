package springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.web.servlet.ModelAndView;

import springmvc.model.UserModel;

public class MultiActionController extends org.springframework.web.servlet.mvc.multiaction.MultiActionController{
	private UserService userService;
     private String createView;
     private String updateView;
     private String deleteView;
     private String listView;
     private String redirectToListView;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getCreateView() {
		return createView;
	}
	public void setCreatwView(String creatView) {
		this.createView = creatView;
	}
	public String getUpdateView() {
		return updateView;
	}
	public void setUpdateView(String updateView) {
		this.updateView = updateView;
	}
	public String getDeleteView() {
		return deleteView;
	}
	public void setDeleteView(String deleteView) {
		this.deleteView = deleteView;
	}
	public String getListView() {
		return listView;
	}
	public void setListView(String listView) {
		this.listView = listView;
	}
	public String getRedirectToListView() {
		return redirectToListView;
	}
	public void setRedirectToListView(String redirectToListView) {
		this.redirectToListView = redirectToListView;
	}
	public String create(HttpServletRequest request,HttpServletResponse response,UserModel user){
		if("GET".equals(request.getMethod())){
			return getCreateView();
		}
		userService.create(user);
		return getRedirectToListView();
		
	}
    public ModelAndView update(HttpServletRequest request,HttpServletResponse response,UserModel user){
    	if("GET".equals(request.getMethod())){
    		ModelAndView mv=new ModelAndView();
    		mv.addObject("command", userService.get(user.getUsername()));
    		mv.setViewName(getUpdateView());
    		return mv;
    	}
    	userService.update(user);
    	return new ModelAndView(getRedirectToListView());
    }
    public ModelAndView list(HttpServletRequest request,HttpServletResponse response,UserModel user){
    	ModelAndView mv=new ModelAndView();
    	mv.addObject("userList",userService.list());
    	mv.setViewName(getListView());
    	return mv;
    }
	protected String getCommand(Object command){
		return "command";
	}
     
}
