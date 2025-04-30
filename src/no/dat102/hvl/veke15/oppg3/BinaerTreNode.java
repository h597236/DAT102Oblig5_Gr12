package no.dat102.hvl.veke15.oppg3;

public class BinaerTreNode<T> {
    private T element;
    private BinaerTreNode<T> venstre, hogre;
    private int hogdeU;

    public BinaerTreNode(T element) {
        this.element = element;
        this.hogdeU = 1;
    }

    public int getHogdeU() {
        return hogdeU;
    }

    public void setHogdeU(int h) {
        this.hogdeU = h;
    }

    public T getElement() {
        return element;
    }

    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public void setVenstre(BinaerTreNode<T> venstre) {
        this.venstre = venstre;
    }

    public BinaerTreNode<T> getHogre() {
        return hogre;
    }

    public void setHogre(BinaerTreNode<T> hogre) {
        this.hogre = hogre;
    }

    public static <T> boolean erBalansert(BinaerTreNode<T> node) {
        if (node == null) return true;

        int venstreHoyde = (node.getVenstre() != null) ? node.getVenstre().getHogdeU() : 0;
        int hogreHoyde = (node.getHogre() != null) ? node.getHogre().getHogdeU() : 0;

        if (Math.abs(venstreHoyde - hogreHoyde) > 1) {
            return false;
        }

        return erBalansert(node.getVenstre()) && erBalansert(node.getHogre());
    }
}
