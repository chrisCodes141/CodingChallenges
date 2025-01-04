package blind75.Graphs;



public class numberOfIslands {

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
                //if this spot is land, send to start sinking, when done increase count
                if(grid[i][j] == '1'){
                    dfsSinkingIslands(grid,i,j);
                    ++islandsCount;
                }
        }
        return islandsCount;
    }

    private void dfsSinkingIslands(char[][] grid, int v, int h){
        //if inbound AND currentSpot is infact 1 ( land )
        if(v < 0 || v >=  gridVlength || h < 0 || h >= gridHlength || grid[v][h] != '1') return;
        //it was a land, now its water
        grid[v][h] = '0';

        //up,down, left, right
        dfsSinkingIslands(grid,v - 1, h);
        dfsSinkingIslands(grid,v + 1, h);
        dfsSinkingIslands(grid,v, h - 1);
        dfsSinkingIslands(grid,v, h + 1);
    }
}
