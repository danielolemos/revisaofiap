
public class Canal {
	
	private String login;
	private String senha;
	
	public boolean autentica(String login, String senha){
		this.login = login;
		this.senha = senha;
		
		if (this.login.equals("professor") && this.senha.equals("fiap")) {
			return true;
		}else{
			return false;
		}
	}

}
