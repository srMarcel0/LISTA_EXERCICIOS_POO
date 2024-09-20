import java.util.HashMap;
import java.util.Map;

class Calendario {
    private Map<String, Boolean> feriados;

    public Calendario() {
        feriados = new HashMap<>();
        feriados.put("01-01", true); // Exemplo de feriado
        feriados.put("25-12", true);
    }

    public void exibirCalendario(String mes) {
        // Implementar exibição do calendário
        System.out.println("Exibindo calendário de " + mes);
    }

    public boolean ehFeriado(String data) {
        return feriados.getOrDefault(data, false);
    }

    public int calcularDiferencaDias(String data1, String data2) {
        // Implementar cálculo de diferença de dias
        return 0; // Valor fictício
    }
}
