public class CalculadoraRank {

    public static void main(String[] args) {
        // Teste da função
        int vitorias = 85;
        int derrotas = 20;

        String nivel = calcularNivel(vitorias);
        int saldoVitorias = vitorias - derrotas;

        System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + nivel);
    }

    public static String calcularNivel(int vitorias) {
        String nivel;

        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 10 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        return nivel;
    }
}
