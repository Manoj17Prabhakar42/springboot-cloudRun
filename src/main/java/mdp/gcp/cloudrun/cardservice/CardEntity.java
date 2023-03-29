package mdp.gcp.cloudrun.cardservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String card;
	private String description;

	public Card(String card, String desc) {
		super();
		this.card = card;
		this.description = desc;
	}

}
