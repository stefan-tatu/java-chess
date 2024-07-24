package chess;

public class King extends Piece{
	public King (PieceColour p){
		this.colour = p;
		if (p == PieceColour.WHITE){
			this.setSymbol("♔");
		}
		else this.setSymbol("♚");
	}

	public boolean isLegitMove (int inI, int inJ, int finI, int finJ){
		if (inI == finI){
			if (Math.abs(finJ - inJ)==1){
				if (Board.hasPiece(finI, finJ) == false) return true;
				else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
			}
		}
		else if (inI == finI -1){
			if (Math.abs(finJ - inJ) <= 1){
				if (Board.hasPiece(finI, finJ) == false) return true;
				else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
			}	
		}
		else if (inI == finI +1){
			if (Math.abs(finJ - inJ) <= 1){
				if (Board.hasPiece(finI, finJ) == false) return true;
				else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
			}
		}
		return false;
	}
}
