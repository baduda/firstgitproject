package simplegame;

abstract class GameCharacter {
    int hp;
    int damage;

    public GameCharacter(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    boolean isAlive() {
        return hp > 0;
    }

    abstract int hit();
}

class Warrior extends GameCharacter {
    public Warrior() {
        super(100, 15);
    }

    int hit() {
        return damage;
    }
}

class Mage extends GameCharacter {
    public Mage() {
        super(50, 50);
    }

    int hit() {
        return (Math.random() > 0.5) ? damage : 0;
    }
}

class Archer extends GameCharacter {
    int arrows = 5;

    public Archer() {
        super(70, 30);
    }

    int hit() {
        return (arrows-- > 0) ? damage : 0;
    }
}


class Team {
    GameCharacter[] characters;

    public Team(GameCharacter[] characters) {
        this.characters = characters;
    }

    void print() {
        for (GameCharacter character : characters) {
            System.out.println("character = " + character.hp);
        }
    }

    GameCharacter randomCharacter() {
        GameCharacter character;
        do {
            int i = (int) (Math.random() * characters.length);
            character = characters[i];
        } while (!character.isAlive());
        return character;
    }

    boolean isTeamAlive() {
        for (GameCharacter character : characters) {
            if (character.isAlive()) return true;
        }
        return false;
    }
}

public class MainGameApp {
    public static void main(String[] args) {
        Team team1 = new Team(new GameCharacter[]{
                new Warrior(), new Warrior(), new Warrior()});

        Team team2 = new Team(new GameCharacter[]{
                new Warrior(), new Mage(), new Archer()});

        int round = 1;
        while (team1.isTeamAlive() && team2.isTeamAlive()) {
            GameCharacter c1 = team1.randomCharacter();
            GameCharacter c2 = team2.randomCharacter();

            int damage1 = c1.hit();
            int damage2 = c2.hit();

            c1.hp -= damage2;
            c2.hp -= damage1;

            System.out.println("********************* Round " + round + " *************************");
            System.out.println("Team 1");
            team1.print();
            System.out.println("Team 2");
            team2.print();
            round++;
        }
    }
}

