package week5.service;

import week5.entity.ProgrammingLanguage;
import week5.repository.abstracts.BaseRepository;

import java.util.List;

public class ProgrammingLanguageService {

    private BaseRepository<ProgrammingLanguage> programmingLanguageRepository;

    public ProgrammingLanguageService(BaseRepository<ProgrammingLanguage> programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;

    }
    public void addProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.add(programmingLanguage);
    }

    public List<ProgrammingLanguage> getAllProgrammingLanguages() {
        return programmingLanguageRepository.getAll();
    }

    public void deleteProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.delete(programmingLanguage);
    }

    public void updateProgrammingLanguage(int id , String name) {
        programmingLanguageRepository.update(id,name);
    }

    public ProgrammingLanguage getProgrammingLanguageById(int id) {
        return programmingLanguageRepository.getById(id);
    }




}
