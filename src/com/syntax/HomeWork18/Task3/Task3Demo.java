package com.syntax.HomeWork18.Task3;

public class Task3Demo {
    /*
   Write a Java program called Teacher. Identify features and behaviour of that Class.
   Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
   features and behaviour. Test all 4 classes
   */
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Demir";
        mathTeacher.teachMath();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Demir";
        chemistryTeacher.teachChemistry();
        //brea till 8:50
    }
}
class Teacher{
    String name;
    void teach(){
        System.out.println(name+" Teaches subjects");
    }
}
class MathTeacher extends Teacher{

    void teachMath(){
        System.out.println(name+" Teaches math");
    }
}
class ChemistryTeacher extends Teacher{

    void teachChemistry(){
        System.out.println(name+" Teaches Chemistry");
    }
}

class PianoTeacherTeacher extends Teacher{

    void teachPiano(){
        System.out.println(name+" Teaches Piano");
    }
}

