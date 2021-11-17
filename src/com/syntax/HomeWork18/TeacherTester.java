package com.syntax.HomeWork18;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher math=new MathTeacher();
        math.name="Max";
        math.age=35;
        math.schoolName="Lincoln school";
        math.teach();
        math.printAge();
        math.mathSubject();


    ChemistryTeacher chemistry=new ChemistryTeacher();


        chemistry.name = "Alex";
        chemistry.age = 43;
        chemistry.schoolName="Hunter";
        chemistry.teach();
        chemistry.printAge();
        chemistry.chemistrySubject();

    PianoTeacher piano=new PianoTeacher();

        piano.name="Anna";
        piano.age=38;
        piano.schoolName="Queensboro";
        piano.teach();
        piano.printAge();
        piano.pianoSubject();
    }


}
