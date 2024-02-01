public class Partner {
    // Attributes to store partner details
    private String name;
    private String type; // Type of organization (e.g., Corporation, Non-Profit)
    private String resources; // Resources offered by the partner
    private String contact; // Direct contact information

    // Constructor to initialize a new partner object
    public Partner(String name, String type, String resources, String contact) {
        this.name = name;
        this.type = type;
        this.resources = resources;
        this.contact = contact;
    }

    // Getters for accessing partner details
    public String getName() { return name; }
    public String getType() { return type; }
    public String getResources() { return resources; }
    public String getContact() { return contact; }

    // Override toString() for easy printing of partner details
    @Override
    public String toString() {
        return "Partner{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", resources='" + resources + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}