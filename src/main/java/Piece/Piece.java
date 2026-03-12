package Piece;

import org.example.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {
    public BufferedImage image;
    public int x, y;
    public int col, row, preCol, preRow;
    public int color;

    public Piece(int color, int col, int row) {
        x = getX(col);
        y = getY(row);
        this.col = col;
        this.row = row;
        this.color = color;
        preCol = col;
        preRow = row;
    }
    public BufferedImage getImage(String imagePath){
        BufferedImage image = null;

        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath));
        }catch (IOException e){
            e.printStackTrace();
        }
        return image;

    }
    public int getX(int col){
        return col = col*Board.SQUARE_SIZE;
    }
    public int getY(int row){
        return row = row*Board.SQUARE_SIZE;
    }
    public void draw(Graphics2D g2){
        g2.drawImage(image, x, y, Board.SQUARE_SIZE, Board.SQUARE_SIZE, null);
    }
}
