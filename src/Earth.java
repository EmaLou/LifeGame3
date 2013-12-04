import java.util.ArrayList;

public class Earth {

    public String[][] calculateNextStatus(Life life, String[][] input) {
        int x = life.getX();
        int y = life.getY();
        int aliveNumber = getAroundAliveNumber(input, x, y);
        if(aliveNumber == 3)
            input[x][y] = "*";
        return input;
    }

    public int getAroundAliveNumber(String[][] input, int x, int y) {
        int aliveNumber = 0;

        ArrayList<String> aroundPosition = new ArrayList<String>();
        aroundPosition.add(input[x-1][y-1]);
        aroundPosition.add(input[x-1][y]);
        aroundPosition.add(input[x-1][y+1]);
        aroundPosition.add(input[x][y-1]);
        aroundPosition.add(input[x][y+1]);
        aroundPosition.add(input[x+1][y-1]);
        aroundPosition.add(input[x+1][y]);
        aroundPosition.add(input[x+1][y+1]);

        for(String status:aroundPosition) {
            if(status.equals("*"))
                aliveNumber++;
        }
        return aliveNumber;
    }

}
