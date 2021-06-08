package sk.kosickaakademia.stovcikova.piskorky;

public class Winner {
    public int isWinner(int[][] m){
        int r=15;
        int s=15;
        int i,j;
        for(i=0;i<r;i++){
            for(j=0;j<s;j++){
                if(j<=10 && m[i][j]*m[i][j+1]*m[i][j+2]*m[i][j+3]*m[i][j+4]==1)
                    return 1;
                if(j<=10 && m[i][j]*m[i][j+1]*m[i][j+2]*m[i][j+3]*m[i][j+4]==32)
                    return 2;
                if(i<=10 && m[i][j]*m[i+1][j]*m[i+2][j]*m[i+3][j]*m[i+4][j]==1)
                    return 1;
                if(i<=10 && m[i][j]*m[i+1][j]*m[i+2][j]*m[i+3][j]*m[i+4][j]==32)
                    return 2;
                if(j<=10 && i<=10 && m[i][j]*m[i+1][j+1]*m[i+2][j+2]*m[i+3][j+3]*m[i+4][j+4]==1)
                    return 1;
                if(j<=10 && i<=10 && m[i][j]*m[i+1][j+1]*m[i+2][j+2]*m[i+3][j+3]*m[i+4][j+4]==32)
                    return 2;
                if(j>=4 && i<=10 && m[i][j]*m[i+1][j-1]*m[i+2][j-2]*m[i+3][j-3]*m[i+4][j-4]==1)
                    return 1;
                if(j>=4 && i<=10 && m[i][j]*m[i+1][j-1]*m[i+2][j-2]*m[i+3][j-3]*m[i+4][j-4]==32)
                    return 2;
            }
        }
        return 0;
    }
}
