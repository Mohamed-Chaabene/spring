package tn.esprit.arctic1.arctic1.Services;

import org.springframework.stereotype.Service;
import tn.esprit.arctic1.arctic1.Entity.Pilote;
import tn.esprit.arctic1.arctic1.Repository.PiloteRepository;

@Service
public class PiloteService implements IPiloteService {

    private final PiloteRepository pr;

    public PiloteService(PiloteRepository pr) {
        this.pr = pr;
    }

    @Override
    public String addPilote(Pilote p) {
        pr.save(p);
    }
}
