package entidades;

public class Produto 
{
   private String nome;
   private double preco;
   private int quantidade;
   /* 
    public  Produto(String nome,double preco,int quantidade) 
    {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
    
    //novo contrutor 
    public  Produto(String nome,double preco) 
    {
		this.nome = nome;
		this.preco = preco;
		
	}
    //alterar nome
    public void setName(String nome) 
    {
    	this.nome = nome;
    }//retornar nome
    public String getName() 
    {
    	return nome;
    }
    //alterar preço
    public void setPreco(double preco) 
    {
    	this.preco = preco;
    }
  //retornar preço
    public double getPreco() 
    {
    	return preco;
    }

    public int getQuantidade() 
    {
    	return quantidade;
    }*/
    
    
   
   //•Botão direito -> Source-> Generate Constructor using Fields
   //•Botão direito -> Source-> Generate Getters and Setters
    
    
    

    public Produto(String nome, double preco, int quantidade) {
	super();
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;
}
    
    
    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}




	public double valorTotalEmEstoque() 
    {
        return preco * quantidade;
    }
	public void adicionarProdutos(int quantidade) 
    {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) 
    {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f", preco) + ", "   + quantidade + " unidades, Total: R$ "+ String.format("%.2f", valorTotalEmEstoque());
    }
}
