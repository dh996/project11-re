package kr.co.dh996.project11re.simul.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.dh996.project11re.simul.data.SimulMainObject;
import kr.co.dh996.project11re.simul.data.TurnData;
import kr.co.dh996.project11re.simul.machin.turn.BattlePhase;

@Component
public class Turn {
	//턴 진행 관련 기능을 수행합니다.
    private final BattlePhase battlePhase;

    @Autowired
    public Turn(BattlePhase battlePhase) {
        this.battlePhase = battlePhase;
    }
    
    //턴 실행 기능입니다.
  	public void turnStart(SimulMainObject simulMO) {
  		// TODO Auto-generated method stub
  		TurnData turnData = new TurnData(simulMO); //프로그램 가동에 필요한 요소들을 참조 인스턴스로 선언합니다.
  		battlePhase.battleStart(turnData); //전투 기능을 시작합니다.
  		applyDataToMO(turnData, simulMO); //전투 결과를 메인 객체에 반영합니다.
  	}

	private void applyDataToMO(TurnData turnData, SimulMainObject simulMO) {
		// TODO Auto-generated method stub
		
	}
}
