package week5.repository.concretes;

import week5.entity.ProgrammingLanguage;
import week5.entity.Technology;
import week5.repository.abstracts.BaseRepository;

import java.util.ArrayList;
import java.util.List;

public class TechnologyRepository implements BaseRepository<Technology> {

    private  List<Technology> technologies = new ArrayList<>();

    @Override
    public void add(Technology technology) {
    technologies.add(technology);
    }

    @Override
    public List<Technology> getAll() {
        return technologies;
    }

    @Override
    public void delete(Technology technology) {
        technologies.remove(technology);

    }

    @Override
    public void update(int id, String name) {
    getById(id).setName(name);

    }


    @Override
    public Technology getById(int id) {
        for (Technology technology : technologies) {
            if (technology.getId() == id) {
                return technology;
            }
        }
        return null;
    }


    }

