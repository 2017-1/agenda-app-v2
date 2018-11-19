/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agenda.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.agenda.components.ContactListDB;
import br.edu.fjn.agenda.domain.contact.Contact;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
@Path("contato")
public class ContactController {
    
    @Inject
    private Result result;
    @Inject
    private ContactListDB contactListDB;
    
    @Get("novo")
    public void formView(){
         /* se o user está logado (Session)?
          * True -> Deixo ele acessar formView
          * False -> Mando ele para loginView
          * 
          * */      
    }
    
    @Post("salvar")
    public void save(Contact contact){
        contactListDB.save(contact);
        result.redirectTo(this).listView();
              
    } 
    
    
  
    @Post("atualizar")
    public void update(Contact contact){
        contactListDB.update(contact);
        result.redirectTo(this).listView();
    
    }
    
    public void delete(){}
    
    @Get("listar")
    public void listView(){     
        result.include("contactList", contactListDB.getContactDB());
    }
    
    @Get("detalhar/{code}")
    public void listOneByCode(String code){
       Contact contact = contactListDB.findByCode(code);
       result.include("contact", contact);
       result.redirectTo(this).updateView();
              
    }    
    
    public void updateView(){
    
    }

}
