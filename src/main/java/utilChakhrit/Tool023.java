package utilChakhrit;

public class Tool023 {
    //1.1
    public static boolean isUsable023(String name){
        return name != null && !name.isBlank();
    }
    //1.2
    public static boolean isUsable023(Object[] ob){

        return ob != null && ob.length > 0;
    }
    //1.3
    public static int count023(Object[] ob){
        int count = 0;
        if(!isUsable023(ob)) return -1;
        for(int i = 0 ; i < ob.length;i++){
            if(ob[i] != null) count++;
        }
        return count;
    }
}
