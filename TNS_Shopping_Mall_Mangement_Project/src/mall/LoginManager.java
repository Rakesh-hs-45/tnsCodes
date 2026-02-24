package mall;

import java.util.HashMap;

public class LoginManager {

    private final String ADMIN_USER="admin";
    private final String ADMIN_PASS="1234";

    private HashMap<String,String> shopUsers=new HashMap<>();

    public LoginManager(){
        shopUsers.put("electronics","1111");
    }

    public boolean adminLogin(String u,String p){
        return ADMIN_USER.equals(u) && ADMIN_PASS.equals(p);
    }

    public boolean shopLogin(String u,String p){
        return shopUsers.containsKey(u) && shopUsers.get(u).equals(p);
    }
}