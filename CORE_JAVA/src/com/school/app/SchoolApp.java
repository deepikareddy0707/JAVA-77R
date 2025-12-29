package com.school.app;

import com.school.management.School;
import com.school.staff.Principal;

public class SchoolApp {

    public static void main(String[] args) {

        School school = new School();
        school.setName("Green Valley High School");
        school.setLocation("Hyderabad");

        Principal principal = new Principal();
        principal.setPrincipalName("Dr. Anil Kumar");
        principal.setExperienceYears(18);

        school.showSchoolInfo();
        System.out.println();
        principal.showPrincipalInfo();
    }
}
