public class Pile {

    private int[] tab;
    private int indiceSommet;

    /**
     * Permet de créer une pile de taille pfTaille
     */
    public Pile(int pfTaille) {
        this.tab = new int[pfTaille];
        this.indiceSommet = -1;
    }

    /**
     * Permet de créer une pile de taille pfTaille
     *
     * @param pfTaille taille de la pile
     * @return un nouvel objet Pile de taille pfTaille
     */
    public static Pile CreerPile(int pfTaille) {
        return new Pile(pfTaille);
    }

    /**
     * Permet de tester si la pile est vide
     *
     * @return true si la pile est vide, sinon false
     */
    public boolean est_vide() {
        return this.indiceSommet <= 0;
    }

    /**
     * Permet d'empiler un élément
     *
     * @param pfElement element a empiler
     */
    public void empiler(int pfElement) {
        this.indiceSommet = this.indiceSommet + 1;
        this.tab[this.indiceSommet] = pfElement;
    }

    /**
     * Permet de dépiler une pile
     *
     * @return l'indice sommet de la pile
     */
    public int depiler() {
        this.indiceSommet = this.indiceSommet - 1;
        return this.indiceSommet;
    }

    /**
     * Permet de retourner le sommet d'une pile
     *
     * @return le sommet de la pile
     */
    public int sommet() throws Exception {
        return this.tab[this.indiceSommet];
    }

    /**
     * Permet de vider une pile
     */
    public void vider() {
        this.indiceSommet = 0;

    }
}
