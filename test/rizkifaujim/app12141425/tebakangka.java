package rizkifaujim.app12141425;

import java.util.Scanner;


public class tebakangka {
    String nama;
    byte level = 1;
    byte kesempatan = 5;
    short tebak;
    short banyak = 0;
    int random, score =0;
    char jawab;
    
    public void setpilih(String nama) {
        this.nama = nama;
            }
    
    public void setTebak(short tebak) {
        this.tebak = tebak;
            }
    
        public int Level(){
            return level*5;
             }
        
        public void  hasilTebakan() {
            kesempatan--;
            banyak++;
            System.out.println("Tebakan anda"+ tebak);
            if(tebak<random){
                System.out.print("Tebakan anda terlalu kecil!");
                }
            if(tebak>random){
                System.out.print("Anda Tebakan telalu besar!");
                }
            if(tebak==random){
                System.out.print("Selamat Anda berhasil menebak sebanyak"+ banyak + " kali tebakan");
            }
            
            if(kesempatan>0){
                System.out.println("Anda mempunyai kesempatan " + kesempatan + " kali lagi.");
          
                
                 }
                  else {
                System.out.println("Game Over");
            }  
        
        
           }
    
           public void Score() {  
           if (banyak>0){ 
           score= 100*level; 
            }
           if (banyak>1){ 
           score= 70*level;   
            }
           if (banyak>2){
           score= 50*level;
            }
           if (banyak>3){
           score= 30*level; 
            }
                   System.out.println(nama + "\t: " + score);
                   System.out.println("ardin\t: 70");
                   System.out.println("misnah\t: 50");
                   System.out.println("janur\t: 100");
                   System.out.println("cinta\t: 100");
                    }
           
               public static void main(String[] args) {
                   tebakangka main = new tebakangka();
                   
             main.random = (short) (Math.random()*main.Level());
             System.out.println("Masukkan nama Anda untuk memulai atau tekan 'T' utuk keluar.");
             
             Scanner inputString = new Scanner(System.in);
             Scanner inputAngka = new Scanner(System.in);
             main.nama=inputString.nextLine();
             if (!"T".equals(main.nama))
              { 
               do {  
                               System.out.println("# Level " + main.level);  
                               System.out.println("Selamat datang " + main.nama);   
                               System.out.println("Silakan tebak angka antara 1 s/d " + main.Level());    
                               System.out.println("Anda mempunyai kesempatan menebak " + main.kesempatan + " kali");  
                               
                               do{
                                   System.out.println();
                                   System.out.println("Masukkan tebakan : ");
                                   main.tebak = inputAngka.nextShort();
                                   main.hasilTebakan();
                                   }while(main.tebak!=main.random&&main.kesempatan>0);
                                   
                                    main.Score();
                                    System.out.println("Apakah anda ingin melanjutkan ke level berikutnya ? (y/t)");
                                    main.jawab=inputString.nextLine().charAt(0);
                                    }while(main.jawab=='y');
                                   
                               }
               }
                 
                 
             
                   
                   
                   
           
           
           
           
           }   
             
               
           
           
           
