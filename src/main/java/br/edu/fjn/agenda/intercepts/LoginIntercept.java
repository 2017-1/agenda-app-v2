/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.agenda.intercepts;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.edu.fjn.agenda.annotations.Public;
import br.edu.fjn.agenda.components.UserSession;
import br.edu.fjn.agenda.controllers.LoginController;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Intercepts
public class LoginIntercept implements Interceptor{

    @Inject
    private UserSession userSession;
    @Inject
    private Result result;
    
    @Override
    public void intercept(InterceptorStack stack, ControllerMethod method, Object controllerInstance) throws InterceptionException {
         if ( userSession.isLogged()){
            stack.next(method, controllerInstance);
         }else {
            result.redirectTo(LoginController.class).loginView();
         }  
    }

    @Override // method => Representa o método associado com a URL ( Rota )
    public boolean accepts(ControllerMethod method) {
        return !method.containsAnnotation(Public.class);
    }
    
}
