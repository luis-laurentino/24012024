package controller;
import view.*;
import model.*;

public class App {

    public static void main(String[] args) throws Exception {
        BemVindo.exibirBemVindo();
        Cardapio.consultarEstoque();
        ApresentarCardapio.mostrar();
    }

    
}
