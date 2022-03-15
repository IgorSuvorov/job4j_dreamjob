package ru.job4j.dream.service;

import org.springframework.stereotype.Service;
import ru.job4j.dream.model.Candidate;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CandidateService {
    private static final CandidateService INST = new CandidateService();

    private final Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();

    private CandidateService() {
        candidates.put(1, new Candidate(1, "Junior Java Candidate"));
        candidates.put(2, new Candidate(2, "Middle Java Candidate"));
        candidates.put(3, new Candidate(3, "Senior Java Candidate"));
    }

    public static CandidateService instOf() {
        return INST;
    }

    public Collection<Candidate> findAll() {
        return candidates.values();
    }

    public Candidate findById(int id) {
        return candidates.get(id);
    }

    public void saveCandidate(Candidate candidate) {
        candidates.put(candidate.getId(), candidate);
    }

}
