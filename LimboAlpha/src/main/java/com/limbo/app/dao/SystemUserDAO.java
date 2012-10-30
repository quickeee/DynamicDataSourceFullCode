package com.limbo.app.dao;

import java.util.List;

import com.limbo.app.domain.SystemUser;

public interface SystemUserDAO {

    public void addUser(SystemUser user);

    public List<SystemUser> listUser();

    public void removeUser(Integer id);
    
    public SystemUser getUser(Integer id);
    
    public void updateUser(SystemUser repair);
    
    public SystemUser getUserByUsername(String username);
}