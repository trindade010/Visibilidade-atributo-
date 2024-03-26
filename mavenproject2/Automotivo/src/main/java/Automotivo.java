import javax.swing.JOptionPane;


public class Automotivo {
    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    public Automotivo() {
        this("", "", 0, "");
    }
    public Automotivo(String modelo, String marca, Integer ano, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public Integer getAno() {
        return ano;
    }
    
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void provarExistencia() {
        
        JOptionPane.showMessageDialog(null, "Modelo: " + this.getModelo() + "\n Marca: "
                + this.getMarca() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor());
    }
    
    public void entraDados() {
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        marca = JOptionPane.showInputDialog("Marca: ");
        setMarca(marca);
        ano = Integer.parseInt(JOptionPane.showInputDialog("ano: "));
        setAno(ano);
        String cor  = JOptionPane.showInputDialog("cor: ");
        setCor(cor);
    }
    
    public static void main(String[] args) {
        Automotivo autol;
        autol = new Automotivo();
        autol.entraDados();
        autol.provarExistencia();
    }
}
