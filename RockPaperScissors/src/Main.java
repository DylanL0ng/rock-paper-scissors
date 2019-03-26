import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Options rock = new Options("Rock", "Paper", "Scissors");
		System.out.println("Welcome to Rock, Paper, Scissors");
		Scanner input = new Scanner(System.in);

		String PlayerInput = input.nextLine();
		input.close();
		if(PlayerInput.equalsIgnoreCase("Paper")) {
			System.out.println(rock.getPaper());
			PlayerInput = rock.getPaper();
		} else if(PlayerInput.equalsIgnoreCase("Rock")) {
			System.out.println(rock.getRock());
			PlayerInput = rock.getRock();
		} else if(PlayerInput.equalsIgnoreCase("Scissors")) {
			System.out.println(rock.getScissors());
			PlayerInput = rock.getScissors();
		} else {
			System.out.println("Invalid Choice");
			System.exit(0);
		}
		TimeUnit.SECONDS.sleep(1);
		Random random = new Random();
		
			int aiTurn = random.nextInt(3);
		if(aiTurn == 0){
			System.out.println("Rock");
			aiTurn = 0;
		}else if(aiTurn == 1) {
			System.out.println("Paper");
			aiTurn = 1;
		} else if(aiTurn == 2) {
			System.out.println("Scissors");
			aiTurn = 2;
		}
		

		if(PlayerInput == ("Paper") && aiTurn == 1 || PlayerInput == ("Rock") && aiTurn == 0 || PlayerInput == ("Scissors") && aiTurn == 2) {
			System.out.println("There was a Draw");
		} else if(PlayerInput == ("Paper") && aiTurn == 0 || PlayerInput == ("Rock") && aiTurn == 2 || PlayerInput == ("Scissors") && aiTurn == 1 ) {
			System.out.println("Player Wins");
		} else if(PlayerInput == ("Paper") && aiTurn == 2 || PlayerInput == ("Rock") && aiTurn == 1 || PlayerInput == ("Scissors") && aiTurn == 0) {
			System.out.println("AI Wins");
		}
		
		TimeUnit.SECONDS.sleep(20);
		System.exit(0);
	}
}
