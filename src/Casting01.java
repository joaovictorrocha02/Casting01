public class Casting01 {
    public static void main(String[] args) {
        
      short myShort = 128;
      // Declarei valor de 128 para short
      
      byte myByte = 127;
      // Declarei valor de 127 para byte
      
      myShort = (short)myByte;
      
      
      myByte++;
        System.out.println(myByte);
        // Somei mais um para Byte
        
        myByte++;
        System.out.println(myByte);
      
    
    }    
}
