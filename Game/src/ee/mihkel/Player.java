package ee.mihkel;

// tellimused, kasutajad, tooted, kategooriad, postitused
// eesnimi, perenimi, e-mail, isikukood, aadress, salasõna
// muuda salasõna, muuda profiili andmeid, kustuta kasutaja

public class Player extends Character {
    Item fightWeapon;

    // constructor - kirjeldab kuidas seda klassi luuakse
    public Player(int worldWidth, int worldHeight) {
        super(worldWidth,worldHeight);
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        if (input.equals("w")) {
            if (YCoord > 1){
                YCoord--;
            }
        }   else if (input.equals("s")) {
            if (YCoord < worldHeight-2){
                YCoord++;
            }
        }   else if (input.equals("a")) {
            if (XCoord > 1){
                XCoord--;
            }

        }   else if (input.equals("d")) {
            if (XCoord < worldWidth-2){
                XCoord++;
            }
        }
    }
}
