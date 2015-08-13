package com.oneler.mybatis.mapper;

public class User {
    private Integer id;

    private String userName;

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}



	private Integer userAge;

    private String userAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Integer getUserAge() {
        return userAge;
    }


}