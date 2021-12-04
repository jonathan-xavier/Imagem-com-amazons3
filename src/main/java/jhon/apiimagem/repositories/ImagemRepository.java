package jhon.apiimagem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jhon.apiimagem.model.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long > {

}
