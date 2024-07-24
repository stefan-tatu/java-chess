package chess;

public class Pawn extends Piece{	
	public Pawn (PieceColour p){
		this.colour = p;
		if (p == PieceColour.WHITE){
			this.setSymbol("♙");
		}
		else this.setSymbol("♟︎");
		
	}
	public boolean isLegitMove (int inI, int inJ, int finI, int finJ){
		if (inJ == finJ){
			if (Board.getPiece(inI, inJ).getColour() == PieceColour.BLACK){
				if ( finI>inI && (finI - inI) < 3){
					if (finI - inI == 1){
						if (Board.hasPiece(finI, finJ) == false)
							return true;}
					else {
						if (inI == 1)
						if (Board.hasPiece(finI, finJ) == false && Board.hasPiece(finI-1, finJ) == false)
							return true;}
				}
			}
			else if (Board.getPiece(inI, inJ).getColour() == PieceColour.WHITE){
				if ( inI>finI && inI - finI < 3){
					if (inI - finI == 1){
						if (Board.hasPiece(finI, finJ) == false)
							return true;}
					else {
						if (inI == 6)
						if (Board.hasPiece(finI, finJ) == false && Board.hasPiece(finI+1, finJ) == false)
							return true;
					}

				}
			}
		}
		else{
			if (Board.getPiece(inI, inJ).getColour() == PieceColour.BLACK){
				if(finI-inI == 1){
					if(finJ == inJ + 1 || finJ == inJ - 1)
					{
						if (Board.hasPiece(finI, finJ) == true && Board.getPiece(finI, finJ).getColour() == PieceColour.WHITE) return true;
					}
				}
			}
			else if (Board.getPiece(inI, inJ).getColour() == PieceColour.WHITE){
				if(inI-finI == 1){
					if(finJ == inJ + 1 || finJ == inJ - 1)
					{
						if (Board.hasPiece(finI, finJ) == true && Board.getPiece(finI, finJ).getColour() == PieceColour.BLACK) return true;
					}
				}
			}
		}
		return false;
	}
}

	

