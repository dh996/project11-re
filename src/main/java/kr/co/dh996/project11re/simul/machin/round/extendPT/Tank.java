package kr.co.dh996.project11re.simul.machin.round.extendPT;

import org.springframework.stereotype.Component;

@Component
class Tank extends TankParent{

	Tank() {
		super();
		setDefaultHp(1100);
		setDefaultAp(90);
		setDefaultSp(100);
		setDefaultIp(120);
	}
}
