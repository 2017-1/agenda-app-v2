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
    
    @Get("novo")
    public void formView(){
      
    }
    
    @Post("salvar")
    public void save(Contact contact){
        result.include("contact", contact);
        result.redirectTo(this).formView();
              
    } 
    
    
  
    public void update(){}
    
    public void delete(){}
    
    public void listAll(){}
    
    public void listOneByCode(){}    

}
