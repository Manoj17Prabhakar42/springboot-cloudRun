package mdp.gcp.cloudrun.cardservice;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
class CardService {
	
	private final CardRepo cardRepo;

	Card issueNewCard(Card card) {
		return this.cardRepo.save(card);
	}
	
	long cardCount() {
		return this.cardRepo.count();
	}

}
