package fase05.futebol.dominio;

public class Clube {
   private String nome;
   private int vitorias;
   private int empates;
   private int derrotas;
  
public Clube(String nome, int vitorias, int empates, int derrotas) {
    this.nome = nome;
    this.vitorias = vitorias;
    this.empates = empates;
    this.derrotas = derrotas;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getVitorias() {
    return vitorias;
}

public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
}

public int getEmpates() {
    return empates;
}

public void setEmpates(int empates) {
    this.empates = empates;
}

public int getDerrotas() {
    return derrotas;
}

public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
}

public int totalDeJogos(){
   return  (vitorias + derrotas + empates);
}

public int pontosGanhos(){
   return  vitorias * 3 + empates;
}

public int pontosPerdidos(){
   return  derrotas * 3 + empates * 2;
}   

public double aproveitamento(){
   return  (pontosGanhos()/(totalDeJogos()*3)) * 100;
}

  }
