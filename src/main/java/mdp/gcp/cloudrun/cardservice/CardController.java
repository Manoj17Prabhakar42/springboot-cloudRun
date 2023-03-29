package mdp.gcp.cloudrun.cardservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cards")
class CardController {
	
	private final CardService cardService;

	@PostMapping
	CardResponse issueNewCard(@RequestBody IssueCardRequest request) {
		Card card = cardService.issueNewCard(new Card(request.getCard(), request.getDescription()));
		return new CardResponse(card.getId(), card.getCard(), card.getDescription());
	}
	
	@GetMapping("/count")
	long count() {
		return this.cardService.cardCount();
	}

}
