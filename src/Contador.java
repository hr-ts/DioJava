public class Contador {
    public static void main(String[] args) {
        try {
            int numeroInicial = Integer.parseInt(args[0]);
            int numeroFinal = Integer.parseInt(args[1]);

            if (numeroInicial > numeroFinal) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Parâmetros inválidos. Digite dois números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}