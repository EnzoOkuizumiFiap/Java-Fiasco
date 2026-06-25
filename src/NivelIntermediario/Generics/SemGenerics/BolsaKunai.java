package NivelIntermediario.Generics.SemGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {
    private List<Kunai> kunais;

    // Construtor
    public BolsaKunai() {
        this.kunais = new ArrayList<>();
    }

    // Getters / Setters
    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    // Metodo para adicionar Kunais
    public void adicionarKunai(Kunai kunai) {
        kunais.add(kunai);
    }

    @Override
    public String toString() {
        return "Bolsa de Kunais: " + kunais.toString();
    }


}
