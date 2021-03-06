import java.util.ArrayList;

public class Scuola {
    private String nomeScuola;
    ArrayList<Alunno> stud;
    ArrayList<Classe> classi;//array list classi

    public Scuola(String nomeScuola) {
        this.nomeScuola = nomeScuola;
        classi=new ArrayList<Classe>();
        stud=new ArrayList<Alunno>();
           
    }
    
    
    public void aggiungiAlunno(String nome, String cognome, int anno, String luogo){
    Alunno alunno= new Alunno(nome,cognome,anno,luogo);
    stud.add(alunno);
    
}
     public void elencoAlunniScuola() {
        for (Alunno alunno : stud) {
            System.out.println(alunno);
        }
    }
    
    
    public void aggiungiClasse(String nomeClasse){
        Classe classe =new Classe(nomeClasse);
        classi.add(classe);
    
    }
    public void aggiungiUtenteClasse(String primaClasse,String secondaClasse,String terzaClasse){
        
    
        
        for (Classe classe : classi) 
            if(classe.getNomeClasse().equalsIgnoreCase(primaClasse)){
                for (Alunno alunno : stud) {
                    if(alunno.getAnno()<=1980){
                        
                        classe.getAlunniClasse().add(alunno);
                        
    }
                }
            }
    
            else if(classe.getNomeClasse().equalsIgnoreCase(secondaClasse)){
                for (Alunno alunno : stud) {
                    if(alunno.getAnno()>1980 && alunno.getAnno()<=1990){
                        
                      classe.getAlunniClasse().add(alunno);
                     
}
                }
            }
            else if (classe.getNomeClasse().equalsIgnoreCase(terzaClasse)){
                for (Alunno alunno : stud) {
                    if(alunno.getAnno()>1990 && alunno.getAnno()<=2000 ){
                        classe.getAlunniClasse().add(alunno);
                        
                    }
                }
            }
       
        
            
        }
       
            
    
   
    public void stampaUtentiClasse(){
        for (Classe classe : classi) {
            System.out.println(classe.getNomeClasse());
            classe.stampaUtentiClasse();
            System.out.println("*******************************");
            
            
        }
    }
     
















}
