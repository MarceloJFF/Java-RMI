package com.app.Controllers;

import com.app.Dao.DaoGenerico;
import com.app.model.PhoneBookContact;

public class PhoneBookController {
    private DaoGenerico<PhoneBookContact> dao = null;
    
    public PhoneBookController(){
        dao = dao.getIntance();
    }

    public boolean salvar(PhoneBookContact phoneBookContact){
        return dao.salvar(phoneBookContact);
    }

    public PhoneBookContact get(Integer id){
        return  dao.get(PhoneBookContact.class, id);
    }

    public boolean excluir(PhoneBookContact phoneBookContact){
        return dao.excluir(phoneBookContact);
    }
}
