package 배열응용;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math_1 = 100;
		int math_2 = math_1;
		
		System.out.println("int형 복사 : "+(math_1 + math_2));
		math_1 += 1;
		System.out.println("math_1에 1을 더함 : "+(math_1 + math_2));
		// math_1, math_2 는 메모리에 각각 공간이 생기고, 값도 각각 가지게 됨.
		
		System.out.println("\n-----------arr 그냥 복사\n");
		
		//참조형 복사는 기본적으로 주소가 복사됨(이걸 얕은 복사라고 부름)
		int[] arr1 = {100,200,300};
		int[] arr2 = arr1;
		System.out.println("arr1 == arr2(heap의 주소값 비교) : "+(arr1 == arr2));
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
		
		System.out.println("\n-----------clone\n");
		
		//깊은 복사 -> clone
		int[] arr_clone1 = {100,200,300};
		int[] arr_clone2 = arr_clone1.clone();
		System.out.println("arr_clone1 == arr_clone2(heap의 주소값 비교) : "+(arr_clone1 == arr_clone2));
		System.out.println("arr_clone1 : "+arr_clone1);
		System.out.println("arr_clone2 : "+arr_clone2);
		
		
		
	}

}
