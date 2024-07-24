package chess;

//This class requires your input
abstract class Piece {
	private String symbol;
	protected PieceColour colour;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String newSymbol){
		symbol = newSymbol;
	}

	public PieceColour getColour(){
		return colour;
	}

	abstract boolean isLegitMove(int i, int j, int x, int y);
}
