package org.example;

public class Lutadores implements Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private int vitoria;
    private int derrota;
    private int empate;
    private String categoria;
    private String maioridade;

    public Lutadores(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empate){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
        setcategoria("");
        setmaioridade("");
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getnacionalidade(){
        return nacionalidade;
    }

    public void setnacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getidade(){
        return idade;
    }

    public void setidade(int idade){
        this.idade = idade;
    }

    public double getaltura(){
        return altura;
    }

    public void setaltura(double altura){
        this.altura = altura;
    }

    public double getpeso(){
        return peso;
    }

    public void setpeso(double peso){
        this.peso = peso;
    }

    public int getvitoria(){
        return vitoria;
    }

    public void setvitoria(int vitoria){
        this.vitoria = vitoria;
    }

    public int getderrota(){
        return derrota;
    }

    public void setderrota(int derrota){
        this.derrota = derrota;
    }

    public int getempate(){
        return empate;
    }
    public void setempate(int empate){
        this.empate = empate;
    }

    public String getcategoria(){
        return categoria;
    }

    public String getmaioridade(){
        return maioridade;
    }

    public void setmaioridade(String maioridade){
        if (idade < 18){
            this.maioridade = "nao e possivel competir!";
        }
        else {
            this.maioridade = "pode competir!";
        }
    }

    public void setcategoria(String categoria){
        if (peso < 52.0){
         this.categoria = "invalido";
        }
        else if ( peso <= 70.3) {
            this.categoria = "leve";
        } else if (peso <= 83.9) {
            this.categoria = "medio";
        }
        else {
            this.categoria = "pesado";
        }

    }

    @Override
    public void apresentar() {
        System.out.println("--------------------LUTADOR--------------------");
        System.out.println("NOME: " + nome);
        System.out.println("NACIONALIDADE: " + nacionalidade);
        System.out.println("IDADE: " + idade);
        System.out.println("PODE COMPETIR? " + maioridade);
        System.out.println("ALTURA: " + altura);
        System.out.println("PESO: " + peso);
        System.out.println("CATEGORIA: " + categoria);
    }

    @Override
    public void status() {
        System.out.println("DERROTAS: " + derrota);
        System.out.println("VITORIAS:" + vitoria);
        System.out.println("EMPATES: "+ empate);
    }

    @Override
    public void ganharLuta() {
        this.vitoria = vitoria++;
    }

    @Override
    public void perderLuta() {
        this.derrota = derrota++;
    }

    @Override
    public void empatarLuta() {
        this.empate = empate++;
    }
}
