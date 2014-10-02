package fr.alexandre.main;

/**
 * User: Alexandre
 */

/*
	0 0 0 0 0 0 0           1  -> Player 1
	0 0 0 0 0 0 0           10 -> Player 2
	0 0 0 0 0 0 0
	0 0 0 0 0 0 0
	0 0 0 0 0 0 0
	0 0 0 0 0 0 0

	0 0 0 0 0 0 0

	0 1
	| |
0-	1 2
1-	3 4     [2][1] = 6
2-	5 6
 */
public class Tracker {

	private int[][] logicBoard = new int[5][7];

	private int[] columnCount = new int[7];

	public void addNewInput(int Player, int Column){
		switch(Player){
			case 1:
				logicBoard[getOccupationPerColumn(Column)][Column - 1] = 1;
				break;
			case 2:
				logicBoard[getOccupationPerColumn(Column)][Column - 1] = 10;
				break;
			default:
				System.err.println("[P4] ");
				break;
		}
		columnCount[Column - 1]++;
	}

	public int getOccupationPerColumn(int ColumnNumber){
		return columnCount[ColumnNumber - 1];
	}
}
