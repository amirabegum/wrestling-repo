
public class Wrestler {
	String name; 
	int age; 
	String weightDivision; 
	float weight;
	int skillLevel;
	
	public Wrestler(String Name, int Age, String WeightDivision, float Weight, int SkillLevel) {
		name = Name;
		age = Age;
		weightDivision = WeightDivision;
		weight = Weight; 
		skillLevel = SkillLevel;
	}
	
	void train() {
		System.out.println("old skill level " + skillLevel);
		skillLevel+=10;
		System.out.println("new skill level " + skillLevel);
	}
	
	
}

class LightWeight extends Wrestler{
	int agility;
	int flexibility;
	int jumping;
	int athleticism; 

	public LightWeight(String Name, int Age, String WeightDivision, float Weight, int SkillLevel, int Agility, int Flexibility, int Jumping, int Athleticism) {
		super(Name, Age, WeightDivision, Weight, SkillLevel);
		agility = Agility;
		flexibility = Flexibility;
		jumping = Jumping;
		athleticism = Athleticism; 
	}
	
	void jump() {
		jumping+=10;
		athleticism++;
		System.out.println("JUMP"); 
	}
	
	void bodySlammed() {
		athleticism-=10;
		agility-=5; 
		System.out.println("You have been body slammed"); 
	}
	
	
	
}

class HeavyWeight extends Wrestler{
	int punchStrength;
	int power; 
	int defence; 
	int courage; 
	public HeavyWeight(String Name, int Age, String WeightDivision, float Weight, int SkillLevel, int PunchStrength, int Power, int Defence, int Courage) {
		super(Name, Age, WeightDivision, Weight, SkillLevel);
		punchStrength = PunchStrength; 
		power = Power; 
		defence = Defence; 
		courage = Courage; 
		
	}
	
	void fight() {
		System.out.println(courage);
		courage++;
		defence-=3;
		punchStrength+=5;
		System.out.println("FIGHT FIGHT FIGHT");
		System.out.println("After fighting his courage level increases to " + courage);
		
	}
	
	void attacked(String heavyWeight1, int heavyWeightCourage) {
		power-=10;
		heavyWeightCourage-=5;
		
		defence+=5;
		System.out.println("After fighting the courage level of " + heavyWeight1 + " decreases to " + heavyWeightCourage);
	}
	
	void wrestlingMatch(int lightWeightSkillLevel, int heavyWeightSkillLevel, String lw1, String hw1) {
		heavyWeightSkillLevel+=5;
		lightWeightSkillLevel-=5;
		System.out.println("After fighting " + lw1 + ", the skill level of " + hw1 + " increases to " + heavyWeightSkillLevel );
		System.out.println("However, the skill level of " + lw1 + " reduces to " + lightWeightSkillLevel);
	}
	
	
	
}