public class Iphone {
    private String modelo;
    private String numeroSerie;

    public Iphone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public void ligar() {
        System.out.println("Ligando o iPhone");
    }

    public void atender() {
        System.out.println("Atendendo uma chamada no iPhone");
    }

    public void iniciarChamadaVoz() {
        System.out.println("Iniciando chamada de voz no iPhone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo uma página na Internet no iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador do iPhone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador do iPhone");
    }

    public void tocar() {
        System.out.println("Reproduzindo música no iPhone");
    }

    public void pausar() {
        System.out.println("Pausando a reprodução de música no iPhone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando uma música no iPhone");
    }

    public static void main(String[] args) {
        Iphone myiPhone = new Iphone("iPhone 13", "123456");

        myiPhone.ligar();
        myiPhone.atender();
        myiPhone.iniciarChamadaVoz();

        myiPhone.exibirPagina();
        myiPhone.adicionarNovaAba();
        myiPhone.atualizarPagina();

        myiPhone.tocar();
        myiPhone.pausar();
        myiPhone.selecionarMusica();
    }
}

