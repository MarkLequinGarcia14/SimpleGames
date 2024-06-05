// This a basic Quiz game using Lore of League of Legends using java language
// Compiler use: Eclipse 2019

package bscs; //use your own package name
import java.util.Scanner;

public class TaskPerformanceQuiz {
	public static void main(String[] args){
		
		System.out.println("Welcome to QUIZ game about League of Legends ");
		System.out.println("Choice ABCD only, out of box of it is considered as Wrong");
		System.out.println("If you know Lore about League of Legends, it is easy for you! Good Luck!");
		System.out.println("");
		System.out.println("");
		
		//Questions
	    String q1 = "Ionia know Yasuo and his brother because of swordmanship skills,\n"
	    		+ "who is the brother of Yasuo he accidentaly kill? \n"
	          + "(a)Yone\n(b)Shen\n(c)Zed\n(d)Rakan\n";

	    String q2 = "Kaisa known as Void Keeper, making help that might related to the void,\n"
	    		+ "unfortunately, Kaisa didn't know her father is mastermind all of it, who is the Kaisa father?\n"
	          + "(a)Swain\n(b)Kassadin\n(c)Thresh\n(d)Braum\n";
	    
	    String q3 = "From the stories of Ionian's, there was a 3 member of Family that manage Assasin Clans,\nunfortunately one of the Family member kill their father/leader"
	    		+ " because of misunderstanding\nabout balance, he was known as ZED, Zed wants to destroy the clan and renew it's beliefs\nbut there was one member still believe"
	    		+ " that balance is the way of Assasin's\n, who is that one family member of the Assasin Clan wants to stop Zed? \n"
	          + "(a)Xayah\n(b)Rakan\n(c)Yasuo\n(d)Shen\n";

	    String q4 = "Based on lore of runnetera, who is known as the Head Hunter of Kha'Zix\n"
	          + "(a)Akali\n(b)Twisted Fate\n(c)Graves\n(d)Rengar\n";

	    String q5 = "Based on the lore of runnetera, who is the raging brother of Nasus and been brainwashed by Xerath?\n"
	          + "(a)Warwick\n(b)Urgot\n(c)Renekton\n(d)Darius\n";

	    //Answers
	    Question [] questions = {
	            new Question(q1, "a"),
	            new Question(q2, "b"),
	            new Question(q3, "d"),
	            new Question(q4, "d"),
	            new Question(q5, "c"),
	    };
	    
	    //Methods are in the Question.java
	    takeTest(questions);


	}


	public static void takeTest(Question [] questions){
	    int score = 0;
	    Scanner Lore = new Scanner(System.in);


	    for(int i = 0; i < questions.length; i++) {
	        System.out.println(questions[i].prompt);
	        String answer = Lore.nextLine();
	        if(answer.equalsIgnoreCase(questions[i].answer)) {
	            score++;
	        }
	    }
	    System.out.println("You got " + score + "/" + questions.length);
	    System.out.println("Do you want to play again? (Yes/No) ");
	    String playAgain = Lore.nextLine();
	    if(playAgain.equalsIgnoreCase("yes")) {
	    	takeTest(questions);
	    } else {
	    	System.out.println("Thanks for playing!!");
	    }
	    }
	}







