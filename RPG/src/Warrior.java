import java.util.Scanner;

public class Warrior extends Melee{
    double physicalBoost;
    Scanner scanner = new Scanner(System.in);

    public Warrior(double baseDamage, double health, double physicalBoost) {
        super(baseDamage, health);
        this.physicalBoost = physicalBoost;

    }

    double slash (){
        double totalDamage;
        totalDamage =  baseDamage + baseDamage * physicalBoost + 15 ;
        System.out.println(totalDamage);
        return totalDamage;
    }

    double heavySlash (){
        double totalDamage;
        totalDamage =  baseDamage + baseDamage * physicalBoost + 35 ;
        System.out.println(totalDamage);
        return totalDamage;
    }

    double ultimateMove (){
        double totalDamage;
        totalDamage =  baseDamage + baseDamage * physicalBoost + 100 ;
        System.out.println(totalDamage);
        return totalDamage;
    }
}

