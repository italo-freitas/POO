package Exercicio2;

public abstract class VeiculoPasseio {
	private String cor;
    private String placa;
    private String modelo;
    private int ano;
    private double qtdeCombustivel;
    
    VeiculoPasseio (String cor, String placa, String modelo, int ano, double comb){
        setCor(cor);
        setPlaca(placa);
        setModelo(modelo);
        setAno(ano);
        setComb(comb);
    }
 
    private void setCor(String cor){
        this.cor = cor;
    }
    
    private void setPlaca(String placa){
        this.placa = placa;
    }
    
    private void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    private void setAno(int ano){
        this.ano = ano;
    }
    
    private void setComb(double comb){
        this.qtdeCombustivel = comb;
    }

    public String getCor(String cor){
        return cor;
    }
    
    public String getPlaca(String placa){
        return placa;
    }
    
    public String getModelo(String modelo){
        return modelo;
    }
    
    public int getAno(int ano){
        return ano;
    }
    
    public double getComb(double comb){
        return comb;
    }

}
