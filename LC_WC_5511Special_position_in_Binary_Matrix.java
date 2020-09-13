package com.soumik;

public class Main {

    public static void main(String[] args)
    {
        int[][] ma={{0,0,0,0,0},
                    {1,0,0,0,0},
                    {0,1,0,0,0},
                    {0,0,1,0,0},
                    {0,0,0,1,1}};

        int ans=numSpecial(ma);
        System.out.print(ans);
    }
    public static int numSpecial(int[][] mat)
    {
            int count=0;
            for(int i=0;i<mat.length;i++)
            {
                for (int j = 0; j < mat[i].length; j++)
                {

                    if(mat[i][j]==1)
                    {
                        int r=addrow(i,mat);
                        int c=addcol(j,mat);
                        if(r+c==2)
                        {
                            count++;
                        }

                    }
                }
            }
            return count;
    }
    public static int addrow(int a,int[][] m)
    {
        int sum=0;
        for(int i=0;i<m[a].length;i++)
        {
            sum+=m[a][i];
        }
        return sum;
    }
    public static int addcol(int b,int[][] m)
    {
        int sum=0;
        for(int i=0;i<m.length;i++)
        {
                sum += m[i][b];
        }
        return sum;
    }
}
