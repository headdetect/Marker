package models;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Brayden
 * Date: 5/31/13
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    public Name studentFirstName;
    public Name studentMiddleName;
    public Name studentLastName;
    public Name studentOtherName;

    public Date studentBirthDate;

    public int studentGradYear;
    public int studentGrade;
    public int studentAge;

    public List<School> studentSchools;

    public Address studentMailingAddress;
    public Address studentHomeAddress;

    public List<Course> studentCourseList;

    public Schedule studentSchedule;

    /* They could be mormon and have liek 40 moms */
    public List<Parent> studentParents;

    public String studentHomePhone;
    public String studentCellPhone;

    public String studentLanguage;

    public Gender studentGender;

    public Status studentStatus;

    public String studentEmail;

    /* This is not the internal id. */
    public String studentID;

    public List<EmergencyContact> studentEmergencyContacts;

    public String studentNotes;

    /* Internal student ID only available for admins */
    public int ID;


    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getters & Setters
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
