package kr.co.dh996.project11re.simul.machin.round;

import org.springframework.stereotype.Component;

import kr.co.dh996.project11re.simul.data.RecordSimulProcess;
import kr.co.dh996.project11re.simul.data.SimulMainObject;

@Component
public class RoundManage {
	//이 클래스는 라운드 진행에 따른 메인 객체의 기초적인 값 수정에 관여합니다.
	
	//라운드가 시작될 때 라운드 값을 1 증가시킵니다.
	public void incRound(SimulMainObject simulMO) {
		int round = simulMO.getUsingSimulProcess().getRound();
		simulMO.getUsingSimulProcess().setRound(round + 1);
	}

	//이번 라운드의 전체적 진행상황을 저장합니다.
	public void recodingSimulProcess(SimulMainObject simulMO) {
		// TODO Auto-generated method stub
		RecordSimulProcess rsp = new RecordSimulProcess(
				simulMO.getUsingSimulProcess(), simulMO.getSimulDataList(), simulMO.getSid());
		simulMO.getSimulProcessList().add(rsp);
	}
}
