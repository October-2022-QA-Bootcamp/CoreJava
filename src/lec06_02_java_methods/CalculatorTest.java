package lec06_02_java_methods;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator01 cal01 = new Calculator01();
		cal01.addition();
		cal01.subtraction();
		cal01.multipliaction();
		cal01.division();
		
		System.out.println("\n------------------------------------------------\n");
		Calculator02 cal02 = new Calculator02();
		cal02.addition();
		cal02.myName();
		cal02.subtraction();
		cal02.usCitizen();
		
		System.out.println("\n------------------------------------------------\n");
		Calculator03 cal03 = new Calculator03();
		cal03.multiplication();
		cal03.division(4.02f, 2.01f); // argument
		cal03.division(9.432402f, 2.63501f); // argument
		cal03.division(6.4302f, 5.501f); // argument
		cal03.addition(9.432402f, 2.63501f);
		
		System.out.println("\n------------------------------------------------\n");
		Calculator04 cal04 = new Calculator04();
		cal04.division();
		cal04.multiplication();
		
		System.out.println("\n------------------------------------------------\n");
		Calculator05 cal05 = new Calculator05();
		cal05.addition(323, 409); // argument
		cal05.addition(123, 9); // argument
		cal05.addition(30, 19); // argument
		cal05.subtraction(3251, 9);
		cal05.subtraction(333, 11);
		cal05.multiplication(22, 4);
		cal05.multiplication(322, 74);
		cal05.division(44, 8);
		cal05.division(764, 238);
		cal05.stName("Asraful", "Alam");
		cal05.stName("Ngawang", "Dakpa");
		cal05.stName("Jahidul", "Rafsan");
		
		System.out.println("\n------------------------------------------------\n");
		cal05.allMethods(4, 2);
		System.out.println("\n------------------------------------------------\n");
		cal05.allMethods(9, 2);
		System.out.println("\n------------------------------------------------\n");
		cal05.allMethods(2239, 332);
		
		
		System.out.println("\n------------------------------------------------\n");
		Calculator06 cal06 = new Calculator06();
		cal06.addition(323, 409); // argument
		cal06.addition(123, 9); // argument
		cal06.addition(30, 19); // argument
		cal06.subtraction(3251, 9);
		cal06.subtraction(333, 11);
		cal06.multiplication(22, 4);
		cal06.multiplication(322, 74);
		cal06.division(44, 8);
		cal06.division(764, 238);
		cal06.employee("Tofael", 2188458, 'M', false);
		cal06.employee("Noumanl", 9088458, 'M', true);
		cal06.employee("Nabeel", 1088458, 'M', false);
		
		System.out.println("\n------------------------------------------------\n");
		Calculator07 cal07 = new Calculator07();
		cal07.addition(34, "67");
		cal07.multiplication(3.65426, "2.73687");
		cal07.addition(32, "66");
		cal07.multiplication(3.65426, "2.73687");
		cal07.subtraction(323, 24.4234);
		cal07.division01(62357, 642.823974f);
		cal07.division02(2357, 42.84f);

	}

}
