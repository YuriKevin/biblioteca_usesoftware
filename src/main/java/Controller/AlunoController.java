package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usesoftware.biblioteca.model.Aluno;
import com.usesoftware.biblioteca.service.AlunoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {
	private final AlunoService alunoService = new AlunoService();
	
	@PostMapping
    public ResponseEntity<String> cadastrar(Aluno aluno){
        return ResponseEntity.ok(alunoService.cadastrar(aluno));
    }
}
