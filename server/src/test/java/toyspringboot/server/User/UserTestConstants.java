package toyspringboot.server.User;

import toyspringboot.server.DefaultTestConstants;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class UserTestConstants extends DefaultTestConstants {
    // ---------- API ----------
    public static final String SignIn_API = "/users/user";
    public static final String SignUp_API = "/users/newUser";
    public static final String UpdateUser_API = "/users/user";
    public static final String DeleteUser_API = "/users/user";

    // ---------- test information ----------
    // 존재하지 않는 유저
    public static final String User_email = "testEmail@junyoung.com";
    public static final String User_password = "testPassword";
    public static final Boolean User_admin = false;
    public static final Boolean User_IsDeleted = true;


    // 존재하는 유저
    public static final String Exist_User_email = "user@junyoung.com";
    public static final String Exist_User_password = "password123";
    public static final Boolean Exist_User_admin = true;
    public static final Boolean Exist_User_isDeleted = false;


    // ---------- response message ----------
}
