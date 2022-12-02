package br.edu.iftm.lp2.projetojavafx;

import br.edu.iftm.lp2.projetojavafx.entidades.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class TelaCadastroClienteController {

    private List<Cliente> listaCliente = new ArrayList<>();

    @FXML
    private TextField campoCPF;

    @FXML
    private TextField campoEmail;

    @FXML
    private Button botaoSalvar;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoEndereco;

    //private TextField campoNumero;

    @FXML
    void salvarCliente(ActionEvent event) {
        String nome = campoNome.getText();
        String cpf = campoCPF.getText();
        String email = campoEmail.getText();
        String endereco = campoEndereco.getText();
        Cliente cli = new Cliente(nome,cpf,email,endereco);
        listaCliente.add(cli);
        limpaFormulario();
        for (Cliente cliente: listaCliente) {
            System.out.println(cliente);
        }

        //convertendo de String para valor numero
        /*int numero1 = Integer.parseInt(campoNumero.getText());
        float numero2 = Float.parseFloat(campoNumero.getText());
        double numero3 = Double.parseDouble(campoNumero.getText());*/
    }

    private void limpaFormulario(){
        campoNome.clear();
        campoCPF.clear();
        campoEmail.clear();
        campoEndereco.clear();
    }

}

