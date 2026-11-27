public static void main(String[] args){
    Story mysteriousFigure = new Story();
    mysteriousFigure.add("You wake up in a dark room. All you see is someone sitting in the corner watching...", 
    "You aproach the person and ask who they are.", 
    "Grab the knife on your bedside table and throw it at the person.", 0, 1, 2, false);

    mysteriousFigure.add("You aproach the person and ask why they are there.\n\"Oh Hi I am just here to deliver you a turkey.\"",
    "Accept the Turkey", "Decline the turkey", 1, 6, 3, false); //1 next 3
    mysteriousFigure.add("You Grab your knife and throw it at the mysterious figure. They reach their hand out and stop the knife crushing it in their hand.", 
    "Do you run away.", "Do you keep fighting?", 2, 4, 7, false); //2 next 4
    mysteriousFigure.add("Declining the turkey, enrages the mysterious figure! It starts beating you with the crushed knife and kills you,\nyou do not escape. You Lose!", 3, true); //3 End
    mysteriousFigure.add("While running away you stumble upon a car and a bicycle.",
    "Take the car", "Take the bicycle", 4, 5, 8, false); //4 next 5

    mysteriousFigure.add("You escaped the mysterious figure since the car was fast enough. Congrats you win!", 5, true); //5 End
    mysteriousFigure.add("You accepted the turkey and enjoyed the meal with the mysteriousfigure.", 6, true); //6 End
    mysteriousFigure.add("Continuing to fight you learn you have super strength all of the sudden. Pushing the figure through the wall it suddening dissapears like nothing ever happened. You Win!!", 7, true); //7 End
    mysteriousFigure.add("Taking the bicycle was a huge mystake. What you didnt know is the sheer speed of the figure." 
    + "\nIt practically levitates beside you as you try to peddle as fast as possible, the figure proceeds to swipe you off the bike slamming you into a tree at high speeds, obliterating your existence. You Lose!", 8, true); //8 End

    mysteriousFigure.runStory();
}