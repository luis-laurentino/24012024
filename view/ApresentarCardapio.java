package view;
import controller.*;

public class ApresentarCardapio {

    public static void mostrar(){
        System.out.printf("Veja as opções abaixo e digite o número da opção desejada, depois tecle enter:\n");
       
        System.out.printf(InterfaceControler.receitasDisponiveis + "\n" + InterfaceControler.receitasIndisponiveis);

        
    }
}
