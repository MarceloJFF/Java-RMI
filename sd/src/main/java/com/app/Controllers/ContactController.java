package com.app.Controllers;
import com.app.Dao.DaoGenerico;
import com.app.model.Contact;

public class ContactController {
    private DaoGenerico<Contact> dao = null;

    public ContactController(){
        dao = dao.getIntance();
    }

    public boolean salvar(Contact c){
        return dao.salvar(c);
    }

   
    public Contact get(Integer id){
        return dao.get(Contact.class, id);
    }

    public boolean excluir(Contact c){
        return dao.excluir(c);
    }
}
