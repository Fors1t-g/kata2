package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Connection conn = Util.getConnection();

        if (conn != null) {
            System.out.println("dddd");
        } else {
            System.out.println("nnnn");
        }
        */

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("петя", "базарин", (byte) 30);
        userService.saveUser("никита", "базарин", (byte) 30);
        userService.saveUser("иван", "базарин", (byte) 30);
        userService.saveUser("семен", "базарин", (byte) 30);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
