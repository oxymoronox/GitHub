package ee.mihkel;

public abstract class Character {
    int XCoord;
    int YCoord;

    public Character(int worldWidth, int worldHeight) {

        this.XCoord = (int) (Math.random()*(worldWidth-2)+1);
        this.YCoord = (int) (Math.random()*(worldHeight-2)+1);
    }

    public  void randomsizeCoordinates(int worldWidth, int worldHeight){
        this.XCoord = (int) (Math.random()*(worldWidth-2)+1);
        this.YCoord = (int) (Math.random()*(worldHeight-2)+1);
    }
}
