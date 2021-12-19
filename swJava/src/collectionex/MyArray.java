package collectionex;

public class MyArray {
    private Object[] data;
    private int count;

    public MyArray(int maxSize) throws IllegalAccessException{
        System.out.println("이게 왜 에러");
        if(maxSize < 0){
            throw new IllegalAccessException();
        }
        this.data = new Object[maxSize];
        this.count = 0;
    }

    public void add(Object obj){
        if(count>= data.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        data[count++] = obj;
    }

    public void remove(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException();
        } else if (index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }

        for( int i= index; i < count -1; i++){
            data[i] = data[i + 1];
        }
        count--;
        data[count] = null;

    }

    public Object get(int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    public String toString(){
        StringBuffer str = new StringBuffer("[");
        if (count > 0 ) {
            str.append(data[0]);
        }
        for(int i =1; i < count; i++){
            str.append(", ").append(data[i]);
        }
        str.append("]");
        return str.toString();
    }
    
}
