package cajero;

public class Mastercard {
 int idCard;
 int password;
 String tipo;
 String banco;
 public int retiradoM;
 public int fallidosM;
 public int balanceM;
 
 
 public Mastercard (int idCard,int password,int balance,String tipo,String banco)
 {
     this.idCard = idCard;
     this.password = password;
     this.balanceM = balance;
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
