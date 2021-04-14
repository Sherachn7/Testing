package ex;
import java.util.Scanner;
public class Ex {
    int dayOfMonth=0;
	public int dayofmonth( int month,int year ){
		int jan=1,feb=2,march=3,april=4,may=5,jun=6,julay=7,august=8,sebtember=9,october=10,november=11,december=12;
		int febrewary;
		if(year%4==0){
			febrewary=29;
		}else{
			febrewary=28;
		}
		int months[]={31,febrewary,31,30,31,30,31,30,31,30,31,30};

		if(month==jan){
			return dayOfMonth=months[0];
		}else if(month==feb){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==march){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==april){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==may){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==jun){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==julay){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==august){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==sebtember){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==october){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==november){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}else if(month==december){
			for(int i=0;i<=month-1;i++){
				dayOfMonth=dayOfMonth+months[i];
				}
		}
		return dayOfMonth;
	}
        public boolean month(int month){
           if(month<=0)throw new IllegalArgumentException("No Result");
           if(month<=12)return true;
           else return false; 
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.println("Enter Month");
		int month=s.nextInt();
		System.out.println("Enter Year");
	        int year=s.nextInt();
		Ex e=new Ex();
		System.out.println(e.dayofmonth(month,year));

    }
    
}
