15 Apr 2016

I had enjoyed doing this project although I was restricted from time due to work, family matters, and I unfortunately got 
a stomach flu for on the last week that I could work on the project and study for the exam

I had java documented all of my codes within the classes so they should be pretty self explanatory. 

I had tried to make 4 different versions of this project but had to stick with this one that actually works as per the requirements.  
It isn't my best work but did what I could to actually make the game work as per the requirements.

For this project I have decide to make 5 different types of Goblins which inherit the abstract method void(); 
in the Actor class.  I have chosen to make Goblin implement the interface Monster which it inherited by the Goblin,
StillGoblin, TeleportingGoblin, LeftAndRightGoblin, and the UpAndDownGoblin, methods and movements were only made through
the abstract method void.

The player entity would change from @ to H if player has more than 5 glims, if the player has less than or equal to 5 glims he will
change back to the entity @ as reminder that the player has very little glims left.

Controls for the player to move was originally located in the Player Class but unfortunately was leaving a trail of
the player entity in the dungeon I tried as hard as I could to fix it but was unable to before the cut off time so 
I had relocated it into the dungeon class so that it would move properly with out trailing.  

Most of the coding is located in the dungeon class as I had initiated the do{ while gameloop == true; in that class
it was easier to conduct the majority of the games methods in that class as if any changes or refactoring
were needed to be made it would not affect the other classes.

I had created different scenario's for running into a glim from teleporting glims to disappearing glims and hidden glims in the dungeon

Wall barriers were put into place so that the characters entities would not be able to pass the wall barriers also had goblins move the
other direction once they had reached the end of a wall barrier.

I had created 3different scenarios for ending the game one scenario is to kill all the goblins another is to collect all the glims and
kill all the goblins and another is when you run out of glims in the inventory.

I also included a method to lower the cpu memory usage by 50% as I found that the virtual machine was constantly telling me to close and
reopen due to low memory.

I tried very hard to get this project to be loose coupling with high cohesion but unfortunately I had ran out of time
in any event I just wanted to make sure the game would work up to requirements detailed in the A3 hand out.

Thanks for everything Chris I have enjoyed doing this course with you and appreciate all the time and efforts you 
have put into helping all your students with quick replies via email and great answers to our questions.

Hopefully see you in a future course.

Cheers 
Have a great summer!!!!