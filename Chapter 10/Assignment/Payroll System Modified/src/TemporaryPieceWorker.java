



public class TemporaryPieceWorker extends Employee {
    private double wage; // wage per piece
    private int pieces; // pieces produced

    // constructor
    public TemporaryPieceWorker(String firstName, String lastName, String socialSecurityNumber,
                                double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);
        {
            // validate wage
            if (wage < 0.0) { // validate wage
                throw new IllegalArgumentException("Hourly wage must be >= 0.0");
            }

            if (pieces < 0.0) { // validate pieces
                throw new IllegalArgumentException("Number of pieces produced must be >= 0");
            }

            this.wage = wage;
            this.pieces = pieces;
        }
    }

    // set wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }
    // return wage
    public double getWage() {
        return wage;
    }
    // set pieces produced
    public void setPieces(int pieces) {
        if (pieces < 0) { // validate pieces produces
            throw new IllegalArgumentException("Number of pieces produced must be >= 0");
        }
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }

    // calculate earnings; override abstract method earnings in Employee
    public double earnings() {
        return getWage() * getPieces();
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("temporary piece employee: %s%n%s: $%,.2f; %s: %d",
                super.toString(), "hourly wage", getWage(),
                "pieces produced", getPieces());
    }
}
