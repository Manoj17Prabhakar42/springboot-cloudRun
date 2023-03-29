package mdp.gcp.cloudrun.cardservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
class IssueCardRequest {
	private String card;
	private String description;
}
