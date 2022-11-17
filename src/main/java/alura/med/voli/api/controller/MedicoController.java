package alura.med.voli.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alura.med.voli.api.domain.medico.DadosCadastroMedico;
import alura.med.voli.api.domain.medico.Medico;
import alura.med.voli.api.repositories.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados));

    }
}
