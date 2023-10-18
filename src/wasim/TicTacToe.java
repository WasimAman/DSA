// Right now this code is incomplete...
package wasim;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int row,col,scoreA=0,scoreB=0;
        char player = 'A';
        initBoard(board);
        display(board);
        for(int i=0;i<9;i++){
            System.out.print("Enter your possotion:- ");
            row = sc.nextInt();
            col = sc.nextInt();
            if(board[row-1][col-1]!=' '){
                System.out.println("\nThis spot is already taken!!! please enter agian");
                i--;
                display(board);
                continue;
            }
            if(player=='A'){
                board[row-1][col-1] = 'X';
                player = 'B';
            }
            else{
                board[row-1][col-1] = 'O';
                player = 'A';
            }
            display(board);
            char winner = win(board);
            if(winner=='A'){
                scoreA++;
                System.out.println("Player A won the game!");
                System.out.println("ScoreA : "+scoreA);
                i=0;
                initBoard(board);
            }else if(winner=='B'){
                scoreB++;
                System.out.println("Player B won the game!");
                System.out.println("ScoreB : "+scoreB);
                i=0;
                initBoard(board);
            }

        }
        sc.close();

    }
    // Initializing the board with empty charecter.
    public static void initBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = ' ';
            }
        }
    }
    // Displaying the board.
    public static void display(char[][] board){
        System.out.println("-------------");
        for(int i=0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    //  Checking winner.
    public static char win(char[][] board){
        for(int i=0;i<3;i++){
            // Checking win for player A.
            if(board[i][0]=='X' && board[i][1]=='X' && board[i][2]=='X'){
                return 'A';
            }else if(board[0][i]=='X' && board[1][i]=='X' && board[2][i]=='X'){
                return 'A';
            }
            // Checking win for player B.
            else if(board[i][0]=='O' && board[i][1]=='O' && board[i][2]=='O'){
                return 'B';
            }else if(board[0][i]=='O' && board[1][i]=='O' && board[2][i]=='O'){
                return 'B';
            }
        }
        // Checking win for player A.
        if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X'){
            return 'A';
        }else if(board[0][2]=='X' && board[1][1]=='X' && board[2][0]=='X'){
            return 'A';
        }
        // Checking win for player A.
        else if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X'){
            return 'B';
        }else if(board[0][2]=='X' && board[1][1]=='X' && board[2][0]=='X'){
            return 'B';
        }
        return ' ';
    }
}
