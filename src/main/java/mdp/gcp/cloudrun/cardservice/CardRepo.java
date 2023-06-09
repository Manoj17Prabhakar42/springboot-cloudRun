package mdp.gcp.cloudrun.cardservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CardRepo extends JpaRepository<Card, Long> {
}