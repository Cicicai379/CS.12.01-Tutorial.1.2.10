public class LightBoard {

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        for(int i=0; i<numRows; i++){
            for(int j=0; j<numCols; j++){
                if(Math.random()<=0.4)
                    lights[i][j] = true;
            }
        }

    }

    public boolean[][] getLights() {
        return lights;
    }

    public boolean evaluateLight(int row, int col)
    {
        int cnt = 0;
        for(int i = 0; i < lights.length; i++) {
            if (lights[i][col]) cnt++;
        }
        if(!lights[row][col]) {
            if(cnt % 2 == 0) return false;
        } else {
            if(cnt % 3 == 0) return true;
        }
        return lights[row][col];
    }

    public void setLights(boolean[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                    this.lights[i][j] = board[i][j];
            }
        }
    }
}