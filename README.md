# README #

**Name:**	Adityaa Ravi

**Period:**	3

**Game Title:** Lunar pilot

## Game Proposal ##

I am planning to make a space-vehicle simulator, where the player will be able to drive multiple vehicles 
throughout the course of the game. The primary objective for the player will be to navigate through a series
of obstacles to reach a final destination. But because I am not sure on how to make the world move with the
player, each level (or world) itself will be static and the player will be the only moving part. I am planning
to include simple gravity physics, where each vehicle will fall down at different paces based on their weight. 
I am also not planning to let each spacecraft rotate, as then I will have to change the direction of movement
of each control based on the orientation, which will make it too complex.

Game Controls:

+ Keyboard controls to make each vehicle move up, to the left and right.
+ The user will have to use the gravity to bring the vehicle down, using proper timing to bring it down at the right time and speed.

Game Elements:

+ Simple gravity physics that accelerate different objects at different rates based on their weight.
+ Static levels each with a simple vertical maze that the player has to navigate.
+ A minimum of two different levels.
+ Different vehicles available for use in different levels.
+ A maximum speed at which the space craft can land on the ground without destroying it.
+ The player will immediately loose the game if they touch any surface that isn't ground.
+ The player will also immediately loose if they go out of bounds of the screen.

How to Win:

+ Use the keyboard to control upward and left/right thrusters to move the craft.
+ Use gravity to bring the spacecraft down, but use the thrusters to ensure that you don't fall too fast.
+ Don't touch any walls or go out of bounds.

## Link Examples ##

+ https://play.google.com/store/apps/details?id=com.topsecretdevelopments.lunarRescueMission&hl=en [My inspiration for this game]

## Teacher Response ##

**Approved**

Looks like a good plan.

## Class Design and Brainstorm ##

Put all your brainstorm ideas, strategy approaches, and class outlines here

+ Each level is going to be its own subclass of World, so essentially, when the levels have to be switched, a new object of the next level subclass must be added into its place.
+ There is going to be a level abstract class that is going have all the elements common between all levels such as the score display, key-press handler etc.
+ Each moving element of the game is going to be an Actor subclass with the act() method overridden.
+ A seperate class will be created, which stores all the data required across the game as private static variables, which can be accessed using the given static setter and getter methods.
+ There will be a Spaceship abstract class that has all the properties and actions common between the spaceships that will be used throughout the game, and each Spacecraft subclass will have their own getters and setters for the properties that change.

## Development Journal ##

Every day you work, keep track of it here.

**May 17, 2020 (1 hour)**

Goal:  Complete brainstorming about the game and finish the Game proposal

Work accomplished: All the above work were completed succesfully, I decided to go a space-vehicle simulator, where the player will be able to drive multiple vehicles throughout the course of the game, and avoid obstacles on the path to a final destination. I am excited to start working on this project!

**May 25, 2020 (7 hours)**

Goal:  Complete a proof of concept version of the game

Work accomplished: I finished everything I planned for today. It took me some time to figure out why each of the actors were in places that the coordinates I gave didn't match with. I finally figured out that it was because of the fact that the coordinate system used by each world in the center of the BorderPane I used doesn't match with that of the whole screen. I have decided to not make the craft acclerate due to gravity, but rather fall at a constant pace, so the player doesn't have to worry about falling too fast, but they will lose a small portion of health points each frame they are in contact with an obstacle. I also completely finished designing Level 1 and I have also made the pictures to represent the ground and the obstacles.

**May 26, 2020 (8 hours)**

Goal:  Complete the whole game - including sounds, pictures and instructions. 

Work accomplished:  I finished everything I planned for today. Although I had all the game parts such as the levels fully done by this afternoon, it took me quite a bit of time to polish the game and make it more presentable. I didn't have to change much from my initial plan today, so the changes described on yesterday's log in the journal are the only deviations from my original plan. After I figured out that the coordinate system of the objects in each world don't necessarily  align with the coordinate system of the entire screen, it didn't take me much time to figure out the positions that I have to put my obstacles to put them where I want. As far as organizing my code goes, I tried my best to put all repeating parts of my code in abstract classes and just change the properties that differ between the different types of objects. But I think I should have spent some time organizing my classes into packages, as right now, even though it works  does make it annoying to search for the class that I want to edit, so that is something that I will do for my future projects. Overall, I enjoyed working on this project and never once got bored even though I ended up putting many consecutive hours the past two days so that I can finish my game comfortably before the expedited deadline for seniors. 

***
***
