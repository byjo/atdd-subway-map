package nextstep.subway.acceptance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("구간 관리 기능")
public class SectionAcceptanceTest extends AcceptanceTest {

    /**
     * Given 구간을 등록하려는 노선이 존재하지 않을 때
     * When 구간 등록 요청을 하면
     * Then 구간 등록이 실패한다.
     */
    @DisplayName("구간을 등록하려는 노선이 존재하지 않을 때")
    @Test
    void createNotExistsLineSection() {
    }

    /**
     * Given 상행역이 존재하지 않을 때
     * When 구간 등록 요청을 하면
     * Then 구간 등록이 실패한다.
     */
    @DisplayName("상행역이 존재하지 않을 때")
    @Test
    void createNotExistsUpStationSection() {
    }

    /**
     * Given 하행역이 존재하지 않을 때
     * When 구간 등록 요청을 하면
     * Then 구간 등록이 실패한다.
     */
    @DisplayName("하행역이 존재하지 않을 때")
    @Test
    void createNotExistsDownStationSection() {
    }

    /**
     * Given 새로운 구간의 상행역이 노선의 하행 종점역이 아닐 때
     * When 구간 등록 요청을 하면
     * Then 구간 등록이 실패한다.
     */
    @DisplayName("상행역이 노선의 하행 종점역이 아닐 때")
    @Test
    void createNotConsistsUpStationSection() {
    }

    /**
     * Given 새로운 구간의 하행역이 노선에 이미 등록되어 있을 때
     * When 구간 등록 요청을 하면
     * Then 구간 등록이 실패한다.
     */
    @DisplayName("하행역이 노선에 이미 등록되어 있을 때")
    @Test
    void createAlreadyConsistsDownStationSection() {

    }

    /**
     * When 구간 등록 요청을 하면
     * Then 구간 등록이 성공한다.
     */
    @DisplayName("구간 등록")
    @Test
    void createSection() {

    }
}

