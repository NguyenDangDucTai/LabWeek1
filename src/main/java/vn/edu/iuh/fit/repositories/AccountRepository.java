package vn.edu.iuh.fit.repositories;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.logging.Logger;

public class AccountRepository {
    private final Logger logger = Logger.getLogger(AccountRepository.class.getName());
    private EntityManager entityManager;
    @Inject
    private  RoleRepository roleRepository;
    @Inject
    private GrantAccessRepository grantAccessRepository;

    public AccountRepository() {
        entityManager = Persistence.createEntityManagerFactory("dbweek2").createEntityManager();
    }
}
