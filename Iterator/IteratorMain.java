public class IteratorMain {
    public static void main(String[] args) { 

      ChannelRepository channelRepository= new ChannelRepository();

      Iterator i = channelRepository.getIterator();

      while(i.hasNext()){
         String channelname = (String)i.next();
         System.out.println("Name : " + channelname);
         } 	
        
    }   
}
