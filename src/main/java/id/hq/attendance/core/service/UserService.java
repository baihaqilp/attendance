package id.hq.attendance.core.service;

import id.hq.attendance.core.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User registerUser(User user);

    public User getUserByEmail(String email);

    public User getUserByName(String name);
}
