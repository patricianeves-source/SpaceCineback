import java.time.LocalDate;
import java.util.Date;

public class Usuario {

     public String nome;
     public String cpf;
     public Genero genero;
     public String nomesocial;
     public LocalDate datadenasc;
     public String email;
     public String cep;
     public String senha;
     public String telefone;

     public Usuario(String nome, String cpf, Genero genero, String nomesocial, LocalDate datadenasc, String email, String cep, String senha, String telefone) {
          this.nome = nome;
          this.cpf = cpf;
          this.genero = genero;
          this.nomesocial = nomesocial;
          this.datadenasc = datadenasc;
          this.email = email;
          this.cep = cep;
          this.senha = senha;
          this.telefone = telefone;
     }
}
