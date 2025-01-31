package Models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private long dimension;
    private List<List<Cell>> board;

    public Board(long dimension) {

        this.dimension = dimension;

        board = new ArrayList<>();

        for (int i = 0; i < dimension; i++) {
            board.add(new ArrayList<>());
            for (int j = 0; j < dimension; j++) {
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public long getDimension() {
        return dimension;
    }

    public void setDimension(long dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
