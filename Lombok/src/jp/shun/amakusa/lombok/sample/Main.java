package jp.shun.amakusa.lombok.sample;

import java.util.HashSet;

import com.google.common.collect.Sets;

import jp.shun.amakusa.lombok.sample.builder.Pilot;

public class Main {

	public static void main(String[] args) {

		HashSet<String> aliasSet = Sets.newHashSet("シャア・アズナブル", "クワトロ・バジーナ");

		// @Builderにより自動生成されたbuilderを使用してインスタンスを取得
		Pilot pilot = Pilot.builder().name("キャスバル・レム・ダイクン").age(27).aliases(aliasSet).build();

		// @Dataにより自動でオーバーライドされたtoString()を使用して出力
		System.out.println(pilot);
	}

}
