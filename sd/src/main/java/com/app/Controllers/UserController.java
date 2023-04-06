package com.app.Controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.app.Dao.DaoGenerico;
import com.app.InterfaceRMI.InterfaceRMI;
import com.app.model.User;

public class UserController  extends UnicastRemoteObject implements InterfaceRMI<User> {
    private DaoGenerico<User> dao = null;
    
    public UserController() throws RemoteException {
        dao = dao.getIntance();
    }

    @Override
    public boolean salvar(User u){
        return dao.salvar(u);
    }

    @Override
    public User get(Integer id){
        return   dao.get(User.class, id);
    }
    @Override
    public boolean excluir(User u){
        return dao.excluir(u);
        
    }
}
