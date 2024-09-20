import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, String autor, int numeroPaginas) {
        livros.add(new Livro(titulo, autor, numeroPaginas));
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.isDisponivel()) {
                livro.emprestar();
                return;
            }
        }
        System.out.println("Livro não disponível.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolver();
                return;
            }
        }
    }

    public void verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                System.out.println(livro.isDisponivel() ? "Disponível" : "Indisponível");
                return;
            }
        }
    }
}
