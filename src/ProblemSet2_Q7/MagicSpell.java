//MagicSpell.java by Daragh Carroll
/*
For my question seven 'project' I have chosen to model magical spells for a
hypothetical computer game

Each spell has a name, a range at which it can be cast and an amount of damage.
A spell may or may not be an 'Area of effect spell'
If it is, the radius of that area of effect needs to be calculated.
 */
package ProblemSet2_Q7;

public class MagicSpell {
    private String spellName;
    private int spellRange;
    private float spellDamage;
    private int spellAOE;

    //Mutators
    public void setSpellName(String spellName)
    {
        this.spellName = spellName;
    }

    public void setSpellRange(int spellRange)
    {
        this.spellRange = spellRange;
    }

    public void setSpellDamage(float spellDamage)
    {
        this.spellDamage = spellDamage;
    }

    public void setSpellAOE(int spellAOE)
    {
        this.spellAOE = spellAOE;
    }

    //Accessors
    public String getSpellName()
    {
        return this.spellName;
    }

    public int getSpellRange()
    {
        return this.spellRange;
    }

    public float getSpellDamage()
    {
        return this.spellDamage;
    }

    public int getSpellAOE()
    {
        return this.spellAOE;
    }


    //Constructor
    public MagicSpell()
    {
        this.spellName = "Unknown Spell";
        this.spellRange = 0;
        this.spellDamage = 0.0f;
        this.spellAOE = 0;
    }

    public MagicSpell(String spellName, int spellRange, float spellDamage, int spellAOE)
    {
        setSpellName(spellName);
        setSpellRange(spellRange);
        setSpellDamage(spellDamage);
        setSpellAOE(spellAOE);
    }

    //toString
    public String toString()
    {
        return "Spell name: " + getSpellName() +
                "\nSpell Range: " + getSpellRange() +
                "\nSpell Damage: " + getSpellDamage()+
                "\nSpell AoE: " + getSpellAOE();
    }
}
