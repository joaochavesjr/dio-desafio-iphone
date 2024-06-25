package Iphone;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		// Aparelho telefonico
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		// Reprodutor musical
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		// Navegador Internet
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

	public void ligar() {
		System.out.println("Efetuar ligacao telefonica");
		
	}

	public void atender() {
		System.out.println("Atender ligacao telefonica");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz");
		
	}

	public void tocar() {
		System.out.println("Tocar uma musica");
		
	}

	public void pausar() {
		System.out.println("Pausar uma musica");
		
	}

	public void selecionarMusica() {
		System.out.println("Selecionar nova musica");
		
	}

	public void exibirPagina() {
		System.out.println("Exibir pagina web");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Criar uma nova aba");
		
	}

	public void atualizarPagina() {
		System.out.println("Recarregar pagina");
		
	}

	
	
}
