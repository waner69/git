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
        Integer id = user.getId();
        String name = user.getName();
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("user = " + user);
        System.out.println("name = " + name);
        System.out.println("user = " + user);
        System.out.println("args = " + Arrays.toString(args));
    }
}
