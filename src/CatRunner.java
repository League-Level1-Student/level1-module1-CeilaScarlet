import com.sun.org.apache.bcel.internal.classfile.LocalVariable;

public class CatRunner {
public static void main(String[] args) {
	Cat ci = new Cat("Love"); 
	ci.meow();
	ci.printName();
	for (int i = 0; i < 9; i++) {
		ci.kill();
	}
	
}
}
