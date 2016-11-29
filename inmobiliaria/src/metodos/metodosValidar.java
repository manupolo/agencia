
package metodos;

public class metodosValidar {
    public boolean validar(String cad){
        int num;
        try {
            num = Integer.parseInt(cad);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
