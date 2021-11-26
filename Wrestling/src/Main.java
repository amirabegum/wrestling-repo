
public class Main {

	public static void main(String[] args) {
		LightWeight l1 = new LightWeight("Ray Mysterio", 27, "lightweight", 170.5f, 55, 75, 77, 7, 80);
		HeavyWeight h1 = new HeavyWeight("John Cena", 40, "heavyweight", 250.5f, 75, 85, 80, 65, 10); 
		
		System.out.println(h1.name);
		System.out.println(l1.name);
		
		System.out.println(h1.courage);
	    System.out.println(l1.athleticism);
		h1.fight();
		h1.attacked(h1.name, h1.courage);
		h1.wrestlingMatch(l1.skillLevel, h1.skillLevel, l1.name, h1.name);
		
		
		
	}

}
