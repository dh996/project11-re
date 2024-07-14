package kr.co.dh996.project11re.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.dh996.project11re.entity.ChampVersion;

public interface ChampVersionRepository extends JpaRepository<ChampVersion, String> {

	//중복 체크 확인용
	boolean existsByChampVersion(String champVersion);
}