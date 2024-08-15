package Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{2+3}")
	public int sum;
	@Value("#{5-3}")
	public int sub;
	@Value("#{2*3}")
	public int mul;
	@Value("#{15/3}")
	public int div;
	@Value("#{1>2}")
	public boolean equalvalid;

	@Value("#{1!=2}")
	public boolean notequalvalid;
	
	public static String call() {
		return "Method Call";
	}

	@Value("#{2<3 ? 'yes' : 'no'}")
	public boolean ternary;

//	@Value("#{T(java.lang.Math).sqrt(144)}")
	@Value("#{T(java.lang.Math).PI}")
	public int num;
	
	@Value("#{T(Spel.Student).call()}")
	public String result;

	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equalvalid=" + equalvalid
				+ ", notequalvalid=" + notequalvalid + ", ternary=" + ternary + ", num=" + num + "]";
	}

}
