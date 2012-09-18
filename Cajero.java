package cajero;
import java.util.*;
//Todas las clases que cree...
import cajero.AmericanExpress;
import cajero.Billetes;
import cajero.Visa;
import cajero.Mastercard;
import cajero.Maestro;

public class Cajero 
{
    public static void main(String[] args)
{
    Billetes papeletas = new Billetes(300, 50, 40, 20, 10);
    int balanceDelCajero = ((papeletas.b100*100)+(papeletas.b200*200)+(papeletas.b500*500)+(papeletas.b1000*1000)+(papeletas.b2000*2000));
    Visa paVisa = new Visa(12341234, 1234, 75000, "visa", "popular");
    Mastercard paMastercard = new Mastercard(28052805, 2805, 50000, "mastercard", "leon");
    Maestro paMaestro = new Maestro(12345678, 1000, 20000, "maestro", "reserba");
    AmericanExpress paAEx = new AmericanExpress(16041604, 1604, 3000, "american express", "bhd");
        
    boolean sigue=true;
        
while(sigue)
{
    System.out.println("\n\nBienbenido al sistema de cajeros POPULAR\n");
    System.out.print("Ingrese los 8 digitos de su tarjeta: ");
    Scanner datos = new Scanner(System.in);
    String numeroDeTarjeta = datos.nextLine();
    int a = Integer.parseInt(numeroDeTarjeta);
    int existe = 0;
    int caso = 0;
    //Verificar que introduzca los 8 digitos de la tarjeta, en este caso solo tendran 8 digitos...    
    if (numeroDeTarjeta.length() == 8)
        {
          if (a == paVisa.idCard)
          {
              caso = 1;
          }
          else if (a == paMastercard.idCard)
          {
              caso = 2;
          }
          else if (a == paMaestro.idCard)
          {
              caso = 3;
          }
          else if (a == paAEx.idCard)
          {
              caso = 4;
          }
          else
          {
              caso = 5;
          }         
          
           switch(caso)
           {
               case 1:
                    {
                        boolean stop = true;
                        while(stop)
                            {
                                if(paVisa.fallidosVisa < 3)
                                {
                                    System.out.print("Digite su contraseña: ");
                                    int paPassword = datos.nextInt();
                                    if(paVisa.password == paPassword)
                                    {
                                        System.out.println("\nSeleccione una opcion de acuerdo a lo que desee\n1 - Consulta de balance\n2 - Retiro de efectivo");
                                        System.out.print("Opcion: ");
                                        int decide = datos.nextInt();
                                        boolean opcion = true;
                                        int error = 0;
                                        while(opcion)
                                        {
                                            switch(decide)
                                            {
                                                case 1:
                                                {
                                                    System.out.printf("El balance de la cuenta No. %d es %d\n",paVisa.idCard,paVisa.balanceVisa);
                                                    opcion = false;
                                                }   
                                                    break;
                                                case 2:
                                                {
                                                    System.out.println("Digite un numero de acuerdo a lo que desee retirar\n\n1- 100\n2- 200\n3- 500\n4- 1000\n5- 2000\n6- Otra Cantidad");
                                                    System.out.print("Opcion: ");
                                                    int dime = datos.nextInt();
                                                    switch(dime)
                                                    {
                                                        case 1:
                                                        {
                                                            if (papeletas.b100 > 0)
                                                            {
                                                                if (paVisa.balanceVisa >= 100)
                                                                {
                                                                    System.out.println("1 billete de 100");
                                                                    papeletas.b100 -= 1;
                                                                    paVisa.retiradoVisa += 100;   
                                                                }
                                                                else
                                                                {
                                                                   System.out.println("No posee saldo para retirar esta cantidad"); 
                                                                }
                                                            }
                                                            else
                                                            {
                                                               System.out.println("No hay billetes de 100 disponibles"); 
                                                            }
                                                        }
                                                            break;
                                                        case 2:
                                                        {
                                                            if (papeletas.b200 > 0)
                                                            {
                                                                if (paVisa.balanceVisa > 200)
                                                                {
                                                                    System.out.println("1 billete de 200");
                                                                    papeletas.b200 -= 1;
                                                                    paVisa.retiradoVisa += 200; 
                                                                }
                                                                else
                                                                {
                                                                   System.out.println("No posee saldo para retirar esta cantidad"); 
                                                                }
                                                            }
                                                            else
                                                            {
                                                               System.out.println("No hay billetes de 200 disponibles"); 
                                                            }
                                                        }
                                                            break;
                                                        case 3:
                                                        {
                                                            if (papeletas.b500 > 0)
                                                            {
                                                                if (paVisa.balanceVisa > 500)
                                                                {
                                                                    System.out.println("1 billete de 500");
                                                                    papeletas.b500 -= 1;
                                                                    paVisa.retiradoVisa += 500;
                                                                }
                                                                else
                                                                {
                                                                   System.out.println("No posee saldo para retirar esta cantidad"); 
                                                                }
                                                            }
                                                            else
                                                            {
                                                               System.out.println("No hay billetes de 500 disponibles"); 
                                                            }
                                                        }
                                                            break;
                                                        case 4:
                                                        {
                                                            if (papeletas.b1000 > 0)
                                                            {
                                                                if (paVisa.balanceVisa > 1000)
                                                                {
                                                                    System.out.println("1 billete de 1000");
                                                                    papeletas.b1000 -= 1;
                                                                    paVisa.retiradoVisa += 1000;
                                                                }
                                                                 
                                                            }
                                                            else
                                                            {
                                                               System.out.println("No hay billetes de 1000 disponibles"); 
                                                            }
                                                        }
                                                            break;
                                                        case 5:
                                                        {
                                                            if (papeletas.b2000 > 0)
                                                            {
                                                                if (paVisa.balanceVisa > 2000)
                                                                {
                                                                    System.out.println("1 billete de 2000");
                                                                    papeletas.b2000 -= 1;
                                                                    paVisa.retiradoVisa += 2000; 
                                                                }
                                                            }
                                                            else
                                                            {
                                                               System.out.println("No hay billetes de 2000 disponibles"); 
                                                            }
                                                        }
                                                            break;
                                                        case 6:
                                                        {
                                                           System.out.println("En Construcción");  
                                                        }
                                                            break;
                                                        default:
                                                        {
                                                           System.out.println("Opcion invalida");
                                                           paVisa.fallidosVisa += 1;
                                                        }
                                                            break;
                                                    }
                                                    opcion = false;
                                                }
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                    }
                    break;
           }
        }
        else
        {
            System.out.print("Usted no digito exactamente 8 digitos. Por favor asegurece de introducir los 16 digitos correctamente");
        }
}
}
}
