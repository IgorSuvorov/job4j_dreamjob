package ru.job4j.dream.service;

import org.springframework.stereotype.Service;
import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.store.CandidateStore;

import javax.annotation.concurrent.ThreadSafe;
import java.util.Collection;

@ThreadSafe
@Service
public class CandidateService {

    private final CandidateStore candidateStore;

    public CandidateService(CandidateStore candidateStore) {
        this.candidateStore = candidateStore;
    }

    public Collection<Candidate> findAll() {
        return candidateStore.findAll();
    }

    public Candidate findById(int id) {
        return candidateStore.findById(id);
    }

    public void saveCandidate(Candidate candidate) {
        candidateStore.savePost(candidate);
    }
}
