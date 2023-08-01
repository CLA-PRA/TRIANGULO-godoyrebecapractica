package miPrincipal;

public class Triangulo {

    public String verifica(int l1, int l2, int l3) {
        String s;
        s="";
        if (l1==l2 && l2==l3)
            s="Equilatero";
            else
            {
                    if (l1==l2 || l1==l3 || l2==l3)
                        s="Isosceles";
                            else
                            {
                                    if (l1!=l2 || l1!=l3 || l3!=l2)
                                        s="Escaleno";
                                        }
                                        
            }
        return s;
    }
}