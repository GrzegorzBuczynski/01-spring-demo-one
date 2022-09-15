package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService thefortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.thefortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {

        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + thefortuneService.getFortune();
    }

    // add init method
    public void doMyStartapStuff() {
        System.out.println("trackCoach: inside method doMyStartapStuff");
    }

    // add destroy method
    public void doMyCleanUpStaff() {
        System.out.println("TrackCoach: inside method doMyCleanUpStaff");
    }

}
