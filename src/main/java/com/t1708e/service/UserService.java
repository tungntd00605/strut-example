package com.t1708e.service;

import com.t1708e.entity.User;
import com.t1708e.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserService implements UserDAO{
    public boolean save(User user){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            if(transaction != null){
                transaction.rollback();
            }
            return false;
        }
        return true;
    }

    public User getUserById(String id){
        User user = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.load(User.class, id);;
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            if(transaction != null){
                transaction.rollback();
            }
        }
        return user;
    }
}
