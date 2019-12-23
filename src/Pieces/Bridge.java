package Pieces;

import BoardStuff.PieceTypes;
import javafx.scene.image.Image;

public class Bridge extends Piece {

    public Bridge(Teams team){
        super(team);
    }

    @Override
    public String type() {
        return "Archer";
    }

    @Override
    public PieceTypes getType() {
        return PieceTypes.ARCHER;
    }

    @Override
    public PieceTypes getPieceType() {

        return PieceTypes.ARCHER;
    }

    @Override
    public Image getImage() {
        System.out.println(team);
        Image i=new Image("/Textures/Pieces/"+team+"Bridge.png");
        return i;
    }
}
