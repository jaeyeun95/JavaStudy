package collectionex;

public class MyArrayTest {
    public static void main(String[] args) throws IllegalAccessException{
        MyArray arr = new MyArray(5);
        // MyArray arr = new MyArray(5);
        System.out.println("안만들어짐?");
        for(int i =0; i <=5 ; i++){
            arr.add("데이터-" + i);
        }
        System.out.println("<< MyArray 객체에 저장된 요소들 >>");
        System.out.println(arr.toString());
        System.out.println("<< MyArray 0번 index에 저장된 요소");
        System.out.println(arr.get(0));
        System.out.println("<< MyArray 3번 index에 저장된 요소");
        System.out.println(arr.get(3));

        arr.remove(3);
        System.out.println("<< 3번 index 요소 삭제 후, 요소들 >>");
        System.out.println(arr.toString());

        arr.add("데이터-4");
        System.out.println("<< 새로운 데이터 등록후, 요소들 >> ");
        System.out.println(arr);
    }
    
}
