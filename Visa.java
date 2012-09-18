package cajero;

public class Visa {
 int idCard;
 int password;
 String tipo;
 String banco;
 public int retiradoVisa;
 public int fallidosVisa;
 public int balanceVisa;
 
 
 public Visa (int idCard,int password,int balance,String tipo,String banco)
 {
     this.idCard = idCard;
     this.password = password;
     this.balanceVisa = balance;
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
