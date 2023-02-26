public class Main {

    public static void main(String[] args) {
        Pile maPile = Pile.CreerPile(10);
        if (!maPile.est_vide())
            System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide())
            System.out.println("NOK");

        int element = maPile.depiler();
        if (!maPile.est_vide())
            System.out.println("NOK");
        if (element != 5)
            System.out.println("NOK");

        try {
            int sommet = maPile.sommet();
            if (!maPile.est_vide())
                System.out.println(sommet);
        } catch (Exception e) {
            System.out.println("Une erreur est survenue sur le sommet.");
        }

        maPile.vider();
        if (maPile.est_vide())
            System.out.println("NOK");
    }
}
