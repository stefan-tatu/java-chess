package chess;

public class Knight extends Piece {
	public Knight (PieceColour p){
		this.colour = p;
		if (p == PieceColour.WHITE){
			this.setSymbol("♘");
		}
		else this.setSymbol("♞");
	}

	public boolean isLegitMove (int inI, int inJ, int finI, int finJ){
		if (finI + 1 == inI || finI - 1 ==inI){
			if (finJ +2 == inJ || finJ - 2 ==inJ){
				if (Board.hasPiece(finI, finJ) == false) return true;
				else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
			}
		}
		else if (finI + 2 == inI || finI - 2 ==inI){
			if (finJ + 1 == inJ || finJ - 1 ==inJ){
				if (Board.hasPiece(finI, finJ) == false) return true;
				else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
			}
		}	

		return false;
	}

}
