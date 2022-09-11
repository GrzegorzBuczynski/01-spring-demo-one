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

}
