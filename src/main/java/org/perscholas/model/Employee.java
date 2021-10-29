package org.perscholas.model;

public class Employee {

  private String fName;
  private String lName;
  private String uName;
  private String password;
  private String[] hobbies;
  private String designation;
  private String gender;

  public Employee() {
  }

  public Employee(String fName, String lName, String uName, String password,
      String[] hobbies, String designation, String gender) {
    this.fName = fName;
    this.lName = lName;
    this.uName = uName;
    this.password = password;
    this.hobbies = hobbies;
    this.designation = designation;
    this.gender = gender;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public String getuName() {
    return uName;
  }

  public void setuName(String uName) {
    this.uName = uName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String[] getHobbies() {
    return hobbies;
  }

  public void setHobbies(String[] hobbies) {
    this.hobbies = hobbies;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

}
