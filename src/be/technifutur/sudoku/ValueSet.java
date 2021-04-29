package be.technifutur.sudoku;

public class ValueSet {
    private int data=0;
    private int tomask(int val){
        return 1 << val-1;
    }
    public boolean add(int val){
        boolean result=false;
        if (!contains(val)) {
            int mask = tomask(val);
            data = data | mask;
            result=true;
        }
        return result;
    }
    public boolean contains(int val){
        int mask=tomask(val);

        return (data & mask)==mask;
    }
    public boolean remove(int val){
        boolean result=false;
        if (contains(val)) {
            int mask = tomask(val);
            data = data ^ mask;
            result=true;
        }
        return result;
    }
    public int size(){
        return Integer.bitCount(data);
    }
    public ValueSet commun(ValueSet set){
         ValueSet result= new ValueSet();
         result.data=set.data & data;
        return result;
    }
    public ValueSet add(ValueSet set) {
        ValueSet result= new ValueSet();
        result.data=set.data | data;
        return result;
    }
    public String ToString(){
        return "ValueSet{"+
                "data="+Integer.toBinaryString(data)+
                "}";
    }

}
