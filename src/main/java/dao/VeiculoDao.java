package dao;

import domain.Veiculo;

import java.util.List;

public class VeiculoDao extends GenericDao<Veiculo>{

    @Override
    public void saveOrUpdate(Veiculo entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public Veiculo findById(Class<Veiculo> clazz, Long id) {
        return super.findById(clazz, id);
    }

    @Override
    public void delete(Veiculo entity) {
        super.delete(entity);
    }

    @Override
    public List<Veiculo> findAll(String namedQuery) {
        return super.findAll(namedQuery);
    }
}
