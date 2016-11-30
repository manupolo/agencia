
package facadeVendedor;

import javax.swing.table.DefaultTableModel;
import metodos.vendedor;

public class facadeTitular {
    vendedor v = new vendedor();
    
    public DefaultTableModel tablaVendedor(){
        return v.tablaVendedor();
    }
}
