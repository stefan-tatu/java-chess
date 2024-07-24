package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;


	//This method requires your input
	public static void play(){
		Console cin = System.console();
		char turn = 'w'; //detrmine whose turn is
		String start, finish;
		CheckInput validate = new CheckInput();

		while (!gameEnd){

			if(turn == 'w'){
				System.out.println("\n------ Whites Move ------");
			}
			else{
				System.out.println("\n------ Blacks Move ------");
			}


			System.out.println("> Enter origin: ");
			start = cin.readLine();
			if (start.equals("END")){
				System.out.println("> Game ended, one of the players gave up");
				gameEnd = true;
			}
			if(validate.checkCoordinateValidity(start)){
				int startI = start.charAt(0) - '1';
				int startJ = start.charAt(1) - 'a';
				if (Board.hasPiece(startI, startJ) == true){
					if ((Board.getPiece(startI, startJ).getColour() == PieceColour.WHITE && turn == 'w') || (Board.getPiece(startI, startJ).getColour() == PieceColour.BLACK && turn == 'b')){
						System.out.println("> Enter destination: ");
						finish = cin.readLine();
						if (finish.equals("END")){
							System.out.println("> Game ended, one of the players gave up");
							gameEnd = true;
						}
						if(validate.checkCoordinateValidity(finish)){
							int finishI = finish.charAt(0) - '1';
							int finishJ = finish.charAt(1) - 'a';
							Piece p = Board.getPiece(startI, startJ);
							if(p.isLegitMove(startI, startJ, finishI, finishJ))
							{
								gameEnd = Board.movePiece(startI, startJ, finishI, finishJ, p);
								Board.printBoard();
								if (turn == 'w') turn = 'b';
								else turn = 'w';
							}
							else System.out.println("> Not a valid move");
						}
						else System.out.println("> Not a valid coordinate");
					}
					else System.out.println("> Not your piece");
				}
				else System.out.println("> No piece at the pointed coordinates");
			}
			else if (gameEnd == false) System.out.println("> Not a valid coordinate");
		}
	}	
	
	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();	}
}
