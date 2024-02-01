import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseManager {
    private List<Partner> partners; // List to store partner objects

    public DatabaseManager() {
        partners = new ArrayList<>(); // Initialize the list
    }

    // Adds a partner object to the list
    public void addPartner(Partner partner) {
        partners.add(partner);
    }

    // Searches partners by name, ignoring case
    public List<Partner> searchByName(String name) {
        return partners.stream()
                .filter(partner -> partner.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Filters partners by type, ignoring case
    public List<Partner> filterByType(String type) {
        return partners.stream()
                .filter(partner -> partner.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    // Returns all partners in the database
    public List<Partner> getAllPartners() {
        return new ArrayList<>(partners);
    }
}