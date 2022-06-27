import java.util.Scanner;  
class Main
{  
  public static void main(String args[] )  
    {   
        int stan_konta = 100000, wyplacanie, wplacanie;  
        Scanner wczytaj = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("\n************");  
            System.out.println("MENU");  
            System.out.println("************"); 
            System.out.println("1-Wypłata pieniędzy z konta");  
            System.out.println("2-Wpłata na konto");  
            System.out.println("3-Sprawdzenie stanu konta");  
            System.out.println("4-Wyjście z programu");  
            int wybor = wczytaj.nextInt();  
            switch(wybor){ 
             case 1: {
              System.out.print("Ile chcesz wypłacić (tylko wielkrotności 10): "); 
              wyplacanie = wczytaj.nextInt();  
              if(wyplacanie%10!=0||wyplacanie<0){
                System.out.println("Niepoprawne dane!");
                break;
              }
              if(stan_konta >= wyplacanie)  {
                stan_konta -=wyplacanie;  
                System.out.println("Odbierz swoje pieniądze!");  
              }  
              else  
              {    
                System.out.println("Za mało środków na koncie");  
              }  
              break;  
             }
              case 2:        
                System.out.print("Podaj ile chcesz wpłacić (tylko krotności 10)):");  
                wplacanie = wczytaj.nextInt();  
                if(wplacanie%10!=0||wplacanie<0){
                System.out.println("Niepoprawne dane!");
                break;
                }
                stan_konta += wplacanie;  
                System.out.println("Udało się wpłacić na konto");  
              break;  
   
              case 3:  
                 System.out.println("Stan konta wynosi: "+stan_konta);  
              break;  
   
                case 4:  
              System.exit(0);  
            }  
          
    }  
        }  
      
}  