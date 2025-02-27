package ex08_parallel;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelEx02 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		long start = System.currentTimeMillis();
		list.stream().forEach( i -> System.out.println(Thread.currentThread() +":" + i));
		long end = System.currentTimeMillis();
		System.out.println("순차처리 시간 : " + (end - start) );
		start = System.currentTimeMillis();
		list.parallelStream().forEach( i -> System.out.println(Thread.currentThread() +":" + i));
		end= System.currentTimeMillis();
		System.out.println("병렬처리 시간 : " + (end - start) );
	}

}
