package kielce.tu.weaii.telelearn.exceptions;

public class ScheduleBeyondTheDay extends BusinessLogicException {
    public ScheduleBeyondTheDay() {
        super("The plan entry would extend beyond the day.");
    }
}
