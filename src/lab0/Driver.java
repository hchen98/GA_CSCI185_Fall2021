// Implementation of Lab 0 through constructor method
// Spe 14th, 2021

package lab0;

class Driver {
  public static void main(String[] args) {
    Person p1 = new Person("Joe Smith", "123-456-7890", 25);
    System.out.println(p1);
  }
}

class Person{
  private String name;
  private String SSN;
  private int age;

  public Person(String n, String s, int a){
    this.name = n;
    this.SSN = s;
    this.age = a;
  }

  public void setName(String n){
    /**
     * setter of name
     * parameter:
     *   n: string
     */
    this.name = n;
  }

  public void setSSN(String s){
    /**
     * setter of SSN
     * parameter:
     *   s: string
     */
    this.SSN = s;
  }

  public void setAge(int a){
    /**
     * setter of age
     * parameter:
     *   a: int
     */
    this.age = a;
  }

  public String getName(){
    /**
     * getter of name
     * return:
     *   name: string
     */
    return this.name;
  }

  public String getSSN(){
    /**
     * getter of SSN
     * return:
     *   ssn: string
     */
    return this.SSN;
  }

  public int getAge(){
    /**
     * getter of age
     * return:
     *   age: int
     */
    return this.age;
  }

  public String toString(){
    // output person obj info
    // same as "PrintInfo" func
    return (getName() + "\t" + getSSN() + "\t" + getAge());
  }

}