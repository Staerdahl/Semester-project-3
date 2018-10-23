/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Acquaintance.IBusiness;
import Acquaintance.IPresentation;

/**
 *
 * @author Sigurd E. Espersen
 */
public class PresentationFacade implements IPresentation {
    
    private IBusiness Ibus;
    private SYNchat synchat;

    private static PresentationFacade instance = null;

    private PresentationFacade() {
    }

    public static PresentationFacade getInstance() {
        if (instance == null) {
            instance = new PresentationFacade();
        }
        return instance;
    }
    
    @Override
    public void injectBusiness(IBusiness bus) {
       this.Ibus = bus;
    }
    
    public int hashLogin(String mail, String pw) {
        return Ibus.Login(mail, pw);
    }
    
    //Call from Starter to SYNchat with System Startup command
    @Override
    public void startApplication(String[] args) {
        if (synchat == null) {
            synchat = new SYNchat();
        }
        synchat.startApplication(args);
    }
    
    @Override
    public boolean registerNewUser(String firstName, String lastName, String email, String password) {
        return Ibus.registerNewUser(firstName, lastName, email, password);
    }
}