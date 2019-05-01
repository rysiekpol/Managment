package api;
import java.io.IOException;
import java.util.List;
import entity.User;
import exceptions.UserLoginAlreadyExistException;
import exceptions.UserShortLengthLoginException;
import exceptions.UserShortLengthPasswordException;

public interface UserService {

    List<User> getAllUsers() throws IOException;
    void addUser(User user) throws IOException, UserShortLengthPasswordException, UserShortLengthLoginException, UserLoginAlreadyExistException;
    void removeUserById(Long getId) throws IOException;
}
