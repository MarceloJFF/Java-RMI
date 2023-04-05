package com.app.Controllers;

import com.app.Dao.DaoGenerico;
import com.app.model.User;

public class UserController {
    private DaoGenerico<User> dao = null;
    
    public UserController(){
        dao = dao.getIntance();
    }

    public boolean salvar(User u){
        return dao.salvar(u);
    }

    public User get(Integer id){
        return   dao.get(User.class, id);
    }
    
    public boolean excluir(User u){
        return dao.excluir(u);
        
    }
}
