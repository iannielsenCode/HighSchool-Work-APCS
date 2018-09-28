package Chomp;

/**
 * Author: Ian Nielsen
 * Date: January 26th 2012
 * Implements a 2D array of characters.
 */

public class CharMatrix
{
  char[][] a;

  public CharMatrix(int rows, int cols)
  {
      for(int i = 0;i < a.length;i++){
          for(int j = 0;j < a[i].length;j++){
              a[i][j] = ' ';
          }
      }
  }
  
  public CharMatrix(int rows, int cols, char fill)
  {
      for(int i = 0;i < a.length;i++){
          for(int j = 0; j < a[i].length;j++){
              a[i][j] = fill;
          }
      }
  }

  public int numRows()
  {
      int j = 0;
      for(int i = 0; i < a.length; i++){
          j++;
      }
      return j;
          
  }
  
  public int numCols()
  {
      int i = 0;
      int k = 0;
      for(int j = 0; j < a[i].length;j++){
          k++;
      }
      return k;
  }

  public char charAt(int row, int col)
  {
      char b = a[row][col];
      return b;
  }

  public void setCharAt(int row, int col, char ch)
  {
      a[row][col] = ch;
  }

  public boolean isEmpty(int row, int col)
  {
      if(a[row][col] == ' '){
          return true;
      }
      else{ 
          return false;
      }
  }

  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
      for(int i = row0; i < row1; i++){
          for(int j = col0; j < col1; j++){
              a[i][j] = fill;
          }
      }
  }

  public void clearRect(int row0, int col0, int row1, int col1)
  {
      for(int i = row0; i < row1; i++){
          for(int j = col0; j < col1; j++){
              a[i][j] = ' ';
          }
      }
  }
 
  public int countInRow(int row)
  {
    int j = row;
    int k = 0;
    for(int i = 0; i <= a[j].length; i++){
        if(a[j][i] != ' '){
            k++;
        }
    }
    return k;
  }

  public int countInCol(int col)
  {
    int j = col;
    int k = 0;
    for(int i = 0; i <= a[j].length; i++){
        if(a[i][j] != ' '){
            k++;
        }
    }
    return k;
  }
  


}
