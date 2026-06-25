package NivelIntermediario.Generics.GenericsPt1;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    // Construtores
    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    // Getters / Setters
    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    // Metodo colocar equipamentos Genéricos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos;
    }

}
