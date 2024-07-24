package chess;

public class Bishop extends Piece {
	public Bishop (PieceColour p){
		this.colour = p;
		if (p == PieceColour.WHITE){
			this.setSymbol("♗");
		}
		else this.setSymbol("♝");

	}

	public boolean isLegitMove (int inI, int inJ, int finI, int finJ){
		if (Math.abs(inJ - finJ) == Math.abs(inI - finI) && inJ - finJ!=0){
			int val1 = inI - finI;
			int val2 = inJ - finJ;
		
			if (val1 >0){
				if (val2 > 0){
					for (int i = 1; i < val1; i++){
						if (Board.hasPiece(inI - i, inJ - i) == true) return false;
					}
					if (Board.hasPiece(finI, finJ) == false) return true;
					else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
				}
				else{
					for (int i = 1; i < val1; i++){
						if (Board.hasPiece(inJ - i, inJ + i) == true) return false;
					}
					if (Board.hasPiece(finI, finJ) == false) return true;
					else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
				}
			}
			else{

				if (val2 > 0){
					for (int i = 1; i < Math.abs(val1); i++){
						if (Board.hasPiece(inI + i, inJ - i) == true) return false;
					}
					if (Board.hasPiece(finI, finJ) == false) return true;
					else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
				}
				else{
					for (int i = 1; i < Math.abs(val1); i++){
						if (Board.hasPiece(inI + i, inJ + i) == true) return false;
					}
					if (Board.hasPiece(finI, finJ) == false) return true;
					else if (Board.getPiece(finI, finJ).getColour() != Board.getPiece(inI, inJ).getColour()) return true;
				}
			}
		}
		return false;
	}

}
