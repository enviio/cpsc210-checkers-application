package model;


import org.json.JSONObject;
import persistence.Writable;

// Represents a Checkers piece on a board
public class Piece implements Writable {

    private int posX;               // X position of a piece
    private int posY;               // Y position of a piece
    private final boolean isBlackPiece;  // true if black piece, false if white piece

    // EFFECT: create a new checkers piece on (x,y) with a boolean to clarify piece colour
    public Piece(int x, int y, boolean blackPiece) {
        posX = x;
        posY = y;
        isBlackPiece = blackPiece;
    }

    // MODIFY: this
    // EFFECT: set x position of the checkers piece
    public void setXPos(int x) {
        posX = x;
    }

    // MODIFY: this
    // EFFECT: set y position of the checkers piece
    public void setYPos(int y) {
        posY = y;
    }

    // EFFECT: return x position of the checkers piece
    public int getXPos() {
        return posX;
    }

    // EFFECT: return y position of the checkers piece
    public int getYPos() {
        return posY;
    }


    // EFFECT: return true if a black piece, else false;
    public boolean getIsBlackPiece() {
        return isBlackPiece;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("x position", posX);
        json.put("y position", posY);
        json.put("is black piece?", isBlackPiece);
        return json;
    }
}
