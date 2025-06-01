package Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usesoftware.biblioteca.model.Livro;
import com.usesoftware.biblioteca.service.BibliotecaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/biblioteca")
public class BibliotecaController {
	private final BibliotecaService bibliotecaService = new BibliotecaService();
	
	@PutMapping
    public ResponseEntity<String> emprestarLivro(Livro livro){
        return ResponseEntity.ok(bibliotecaService.emprestarLivro(livro.getEmprestadoPara(), livro));
    }
	@PutMapping
    public ResponseEntity<String> devolverLivro(Livro livro){
        return ResponseEntity.ok(bibliotecaService.devolverLivro(livro, livro.getEmprestadoPara()));
    }
	
}
