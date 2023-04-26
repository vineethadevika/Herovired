class Solution {
    private List<List<String>> res;
    
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        char[][] board = new char[n][n];
        
        
        for(char[] tmp : board) Arrays.fill(tmp, '.');
        backtrack(board, 0);
        
        return res;
    }
    
    private void backtrack(char[][] board, int row){
        if(row == board.length){
            res.add(array2list(board));
            return;
        }
        
        for(int j = 0; j < board.length; j++){
            // check valid
            if(!isValid(board, row, j)) continue;

            board[row][j] = 'Q';
            backtrack(board, row + 1);
            board[row][j] = '.';
                
        }

        
    }
    
    private ArrayList<String> array2list(char[][] board){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            list.add(new String(board[i]));
        }
        
        return list;
    }
    
    private boolean isValid(char[][] board, int row, int colum){
        // check colum
        for(int i = 0; i < row; i++){
            if(board[i][colum] == 'Q') return false;
        }
        
        // check row
        for(int i = 0; i < colum; i++){
            if(board[row][i] == 'Q') return false;
        }
        
        // check right up
        for(int i = row-1, j = colum+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q') return false;
        }
        
        // check left up
        for(int i = row-1, j = colum-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }
        
        return true;
    }
     
    
}