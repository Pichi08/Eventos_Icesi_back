package co.edu.icesi.eventos.service.postgres;

import co.edu.icesi.eventos.domain.postgres.Areas;
import co.edu.icesi.eventos.repository.postgres.AreasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class AreasServiceImpl implements AreasService{

    @Autowired
    private AreasRepository areasRepository;

    @Override
    public List<Areas> findAll() {
        return areasRepository.findAll();
    }

    @Override
    public Optional<Areas> findById(Integer integer) {
        return areasRepository.findById(integer);
    }

    @Override
    public Areas save(Areas entity) throws Exception {
        return areasRepository.save(entity);
    }

    @Override
    public Areas update(Areas entity) throws Exception {
        return areasRepository.save(entity);
    }

    @Override
    public void delete(Areas entity) throws Exception {
        areasRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        areasRepository.deleteById(integer);
    }

    @Override
    public void validate(Areas entity) throws Exception {

    }

    @Override
    public Long count() {
        return areasRepository.count();
    }
}
