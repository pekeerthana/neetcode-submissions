class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            if(!rowCheck(i,board)) return false;
            if(!columnCheck(i,board)) return false;
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!subgrid(i,j,board)) return false;  
            }
        }
        return true;
        
    }

    private static boolean rowCheck(int r,char[][] board){
        HashSet<Character> rowValues = new HashSet<>();
        for(int i=0;i<9;i++){
            char num = board[r][i];
            if(num=='.') continue;
            if(!rowValues.add(num)) return false;
        }

        return true;

    }

    private static boolean columnCheck(int c, char[][] board){
        HashSet<Character> colValues = new HashSet<>();
        for(int i=0;i<9;i++){
            char num = board[i][c];
            if(num=='.') continue;
            if(!colValues.add(num)) return false;
        }
        return true;

    }

    private static boolean subgrid(int r1,int c1,char[][] board){

        HashSet<Character> gridValues = new HashSet<>();
        for(int i=r1;i<=r1+2;i++){
            for(int j = c1;j<=c1+2;j++)
            {
                char num = board[i][j];
                if(num=='.') continue;
                if(!gridValues.add(num)) return false;
            }
        }
        return true;

    }
}
