package chess;

public class Rook extends Piece{
	public Rook (PieceColour p){
		this.colour = p;
		if (p == PieceColour.WHITE){
			this.setSymbol("♖");
		}
		else this.setSymbol("♜");
		
	}
	
	public boolean isLegitMove (int inI, int inJ, int finI, int finJ){
		if (inJ == finJ){
			for (int i = Math.min(inI, finI) +1; i<Math.max(inI, finI); i++){
				if (Board.hasPiece(i, finJ) == true) return false;
			}
			if (Board.hasPiece(finI, finJ) == false) return true;
			else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
		}
		else if (inI == finI){
			for (int i = Math.min(inJ, finJ) +1; i<Math.max(inJ, finJ); i++){
				if (Board.hasPiece(inI, i) == true) return false;
			}

			if (Board.hasPiece(finI, finJ) == false) return true;
			else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
		}
		return false;
	}

}
