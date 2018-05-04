
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario robson = new Funcionario();
		robson.setNome("Robson");
		robson.setCpf("12345678900");
		robson.setSalario(12000.00);
		
		System.out.println(robson.getNome());
		System.out.println(robson.getBonificacao());

		FuncionarioTeste nico = new FuncionarioTeste();
		nico.setSalario(3000);
		
		System.out.println(nico.getTipo());
		System.out.println(nico.getBonificacao());
		
		FuncionarioTeste ze = new FuncionarioTeste();
		ze.setTipo(1);
		ze.setSalario(1000);
		
		System.out.println(ze.getTipo());
		System.out.println(ze.getBonificacao());
	}

}
