package Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usesoftware.biblioteca.model.Livro;
import com.usesoftware.biblioteca.service.LivroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/livro")
public class LivroController {
private final LivroService  livroService = new LivroService();
	
	@PostMapping
    public ResponseEntity<String> cadastrar(Livro livro){
        return ResponseEntity.ok(livroService.cadastrar(livro));
    }
}
