//best case = O(1) worst case = O(n)
//So the Runtime complexity of this program is O(n)

class Stack {
    public static void main(String[] args) {
        
        Array number = new Array(3);
        number.insert(1);
        number.insert(2);
        number.insert(3);
        number.insert(4);
        number.print();
        System.out.println();
        number.removeAt(0);

        number.print();
        System.out.println("index = " + number.indexOf(5));

    }
    
}

class Array{

    private int[] items;
    private int count = 0;

    public Array(int length){

        items = new int[length];
    }

    public void insert(int no){

        if (items.length == count) {
        
            int[] newItems = new int[count*2];
        
            for (int i = 0; i < items.length; i++) 

                newItems[i] = items[i];

            items = newItems;

        }

        items[count++] = no;

    }

    public void print(){

        for(int i = 0 ; i < count ; i++)

            System.out.println(items[i]);
        
    }

    public void remove(){

        if (count > 0) 

            items[count--] = 0;

        else

            System.out.println("Empty");
        
    }

    public int length(){

        return count;

    }

    public void removeAt(int index){

        if (index < count && index >= 0) {
            
            for (int i = index; i < count-1; i ++)

               items[i] = items[i+1];

            items[count-1] = 0;
            count--;
        }
        else

            throw new IllegalStateException("Invalid index");

    }

    public int indexOf(int index) {

        for(int i = 0; i < count;i++)

            if(index == items[i])
                return i;

        return -1;

    }

}