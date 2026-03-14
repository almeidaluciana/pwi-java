package exemplos;

class Professor extends Pessoa {
    private int matriculaProfessor;
    private String disciplina;

    Professor(String nome, String cpf, String dataNascimento, String telefone,
              int matriculaProfessor, String disciplina){
        super(nome, cpf, dataNascimento, telefone);
        this.matriculaProfessor = matriculaProfessor;
        this.disciplina = disciplina;
    }

    @Override
    public void imprimirDados(){
        System.out.println("### Professor ###");
        super.imprimirDados();
        System.out.println("Matrícula: " + matriculaProfessor);
        System.out.println("Disciplina: " + disciplina);
    }
    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }
    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
