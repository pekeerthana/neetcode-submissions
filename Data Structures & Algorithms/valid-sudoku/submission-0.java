class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            if(rowCheck(i,board) == false) return false;
            if(columnCheck(i,board) == false) return false;
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(subgrid(i,i+2,j,j+2,board) == false) return false;  
            }
        }
        return true;
        
    }

    private static boolean rowCheck(int r,char[][] board){
        HashSet<Character> rowValues = new HashSet<>();
        for(int i=0;i<9;i++){
            char num = board[r][i];
            if(num=='.') continue;
            if(!rowValues.contains(num)) rowValues.add(num);
            else return false;
        }

        return true;

    }

    private static boolean columnCheck(int c, char[][] board){
        HashSet<Character> colValues = new HashSet<>();
        for(int i=0;i<9;i++){
            char num = board[i][c];
            if(num=='.') continue;
            if(!colValues.contains(num)) colValues.add(num);
            else return false;
        }
        return true;

    }

    private static boolean subgrid(int r1,int r2,int c1,int c2,char[][] board){

        HashSet<Character> gridValues = new HashSet<>();
        for(int i=r1;i<=r2;i++){
            for(int j = c1;j<=c2;j++)
            {
                char num = board[i][j];
                if(num=='.') continue;
                if(!gridValues.contains(num)) gridValues.add(num);
                else return false;
            }
        }
        return true;

    }
}
