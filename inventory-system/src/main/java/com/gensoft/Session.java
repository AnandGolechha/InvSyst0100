package com.gensoft;

import java.util.Date;

import org.springframework.util.StringUtils;

/**
 * Gensoft application session class.
 * <p>
 * 
 * @author Anand Golechha
 *
 */
public class Session {
	
	/** User identifier */
	private int userID;
	
	/** User first name */
	private String userFirstName;
	
	/** User's last name */
	private String userLastName;
	
	/** Login time */
	private Date loginDateAndTime;

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * @return the userFirstName
	 */
	public String getUserFirstName() {
		return StringUtils.trimWhitespace(userFirstName);
	}

	/**
	 * @param userFirstName the userFirstName to set
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	/**
	 * @return the userLastName
	 */
	public String getUserLastName() {
		return StringUtils.trimWhitespace(userLastName);
	}

	/**
	 * @param userLastName the usersLastName to set
	 */
	public void setUserLastName(String usersLastName) {
		this.userLastName = usersLastName;
	}

	/**
	 * @return the loginDateAndTime
	 */
	public Date getLoginDateAndTime() {
		return loginDateAndTime;
	}

	/**
	 * @param loginDateAndTime the loginDateAndTime to set
	 */
	public void setLoginDateAndTime(Date loginDateAndTime) {
		this.loginDateAndTime = loginDateAndTime;
	}
}
