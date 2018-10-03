
public class latihan2 {

	public static void main(String[] args) {
		
				String wd = "PRAY FOR PALU";
				System.out.println("Bentuk Plaintextnya adalah	:"+wd);
				
				String dw = encript(wd);
				System.out.println("Bentuk Enkripsinya adalah	:"+dw);
				
				String wd1 = descript(dw);
				System.out.println("Bentuk Dekripsinya adalah	:"+wd1);                     
		        
				
			}
			
			public static final String[] pi = {"A", "B", "C", "D", "E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
			public static final String[] ci = {"D", "E", "F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
			
			public static String encript (String plaintext) {
				String ciphertext = "";
				loop1:
			        for(int a = 0; a < plaintext.length(); a++)
			        {                  
			            int index_plain = -1;
			            for(int b = 0; b < pi.length; b++)
			            {
			                index_plain = (String.valueOf(plaintext.charAt(a)).equals(pi[b])) ? b : -1;
			                if(index_plain != -1)
			                {                 
			                    ciphertext += pi[(index_plain + 3) % 26];
			                    continue loop1;
			                }              
			            }
			            ciphertext +=plaintext.charAt(a);
			        }
				return ciphertext;
			}
			public static String descript (String ciphertext) {
				String plaintext= "";
				loop1:
			        for(int a = 0; a < ciphertext.length(); a++)
			        {                  
			            int index_ciphertext = -1;
			            for(int b = 0; b < ci.length; b++)
			            {
			                index_ciphertext = (String.valueOf(ciphertext.charAt(a)).equals(ci[b])) ? b : -1;
			                if(index_ciphertext != -1)
			                {                 
			                	 plaintext += ((index_ciphertext - 3) >= 0) ? ci[(index_ciphertext - 3 ) % 26] : ci[26 + (index_ciphertext - 3)];
			                        continue loop1;
			                }              
			            }
			            plaintext +=ciphertext.charAt(a);
			        }
				return plaintext;

	}

}
