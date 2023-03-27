package ex3;

/**
 * Classe animal
 */
public class Animal {

    private String nomAnimal;
    private String typeAnimal;
    private String comportement;

    public Animal(String nomAnimal, String typeAnimal, String comportement) {
        this.nomAnimal = nomAnimal;
        this.typeAnimal = typeAnimal;
        this.comportement = comportement;
    }

    /**
     * Accesseur
     * @return nom animal
     */
    public String getNomAnimal() {
        return nomAnimal;
    }

    /**
     * Accesseur
     * @return type animal
     */
    public String getTypeAnimal() {
        return typeAnimal;
    }

    /**
     * Accesseur
     * @return comportement animal
     */
    public String getComportement() {
        return comportement;
    }
}
