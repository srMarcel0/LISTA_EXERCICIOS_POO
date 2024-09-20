import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<Usuario> amigos;
    private List<String> posts;

    public Usuario(String nome) {
        this.nome = nome;
        amigos = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void publicarMensagem(String mensagem) {
        posts.add(mensagem);
    }

    public void comentarPost(int indice, String comentario) {
        if (indice >= 0 && indice < posts.size()) {
            System.out.println(nome + " comentou: " + comentario);
        }
    }

    public void mostrarPosts() {
        for (String post : posts) {
            System.out.println(post);
        }
    }
}

class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(String nome) {
        usuarios.add(new Usuario(nome));
    }
}
