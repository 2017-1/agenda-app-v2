/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agenda.components;

import br.edu.fjn.agenda.domain.contact.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author leonardo
 * 
 */
@ApplicationScoped
public class ContactListDB {

    private List<Contact> contactDB = new ArrayList<>();
    
    public ContactListDB() {
        
        contactDB.add(new Contact("Joazinho", "88999000"));
        contactDB.add(new Contact("Mariazinha", "88999000"));
        contactDB.add(new Contact("Zezim", "88999000"));
    }

    public List<Contact> getContactDB() {
        return contactDB;
    }
    
    public Contact findByCode(String code){
        Contact contactFromDB = null;
        for (Contact contact : contactDB) {
            if (contact.getCode().equals(code)){
               contactFromDB = contact;
               break;
            }
        }
        return contactFromDB;
    }
    
    public void save(Contact contact){
       contactDB.add(contact);
    }
    
    public void update(Contact contact){
        for (Contact contactFromDB : contactDB) {
            if (contactFromDB.getCode().equals(contact.getCode())){
               int position = contactDB.indexOf(contactFromDB);
               System.out.println("Pos " + position);
               contactDB.set(position, contact);
            }
        }
    }

    public List<Contact> findByName(String name) {
        List<Contact> contactList = new ArrayList<>();
        for (Contact contactFromDB : contactDB) {
            if (contactFromDB.getName().startsWith(name)){
               contactList.add(contactFromDB);
            }
        }
        return contactList;
    }

    public void remove(String code) {
        Contact contact = findByCode(code);
        contactDB.remove(contact);
    }
    
}
