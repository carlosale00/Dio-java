package inter.multifuncional;

import inter.equipamento.copiadora.Copiadora;
import inter.equipamento.digitalizadora.Digitalizadora;
import inter.equipamento.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora,Copiadora  {

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

}
