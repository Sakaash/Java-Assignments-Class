public class Flight {
    private final String flightNo;
    private final String destination;
    private final String startLocation;
    private String arrivalTime;
    private String departureTime;

    private static int flightCount = 0;

    public Flight(String flightNo, String destination, String startLocation, String arrivalTime, String departureTime) {
        if (flightNo == null || flightNo.isEmpty())
                throw new IllegalArgumentException("Flight number cannot be empty");
        this.flightNo = flightNo;
        if (destination == null || destination.isEmpty())
            throw new IllegalArgumentException("Destination cannot be empty");
        this.destination = destination;
        if (startLocation == null || startLocation.isEmpty())
            throw new IllegalArgumentException("Start location cannot be empty");
        this.startLocation = startLocation;
        setArrivalTime(arrivalTime);
        setDepartureTime(departureTime);
        flightCount++;
    }

    public String getFlightNo() {
        return flightNo;
    }
    public String getDestination() {
        return destination;
    }
    public String getStartLocation() {
        return startLocation;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime){
        if (arrivalTime == null || arrivalTime.isEmpty())
            throw new IllegalArgumentException("Arrival time cannot be empty");
        this.arrivalTime = arrivalTime;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime){
        if (departureTime == null || departureTime.isEmpty())
            throw new IllegalArgumentException("Departure time cannot be empty");
        this.departureTime = departureTime;
    }
}
