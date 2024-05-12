package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Name1", "LastName1", (byte) 20);
        service.saveUser("Name2", "LastName2", (byte) 25);
        service.saveUser("Name3", "LastName3", (byte) 31);
        service.saveUser("Name4", "LastName4", (byte) 38);
        List<User> ls = service.getAllUsers();
        for (User i : ls) System.out.println(i.toString());
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}