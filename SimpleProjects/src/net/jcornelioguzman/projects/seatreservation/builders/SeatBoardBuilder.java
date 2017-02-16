<<<<<<< HEAD
package net.jcornelioguzman.projects.seatreservation.builders;

import net.jcornelioguzman.projects.seatreservation.domain.SeatBoard;

/**
 * Builder for Seat board
 *
 * @author Juan Cornelio Guzman
 * @since July 15, 2015
 */
public class SeatBoardBuilder {

	/** */
	private static SeatBoard seatBoard;

	public static SeatBoard build(int row, int column) {
		seatBoard = new SeatBoard(row, column);
		return seatBoard;
	}

}
=======
package net.jcornelioguzman.projects.seatreservation.builders;

import net.jcornelioguzman.projects.seatreservation.domain.SeatBoard;

/**
 * Builder for Seat board
 *
 * @author Juan Cornelio Guzman
 * @since July 15, 2015
 */
public class SeatBoardBuilder {

	/** */
	private static SeatBoard seatBoard;

	public static SeatBoard build(int row, int column) {
		seatBoard = new SeatBoard(row, column);
		return seatBoard;
	}

}
>>>>>>> 9184d66d7c071cc3cddb2112ef94d5856997cfa5
