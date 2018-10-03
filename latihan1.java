

public class latihan1 {

	
	public static void main(String[] args) {
		// 
	 		String wd = "RISWADI";
			System.out.println("Bentuk Plaintextnya adalah	:"+wd);
			
			String dw = encript(wd);
			System.out.println("Bentuk Enkripsinya adalah	:"+dw);
			
			String wd1 = decript(dw);
			System.out.println("Bentuk Dekripsinya adalah	:"+wd1);  
			
			
		}
		public static final String[] wd = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
		public static final String[] dw = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
		
		
		public static String encript(String plaintext){
			String ciphertext = "";
			for(int i=0 ; i<plaintext.length(); i++){
				String s0 = plaintext.substring(i, i+1);
				String s1 = " ";							
				//
				for(int j=0; j<wd.length; j++){				
					if(s0.equals(wd[j])){					
						s1 = dw[j];
						break;
					}
				}
				ciphertext+=s1;
			}
					
			return ciphertext;
		}
		public static String decript(String ciphertext){
			String plaintext = "";
					for(int i=0 ; i<ciphertext.length(); i++){
						String s0 = ciphertext.substring(i, i+1);
						String s1 = " ";							
						//
						for(int j=0; j<dw.length; j++){				
							if(s0.equals(dw[j])){					
								s1 = wd[j];
								break;
							}
						}
						plaintext+=s1;
					}
			return plaintext;
		}
	}

