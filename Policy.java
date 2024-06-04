public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // No-arg constructor
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    // Parameterized constructor
    public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Setters and getters
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateBMI() {
        if (height == 0) {
            return 0;
        }
        return (weight * 703.0) / (height * height);
    }

    public double calculateInsurancePrice() {
        double baseFee = 600;
        double ageFee = age > 50 ? 75 : 0;
        double smokingFee = smokingStatus.equalsIgnoreCase("smoker") ? 100 : 0;
        double bmi = calculateBMI();
        double bmiFee = bmi > 35 ? (bmi - 35) * 20 : 0;

        return baseFee + ageFee + smokingFee + bmiFee;
    }
}