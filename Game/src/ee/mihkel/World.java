package ee.mihkel;

import java.util.List;

public class World {
    int height;
    int width;
    List<Item> items;

    public World(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void printMap(Player player, Enemy enemy, QuestMaster questMaster) {


        char symbol;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height -1) {
                    symbol = '-';
                } else if (x == 0 || x == width -1) {
                    symbol = '|';
                } else {
                    symbol = ' ';

                }
                for (Item i: items) {
                    if (x == i.xCoord && y == i.yCoord)  {
                    symbol = 'I';
                    }
                }
                if (x == questMaster.XCoord && y == questMaster.YCoord) {
                    symbol = 'Q';
                }
                if (x == enemy.XCoord && y == enemy.YCoord && enemy.isVisible) {
                    symbol = 'Z';
                }
                if (x == player.XCoord && y == player.YCoord) {
                    symbol = 'X';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
