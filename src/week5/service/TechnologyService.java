package week5.service;

import week5.entity.ProgrammingLanguage;
import week5.entity.Technology;
import week5.repository.abstracts.BaseRepository;
import week5.repository.concretes.TechnologyRepository;

import java.util.List;

public class TechnologyService {
    private BaseRepository<Technology> technologyRepository;

    public TechnologyService(BaseRepository<Technology> technologyRepository) {
        this.technologyRepository = technologyRepository;
    }
    public void addTechnology(Technology technology) {
        technologyRepository.add(technology);

    }
    public List<Technology> getAllTechnologies() {
        return technologyRepository.getAll();
    }
    public void deleteTechnology(Technology technology) {
        technologyRepository.delete(technology);
    }
    public void updateTechnology(int id, String name) {
        technologyRepository.update(id , name );
    }

    public Technology getTechnologyById(int id) {
        return technologyRepository.getById(id);
    }
}
