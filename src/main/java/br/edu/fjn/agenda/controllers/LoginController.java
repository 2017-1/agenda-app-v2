/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agenda.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
public class LoginController {

    @Inject
    private Result result;
    
    @Get("login")
    public void loginView() {
    }

    @Post("logar")
    public void authenticate(String username, String password) {
        if (username.equalsIgnoreCase("joão")
                && password.equalsIgnoreCase("123")) {
            
        }

    }

    public void logout() {
    }
}
