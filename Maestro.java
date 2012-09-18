package cajero;
public class Maestro {
 int idCard;
 int password;
 String tipo;
 String banco;
 public int retiradoMaestro;
 public int fallidosMaestro;
 public int balanceMaestro;
 
 
 public Maestro (int idCard,int password,int balance,String tipo,String banco)
 {
     this.idCard = idCard;
     this.password = password;
     this.balanceMaestro = balance;
     this.tipo = tipo;
     this.banco = banco; 
 }
 
 public int idCard()
 {
     return idCard;
 }
 public int password()
 {
     return password;
 }
 
 public String tipo()
 {
     return tipo;
 }
 
 public String banco()
 {
     return banco;
 }
}
