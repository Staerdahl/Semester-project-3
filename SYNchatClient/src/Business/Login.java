package Business;

import Acquaintance.ILogin;
import Acquaintance.IUser;
import java.io.Serializable;

/**
 *
 * @author Group 9
 */
public class Login implements ILogin, Serializable {

    private String hMail;
    private String hPW;
    private int loginvalue = -1;
    private IUser user = null;

    public Login(String mail, String pw) {
        hMail = mail;
        hPW = pw;
    }

    public Login(int loginvalue, IUser user) {
        this.loginvalue = loginvalue;
        this.user = user;
        this.hMail = null;
        this.hPW = null;
    }

    @Override
    public String gethMail() {
        return hMail;
    }

    @Override
    public String gethPW() {
        return hPW;
    }

    @Override
    public int getLoginvalue() {
        return loginvalue;
    }

    @Override
    public IUser getUser() {
        return user;
    }

    @Override
    public void setLoginvalue(int loginvalue) {
        this.loginvalue = loginvalue;
    }

    @Override
    public void setUser(IUser user) {
        this.user = user;
    }

    @Override
    public int login(ILogin finalLogin) {

        if (finalLogin.getLoginvalue() == 2) {
            User currentUser = new User(finalLogin.getUser());
            ClientSystem.getInstance().setUser(currentUser);
        }
        return finalLogin.getLoginvalue();
    }
}
