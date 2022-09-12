package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // public CricketCoach(FortuneService fortuneService) {
    // this.thefortuneService = fortuneService;
    // }

    public CricketCoach() {
        System.out.println("CricketCoach: insade no-arg constructor");
     }

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: insade setter method setFortuneService");
        this.fortuneService = fortuneService;
    }



    
}
