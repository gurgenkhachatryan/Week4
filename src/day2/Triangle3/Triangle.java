package day2.Triangle3;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA >= 1 && sideA <= 20)
            this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB >= 1 && sideB <= 20)
            this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC >= 1 && sideC <= 20)
            this.sideC = sideC;
    }


    private boolean isTriangleValid(int sideA, int sideB, int sideC) {
        if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
            System.out.println("is a Triangle");
            return true;
        } else {
            System.out.println("is a not Triangle");
            return false;
        }
    }


    public void check(int sideA, int sideB, int sideC) {
        if (isTriangleValid(sideA, sideB, sideC) == true)
            System.out.println("is triangle valid");
        else
            System.out.println("is a invalid");
        permeter(sideA,sideB,sideC);
        square(sideA,sideB,sideC);
    }

    public void permeter(int sideC, int sideA, int sideB) {
        System.out.println("permeter=" + (sideA + sideB + sideC));
    }

    public void square(int sideA, int sideB, int sideC) {
        System.out.println("square=" + sideA * sideB / 2);
    }
}
   /*if(((sideA*sideA+sideB*sideB)==sideC*sideC)||((sideA*sideA+sideC*sideC)==sideB*sideB)||((sideB*sideB+sideC*sideC)==sideA*sideA))
            System.out.println();*/