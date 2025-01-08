public class Solution {

    //to store & save memory recursively.
    private static char[][] grid;

    private  int gridHlength, gridVlength;

    public int numIslands(char[][] g){
        gridVlength = g.length;

        if(gridVlength == 0) return 0;

        grid = g;
        gridHlength = grid[0].length;

        int islandsCount = 0;

        for(int i = 0; i < gridVlength; i++){
            for( int j = 0; j < gridHlength; j++)
                if(grid[i][j] == '1'){
                    dfsSinkingIslands(grid,i,j);
                    ++islandsCount;
                }
        }
        return islandsCount;
    }

    private void dfsSinkingIslands(char[][] grid, int v, int h){
        if(v < 0 || v >=  gridVlength || h < 0 || h >= gridHlength || grid[v][h] != '1') return;
        grid[v][h] = '0';

        dfsSinkingIslands(grid,v - 1, h);
        dfsSinkingIslands(grid,v + 1, h);
        dfsSinkingIslands(grid,v, h - 1);
        dfsSinkingIslands(grid,v, h + 1);
    }

}