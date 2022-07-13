import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Funcao> funcoes = new ArrayList<>();

    public void executarFuncao(Funcao funcao) {
        this.funcoes.add(funcao);
        funcao.executar();
    }

    public void cancelarUltimaFuncao() {
        if (funcoes.size() !=0){
            Funcao funcao = this.funcoes.get(this.funcoes.size()-1);
            funcao.cancelar();
            this.funcoes.remove(this.funcoes.size()-1);
        }
    }
}
