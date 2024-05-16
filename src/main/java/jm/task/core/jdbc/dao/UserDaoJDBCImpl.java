package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
//        String sql_query = """
////                CREATE TABLE IF NOT EXISTS `my_db`.`users` (
////                  `id` INT NOT NULL AUTO_INCREMENT,
////                  `name` VARCHAR(45) NULL,
////                  `lastname` VARCHAR(45) NULL,
////                  `age` INT(3) NULL,
////                  PRIMARY KEY (`id`))
////                COMMENT = '\t\t';""";
////        Statement statement = Util.getConnect();
//        try {
//            statement.execute(sql_query);
//
//            statement.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void dropUsersTable() {
//        String sql_query = "DROP TABLE IF EXISTS `my_db`.`users`";
//        Statement statement = Util.getConnect();
//        try {
//            statement.execute(sql_query);
//            statement.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

    }

    public void saveUser(String name, String lastName, byte age) {
//        String sql_query = String.format("INSERT INTO `my_db`.`users` (name,lastname,age) VALUES  ('%s','%s',%d)", name, lastName, age);
//        Statement statement = Util.getConnect();
//        try {
//            statement.execute(sql_query);
//            System.out.println("User с именем - " + name + " добавлен в таблицу");
//            statement.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void removeUserById(long id) {
//        String sql_query = String.format("DELETE FROM `my_db`.`users` WHERE id = %s", id);
//        Statement statement = Util.getConnect();
//        try {
//            statement.execute(sql_query);
//            statement.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public List<User> getAllUsers() {
//        List<User> list = new ArrayList<>();
//        String sql_query = "SELECT * FROM my_db.users;";
//        Statement statement = Util.getConnect();
//        try {
//            ResultSet res = statement.executeQuery(sql_query);
//            while (res.next()) {
//                String name = res.getString("name");
//                String lastname = res.getString("lastname");
//                byte age = res.getByte("age");
//                list.add(new User(name, lastname, age));
//            }
//            statement.close();
//            return list;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        return  null;
    }

    public void cleanUsersTable() {
//        String sql_query = "DELETE FROM `my_db`.`users`";
//        Statement statement = Util.getConnect();
//        try {
//            statement.execute(sql_query);
//            statement.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
