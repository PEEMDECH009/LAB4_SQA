package COM.SQA.LAB4.LAB_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HealthIndexScoreTest {

    // TC001
    @Test
    void testTC001() {
        HealthIndexScore h = new HealthIndexScore(35, 72, 15);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(8, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC002
    @Test
    void testTC002() {
        HealthIndexScore h = new HealthIndexScore(0, 72, 15);
        assertEquals(0, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(6, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC003
    @Test
    void testTC003() {
        HealthIndexScore h = new HealthIndexScore(1, 72, 15);
        assertEquals(0, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(6, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC004
    @Test
    void testTC004() {
        HealthIndexScore h = new HealthIndexScore(89, 72, 15);
        assertEquals(5, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(11, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC005
    @Test
    void testTC005() {
        HealthIndexScore h = new HealthIndexScore(90, 72, 15);
        assertEquals(5, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(11, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC006
    @Test
    void testTC006() {
        HealthIndexScore h = new HealthIndexScore(35, 40, 15);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(5, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(10, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC007
    @Test
    void testTC007() {
        HealthIndexScore h = new HealthIndexScore(35, 41, 15);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(5, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(10, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC008
    @Test
    void testTC008() {
        HealthIndexScore h = new HealthIndexScore(35, 219, 15);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(1, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(6, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC009
    @Test
    void testTC009() {
        HealthIndexScore h = new HealthIndexScore(35, 220, 15);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(1, h.calculateRhrScore());
        assertEquals(3, h.calculateHrrScore());
        assertEquals(6, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC010
    @Test
    void testTC010() {
        HealthIndexScore h = new HealthIndexScore(35, 72, 0);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(1, h.calculateHrrScore());
        assertEquals(6, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC011
    @Test
    void testTC011() {
        HealthIndexScore h = new HealthIndexScore(35, 72, 1);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(1, h.calculateHrrScore());
        assertEquals(6, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC012
    @Test
    void testTC012() {
        HealthIndexScore h = new HealthIndexScore(35, 72, 29);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(5, h.calculateHrrScore());
        assertEquals(10, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

    // TC013
    @Test
    void testTC013() {
        HealthIndexScore h = new HealthIndexScore(35, 72, 30);
        assertEquals(2, h.calculateVo2MaxScore());
        assertEquals(3, h.calculateRhrScore());
        assertEquals(5, h.calculateHrrScore());
        assertEquals(10, h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD, h.getFitnessLevel());
    }

}