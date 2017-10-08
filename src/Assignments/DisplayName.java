
package Assignments;

public class DisplayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] cricketers = {"Sachin Tendulkar", "Sourav Ganguly", "Rahul Dravid", "Virat Kohli", "Yuvraj Singh", "Mahendra Dhoni"};
		
		System.out.println("Names Entered are:");
        for (int i = 0; i < cricketers.length; i++) {
            System.out.print(cricketers[i] + " ");
        }
		
        System.out.println("\nThe First Names of Cricketer are:");
        
		for (int i=0; i<cricketers.length; i++) {
			
			String [] splitData = cricketers[i].split(" ");
			System.out.println(splitData[0]);
			}
	}

}
