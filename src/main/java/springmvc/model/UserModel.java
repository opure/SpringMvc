package springmvc.model;

public class UserModel {
   private String username;
   private String passworld;
   private String realname;
   private WrorkInfoModel workInfo;
   private SchoolInfoModel 	schoolInfo;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassworld() {
	return passworld;
}
public void setPassworld(String passworld) {
	this.passworld = passworld;
}
public String getRealname() {
	return realname;
}
public void setRealname(String realname) {
	this.realname = realname;
}
public WrorkInfoModel getWorkInfo() {
	return workInfo;
}
public void setWorkInfo(WrorkInfoModel workInfo) {
	this.workInfo = workInfo;
}
public SchoolInfoModel getSchoolInfo() {
	return schoolInfo;
}
public void setSchoolInfo(SchoolInfoModel schoolInfo) {
	this.schoolInfo = schoolInfo;
}
}
