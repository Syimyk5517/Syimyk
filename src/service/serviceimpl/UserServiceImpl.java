package service.serviceimpl;

import model.Book;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
   private List<User> users1 = new ArrayList<>();
    @Override
    public String createUser(List<User> users) {
        users1.addAll(users);
        return null;
    }

    @Override
    public List<User> findAllUsers() {

        return users1;
    }

    @Override
    public User findUserById(Long id) {
        return users1.stream().filter(user -> user.getId().equals(id)).findAny().orElseThrow();
    }

    @Override
    public String removeUserByName(String name) {
        users1.removeIf(user -> user.getName().equals(name));
        return "succues";
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        for (User name2:users1) {
            if (name.equalsIgnoreCase(name2.getName())){
                while (true){
                System.out.println(books);
                System.out.println("Algyn kelgen kiteptin atyn jaz");
                String scanerName = new  Scanner(System.in).nextLine();
                 for (Book nam:books) {
                     if (scanerName.equalsIgnoreCase(nam.getName())){

                     }



                    }
                }
            }

        }
        return null;
    }
}
