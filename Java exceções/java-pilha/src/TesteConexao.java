
public class TesteConexao {

	public static void main(String[] args) {
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException e) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.fecha();
//			}
//		}
		
		
		//Simplificação
		
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException e) {
			System.out.println("Deu erro na conexão");
		}
		
	}
	
}
