public class Kappa {

	public static void main(String[] args) {
		Story kappa = new Story();
		kappa.add("You are a freshman at your first day of band camp with the Oklahoma State Marching Band."
				+ "\nAll you can think about is how hot it is outside and how badly you want water.\nFinally, you get a water break"
				+ " and notice two groups form\n-A group of freshmen under a shady tree\n-A group of upperclassmen offering a campus tour",
				"Hang with the freshman under the tree", "Agree to go on the tour with the upperclassmen", 0, 1, 2,
				false);// 0
		kappa.add(
				"Under the tree one of the freshmen mentions something interesting\n\"Have you seen the Kappa Kappa Psi founding rock?"
						+ "\"\nSomeone says they have \"It’s near the old building; I have been told to NEVER lick it\"\nEveryone in the group including yourself decides to"
						+ " go check it out after practice",
				"Go the rock after practice with the group", "DONT CHOOSE THIS ONE", 1, 3, 0, false);// 1A
		kappa.add(
				"You go with the upperclassmen, and they show you the ins and outs of the school as well as the best spots on campus."
						+ "\nAs you pass an old building an upperclassman starts talking: \"That’s the Kappa Kappa Psi founding rock from when the"
						+ " fraternity was founded here in 1919\"\nDONT LICK IT, a mysterious voice shouts from the back. Curious, you decide to go towards it to take a closer look.",
				"Head towards the rock", "DONT CHOOSE THIS ONE", 2, 3, 0, false);// 1B
		kappa.add(
				"You have now arrived at the founding rock- you notice it’s really just a weathered stone with a bronze plaque on it"
						+ " with some info about the founding of the fraternity\nAGAIN, someone makes it clear to NEVER lick the rock. When you touch the rock you feel"
						+ " a strange pull of curiosity",
				"Lick the rock anyways", "Refuse to lick the rock", 3, 4, 5, false);// 1

		kappa.add(
				"You Lean in to lick the rock\nSuddenly the world starts spinning and drops away from you blue and white lights start to swirl"
						+ " around you. You are flying through a shimmering tunnel\nThen you land on grass, you look around and realize you are back in"
						+ " the exact same place but this time it feels magical, and everything is glowing\nAn upper classman wearing a shirt with"
						+ " Kappa Kappa Psi lettering on it approaches you.\n\"Looks like you licked the rock and got transported into the place with all the Kappa Kappa Psi"
						+ " knowledge\" Would you like to learn more?",
				"Follow along to learn more", "You want an explanation right now", 4, 6, 7, false);// 2A
		kappa.add(
				"You step back and decide that you do not want to lick an old gross looking rock\nAn upperclassman in a Kappa Kappa Psi"
						+ " t shirt approaches and asks if you want to learn more about the fraternity",
				"Follow on a walking tour", "Ask for a quick explanation", 5, 8, 9, false);// 2B

		kappa.add(
				"You and the upperclassman talk on the way to the band hall. \"Kappa Kappa Psi is all about supporting the band through"
						+ " service projects, leadership, musicianship and brotherhood\"\nYou have arrived to the band room and you are now very"
						+ " curious about what the upperclassman was telling you",
				"Ask about service projects", "Ask about leadership opportunities", 6, 10, 11, false);// 3A
		kappa.add(
				"You ask the upper classman to explain. \"Sure the fraternity helps the band through service like decorating props, setting up equipment,"
						+ " or help with uniforms\" The upperclassman also emphasizes the importance of leadership and musicianship and directs your attention to the band room",
				"Ask about service", "Ask about Musicianship", 7, 10, 12, false);// 3B
		kappa.add(
				"The upperclassman takes you on a walking tour around campus and explains how the Kappa Kappa Psi fraternity is a service fraternity"
						+ " to help the band run smoothly throughout the year and it emphasizes specific core values including developing leaders and building community",
				"Ask about service", "Ask about brotherhood", 8, 10, 13, false);// 3C
		kappa.add(
				"You get a quick rundown of what the fraternity is\n\"KKPsi is a band fraternity that supports the band through service,"
						+ " leadership, musicianship, and brotherhood\"The upperclassman then directs you towards the band hall",
				"Ask about leadership", "Ask about musicianship", 9, 11, 12, false);// 3D

		kappa.add(
				"You ask about service:\n\"Service is the main purpose for the fraternity. We help with uniforms, setting up concerts,"
						+ " building props, and really anything the band or anyone affiliated with the band might need\"",
				"You decide service is the path you want to follow", "Learn about leadership", 10, 14, 15, false);// 4A
		kappa.add(
				"You ask about leadership:\n\"KKPsi builds leaders, giving many opportunities to take charge, for example being a committee chair\"",
				"You want to follow the path of being a leader", "Learn about brotherhood", 11, 16, 17, false);// 4B
		kappa.add(
				"You ask about musicianship:\n\"Musicianship is one of the most important things I mean we are the BAND fraternity after all.\n"
						+ " We encourage musical growth, support the ensemble, and strive for excellence when it comes to playing our music\"",
				"Focus on the path of musicianship", "Learn about brotherhood", 12, 18, 17, false);// 4C
		kappa.add(
				"You ask about brotherhood:\n\"Relationships are one of the most important things in life and as a fraternity we strive"
						+ " to support that in everyone keeping them connected and giving them shared purpose\"",
				"You want to follow the path of brotherhood", "learn about musicianship", 13, 19, 18, false);// 4D

		kappa.add("You realize you love supporting the band\nYou begin to volunteer at events "
				+ "and help with equipment\nPeople begin to recognize you as someone who makes the band better\n\nTHE END.",
				14, true);// 5A
		kappa.add("You attend leadership workshops, and step up when needed growing more confident and "
				+ "capable\nOthers now trust and look up to you as their leader\n\nTHE END.", 15, true);// 5B
		kappa.add("You feel excited about the idea of leading, so you start hanging around leaders in the band "
				+ "and learn how the fraternity works\nYou plan to take a leadership role sometime in the future\n\nTHE END.",
				16, true);// 5C
		kappa.add(
				"After being inspired by the idea of brotherhood you start connecting with members and joining"
						+ " study groups finding a supportive community\nYou have found your place\n\nTHE END.",
				17, true);// 5D
		kappa.add("After learning about the importance of musicianship you improve your playing, attend sectionals,"
				+ " and help teach your peers how to also be better musicians\nYou are now a better musician and have helped your entire section improve\n\nTHE END.",
				18, true);// 5E
		kappa.add("The realization of how important community is has formed and you have started checking"
				+ " in on your friends, offering help , and building connections\nYou have become a brother that helps lift others up\n\nTHE END",
				19, true);// 5F
		kappa.runStory();

	}
}
