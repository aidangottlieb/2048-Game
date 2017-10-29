/**
 * GameBoard
 *
 * Holds a game board state, that can play moves and such.
 *
 * @since October 28th, 2017
 * @author Aidan Gottlieb
 * @author Ofek Gila
 */

public class GameBoard {

	/**
	 * Board 2d array
	 * 0 means empty square, any other number corresponds to
	 * the value in that location.
	 */
	private int[][] board;

	/**
	 * Constructor for board with width and height
	 * @param  width  width of board
	 * @param  height height of board
	 */
	public GameBoard(int width, int height) {
		board = new int[width][height];
	}


	/**
	 * Moves all tiles towards swipe direction, and then
	 * spawns a new tile if the move was legal.
	 *
	 * swipeDir:
	 *   0: right, positive x
	 *   1: down,  negative y
	 *   2: left,  negative x
	 *   3: up,    positive y
	 *
	 * @param swipeDir the direction to swipe in
	 */
	public void playMove(int swipeDir) {
		if (swipe(swipeDir))
			spawnTile();
	}

	/**
	 * Spawns a 2 or a 4 in the board.
	 */
	private void spawnTile() {}

	/**
	 * Moves all tiles towards swipe direction.
	 *
	 * swipeDir:
	 *   0: right, positive x
	 *   1: down,  negative y
	 *   2: left,  negative x
	 *   3: up,    positive y
	 *
	 * @param  swipeDir the direction to swipe in
	 * @return          true if swipe was possible, false otherwise
	 */
	private boolean swipe(int swipeDir) { return false; }


	/**
	 * Returns the 2d board.
	 * @return the 2d board
	 */
	public int[][] getBoard() { return board; }

}