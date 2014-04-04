import static org.junit.Assert.*;

import org.junit.Test;

import stack1.Stack1;


public class TestKlasse {

	@Test
	public void testKonst() {
		Stack1 a = new Stack1(5);
		if(a.getOs().length!=5){
			throw new RuntimeException("Fail Konstruktor");
		}
		if(a.getTos()!=0){
			throw new RuntimeException("Fail Konstruktor");
		}
	}
	 @Test(expected=RuntimeException.class)
	 public void testpush() {
		 Stack1 a = new Stack1(5);
		 Object o = new Object();
		 a.push(o);
		 int i = a.getTos();
		 if(a.getOs()[i]!=o){
			 throw new RuntimeException("Fail push");
		 }
	 }
	 @Test(expected = RuntimeException.class)
	 public void testpop() {
		 Stack1 a= new Stack1(5);
		 Object o = new Object();
		 a.pop();
		 int i = a.getTos();
		 if(a.getOs()[i-1]==o){
			 throw new RuntimeException("Fail push");
		 }
	 }
	 @Test(expected=RuntimeException.class)
	 public void testEmpty() {
		 Stack1 a= new Stack1(5);
		 if(a.isEmpty()== true)
			 throw new RuntimeException("Fail Empty");
	 }
	 @Test
	 public void testFull(){
		 Stack1 a = new Stack1(5);
		 if(a.isFull()){
			 throw new RuntimeException("Fail Full");
		 }
	 }

}
