import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.*;

public class Principal {

    public static void main(String[] args) {

        MetodoDePagamento metodoDePagamento = new Tranferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoDePagamento);

        Beneficiario funcionario = new Beneficiario("Bruno Afonso", "44445555", "1304");
        DocumentoPagavel holerite = new Holerite(funcionario, 100, 168);
        servicoContaPagar.pagar(holerite);

        Beneficiario fornecedor = new Beneficiario("Consultoria AlgaWorks", "11122266644477",
                "5600");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 65_500);
        servicoContaPagar.pagar(ordemServico);

    }
}
