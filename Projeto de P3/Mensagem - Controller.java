package unikut.pkg2gq;
/*
     Equipe:
   @author André
   @author Lucas
   @author Pedro
   @author Valmir
*/

public class Mensagem {
    private String para;
    private String de;
    private String mensagem;
    private String senha;

    public Mensagem(String para, String de, String mensagem) { //Construtor 2
        super();
        this.para = para;
        this.de = de;
        this.mensagem = mensagem;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
