package kr.co.dh996.project11re.simul.machin.round.extendPT;

import org.springframework.stereotype.Component;

@Component
class MageSupport extends SupportParent{

	MageSupport() {
		super();
		setDefaultHp(550);
		setDefaultAp(100);
		setDefaultSp(120);
		setDefaultIp(60);
		setDefaultAs(2);
	}
}
