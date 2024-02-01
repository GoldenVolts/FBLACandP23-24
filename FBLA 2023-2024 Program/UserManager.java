import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users; // Map usernames to User objects

    public UserManager() {
        users = new HashMap<>();
        initializeSampleUsers(); // Populate with initial sample users
    }

    // Adds a new user, returns false if username is already taken
    public boolean addUser(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Username already exists
        }
        users.put(username, new User(username, password));
        return true;
    }

    // Checks if the username and password are correct
    public boolean authenticateUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    // Populate the database with sample users
    private void initializeSampleUsers() {
        // Add sample users here
        addUser("user1", "password123");
        addUser("user2", "pass456");
        // Add more sample users as needed
    }
}