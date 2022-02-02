package ExamPractice.M1Exam;

import java.util.Scanner;

interface IPlayer {
	String play();
}

class Batsman implements IPlayer {
	public String play() {
		return "Batsman is batting";
	}
}

class Bowler implements IPlayer {
	public String play() {
		return "Bowler is bowling";
	}
}

class Coach {
	private IPlayer player;

	void setPlayer(IPlayer player) {
		this.player = player;
	}

	String coach() {
		return player.play();
	}
}

public class Cricket {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Coach c = new Coach();
		if (s.equals("Batsman")) {
			Batsman ip = new Batsman();
			c.setPlayer(ip);
			System.out.println(c.coach());
		} else if (s.equals("Bowler")) {
			Bowler ip = new Bowler();
			c.setPlayer(ip);
			System.out.println(c.coach());
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}