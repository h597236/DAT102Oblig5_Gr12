package no.dat102.hvl.veke15.oppg2;

import no.dat102.hvl.veke15.oppg3.BinaerTreNode;

public class BS_Tre<T extends Comparable<T>> {
    private BinaerTreNode<T> rot;

    public void setRot(BinaerTreNode<T> nyRot) {
        this.rot = nyRot;
    }

    public void settInn(T verdi) {
        rot = settInnRek(rot, verdi);
    }

    private BinaerTreNode<T> settInnRek(BinaerTreNode<T> node, T verdi) {
        if (node == null) return new BinaerTreNode<>(verdi);

        if (verdi.compareTo(node.getElement()) < 0) {
            node.setVenstre(settInnRek(node.getVenstre(), verdi));
        } else {
            node.setHogre(settInnRek(node.getHogre(), verdi));
        }

        return node;
    }

    public void skrivVerdier(T nedre, T ovre) {
        skrivVerdierRek(rot, nedre, ovre);
    }

    private void skrivVerdierRek(BinaerTreNode<T> t, T min, T maks) {
        if (t == null) return;

        if (t.getElement().compareTo(min) > 0) {
            skrivVerdierRek(t.getVenstre(), min, maks);
        }

        if (t.getElement().compareTo(min) >= 0 && t.getElement().compareTo(maks) <= 0) {
            System.out.print(t.getElement() + " ");
        }

        if (t.getElement().compareTo(maks) < 0) {
            skrivVerdierRek(t.getHogre(), min, maks);
        }
    }


}

