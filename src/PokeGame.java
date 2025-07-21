import java.util.Scanner;
import java.util.Random;
public class PokeGame {


    /*VARIABLES*/

    String title = """
            
            ==================================================================================
            
                 █████    █████   █████  █  █  █████  █████  █████  █      █████    █████
                █░░░░░█   █    █  █   █  █ █   █      █      █   █  █      █       █░░░░░█
                █░░█░░█   █    █  █   █  ██    █████  █████  █   █  █      █████   █░░█░░█
                █░░░░░█   █████   █   █  █ █   █          █  █   █  █      █       █░░░░░█
                 █████    █       █████  █  █  █████  █████  █████  █████  █████    █████
            
            ==================================================================================
            """;

    static String secretPokePc = """
            
            ██████████████████
            █  ------------  █
            █    Secret's    █
            █  ------------  █
            █  1- Arceus     █
            █  2- Dialga     █
            █  3- Palkia     █
            █  4- Articuno   █
            █  5- Zapdos     █
            █  6- Moltres    █
            █                █
            ██████████████████
            """;

    String pokePc = """
            
            █████████████████████████████████████████████████████████████████████████████████████
            █                              ------------------------                             █
            █                                Choose your Pokemon:                               █
            █                              ------------------------                             █
            █  1- Pikachu    |  7- Meowth    | 13- Dragonite  | 19- Snivy      | 25- Scyther    █
            █  2- Charmander |  8- Eevee     | 14- Charizard  | 20- Togepi     | 26- Lapras     █
            █  3- Squirtle   |  9- Mewtwo    | 15- Lucario    | 21- Vaporeon   | 27- Onix       █
            █  4- Bulbasaur  | 10- Snorlax   | 16- Machamp    | 22- Jolteon    | 28- Arcanine   █
            █  5- Jigglypuff | 11- Psyduck   | 17- Alakazam   | 23- Flareon    | 29- Groudon    █
            █  6- Gengar     | 12- Magikarp  | 18- Gyarados   | 24- Blastoise  | 30- Tyranitar  █
            █                                                                                   █
            █████████████████████████████████████████████████████████████████████████████████████
            """;
    static Random random = new Random();
    static int enemylife ;
    static int enemypokemonType;
    static int enemyspecialAttack;
    static String enemyspecialAttackMessage;
    static int enemyattack;
    static int life;
    static int pokemonType;
    static String type;
    static String attackMessage = "has used normal attack";
    static int attack;
    static String specialAttackMessage;
    static int specialAttack;
    static String pokeballGoes;


    /*Selector'sType METHOD*/

    public static void selectorType () {
        switch (pokemonType) {
            case 1:
                PokeGame.type = "Normal";
                break;
            case 2:
                PokeGame.type = "Fire";
                break;
            case 3:
                PokeGame.type = "Water";
                break;
            case 4:
                PokeGame.type = "Grass";
                break;
            case 5:
                PokeGame.type = "Electric";
                break;
            case 6:
                PokeGame.type = "Ice";
                break;
            case 7:
                PokeGame.type = "Fighting";
                break;
            case 8:
                PokeGame.type = "Poison";
                break;
            case 9:
                PokeGame.type = "Ground";
                break;
            case 10:
                PokeGame.type = "Flying";
                break;
            case 11:
                PokeGame.type = "Psychic";
                break;
            case 12:
                PokeGame.type = "Bug";
                break;
            case 13:
                PokeGame.type = "Rock";
                break;
            case 14:
                PokeGame.type = "Ghost";
                break;
            case 15:
                PokeGame.type = "Dragon";
                break;
            case 16:
                PokeGame.type = "Dark";
                break;
            case 17:
                PokeGame.type = "Steel";
                break;
            case 18:
                PokeGame.type = "Fairy";
                break;
        }
    }


    /*SecretSelector's METHOD*/

    public static void secretSelector () {
        switch (PokeSole.secretScan) {
            case 1:
                PokeGame.attack = 30;
                PokeGame.pokeballGoes = "\n\n ----✨Arceus I choose you!!!✨----";
                PokeGame.pokemonType = 1;
                PokeGame.life = 160;
                PokeGame.specialAttackMessage = "✨Judgment✨";
                PokeGame.specialAttack = 65;
                break;
            case 2:
                PokeGame.attack = 35;
                PokeGame.pokeballGoes = "\n\n ----✨Dialga I choose you!!!✨----";
                PokeGame.pokemonType = 17;
                PokeGame.life = 150;
                PokeGame.specialAttackMessage = "✨Roar of Time✨";
                PokeGame.specialAttack = 70;
                break;
            case 3:
                PokeGame.attack = 35;
                PokeGame.pokeballGoes = "\n\n ----✨Palkia I choose you!!!✨----";
                PokeGame.pokemonType = 3;
                PokeGame.life = 150;
                PokeGame.specialAttackMessage = "✨Spacial Rend✨";
                PokeGame.specialAttack = 70;
                break;
            case 4:
                PokeGame.attack = 25;
                PokeGame.pokeballGoes = "\n\n ----✨Articuno I choose you!!!✨----";
                PokeGame.pokemonType = 6;
                PokeGame.life = 130;
                PokeGame.specialAttackMessage = "✨Ice Beam✨";
                PokeGame.specialAttack = 60;
                break;
            case 5:
                PokeGame.attack = 25;
                PokeGame.pokeballGoes = "\n\n ----✨Zapdos I choose you!!!✨----";
                PokeGame.pokemonType = 5;
                PokeGame.life = 130;
                PokeGame.specialAttackMessage = "✨ThunderBolt✨";
                PokeGame.specialAttack = 60;
                break;
            case 6:
                PokeGame.attack = 25;
                PokeGame.pokeballGoes = "\n\n ----✨Moltres I choose you!!!✨----";
                PokeGame.pokemonType = 2;
                PokeGame.life = 130;
                PokeGame.specialAttackMessage = "✨FlameThrower✨";
                PokeGame.specialAttack = 60;
                break;
            default:
                System.out.println("This Pokemon doesn't exist! Try Again");
        }
    }


    /*Selector's METHOD*/

    public static void selector() {
        switch (PokeSole.pokeSelect) {
            case 98:
                System.out.println(PokeGame.secretPokePc);
                break;
            case 1:
                PokeGame.attack = 15;
                PokeGame.pokeballGoes = "\n\n ----Pikachu I choose you!!!----";
                PokeGame.pokemonType = 5;
                PokeGame.life = 90;
                PokeGame.specialAttackMessage = "ThunderBolt";
                PokeGame.specialAttack = 40;
                break;
            case 2:
                PokeGame.attack = 20;
                PokeGame.pokeballGoes = "\n\n ----Charmander I choose you!!!----";
                PokeGame.pokemonType = 2;
                PokeGame.life = 85;
                PokeGame.specialAttackMessage = "FlameThrower";
                PokeGame.specialAttack = 45;
                break;
            case 3:
                PokeGame.attack = 18;
                PokeGame.pokeballGoes = "\n\n ----Squirtle I choose you!!!----";
                PokeGame.pokemonType = 3;
                PokeGame.life = 100;
                PokeGame.specialAttackMessage = "Water Gun";
                PokeGame.specialAttack = 35;
                break;
            case 4:
                PokeGame.attack = 18;
                PokeGame.pokeballGoes = "\n\n ----Bulbasaur I choose you!!!----";
                PokeGame.pokemonType = 4;
                PokeGame.life = 100;
                PokeGame.specialAttackMessage = "Razor Leaf";
                PokeGame.specialAttack = 38;
                break;
            case 5:
                PokeGame.attack = 10;
                PokeGame.pokeballGoes = "\n\n ----Jigglypuff I choose you!!!----";
                PokeGame.pokemonType = 18;
                PokeGame.life = 140;
                PokeGame.specialAttackMessage = "Sing";
                PokeGame.specialAttack = 0;
                break;
            case 6:
                PokeGame.attack = 20;
                PokeGame.pokeballGoes = "\n\n ----Gengar I choose you!!!----";
                PokeGame.pokemonType = 14;
                PokeGame.life = 80;
                PokeGame.specialAttackMessage = "Shadow Ball";
                PokeGame.specialAttack = 45;
                break;
            case 7:
                PokeGame.attack = 17;
                PokeGame.pokeballGoes = "\n\n ----Meowth I choose you!!!----";
                PokeGame.pokemonType = 1;
                PokeGame.life = 75;
                PokeGame.specialAttackMessage = "Pay Day";
                PokeGame.specialAttack = 30;
                break;
            case 8:
                PokeGame.attack = 18;
                PokeGame.pokeballGoes = "\n\n ----Eevee I choose you!!!----";
                PokeGame.pokemonType = 1;
                PokeGame.life = 90;
                PokeGame.specialAttackMessage = "Quick Attack";
                PokeGame.specialAttack = 30;
                break;
            case 9:
                PokeGame.attack = 25;
                PokeGame.pokeballGoes = "\n\n ----Mewtwo I choose you!!!----";
                PokeGame.pokemonType = 11;
                PokeGame.life = 160;
                PokeGame.specialAttackMessage = "Psychic";
                PokeGame.specialAttack = 60;
                break;
            case 10:
                PokeGame.attack = 22;
                PokeGame.pokeballGoes = "\n\n ----Snorlax I choose you!!!----";
                PokeGame.pokemonType = 1;
                PokeGame.life = 160;
                PokeGame.specialAttackMessage = "Body Slam";
                PokeGame.specialAttack = 50;
                break;
            case 11:
                PokeGame.attack = 15;
                PokeGame.pokeballGoes = "\n\n ----Psyduck I choose you!!!----";
                PokeGame.pokemonType = 3;
                PokeGame.life = 95;
                PokeGame.specialAttackMessage = "Confusion";
                PokeGame.specialAttack = 35;
                break;
            case 12:
                PokeGame.attack = 5;
                PokeGame.pokeballGoes = "\n\n ----Magikarp I choose you!!!----";
                PokeGame.pokemonType = 3;
                PokeGame.life = 50;
                PokeGame.specialAttackMessage = "Splash";
                PokeGame.specialAttack = 0;
                break;
            case 13:
                PokeGame.attack = 25;
                PokeGame.pokeballGoes = "\n\n ----Dragonite I choose you!!!----";
                PokeGame.pokemonType = 15;
                PokeGame.life = 150;
                PokeGame.specialAttackMessage = "Dragon Claw";
                PokeGame.specialAttack = 55;
                break;
            case 14:
                PokeGame.attack = 24;
                PokeGame.pokeballGoes = "\n\n ----Charizard I choose you!!!----";
                PokeGame.pokemonType = 2;
                PokeGame.life = 120;
                PokeGame.specialAttackMessage = "Fire BLast";
                PokeGame.specialAttack = 55;
                break;
            case 15:
                PokeGame.attack = 22;
                PokeGame.pokeballGoes = "\n\n ----Lucario I choose you!!!----";
                PokeGame.pokemonType = 17;
                PokeGame.life = 110;
                PokeGame.specialAttackMessage = "Aura Sphere";
                PokeGame.specialAttack = 50;
                break;
            case 16:
                PokeGame.attack = 23;
                PokeGame.pokeballGoes = "\n\n ----Machamp I choose you!!!----";
                PokeGame.pokemonType = 7;
                PokeGame.life = 120;
                PokeGame.specialAttackMessage = "Punch";
                PokeGame.specialAttack = 50;
                break;
            case 17:
                PokeGame.attack = 15;
                PokeGame.pokeballGoes = "\n\n ----Alakazam I choose you!!!----";
                PokeGame.pokemonType = 11;
                PokeGame.life = 75;
                PokeGame.specialAttackMessage = "Psychic";
                PokeGame.specialAttack = 50;
                break;
            case 18:
                PokeGame.attack = 24;
                PokeGame.pokeballGoes = "\n\n ----Gyarados I choose you!!!----";
                PokeGame.pokemonType = 3;
                PokeGame.life = 130;
                PokeGame.specialAttackMessage = "Hyper Beam";
                PokeGame.specialAttack = 60;
                break;
            case 19:
                PokeGame.attack = 14;
                PokeGame.pokeballGoes = "\n\n ----Snivy I choose you!!!----";
                PokeGame.pokemonType = 4;
                PokeGame.life = 80;
                PokeGame.specialAttackMessage = "Leaf Blade";
                PokeGame.specialAttack = 35;
                break;
            case 20:
                PokeGame.attack = 12;
                PokeGame.pokeballGoes = "\n\n ----Togepi I choose you!!!----";
                PokeGame.pokemonType = 18;
                PokeGame.life = 70;
                PokeGame.specialAttackMessage = "Metronome";
                PokeGame.specialAttack = PokeGame.random.nextInt(40) +21;
                break;
            case 21:
                PokeGame.attack = 20;
                PokeGame.pokeballGoes = "\n\n ----Vaporeon I choose you!!!----";
                PokeGame.pokemonType = 3;
                PokeGame.life = 130;
                PokeGame.specialAttackMessage = "Hydro Pump";
                PokeGame.specialAttack = 50;
                break;
            case 22:
                PokeGame.attack = 20;
                PokeGame.pokeballGoes = "\n\n ----Jolteon I choose you!!!----";
                PokeGame.pokemonType = 5;
                PokeGame.life = 90;
                PokeGame.specialAttackMessage = "ThunderBolt";
                PokeGame.specialAttack = 45;
                break;
            case 23:
                PokeGame.attack = 22;
                PokeGame.pokeballGoes = "\n\n ----Flareon I choose you!!!----";
                PokeGame.pokemonType = 2;
                PokeGame.life = 110;
                PokeGame.specialAttackMessage = "FlameThrower";
                PokeGame.specialAttack = 45;
                break;
            case 24:
                PokeGame.attack = 23;
                PokeGame.pokeballGoes = "\n\n ----Blastoise I choose you!!!----";
                PokeGame.pokemonType = 3;
                PokeGame.life = 125;
                PokeGame.specialAttackMessage = "Hydro Pump";
                PokeGame.specialAttack = 55;
                break;
            case 25:
                PokeGame.attack = 21;
                PokeGame.pokeballGoes = "\n\n ----Scyther I choose you!!!----";
                PokeGame.pokemonType = 12;
                PokeGame.life = 100;
                PokeGame.specialAttackMessage = "X-Scissor";
                PokeGame.specialAttack = 40;
                break;
            case 26:
                PokeGame.attack = 20;
                PokeGame.pokeballGoes = "\n\n ----Lapras I choose you!!!----";
                PokeGame.pokemonType = 6;
                PokeGame.life = 135;
                PokeGame.specialAttackMessage = "Beam";
                PokeGame.specialAttack = 50;
                break;
            case 27:
                PokeGame.attack = 17;
                PokeGame.pokeballGoes = "\n\n ----Onix I choose you!!!----";
                PokeGame.pokemonType = 13;
                PokeGame.life = 90;
                PokeGame.specialAttackMessage = "Throw";
                PokeGame.specialAttack = 35;
                break;
            case 28:
                PokeGame.attack = 23;
                PokeGame.pokeballGoes = "\n\n ----Arcanine I choose you!!!----";
                PokeGame.pokemonType = 2;
                PokeGame.life = 120;
                PokeGame.specialAttackMessage = "Speed";
                PokeGame.specialAttack = 50;
                break;
            case 29:
                PokeGame.attack = 25;
                PokeGame.pokeballGoes = "\n\n ----Groudon I choose you!!!----";
                PokeGame.pokemonType = 9;
                PokeGame.life = 160;
                PokeGame.specialAttackMessage = "Eartquake";
                PokeGame.specialAttack = 60;
                break;
            case 30:
                PokeGame.attack = 24;
                PokeGame.pokeballGoes = "\n\n ----Tyranitar I choose you!!!----";
                PokeGame.pokemonType = 16;
                PokeGame.life = 150;
                PokeGame.specialAttackMessage = "Crunch";
                PokeGame.specialAttack = 45;
                break;
            default:
                System.out.println("This Pokemon doesn't exist! Try Again");
        }
    }

    /*Selector'sEnemy METHOD*/

    public static void selectorEnemy() {
        switch (PokeSole.enemySelector) {
            case 1:
            enemyattack = 15;
            pokeballGoes = "\n\n ----Pikachu I choose you!!!----";
            enemypokemonType = 5;
            enemylife = 90;
            enemyspecialAttackMessage = "ThunderBolt";
            enemyspecialAttack = 40;
            break;

            case 2:
                enemyattack = 20;
                pokeballGoes = "\n\n ----Charmander I choose you!!!----";
                enemypokemonType = 2;
                enemylife = 85;
                enemyspecialAttackMessage = "FlameThrower";
                enemyspecialAttack = 45;
                break;
            case 3:
                enemyattack = 18;
                pokeballGoes = "\n\n ----Squirtle I choose you!!!----";
                enemypokemonType = 3;
                enemylife = 100;
                enemyspecialAttackMessage = "Water Gun";
                enemyspecialAttack = 35;
                break;
            case 4:
                enemyattack = 18;
                pokeballGoes = "\n\n ----Bulbasaur I choose you!!!----";
                enemypokemonType = 4;
                enemylife = 100;
                enemyspecialAttackMessage = "Razor Leaf";
                enemyspecialAttack = 38;
                break;
            case 5:
                enemyattack = 10;
                pokeballGoes = "\n\n ----Jigglypuff I choose you!!!----";
                enemypokemonType = 18;
                enemylife = 140;
                enemyspecialAttackMessage = "Sing";
                enemyspecialAttack = 0;
                break;
            case 6:
                enemyattack = 20;
                pokeballGoes = "\n\n ----Gengar I choose you!!!----";
                enemypokemonType = 14;
                enemylife = 80;
                enemyspecialAttackMessage = "Shadow Ball";
                enemyspecialAttack = 45;
                break;
            case 7:
                enemyattack = 17;
                pokeballGoes = "\n\n ----Meowth I choose you!!!----";
                enemypokemonType = 1;
                enemylife = 75;
                enemyspecialAttackMessage = "Pay Day";
                enemyspecialAttack = 30;
                break;
            case 8:
                enemyattack = 18;
                pokeballGoes = "\n\n ----Eevee I choose you!!!----";
                enemypokemonType = 1;
                enemylife = 90;
                enemyspecialAttackMessage = "Quick Attack";
                enemyspecialAttack = 30;
                break;
            case 9:
                enemyattack = 25;
                pokeballGoes = "\n\n ----Mewtwo I choose you!!!----";
                enemypokemonType = 11;
                enemylife = 160;
                enemyspecialAttackMessage = "Psychic";
                enemyspecialAttack = 60;
                break;
            case 10:
                enemyattack = 22;
                pokeballGoes = "\n\n ----Snorlax I choose you!!!----";
                enemypokemonType = 1;
                enemylife = 160;
                enemyspecialAttackMessage = "Body Slam";
                enemyspecialAttack = 50;
                break;
            case 11:
                enemyattack = 15;
                pokeballGoes = "\n\n ----Psyduck I choose you!!!----";
                enemypokemonType = 3;
                enemylife = 95;
                enemyspecialAttackMessage = "Confusion";
                enemyspecialAttack = 35;
                break;
            case 12:
                enemyattack = 5;
                pokeballGoes = "\n\n ----Magikarp I choose you!!!----";
                enemypokemonType = 3;
                enemylife = 50;
                enemyspecialAttackMessage = "Splash";
                enemyspecialAttack = 0;
                break;
            case 13:
                enemyattack = 25;
                pokeballGoes = "\n\n ----Dragonite I choose you!!!----";
                enemypokemonType = 15;
                enemylife = 150;
                enemyspecialAttackMessage = "Dragon Claw";
                enemyspecialAttack = 55;
                break;
            case 14:
                enemyattack = 24;
                pokeballGoes = "\n\n ----Charizard I choose you!!!----";
                enemypokemonType = 2;
                enemylife = 120;
                enemyspecialAttackMessage = "Fire BLast";
                enemyspecialAttack = 55;
                break;
            case 15:
                enemyattack = 22;
                pokeballGoes = "\n\n ----Lucario I choose you!!!----";
                enemypokemonType = 17;
                enemylife = 110;
                enemyspecialAttackMessage = "Aura Sphere";
                enemyspecialAttack = 50;
                break;
            case 16:
                enemyattack = 23;
                pokeballGoes = "\n\n ----Machamp I choose you!!!----";
                enemypokemonType = 7;
                enemylife = 120;
                enemyspecialAttackMessage = "Punch";
                enemyspecialAttack = 50;
                break;
            case 17:
                enemyattack = 15;
                pokeballGoes = "\n\n ----Alakazam I choose you!!!----";
                enemypokemonType = 11;
                enemylife = 75;
                enemyspecialAttackMessage = "Psychic";
                enemyspecialAttack = 50;
                break;
            case 18:
                enemyattack = 24;
                pokeballGoes = "\n\n ----Gyarados I choose you!!!----";
                enemypokemonType = 3;
                enemylife = 130;
                enemyspecialAttackMessage = "Hyper Beam";
                enemyspecialAttack = 60;
                break;
            case 19:
                enemyattack = 14;
                pokeballGoes = "\n\n ----Snivy I choose you!!!----";
                enemypokemonType = 4;
                enemylife = 80;
                enemyspecialAttackMessage = "Leaf Blade";
                enemyspecialAttack = 35;
                break;
            case 20:
                enemyattack = 12;
                pokeballGoes = "\n\n ----Togepi I choose you!!!----";
                enemypokemonType = 18;
                enemylife = 70;
                enemyspecialAttackMessage = "Metronome";
                enemyspecialAttack = PokeGame.random.nextInt(40) +21;
                break;
            case 21:
                enemyattack = 20;
                pokeballGoes = "\n\n ----Vaporeon I choose you!!!----";
                enemypokemonType = 3;
                enemylife = 130;
                enemyspecialAttackMessage = "Hydro Pump";
                enemyspecialAttack = 50;
                break;
            case 22:
                enemyattack = 20;
                pokeballGoes = "\n\n ----Jolteon I choose you!!!----";
                enemypokemonType = 5;
                enemylife = 90;
                enemyspecialAttackMessage = "ThunderBolt";
                enemyspecialAttack = 45;
                break;
            case 23:
                enemyattack = 22;
                pokeballGoes = "\n\n ----Flareon I choose you!!!----";
                enemypokemonType = 2;
                enemylife = 110;
                enemyspecialAttackMessage = "FlameThrower";
                enemyspecialAttack = 45;
                break;
            case 24:
                enemyattack = 23;
                pokeballGoes = "\n\n ----Blastoise I choose you!!!----";
                enemypokemonType = 3;
                enemylife = 125;
                enemyspecialAttackMessage = "Hydro Pump";
                enemyspecialAttack = 55;
                break;
            case 25:
                enemyattack = 21;
                pokeballGoes = "\n\n ----Scyther I choose you!!!----";
                enemypokemonType = 12;
                enemylife = 100;
                enemyspecialAttackMessage = "X-Scissor";
                enemyspecialAttack = 40;
                break;
            case 26:
                enemyattack = 20;
                pokeballGoes = "\n\n ----Lapras I choose you!!!----";
                enemypokemonType = 6;
                enemylife = 135;
                enemyspecialAttackMessage = "Beam";
                enemyspecialAttack = 50;
                break;
            case 27:
                enemyattack = 17;
                pokeballGoes = "\n\n ----Onix I choose you!!!----";
                enemypokemonType = 13;
                enemylife = 90;
                enemyspecialAttackMessage = "Throw";
                enemyspecialAttack = 35;
                break;
            case 28:
                enemyattack = 23;
                pokeballGoes = "\n\n ----Arcanine I choose you!!!----";
                enemypokemonType = 2;
                enemylife = 120;
                enemyspecialAttackMessage = "Speed";
                enemyspecialAttack = 50;
                break;
            case 29:
                enemyattack = 25;
                pokeballGoes = "\n\n ----Groudon I choose you!!!----";
                enemypokemonType = 9;
                enemylife = 160;
                enemyspecialAttackMessage = "Eartquake";
                enemyspecialAttack = 60;
                break;
            case 30:
                enemyattack = 24;
                pokeballGoes = "\n\n ----Tyranitar I choose you!!!----";
                enemypokemonType = 16;
                enemylife = 150;
                enemyspecialAttackMessage = "Crunch";
                enemyspecialAttack = 45;
                break;
            case 31:
                enemyattack = 30;
                pokeballGoes = "\n\n ----✨Arceus I choose you!!!✨----";
                enemypokemonType = 1;
                enemylife = 160;
                enemyspecialAttackMessage = "✨Judgment✨";
                enemyspecialAttack = 65;
                break;
            case 32:
                enemyattack = 35;
                pokeballGoes = "\n\n ----✨Dialga I choose you!!!✨----";
                enemypokemonType = 17;
                enemylife = 150;
                enemyspecialAttackMessage = "✨Roar of Time✨";
                enemyspecialAttack = 70;
                break;
            case 33:
                enemyattack = 35;
                pokeballGoes = "\n\n ----✨Palkia I choose you!!!✨----";
                enemypokemonType = 3;
                enemylife = 150;
                enemyspecialAttackMessage = "✨Spacial Rend✨";
                enemyspecialAttack = 70;
                break;
            case 34:
                enemyattack = 25;
                pokeballGoes = "\n\n ----✨Articuno I choose you!!!✨----";
                enemypokemonType = 6;
                enemylife = 130;
                enemyspecialAttackMessage = "✨Ice Beam✨";
                enemyspecialAttack = 60;
                break;
            case 35:
                enemyattack = 25;
                pokeballGoes = "\n\n ----✨Zapdos I choose you!!!✨----";
                enemypokemonType = 5;
                enemylife = 130;
                enemyspecialAttackMessage = "✨ThunderBolt✨";
                enemyspecialAttack = 60;
                break;
            case 36:
                enemyattack = 25;
                pokeballGoes = "\n\n ----✨Moltres I choose you!!!✨----";
                enemypokemonType = 2;
                enemylife = 130;
                enemyspecialAttackMessage = "✨FlameThrower✨";
                enemyspecialAttack = 60;
                break;

        }
    }

    /*BattleTurn's METHOD*/

    public static void battleTurn() {
        int turn = 1;
        Scanner scanAttack = new Scanner(System.in);
        Random enemyScanAttack = new Random();
        int enemyAttack;
        int chooseAttack;
            while (life > 0 && enemylife > 0) {
                if (turn == 1) {
                    System.out.println("\n*************************\nNow it's your turn!\n*************************");
                    System.out.println("\n1- Normal attack    2- " + specialAttackMessage);
                    chooseAttack = scanAttack.nextInt();
                    switch (chooseAttack) {
                        case 1:
                            System.out.println("\n============================\nYour pokemon " + attackMessage + "\n============================");
                            enemylife -= attack;
                            break;
                        case 2:
                            System.out.println("\n============================\nYour pokemon has used " + specialAttackMessage + "\n============================");
                            enemylife -= specialAttack;
                            break;
                        default:
                            System.out.println("\n============================\nnon-existent attack\n============================");
                            break;
                    }
                    if (enemylife <= 0) {
                        enemylife = 0;
                        System.out.println("\n+++++++++++++++++\nEnemy life: " + enemylife + "\n+++++++++++++++++");
                    } else {
                        System.out.println("\n+++++++++++++++++\nEnemy life: " + enemylife + "\n+++++++++++++++++");
                    }
                    turn--;
                }  else {
                    System.out.println("\n*************************\nNow it's enemy turn!\n*************************");
                    enemyAttack = enemyScanAttack.nextInt(2) + 1;
                    switch (enemyAttack) {
                        case 1:
                            System.out.println("\n============================\nEnemy " + attackMessage + "\n============================");
                            life -= enemyattack;
                            break;
                        case 2:
                            System.out.println("\n============================\nEnemy has used " + enemyspecialAttackMessage+"\n============================");
                            life -= enemyspecialAttack;
                            break;
                    }
                    if (life <= 0) {
                        life = 0;
                        System.out.println("\n+++++++++++++++++\nYour life: " + life + "\n+++++++++++++++++");
                    }
                    else {
                        System.out.println("\n+++++++++++++++++\nYour life: " + life + "\n+++++++++++++++++");
                    }
                    turn++;
                }
        }
            if (life <= 0 && enemylife > 0) {
                System.out.println("\n-----------------------------------------\n               Your enemy won!\n-----------------------------------------");
            }
            else if (life >= 0){
                    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n               You won!\n++++++++++++++++++++++++++++++++++++++++++");
            }
    }
}

