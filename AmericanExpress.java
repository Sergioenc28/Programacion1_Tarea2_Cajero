package cajero;
public class AmericanExpress {
   int idCard;
 int password;
 String tipo;
 String banco;
 public int retiradoAEx;
 public int fallidosAEx;
 public int balanceAEx;
 
 
 public AmericanExpress (int idCard,int password,int balance,String tipo,String banco)
 {
     this.idCard = idCard;
     this.password = password;
     this.balanceAEx = balance;
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
