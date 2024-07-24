package chess;

public class CheckInput {
	
	//This method requires your input
		public boolean checkCoordinateValidity(String input){
		if(input.matches("[1-8][a-h]")) return true;
		else return false;
		
	}
}
