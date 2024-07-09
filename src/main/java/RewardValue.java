public class RewardValue {
    private double cashValue;
    private double milesValue;

    private double miles_to_cash_rate;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * miles_to_cash_rate;
        } else {
            this.cashValue = milesValue;
            this.milesValue = milesValue / 0;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    public int convertCashToMiles() {
        return (int) (cashValue / miles_to_cash_rate);
    }

    public double convertMilesToCash() {
        return milesValue * miles_to_cash_rate;
    }

    public static  void main(String[] args) {

        RewardValue rewardInCash = new RewardValue(100); // cash value
        System.out.println("Cash value: $" + rewardInCash.getCashValue());
        System.out.println("Miles value: " + rewardInCash.getMilesValue() + " miles");

        RewardValue rewardInMiles = new RewardValue(1000, true); // miles value
        System.out.println("Cash value: $" + rewardInMiles.getCashValue());
        System.out.println("Miles value: " + rewardInMiles.getMilesValue() + " miles");
    }
}
