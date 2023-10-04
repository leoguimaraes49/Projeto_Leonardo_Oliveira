public class ClasseA {
    private int a1;
    private double a2;

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }
    
    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public void MA1 () {
        System.out.println("MA1");
    }

    public void MA2 () {
        System.out.println("MA2");
    }

    public void MA3 () {
        System.out.println("Alteração a classe A partir do clone");
    }

    /**
     * Atualizado via fork 
     * @author Gabriel Raimundo Pereira Barroso
     * @param numero1
     * @param numero2
     * @return
     */
    public int getSoma (int numero1, int numero2) {
        return numero1 + numero2;
    }
}
