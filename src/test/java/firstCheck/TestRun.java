package firstCheck;


import Clients.RestClients;
import Entities.Login.LoginRequest;
import Entities.Login.LoginResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Helpers.ConfigurationInfo.URL;
import static Helpers.ConfigurationInfo.USERSINFO;


public class TestRun {
    String url = URL +"/artifactory/api/auth/login";
    RestClients r = new RestClients();
    LoginRequest loginRequest;

    LoginResponse response;



    @Test
    public void TestI() {
        loginRequest= new LoginRequest();
        loginRequest.setPassword(USERSINFO.getUserByType("admin").password);
        loginRequest.setUser(USERSINFO.getUserByType("admin").login);
        response =  r.getPostAsEntity(url,loginRequest,LoginResponse.class);
        Assert.assertNotNull(response);
        Assert.assertEquals(response.getAdmin().booleanValue(),true);
    }
  @Test
    public void Test1() {
        loginRequest= new LoginRequest();
        loginRequest.setPassword(USERSINFO.getUserByType("admin").password);
        loginRequest.setUser(USERSINFO.getUserByType("admin").login);
        response =  r.getPostAsEntity(url,loginRequest,LoginResponse.class);
        Assert.assertNotNull(response);
        Assert.assertEquals(response.getAdmin().booleanValue(),true);
    }

    @Test
    public void Test2() {
        loginRequest= new LoginRequest();
        loginRequest.setPassword(USERSINFO.getUserByType("admin").password);
        loginRequest.setUser(USERSINFO.getUserByType("admin").login);
        response =  r.getPostAsEntity(url,loginRequest,LoginResponse.class);
        Assert.assertNotNull(response);
        Assert.assertEquals(response.getAdmin().booleanValue(),true);
    }


}
