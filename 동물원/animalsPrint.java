package kjunh972.java;

import java.util.Scanner;

public class animalsPrint extends animalsList{
	
	public void animalPrint()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("어떤 동물의 정보를 얻으실껍니까 : ");
		String animal = sc.next();
		
		if (animal.equals("개"))
		{
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			dog.setName(name);
			dog.age();
			dog.sounds();
		} else if (animal.equals("고양이")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			cat.setName(name);
			cat.age();
			cat.sounds();
		} else if (animal.equals("돼지")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			pig.setName(name);
			pig.age();
			pig.sounds();
		} else if (animal.equals("쥐")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			mouse.setName(name);
			mouse.age();
			mouse.sounds();
		} else if (animal.equals("원숭이")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			monkey.setName(name);
			monkey.age();
			monkey.sounds();
		} else if (animal.equals("소")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			cow.setName(name);
			cow.age();
			cow.sounds();
		} else if (animal.equals("말")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			horse.setName(name);
			horse.age();
			horse.sounds();
		} else if (animal.equals("닭")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			chicken.setName(name);
			chicken.age();
			chicken.sounds();
		} else if (animal.equals("사자")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			lion.setName(name);
			lion.age();
			lion.sounds();
		} else if (animal.equals("호랑이")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			tiger.setName(name);
			tiger.age();
			tiger.sounds();
		} else if (animal.equals("양")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			sheep.setName(name);
			sheep.age();
			sheep.sounds();
		} else if (animal.equals("코끼리")) {
			System.out.print(animal+"의 이름을 뭐라고 개명 하겠습니까 : ");
			String name = sc.next();
			
			elephant.setName(name);
			elephant.age();
			elephant.sounds();
		} 
	}
}
