package NivelIntermediario.Generics.GenericsPt2;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> ferramentas;

    // Construtores
    public BolsaGenerica() {
        this.ferramentas = new ArrayList<>();
    }

    // Getters / Setters
    public List<T> getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }

    // Metodo colocar equipamentos Genéricos
    public void adicionarFerramentas(T FerramentaGenerico) {
        ferramentas.add(FerramentaGenerico);
    }

    // Mostrando a nossa lista de ferramentas
    public void mostrarFerramenta() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }

    @Override
    public String toString() {
        return "Bolsa de Ferramentas: " + ferramentas;
    }

}
