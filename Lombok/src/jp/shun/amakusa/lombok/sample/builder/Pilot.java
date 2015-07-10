package jp.shun.amakusa.lombok.sample.builder;

import java.util.Set;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class Pilot {

	private String name;

	private int age;

	// Collectionの場合には@Singularが必要
	@Singular
	private Set<String> aliases;
}
