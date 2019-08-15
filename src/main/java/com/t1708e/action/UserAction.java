package com.t1708e.action;

import com.opensymphony.xwork2.ActionSupport;
import com.t1708e.entity.User;
import com.t1708e.service.UserDAO;
import com.t1708e.service.UserService;
import com.t1708e.util.HibernateUtil;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Map;

public class UserAction extends ActionSupport {
    private User currentUser;
    private UserDAO userService = new UserService();

    public String register(){
        this.currentUser = new User();
        return INPUT;
    }

    public String store(){
        userService.save(currentUser);
        return SUCCESS;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
