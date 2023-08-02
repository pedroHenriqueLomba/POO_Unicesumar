public class Professor {
    public String nome;
    public Integer idade;
    private String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Professor(String nome, Integer idade, String matricula){
        this.setNome(nome);
        this.setIdade(idade);
        this.setMatricula(matricula);
    }
}