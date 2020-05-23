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

## Development Journal ##

Every day you work, keep track of it here.

**Date (time spent)**

Goal:  What are you trying to accomplish today?

Work accomplished:  Describe what you did today and how it went.

**Date (time spent)**

Goal:  What are you trying to accomplish today?

Work accomplished:  Describe what you did today and how it went.

***
***


# Example (Delete after you've read) #

**Name:**	Happy Sparky

**Period:**	1

**Game Title:** Bomb Squad

## Game Proposal ##

I want to make an Angry Birds clone where the player shoots different powerup items at targets.  However,
I don't think handling all the physics is possible for me right now so I'll make the physics simpler and
instead have game elements such as trampolines, lava, fog, fans, etc, that modify the shot path.  I'll also
have different enemies and friendly characters you can't hit.

Game controls:

+ Mouse and buttons control your shot speed and direction
+ Arrow keys control which powerup you will launch

Game elements:

+ Simple falling physics in a gravity world
+ Stuff you hit doesn't tumble like in Angry Birds but is replaced with simpler mechanics
+ Friendly characters you must avoid hitting
	+ Some stay put where they are
	+ Others walk back and forth so you must time your shot
+ Armored enemies take two shots to kill (they drop their armor when hit first time)
+ 3 Levels followed by a Boss level
+ Trampolines - Your shot bounces off and continues farther
+ Lava - kills your shot instantly
+ Fog - your shot drops faster due to dense air
+ Fans - adds wind and modifies the direction of your shot
+ You must clear levels using a limited amount of shots

How to win:

+ Clear all levels using your limited bomb supply
+ I might have a star scoring system so player can try for a perfect score

## Link Examples ##
Provide links to examples of your game idea.  This can be a playable online game, screenshots, YouTube videos of gameplay, etc.

+ [Angry Birds](https://www.youtube.com/watch?v=aiiQ8btusrs) My original inspiration
+ [Tiny Empire](http://www.freewebarcade.com/game/tiny-empire/) I love this!  I want to make something like this version!

## Teacher Response ##

**Approved!**

Love your game plan!  Unless your boss level is truly awesome, it would be better to focus on having more
levels that add progressive game play twists, just like the real Angry Birds game has.  Maybe introduce a
new game element with each level and then have a few levels that take some thinking and replaying to beat.

Also, you haven't addressed how you'll hit multiple enemies.  Is it one shot per enemy or can a single shot
hit multiple enemies?  If so, how would that work?

## Class Design and Brainstorm ##

Put all your brainstorm ideas, strategy approaches, and class outlines here

## Development Journal ##

**Monday May 18 (4 hours)**

Goal:  Make a raw demo of my cannon firing mechanics.  When I click the mouse, I want a cannonball to be
       launched with its initial speed and angle determined by how far away the mouse is from the cannon.

Work accomplished:  My strategy of having the game controller listen for mouse clicks worked.  When the
         	        mouse is clicked, I find the distance from the mouse to the cannon and based on that
					I create a new cannonball object with the right initial speed and direction.  It flies
					through the air and is removed from the world once it goes out of view.

**Tuesday May 19 (1 hour)**

Goal:  I want the cannon to rotate so it points toward (follows) the mouse.

Work accomplished:  I got this working pretty quickly so I also tried to add a parabolic path showing where
the cannonball would travel when fired.  I honestly have no idea how to do this so I'm going to have to think
of a strategy that will actually work.  I spent all my time looking through APIs and looking at how to draw
parabolas on the Internet but nothing helped.  Maybe I should switch to displaying a "power meter" and show
the current angle as text on the screen.