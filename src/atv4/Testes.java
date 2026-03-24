package atv4;

public class Testes {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("João", "Rua 2, 333", "853333333", 1000, 300);
        Empregado empregado = new Empregado("Luis", "Rua 3, 123", "85999999990", 123, 3000, 10);
        Administrador administrador =  new Administrador("Sabrina", "Rua 4, 456", "8574598099", 345, 3000, 15, 500);
        Operario operario = new Operario("Laís", "Rua 5, 123", "85993445556", 789, 2000, 10, 10000, 10);
        Vendedor vendedor = new Vendedor("Manoela", "Rua 6, 678", "85923895475", 456, 1200, 5, 3000, 10);

        System.out.println("\nFornecedor");
        System.out.println("Nome: "+fornecedor.getNome());
        System.out.println("Endereço: "+fornecedor.getEndereco());
        System.out.println("Telefone: "+fornecedor.getTelefone());
        System.out.println("Valor do crédito: R$ "+fornecedor.getValorCredito());
        System.out.println("Valor da dívida: R$ "+fornecedor.getValorDivida());
        System.out.println("Saldo: R$ "+fornecedor.obterSaldo());

        System.out.println("\nEmpregado");
        System.out.println("Nome: "+empregado.getNome());
        System.out.println("Endereço: "+empregado.getEndereco());
        System.out.println("Telefone: "+empregado.getTelefone());
        System.out.println("Código do Setor: "+empregado.getCodigoSetor());
        System.out.println("Salário base: R$ "+empregado.getSalarioBase());
        System.out.println("Imposto: "+empregado.getImposto()+"%");
        System.out.println("Salário atual: R$ "+empregado.calcularSalario());

        System.out.println("\nAdministrador");
        System.out.println("Nome: "+administrador.getNome());
        System.out.println("Endereço: "+administrador.getEndereco());
        System.out.println("Telefone: "+administrador.getTelefone());
        System.out.println("Código do Setor: "+administrador.getCodigoSetor());
        System.out.println("Salário base: R$ "+administrador.getSalarioBase());
        System.out.println("Imposto: "+administrador.getImposto()+"%");
        System.out.println("Ajuda de custo: R$ "+administrador.getAjudaDeCusto());
        System.out.println("Salário atual: R$ "+administrador.calcularSalario());

        System.out.println("\nOperário");
        System.out.println("Nome: "+operario.getNome());
        System.out.println("Endereço: "+operario.getEndereco());
        System.out.println("Telefone: "+operario.getTelefone());
        System.out.println("Código do Setor: "+operario.getCodigoSetor());
        System.out.println("Salário base: R$ "+operario.getSalarioBase());
        System.out.println("Imposto: "+operario.getImposto()+"%");
        System.out.println("Valor da produção: R$ "+operario.getValorProducao());
        System.out.println("Comissão: "+operario.getComissao()+"%");
        System.out.println("Salário atual: R$ "+operario.calcularSalario());

        System.out.println("\nVendedor");
        System.out.println("Nome: "+vendedor.getNome());
        System.out.println("Endereço: "+vendedor.getEndereco());
        System.out.println("Telefone: "+vendedor.getTelefone());
        System.out.println("Código do Setor: "+vendedor.getCodigoSetor());
        System.out.println("Salário base: R$ "+vendedor.getSalarioBase());
        System.out.println("Imposto: "+vendedor.getImposto()+"%");
        System.out.println("Valor das vendas: R$ "+vendedor.getValorVendas());
        System.out.println("Comissão: "+vendedor.getComissao()+"%");
        System.out.println("Salário atual: R$ "+vendedor.calcularSalario());
    }
}
