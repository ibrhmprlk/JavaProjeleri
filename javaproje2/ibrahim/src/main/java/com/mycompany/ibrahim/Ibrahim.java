/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ibrahim;

import java.util.Scanner;

/**
 *
 * @author ibrah
 */
public class Ibrahim {

public static void mean (int[]arr){
   double total = 0;
    for(int i = 0; i < arr.length;i++){
        total += arr[i];
    }
    System.out.println("Ortalama : " +(double)total/arr.length);
}
    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
          int a  = 4;
          a = a*a*a;
          System.out.println("a :"+a);
          System.out.println("merhaba");
          System.out.println("benim adim ibrahim0");
          System.out.println("java ogreniyorum");
          System.out.println("hello word");
         */
          /*
          byte = sayı , 1 byte
          short = sayı , 2 byte
          int = sayı , 4 byte 
          long = sayı , 8 byte
          float = ondalık sayı , 4 byte
          double = ondalıklı sayı , 8 byte
          char = karakter , 2 byte
          boolean = true ya da false , 1 byte 
          string = değişken tipi ( "tırnak işareti" )
          */
     /*     
      a = 51;
      short s = 32;
      double d = 4.14;
      char c = 'f';
      boolean b = true ;
      String ali = "ali";
      
      System.out.println("a nin degeri :"+a);
      System.out.println(s);
      System.out.println(d);
      System.out.println(c);
      System.out.println(b);
    //  System.out.println(murat);//
          */
     /*
      //!!////çalış önemli//
      Scanner scan = new Scanner(System.in);
      System.out.println("Bir sayi giriniz : ");
      double k = scan.nextDouble();
      System.out.println(" k degiskenin degeri = "+k);
     System.out.println("bir sayi daha giriniz : ");
      int f = scan.nextInt();
      System.out.println("f degiskenin degeri = "+f);
     
     //!!//
*/
     /*
     int x = 10;
     int y = 4 ;
     System.out.println("sonuc : "+((double)x/y));//eğer double buraya yazarsan virgüllü böler//
     System.out.println("sonuc : "+(x/(double)y));//bu şekildede yazılır yazılır//
     System.out.println("sonuc : "+(x%y));//kalanı verir//
     */
   /*
     Scanner scan = new Scanner(System.in);
      System.out.println("girilen sayinin karesinin sonucu : ");
      int u = scan.nextInt();
      System.out.println("karesinin sonucu : "+(u*u));
     
     */
     /*
     a == b --> eşit mi (eşitse true değilse false)
     a != b --> eşit değil mi (eşit değilse true eşitse false)
     a > b --> a b den büyük mü (büyükse true değilse false )
     a < b --> a b den küçük mü (küçükse true değilse false )
     a <= b --> b ye eşit veya b den küçük mü (öyleyse true değilse false)
     a >= b --> a b ye eşit veya b den büyük mü (öyleyse true değilse false)

*/
     /*
     System.out.print("sonuc = "+(4 ==5));
     System.out.print("sonuc = "+(4==5));
     System.out.print("sonuc ="+(4!=5));
     System.out.print("sonuc = "+(5>4));
     System.out.print("sonuc = "+(4<5));
     System.out.print("sonuc = "+(4<=5));
     System.out.print("sonuc = "+(5>=4));
      */
     /*
     Scanner scan = new Scanner(System.in);
      System.out.print("notunuzu giriniz = ");
        int u = scan.nextInt();
         if (u>70)
         {
             System.out.print("dersten gectiniz \n");
         }
 
         else
         {
             System.out.print("dersten kaldiniz \n");
         }
      System.out.print("aldigi not = "+u);
      
      */
     
     /* bu soruya tekrardan bak !!
     Scanner scan = new Scanner(System.in);
     System.out.print("4 basamakli sayi gir = ");
     int sayi = scan.nextInt();
     if(sayi < 1000 || sayi >9999)
     {
         
        System.out.print("lutfen gecerli sayi giriniz = ");
        
        
     }
else
     {
         
         int binler = sayi /1000;
         int yüzler = (sayi / 100)%10;
         int onlar = (sayi /10)%10;
         int birler = sayi%10;
         int yenisayi=(binler*1000)+(yüzler*0)+(onlar*10)+birler;
         System.out.print("3.basamagi sifir yapilan sayi = "+yenisayi);         
     }
      */
     
     /*
     &&(And)== true , true = true
               false , true == false
               true , false == false
               false , false == false
     
     ||(or(ya da))== true , true == true 
              false , true == true 
              true , false == true
              false , false == false
     
     */
     
       /*
      Kullanıcı adı girişi 
     */
       /*
       
     String sys_kul_adı = "yazilimbilimi";
     String parola = "12345";
     Scanner scan = new Scanner(System.in);
     System.out.print("Kullanici adi = ");
     String kullanıcı_adı = scan.nextLine();
     System.out.print("parola  = ");
     String kul_parola = scan.nextLine();
    
     if(!(sys_kul_adı.equals(kullanıcı_adı))&& !(parola.equals(kul_parola))) 
     {
        System.out.print("Kullanici adi ve parola yanlis");
     }
     else if ((sys_kul_adı.equals(kullanıcı_adı))&& !(parola.equals(kul_parola))) 
     {
         System.out.print("parola yanlis");
     }
     else if (!((sys_kul_adı.equals(kullanıcı_adı))&& !(parola.equals(kul_parola))) )
     
     {
         System.out.print("kullanici adi yanlis");
     }
     else
     {
         System.out.print("giris basarili");
     }
     
     */
      
       /*
       Scanner scan = new Scanner (System.in);
       int sayi = scan.nextInt();
       switch(sayi)
    {
           case 1:
               System.out.println("bir");
               break;
           case 2:
               System.out.println("iki");
               break;
           case 3:
               System.out.println("üç");
               break;
           case 4:
               System.out.println("dort");
               break;
            
           default :
               System.out.println("gecersiz sayi");
               break;
            
           
    }
     */
      
      
     
     
      // nesne ve sınıfı sınavda cıkar //

     // FirstClass fr1 =  new FirstClass();
     // fr1.sayi = 23;
    
     
     
     /*
     Scanner scan = new Scanner(System.in);
     int sayi = scan.nextInt();
     System.out.print("sayi giriniz :");
     if(sayi == 1)
     {
         System.out.println("bir");
     }
     else if(sayi==2)
     {
         System.out.print("iki");
     }
     else if(sayi==3)
     {
         System.out.print("üç");
         
     }       
     else if (sayi ==4)
     {
         System.out.print(("dört"));
     } 
     else
     {
         System.out.print(("gecersiz sayi"));
     }      
     */
      
     // döngüler = do(direk yapıp sonra şarta bakıyor) - while(şarta bağlı) - for(için - durumu çalıştırmak) 
      
     // for = işlem - koşul - işlem
   /*
Scanner scan = new Scanner (System.in);
System.out.print("sayi giriniz :");
int sayi = scan .nextInt();

     for(int i = 0 ; i<sayi;i++)
     {
         for(int j = 0; j<=i;j++)
         {
         System.out.print("x");
         
         }
         System.out.println();
     }
*/
   /*
   int  i =0;
   while( i < 10){
    
     System.out.println("java");
   i++;
   
   }
   System.out.print("dongu bitti" +i);
   */
   

   /*
   int i;
   for(i=0;i<10;i++)
   {
       System.out.print("i = "+i);
   }
    */
   /*
   Scanner scan = new Scanner(System.in);
   System.out.print("sayi giriniz :");
   int n = scan.nextInt();
   int i=1;
    double t = 0;
    
    while(i<=n){
        t+= Math.pow(i,i+1);
        i++;
    }
   System.out.print(t);
   */
   /*
   int n =5;
   int ys=2*n-1;
   
   for(int j = 0;j<n-1;j++){
       System.out.println("x");
   }
   for(int j =0;j<n;j++){
       System.out.print("x");
   }
   System.out.println("");

   for(int j=1;j<=ys;j++)
{
   for(int k= 1 ; k<= ys;k++)
   {
       if(j==n || k==n)
       {
           System.out.print("x");
       }
       else
       {
           System.out.print(" ");
       }
   
   }
  System.out.println("");
}
 */
   /*
Scanner scan = new Scanner (System.in);
System.out.println("bir sayi giriniz :");
int s = scan.nextInt();
int adet = 0;
for(int i = 2;i<=s-1;i++)
{
    if(s%i==0){
        adet++;
    }
}
if(adet>0)
{
    System.out.print("bu sayi asal degildir");
}
else{
    System.out.print("bu sayi asaldir");
}
   */
   /*
   while(true){
       Scanner scan = new Scanner(System.in);
       String s;
       System.out.print("karekter giriniz \n:");
       s = scan .nextLine();
       
       if(s.equals("q"))//parantezin içine yazılan karekteri yazarsan programdan cıkış yapıyor
       {
           System.out.print("program çikiliyor");
           break;
       }
        System.out.print("karekter:"+s);
   }
  */
   /*
   int  i= 0;
   while(i<10)
   {
       if(i==4 || i==7)
       {
           i++;
           continue;
       }
       
       
       System.out.print("i :\n" +i);
       i++;
   }
   */
      /*
 Scanner scan = new Scanner(System.in);
     
      int bakiye = 1000;
       int islem;
       
      System.out.println("1:Bakiye Goruntule");
      System.out.println("2:para yatirma");
      System.out.println("3:para cekme");
      System.out.println("4:Sistemden cikis");
      islem = scan.nextInt();
     switch (islem){
         case 1:
             System.out.print("Bakiyeniz: "+bakiye+"tl dir");
     break;
         case 2:
             System.out.print("Ne kadar yatiracaksiniz ?");
      int miktar = scan.nextInt();
     // bakiye = bakiye + miktar;
       bakiye += miktar;
       System.out.print("bakiyeniz\t"+bakiye+"tl dir");
       break;
         case 3:
             System.out.println("Ne kadar cekeceksiniz ?");
             miktar = scan.nextInt();
             bakiye -= miktar;
             System.out.print("kalan bakiyeniz = "+bakiye+"tl dir");
     break;
         case 4: 
             System.out.print("Sistemden cikiliyor");
             break;
         default:
             System.out.print("gecersiz islem : ");
             break;
     
     }       
   /*
    
// bir sınıf var . bir sınıfın içindeki değişkenlere erişebilmek için 
// o classtan nesne türetmemiz gerekiyor.new

*/
      /*
      NewClass ogrenci1 = new NewClass();//sınıfın ismini yazdık//ogrenci1 nesnedir
     
      ogrenci1.id=1234567;
      ogrenci1.Soyisim= "parlak";
      ogrenci1.isim="ibrahim";
      System.out.println("ogrencinin bilgileri :");
      System.out.println("id :"+ogrenci1.id+" soyisim :"+ogrenci1.Soyisim+" isim :"+ogrenci1.isim);
   
        
      //NewClass = nesne
      //ogrenci = com.ibrahim = sınıf
      //private = sadece kendi clasından erişebilirsin
      */
  /*    
   NewClass car1 = new NewClass("gümüş","BMW,",1.6,4);
  */
      /*
      car1.color="gumus";
   car1.model=  "renault";
   car1.engine=1.6;
   car1.doors=4;
System.out.println("Arabanin Rengi :"+car1.color+" Modeli :"+car1.model+" Engine :"+car1.engine+" Doors :"+car1.doors); 
*/
/*
      car1.setColor("gümüş");
 System.out.println("Arabanın rengi :"+car1.getColor());//dolaylı yoldan ulaşıyoruz
       
       
       car1.setModel("BMW");
        System.out.println("Arabanın Modeli :"+car1.getModel());
        
        car1.setEngine(1.6);
        System.out.println("engine : :"+car1.getEngine());
        
   car1.setdoors(4);
        System.out.println("doors :"+car1.getDoors());
        
   car1.start();
   car1.stop();
   */
/*
 NewClass car1 = new NewClass("gümüş","BMW,",1.6,4);
 NewClass car2 = new NewClass("altın","mercedes",1.8,4);
 car1.showInfos();
 car2.showInfos();
 */
/*
String s1 = "ibrahim";
String s2="mehmet";
if(s1.equals(s2)){
    System.out.println("esit");//equals ile kullanılmalı
}else{
    System.out.println("esit degil");
}
 */

//int[] arr1 = {10,20,30,40,50};

//int[] arr2 = new int[5];/* beşlik bölüm oluşturuluyor ama içi boş*/
  //  arr2[0]=1;
  // arr2[1]=2;
  //  arr2[2]=3; 
  //  arr2[3]=4;
   // arr2[4]=5;
//System.out.println("Array 2'nin birinci elemani:"+arr2[0]);

//System.out.println("Array 1'in ikinci elamani:"+arr1[1]);

//for ( int i = 0;i<arr1.length;i++)// lneght buradan uzunluğunu belirtiyor
//{
  //  System.out.println("eleman : "+arr1[i]);
//}
/*
Scanner scan = new Scanner ( System.in);


int[]arr2=new int[5];
System.out.println("Arraynin degerlerini giriniz : ");
for(int i = 0;i<arr2.length;i++){
    arr2[i] = scan.nextInt();
}
 mean(arr2);
*/
/*
int[][]arr1={{10,20,30},{40,50,60}};

int [][] arr2= new int[2][3];
arr2[0][0]=10;
arr2[0][1]=20;
arr2[0][2]=30;
arr2[1][0]=40;
arr2[1][1]=50;
arr2[1][2]=60;

        System.out.println(" 0 ' a 0 :" +arr1[0][0]);
        System.out.println(" 1 ' e 1 :" +arr1[1][1]);


for(int i = 0; i<2;i++){
    for(int j = 0; j<3;j++){
        System.out.println("Eleman :" +arr2[i][j]);
    }
    

}
*/
/*
   Scanner scan = new Scanner (System.in);
   System.out.print("Sayi giriniz :");
   int sayi  = scan .nextInt();
   int fak = 1;
   for(int i = 1;i<=sayi;i++)
   {
       fak *=i;
       
   }
   System.out.print("faktoriyeli : "+fak);
   
   */

/*
 Scanner scan = new Scanner (System.in);
 
 System.out.println("Enter a number :");
  int num1  = scan .nextInt();
  
  System.out.println("Enter a number :");
  int num2 = scan.nextInt();
  
  
  
  
  System.out.println(" 1 - : Collection");
   System.out.println(" 2 - :Extraction");
   System.out.println("  3 - :Impact");
   System.out.println("   4 - :Divide");
  System.out.print("Select the action you want to perform :");
   int choice = scan.nextInt();
   
   double result = 0;
   
   switch(choice)
   {
       case 1 :
           result = num1+num2;
           System.out.print("Conclusion : " +result);
           break;
       case 2 : 
           result = num1-num2 ;
           System.out.println("Conslusion :"+result);
           break;
       case 3 : 
           result = num1 * num2;
           System.out.println("Conslusion :"+result);
           break;
       case 4 :
           if(num2!=0){
                result = num1 / num2 ;
           System.out.println("Conslusion :"+result);
           }
           else{
                System.out.println("Division error! You cannot divide a number by zero. :");
           }
          break;
       default:
           System.out.println("Invalid selection. ");
           break;
          
         
   }
scan.close();
  
  */





   


      }
}
