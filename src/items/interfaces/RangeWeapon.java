package items.interfaces;

// Definierar gränssnittet RangeWeapon
public interface RangeWeapon {

    // Deklarerar en metod för att utföra en avståndsattack
    void rangeAttack();

    // Deklarerar en metod för att hämta vapnets räckvidd
    double getRange();

    // Deklarerar en metod för att ställa in mängden ammunition för vapnet
    void setAmmunition(int ammo);
}
