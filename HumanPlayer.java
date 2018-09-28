package Chomp;
// Implements a human player in a board game

import java.awt.*;
import java.awt.event.*;

public class HumanPlayer
    implements Player, MouseListener
{
  private Chomp program;
  private ChompGame game;
  private BoardPanel board;
  private int number;

  private boolean myTurn;

  public HumanPlayer(Chomp program, ChompGame game, BoardPanel board, int a)
  {
    this.program = program;
    this.game = game;
    this.board = board;
    board.addMouseListener(this);
    this.number = a;
  }

  //  Returns a prompt to be displayed before
  //  the next move of this player
  public String getPrompt()
  {
    if(this.number == 1){
	return "Your turn, Player 1";
    }
    else{
	return "Your turn, Player 2";
    }
  }

  //  Returns a message to be displayed when
  //  this player has won
  public String getWinMessage()
  {
    return " Congratulations, you won!";
  }

  //  Initiates this player's next move
  public void makeMove()
  {
      myTurn = true;
  }

  //  Called automatically when the mouse button is released
  public void mouseReleased(MouseEvent e)
  {
    if (!myTurn)
      return;

    // board "knows" how to translate raw pixel coordinates x, y
    //   into row, col on the board:

    Location pos = board.getPos(e.getX(), e.getY());
    int row = pos.getRow();
    int col = pos.getCol();

    if (!game.isEmpty(row, col))
    {
      game.makeMove(row, col);
      program.hasMoved();
      myTurn = false;
    }
  }

  // Not used but required by the MouseListener interface spec:
  public void mouseClicked(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
}

