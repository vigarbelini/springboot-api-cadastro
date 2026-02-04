package br.com.criandoapi.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private IUsuario DAO;

    @GetMapping
    public List<Usuario> listausuarios (){
        return (List<Usuario>) DAO.findAll();
    }

    @PostMapping
    public Usuario criarusuario (@RequestBody Usuario usuario){
        Usuario usuarionovo = DAO.save(usuario);
        return usuarionovo;

    }

    @PutMapping
    public Usuario editarusuario (@RequestBody Usuario usuario){
        Usuario usuarionovo = DAO.save(usuario);
        return usuarionovo;

    }

    @DeleteMapping("/{id}")
    public Optional <Usuario> excluirusuario(@PathVariable Integer id){
        Optional <Usuario> usuario = DAO.findById(id);
        DAO.deleteById(id);
        return usuario;

    }






}
