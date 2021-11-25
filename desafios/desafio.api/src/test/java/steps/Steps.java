package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import metodos.GetNetApi;

public class Steps {
  
	GetNetApi get = new GetNetApi(); 


	@Given("que acesse api get para consultar unico usuario")
	public void que_acesse_api_get_para_consultar_unico_usuario() {
		
		get.acessarApi("https://reqres.in/api/users/2");
		
		
	}

	
	
	@Then("valido o status code retorno")
	public void valido_o_status_code_retorno() {
	   
		get.statusCode(200);
		
	}

	@Then("valido o nome {string}")
	public void valido_o_nome(String texto) {
		
		get.body(texto);
		
	    
	}
	
	
	
	
	
	
	
	
	
	
}
