package ee.mihkel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        World world = new World(5, 10);

        Player mangija1 = new Player(world.width, world.height); // mangija1 - sees on tema koordinaadid(konstruktoris)
        Enemy vaenlane1 = new Enemy(world.width, world.height);
        QuestMaster questMaster = new QuestMaster(world.width, world.height);
        Item sword = new Item(world, ItemType.SWORD);
        Item hammer = new Item(world, ItemType.HAMMER);
        Item dagger = new Item(world, ItemType.DAGGER);
        world.items = new ArrayList<>(Arrays.asList(sword, hammer, dagger));


                      // mangija1.xCoord, mangija1.yCoord
                        // saadan hoopis mangija1
                          // printMap sees tehakse mangija1.xCoord ja mangija1.yCoord
        world.printMap(mangija1, vaenlane1, questMaster);

        Scanner scanner = new Scanner(System.in); // uus class
        while(true) {
            String input = scanner.nextLine();
            mangija1.movePlayer(input, world.height, world.width);
            for (Item i: world.items) {
                if (mangija1.XCoord == i.xCoord && mangija1.YCoord == i.yCoord)  {
                    mangija1.fightWeapon = i;
                    System.out.println("Mängija sai endale relvaks: " + i.itemType);
                    break;
                }
            }
            if (mangija1.XCoord == vaenlane1.XCoord &&
                    mangija1.YCoord == vaenlane1.YCoord && vaenlane1.isVisible) {
                System.out.println("Enemy ja Player kohtusid");
                vaenlane1.isVisible = false;
            }
            if (mangija1.XCoord == questMaster.XCoord &&
                    mangija1.YCoord == questMaster.YCoord) {
                vaenlane1.isVisible = true;
                vaenlane1.randomsizeCoordinates(world.width, world.height);
            }

            world.printMap(mangija1, vaenlane1, questMaster);
        }
    }
}