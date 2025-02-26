public class Stringk {
    public static void main(String args[]){
    
    
        //String are bimmutable
    // String str = "h";
    // String strfull = str+"e"+"l"+"l"+"o";
    // System.out.println(strfull);



       
StringBuilder sb = new StringBuilder("Tony");

System.out.println(sb);

//print char at index 0;
System.out.println(sb.charAt(0));

//set charecter at index 0;
sb.setCharAt(0,'p');
System.out.println(sb);


//insert at 0 index
sb.insert(0,'S');
System.out.println(sb);


//insert at middle position
sb.insert(3,'n');
System.out.println(sb);


//delete at extra n
sb.delete(3,5);
System.out.println(sb);




StringBuilder gc = new StringBuilder("h");

gc.append("e");
gc.append("l");
gc.append("l");
gc.append("o");

System.out.println(gc);



    }
    
}
