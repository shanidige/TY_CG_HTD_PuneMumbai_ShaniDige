package com.capgemini.sorted;

public abstract class Student implements Comparable {

	int id2;
	String name2;
	double percentage2;

	public Student(int id2, String name2, double percentage2) {

		this.id2 = id2;
		this.name2 = name2;
		this.percentage2 = percentage2;
	}

	/*
	 * @Override public String compareTo(Object arg0) { if(this.name2>S.name2) {
	 * return 1; }else if(this.name2< S.name2) { return -1; }else { return 0; }
	 */

	/*
	 * @Override public int compareTo(Student s) { return
	 * this.name2.compareTo(s.name2);////sorted in asending by name }
	 */

	/*
	 * @Override public int compareTo(Student S) { return
	 * this.name2.compareTo(s.name2)*-1;///sorted in desending by name }
	 */

	/*
	 * @Override public int compareTo(Student s) { String k=this.name2; Stringt
	 * t=s.name;Student inte res=k.compareTo(t); return res; }
	 */

	// LOgic to sort students by ID

	/*
	 * @Override public int compareTo(Object arg0) { if(this.id2 > s.i2d) {return
	 * 1;} else if(this.id2<.s.id2) {return -1; }else {return 0;} }
	 */

	/*
	 * @Override public int compareTo(Student S) { Int k=this.id2; Int t=S.id2;
	 * return k.compareTo(t); }
	 */

	// LOgic to sort percentage

	/*
	 * @Override public Double compareTo(Object arg0) {
	 * if(this.percentage2>S.percentage2) { return 1; }else if(this.percentage2<
	 * S.percentage2) { return -1; }else { return 0; }
	 */

	/*
	 * @Override public int compareTo(Student S) { Double k=this.percentage2; Double
	 * t=S.percentage2; return k.compareTo(t); }
	 */

}
