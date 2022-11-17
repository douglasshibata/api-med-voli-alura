package alura.med.voli.api.domain.medico;

import alura.med.voli.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
        DadosEndereco endereco) {

}
