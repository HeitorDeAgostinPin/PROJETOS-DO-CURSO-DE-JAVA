package entidades;

public class AlunoHotelVetor 
{
     private String nome;
     private String email;
     
     
     
     public AlunoHotelVetor(String nome, String email) 
     {
		this.email = email;
		this.nome = nome;
	 }

	public String getNome()
     {
    	 return nome;
     }
     
     public String getEmail() 
     {
    	 return email;
     }

     public String toString() 
     {
    	 return nome + "," + email;
     }
}
