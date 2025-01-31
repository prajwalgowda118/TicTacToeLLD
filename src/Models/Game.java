package Models;

import WinStrategies.WinningStrategies;

import java.util.List;

public class Game {

    private Board board;
    private Player winner;
    private List<Player> players;
    private List<Move> move;
    private long nextPlayerMoveindex;
    private List<WinningStrategies> winningStrategies;


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMove() {
        return move;
    }

    public void setMove(List<Move> move) {
        this.move = move;
    }

    public long getNextPlayerMove() {
        return nextPlayerMoveindex;
    }

    public void setNextPlayerMove(long nextPlayerMoveindex) {
        this.nextPlayerMoveindex = nextPlayerMoveindex;
    }

    public List<WinningStrategies> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategies> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
