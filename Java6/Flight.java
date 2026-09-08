public class Flight {

    private int code;
    private String carrier;
    private String source;
    private String destination;

    // Default constructor
    public Flight() {
    }

    // Parameterized constructor
    public Flight(int code, String carrier, String source, String destination) {
        this.code = code;
        this.carrier = carrier;
        this.source = source;
        this.destination = destination;
    }

    // toString method
    @Override
    public String toString() {
        return "Flight [Code=" + code
                + ", Carrier=" + carrier
                + ", Source=" + source
                + ", Destination=" + destination + "]";
    }

    // Getters and Setters

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}