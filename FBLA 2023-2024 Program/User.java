public class User {
    private String username;
    private String password; // In a real-world scenario, this should be hashed

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    // Password should not have a getter in a real-world scenario
    public String getPassword() {
        return password;
    }
}