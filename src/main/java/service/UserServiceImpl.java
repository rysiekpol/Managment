package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import api.UserDao;
import api.UserService;
import dao.UserDaoImpl;
import entity.User;
import exceptions.UserLoginAlreadyExistException;
import exceptions.UserShortLengthLoginException;
import exceptions.UserShortLengthPasswordException;
import validator.UserValidator;

public class UserServiceImpl implements UserService {

    private static UserServiceImpl instance = null;
    private UserDao userDao = UserDaoImpl.getInstance();
    private UserValidator userValidator = UserValidator.getInstance();

    private UserServiceImpl() {

    }

    public static UserServiceImpl getInstance() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;

    }
    List<User> users;

    public UserServiceImpl(List<User> users) {
        this.users = users;
    }
    public List<User> getAllUsers() throws IOException {
        return users;
    }
    public void addUser(User user) throws IOException, UserLoginAlreadyExistException, UserShortLengthLoginException, UserShortLengthPasswordException {
        if (userValidator.isValidate(user)) {
            userDao.saveUser(user);
        }
    }
    public void removeUserById(Long userId) throws IOException {
        for(int i=0;i<users.size();i++){
            User userFromList = users.get(i);
            if (userFromList.getId() == userId) {
                users.remove(i);
                break;
            }
        }
    }
}
