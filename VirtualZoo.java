package com.test.animalkingdom;

public class VirtualZoo implements AnimalKingdom {
  
	

	public void treatAnimals() {	}
	
	public void cleanAnimals() {	}
	
	public void cureAnimals()  {    }
	
	public void trainAnimals() {	}
	
	public void animalShow()   {	}
	
	

}


interface Walk { void walk(); }
interface Swim { void swim(); }
interface Fly { void fly(); }
interface Crawl { void crawl(); }


class CommonBehaviour {
	public void eat() {
		System.out.println("This animal eats.");
	}
	
	public void play() {
		System.out.println("This animal plays.");
	}
}

class Lion extends CommonBehaviour implements Walk {
	public void walk()
	{
		System.out.println("Lion walks.");
	}
}

class Snake extends CommonBehaviour implements Crawl {
	public void crawl()
	{
		System.out.println("Snake crawls.");
	}
}


class Turtle extends CommonBehaviour implements Swim, Walk {
	public void swim()
	{
		System.out.println("Turtle swims.");
	}
	
	public void walk()
	{
		System.out.println("Turtle walks.");
	}
}


class Duck extends CommonBehaviour implements Swim, Walk, Fly {
	public void swim()
	{
		System.out.println("Duck swims.");
	}
	
	public void walk()
	{
		System.out.println("Duck walks.");
	}
	public void fly()
	{
		System.out.println("Duck flies.");
	}	
}


class Dog extends CommonBehaviour implements Walk, Swim {
	public void swim()
	{
		System.out.println("Dog swims.");
	}
	
	public void walk()
	{
		System.out.println("Dog walks.");
	}

}
