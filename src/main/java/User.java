/*
    Author: 刘子阳.
    Date: 2022-06-22 12:30.
    Created by IntelliJ IDEA.
*/

import lombok.Data;

import java.util.Arrays;

@Data
public class User {
    private Integer id;
    
    private String name;
    
    public static void main(String[] args) {
        User user = new User();
        user.setId(19);
        user.setName("lzy");
        System.out.println("user = " + user);
    }
}
