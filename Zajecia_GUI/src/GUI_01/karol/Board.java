package GUI_01.karol;

public class Board {
    Field[][] board = new Field[8][8];


    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Field();

                if ((i + j) % 2 == 0) {
                    board[i][j].Color = false; // black
                } else {
                    board[i][j].Color = true; // white
                }
            }
        }

    }

    public void CheckColor() {
        if (board[0][0].Color) {
            System.out.println("prawda");
        } else {
            System.out.println("falsz");
        }
    }




   /* public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }*/


    public static void main(String[] args) {
        Board board = new Board();
        board.CheckColor();


    }
}

