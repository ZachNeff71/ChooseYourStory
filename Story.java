import java.util.Scanner;

public class Story {
	private class Node {
		String message;
		int numQuestion;
		String nextOne;
		String nextTwo;
		int nextLeft;
		int nextRight;
		boolean isEnd;

		// active constructor
		public Node(String message, String nextOne, String nextTwo, int numQuestion, int nextLeft, int nextRight,
				boolean isEnd) {
			this.message = message;
			this.nextOne = nextOne;
			this.nextTwo = nextTwo;
			this.numQuestion = numQuestion;
			this.nextLeft = nextLeft;
			this.nextRight = nextRight;
			this.isEnd = isEnd;
		}

		// finalized constructor
		public Node(String message, int numQuestion, boolean isEnd) {
			this.message = message;
			this.numQuestion = numQuestion;
			this.isEnd = isEnd;
		}
	}

	private Node[] store;
	private int size = 0;
	private int top = 0;
	private Scanner input;

	// Constructors
	public Story() {
		store = new Node[10];
		input = new Scanner(System.in);
		System.out.println("Your story has been created and can hold 10 story parts");
	}

	public Story(int n) {
		store = new Node[n];
		input = new Scanner(System.in);
		System.out.println("Your story has been created and can hold " + n + " story parts");
	}

	// Adds to the next spot in the array and makes the array bigger if there is no
	// space
	public void add(String message, String nextOne, String nextTwo, int numQuestion, int nextLeft, int nextRight,
			boolean isEnd) {
		if (size == store.length) {
			increaseCapacity();
		}
		Node n = new Node(message, nextOne, nextTwo, numQuestion, nextLeft, nextRight, isEnd);
		store[top++] = n;
		size++;
	}

	public void add(String message, int numQuestion, boolean isEnd) {
		if (size == store.length) {
			increaseCapacity();
		}
		Node n = new Node(message, numQuestion, isEnd);
		store[top++] = n;
		size++;
	}

	private void increaseCapacity() {
		Node[] temp = new Node[store.length + 2];
		for (int i = 0; i < store.length; i++) {
			temp[i] = store[i];
		}
		store = temp;
		System.out.println("Increased Capacity!!\nStory size is now " + store.length + " current capacity is "
				+ (size + 1) + "/" + store.length);
	}

	public void runStory() {
		System.out.println(
				"\n\n\n------------------------------------------------------------------------------------------------------------------------------------------------------");
		if (size == 0) {
			System.out.println("The story has not been built yet");
			return;
		}
		int i = 0;
		while (store[i].isEnd != true) {
			Node current = store[i];
			System.out.println(current.message + "\nA)" + current.nextOne + "\nB)" + current.nextTwo);
			String selection = input.nextLine().toLowerCase();
			int next;
			if (selection.equals("a"))
				next = current.nextLeft;
			else
				next = current.nextRight;
			i = 0;
			while (store[i].numQuestion != next) {
				i++;
			}
		}
		System.out.println(store[i].message);

		System.out.println("Would you like to play again? (Y, N)");
		String selection = input.nextLine().toLowerCase();
		if (selection.equals("y"))
			runStory();
		else
			System.out.println("Thank you for playing");
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		String text = "[";
		for (Node n : store) {
			text += n + ", ";
		}
		return text.substring(0, text.length() - 2) + "]";
	}
}