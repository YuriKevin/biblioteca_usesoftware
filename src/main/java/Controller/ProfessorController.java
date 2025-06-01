package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.usesoftware.biblioteca.model.Aluno;
import com.usesoftware.biblioteca.model.Professor;
import com.usesoftware.biblioteca.service.AlunoService;
import com.usesoftware.biblioteca.service.ProfessorService;

public class ProfessorController {
private final ProfessorService professorService = new ProfessorService();
	
	@PostMapping
    public ResponseEntity<String> cadastrar(Professor professor){
        return ResponseEntity.ok(professorService.cadastrar(professor));
    }
}
