1. example with constractor injesction

<bean id="myFortune"
class="com.luv2code.springdemo.HappyFortuneService">
</bean>

<bean id="myCoach"
class="com.luv2code.springdemo.TrackCoach">   

<!--set up constructor injection -->
<constructor-arg ref="myFortune" />
</bean>




2. example with setter injection

<bean id "myFortuneService"
    class="com.luv2code.springdemo.HappyFortuneService">
</bean>

spring framework create new object
HappyFortuneService myFortuneService =
                    new HappyFortuneService();




<bean id="myCricketCoach"
    class="om.luv2code.springdemo.CricketCoach">
    <property name="fortuneService" ref="myFortuneService" />
</bean>

Spring Framework create new coach and call Setter method 
CricketCoach myCricketCoach = new CricketCoach();
myCricketCoach.setFortuneService(myFortuneService);