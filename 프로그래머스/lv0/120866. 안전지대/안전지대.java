import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] result = new int[board.length][board[0].length];
        
        // System.out.println(result[0][0]);
        
        MAIN: for(int i = 0; i < board.length; i++) {
            // 배열 행이 1이고 배열의 열도 1일 경우
            if(board.length == 1 && board[i].length == 1) {
                if(board[0][0] == 1) {
                    result[0][0] = 1;
                }
                    
                break MAIN;
            } else if(board.length == 1 && board[i].length != 1) {
                // 배열의 행이 1이고 열이 1이 아닌 경우
                for(int k = 0; k < board[i].length; k++){
                    if(board[i][k] == 1) {
                        if(k == 0) {
                            result[0][k] = 1;
                            result[0][k + 1] = 1;
                        } else if(k == board[i].length - 1) {
                            result[0][k] = 1;
                            result[0][k - 1] = 1;
                        } else {
                            result[0][k] = 1;
                            result[0][k + 1] = 1;
                            result[0][k - 1] = 1;
                        }
                    }
                }	
                break MAIN;
            } else if(board.length != 1 && board[i].length == 1) {
                for(int k = 0; k < board.length; k++) {
                    if(board[k][0] == 1) {
                        if(k == 0) {
                            result[k][0] = 1;
                            result[k + 1][0] = 1;
                        } else if(k == board.length - 1) {
                            result[k][0] = 1;
                            result[k - 1][0] = 1;
                        } else {
                            result[k][0] = 1;
                            result[k + 1][0] = 1;
                            result[k - 1][0] = 1;
                        }
                    }
                }
                break MAIN;
            }
            
            for(int j = 0; j < board[i].length; j++) {
                // 배열 크기가 1보다 큰 경우
                // 배열에 1이 나오면
                if(board[i][j] == 1) {
                    if(i == 0 && j == 0) {
                        // 첫번째 행이며 맨 처음인 경우
                        result[i][j] = 1;
                        result[i + 1][j] = 1;
                        result[i][j + 1] = 1;
                        result[i + 1][j + 1] = 1;
                    } else if(i == 0 && j == board[i].length - 1) {
                        // 첫번째 행이며 마지막인 경우
                        result[i][j] = 1;
                        result[i + 1][j] = 1;
                        result[i][j - 1] = 1;
                        result[i + 1][j - 1] = 1;
                    } else if(i == board.length - 1 && j == 0) {
                        // 마지막 행이며 첫번째 열일 경우
                        result[i][j] = 1;
                        result[i - 1][j] = 1;
                        result[i][j + 1] = 1;
                        result[i - 1][j + 1] = 1;
                    } else if(i == board.length - 1 && j == board[i].length - 1) {
                        // 마지막 행이며 마지막 열일 경우
                        result[i][j] = 1;
                        result[i - 1][j] = 1;
                        result[i][j - 1] = 1;
                        result[i - 1][j - 1] = 1;
                    } else if(i == 0) {
                        // 첫번째 행인 경우
                        result[i][j] = 1;                        
                        result[i][j + 1] = 1;
                        result[i][j - 1] = 1;
                        result[i + 1][j] = 1;
                        result[i + 1][j - 1] = 1;
                        result[i + 1][j + 1] = 1;
                    } else if(i == board.length - 1) {
                        // 마지막 행인 경우
                        result[i][j] = 1;
                        result[i - 1][j] = 1;
                        result[i][j + 1] = 1;
                        result[i][j - 1] = 1;
                        result[i - 1][j - 1] = 1;
                        result[i - 1][j + 1] = 1;
                    } else {
                        // 첫번째 행도 아니며 마지막 행도 아닌 경우
                        if(j == 0) {
                            result[i][j] = 1;
                            result[i][j + 1] = 1;
                            result[i - 1][j] = 1;
                            result[i - 1][j + 1] = 1;
                            result[i + 1][j] = 1;
                            result[i + 1][j + 1] = 1; 
                        } else if(j == board[i].length - 1) {
                            result[i][j] = 1;
                            result[i][j - 1] = 1;
                            result[i - 1][j] = 1;
                            result[i - 1][j - 1] = 1;
                            result[i + 1][j] = 1;
                            result[i + 1][j - 1] = 1; 
                        } else {
                            result[i][j] = 1;
                            result[i][j + 1] = 1;
                            result[i][j - 1] = 1;
                            result[i - 1][j] = 1;
                            result[i - 1][j - 1] = 1;
                            result[i - 1][j + 1] = 1;
                            result[i + 1][j] = 1;
                            result[i + 1][j - 1] = 1;
                            result[i + 1][j + 1] = 1; 
                        }
                                    
                    }
                }
            }
        }
        
        for(int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
            for(int j = 0; j < result[i].length; j++) {
                if(result[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}