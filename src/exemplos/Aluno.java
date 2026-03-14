package exemplos;

class Aluno extends Pessoa {
    private long matriculaAluno;

    Aluno(String nome, String cpf, String dataNascimento, long matricula, String telefone) {
        super(nome, cpf, dataNascimento, telefone);
        this.matriculaAluno = matricula;
    }

    @Override
    public void imprimirDados(){
        System.out.println("### Aluno ###");
        super.imprimirDados();
        System.out.println("Matrícula: " + matriculaAluno);
    }

    public long getMatricula() {
        return matriculaAluno;
    }

    public void setMatricula(long matricula) {
        this.matriculaAluno = matricula;
    }
}
