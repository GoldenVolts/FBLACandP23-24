import java.util.List;
public class backendFBLA {
    private DatabaseManager dbManager; // Instance of DatabaseManager to manage data
    private UserManager userManager;
    public backendFBLA() {
        dbManager = new DatabaseManager();
        initializeSamplePartners(); // Populate initial data on creation
    }

    // Populates the database with sample partner data
    private void initializeSamplePartners() {
        // Add sample partner data here
        dbManager.addPartner(new Partner("Tech Innovations Inc.", "Corporation", "Internships, Workshops", "contact@techinnovations.com"));
        // Add more sample data as needed
    }

    // Adds a new partner with the given details
    public String addPartner(String name, String type, String resources, String contact) {
        Partner newPartner = new Partner(name, type, resources, contact);
        dbManager.addPartner(newPartner);
        return "Partner added successfully.";
    }

    // Searches for partners by name
    public List<Partner> searchPartnerByName(String name) {
        return dbManager.searchByName(name);
    }

    // Filters partners by type
    public List<Partner> filterPartnerByType(String type) {
        return dbManager.filterByType(type);
    }

    // Retrieves all partners
    public List<Partner> getAllPartners() {
        return dbManager.getAllPartners();
    }

    // Register a new user
    public String registerUser(String username, String password) {
        // Use the userManager instance to call the addUser method
        boolean success = userManager.addUser(username, password);
        return success ? "User registered successfully." : "Username already exists.";
    }

    public boolean loginUser(String username, String password) {
        // Use the userManager instance to call the authenticateUser method
        return userManager.authenticateUser(username, password);
    }
}
