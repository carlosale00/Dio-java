package inter.estabelecimento;

import inter.equipamento.digitalizadora.Digitalizadora;
import inter.equipamento.impressora.Impressora;
import inter.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

    public static void main(String[] args) {

//variavel com a interface -- classe que implementa a interface 
        Impressora imp = new EquipamentoMultifuncional();

        imp.imprimir();

        Digitalizadora dg = new EquipamentoMultifuncional();
        
        dg.digitalizar();

    }
    
}
