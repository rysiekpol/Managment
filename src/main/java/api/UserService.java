package api;
import java.io.IOException;
import java.util.List;
import entity.User;
import exceptions.UserLoginAlreadyExistException;
import exceptions.UserShortLengthLoginException;
import exceptions.UserShortLengthPasswordException;

public interface UserService {

    boolean addUser(User user);
    void removeUserById(Long userId) throws IOException;
    List<User> getAllUsers() throws IOException;
    User getUserById(Long userId) throws IOException;
    User getUserByLogin(String login) throws IOException;
    boolean isCorrectLoginAndPassword(String login, String password);
}
