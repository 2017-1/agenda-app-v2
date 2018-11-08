/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agenda.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.agenda.annotations.Public;
import br.edu.fjn.agenda.components.UserSession;

/**
 *
 * @author leonardo
 */
@Controller
public class LoginController {

    @Inject
    private Result result;
    @Inject	
    private UserSession userSession;
    
    @Public
    @Get("login")
    public void loginView() {
    }

    @Public
    @Post("logar")
    public void authenticate(String username, String password) {
        if (username.equalsIgnoreCase("joão")
                && password.equalsIgnoreCase("123")) {       	
            result.redirectTo(HomeController.class).home();
            userSession.setLogged(true);
        }

    }

    public void logout() {
    }
}
