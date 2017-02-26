public class Boys {

    String name;
     int attractiveness;
     int intelligence;
     int budget;
     int min_att_req ;
     String status;
     String girlf;



     boolean girls_type(int attr,int maintenance){
         if(maintenance < budget &&  attr < min_att_req){
             return false;
        }else{
         return true;
     }
  
 }
}
