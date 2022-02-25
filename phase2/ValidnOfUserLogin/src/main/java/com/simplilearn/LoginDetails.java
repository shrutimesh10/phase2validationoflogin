package com.simplilearn;

import java.util.HashMap;

public class LoginDetails {
	private static LoginDetails loginDetails = new LoginDetails();
	private static HashMap<String, String> map;
	
	static {
		map = new HashMap<String, String>();
		map.put("shru1@gmail.com", "shru@1");
		map.put("panku2@gmail.com", "panku@2");
		map.put("darsh3@gmail.com", "darsh@3");
		map.put("sneha4@gmail.com", "sneha@4");
		map.put("prit5@gmail.com", "prit@5");
	}

	/**
	 * This class is single tone class so we declared private constructor
	 */
	private LoginDetails() { }
	
	public static LoginDetails getInstance() {
		return loginDetails;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public boolean isLoginCreadetialsCorrect(final String username, final String password) {
		boolean isLoginCreadetialsCorrect = false;
		boolean nullFlagUsername = (username != null && !username.isEmpty()) ? true : false;
		boolean nullFlagPassword = (password != null && !password.isEmpty()) ? true : false;

		if(nullFlagUsername && nullFlagPassword) {
			if(map.containsKey(username) ) {
				String mapValue = map.get(username);
				if(mapValue.equals(password)) {
					isLoginCreadetialsCorrect = true;
				}
			}
		}
		return isLoginCreadetialsCorrect;



}
	
}
