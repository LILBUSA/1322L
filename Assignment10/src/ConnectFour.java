public class ConnectFour {
    private char[][] board = new char[6][7];
    private String turn;
    private char token = ' ';

    public ConnectFour() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }
        turn = "Red";
        token = 'R';
    }
}
