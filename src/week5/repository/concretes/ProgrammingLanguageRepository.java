package week5.repository.concretes;

import week5.entity.ProgrammingLanguage;
import week5.repository.abstracts.BaseRepository;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageRepository implements BaseRepository<ProgrammingLanguage> {

    private List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();
    @Override
    public void add(ProgrammingLanguage programmingLanguage) {

        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {

        programmingLanguages.remove(programmingLanguage);

    }

    @Override
    public void update(int id , String name) {
        getById(id).setName(name);

    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }
}
