package COM.SQA.LAB4.LAB_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HealthIndexScoreRobustnessTest {

    // TC001 Normal
    @Test
    void testTC001() {
        HealthIndexScore h = new HealthIndexScore(35,72,15);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(8,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC002 VO2 = -1
    @Test
    void testTC002() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(-1,72,15));
    }

    // TC003 VO2 = 0
    @Test
    void testTC003() {
        HealthIndexScore h = new HealthIndexScore(0,72,15);

        assertEquals(0,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(6,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC004 VO2 = 1
    @Test
    void testTC004() {
        HealthIndexScore h = new HealthIndexScore(1,72,15);

        assertEquals(0,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(6,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC005 VO2 = 89
    @Test
    void testTC005() {
        HealthIndexScore h = new HealthIndexScore(89,72,15);

        assertEquals(5,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(11,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC006 VO2 = 90
    @Test
    void testTC006() {
        HealthIndexScore h = new HealthIndexScore(90,72,15);

        assertEquals(5,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(11,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC007 VO2 = 91 (Source Code ยังยอมรับ)
    @Test
    void testTC007() {
        HealthIndexScore h = new HealthIndexScore(91,72,15);

        assertEquals(5,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(11,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC008 RHR = 39
    @Test
    void testTC008() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(35,39,15));
    }

    // TC009 RHR = 40
    @Test
    void testTC009() {
        HealthIndexScore h = new HealthIndexScore(35,40,15);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(5,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(10,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC010 RHR = 41
    @Test
    void testTC010() {
        HealthIndexScore h = new HealthIndexScore(35,41,15);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(5,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(10,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC011 RHR = 219
    @Test
    void testTC011() {
        HealthIndexScore h = new HealthIndexScore(35,219,15);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(1,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(6,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC012 RHR = 220
    @Test
    void testTC012() {
        HealthIndexScore h = new HealthIndexScore(35,220,15);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(1,h.calculateRhrScore());
        assertEquals(3,h.calculateHrrScore());
        assertEquals(6,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC013 RHR = 221
    @Test
    void testTC013() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(35,221,15));
    }

    // TC014 HRR = -1
    @Test
    void testTC014() {
        assertThrows(IllegalArgumentException.class,
                () -> new HealthIndexScore(35,72,-1));
    }

    // TC015 HRR = 0
    @Test
    void testTC015() {
        HealthIndexScore h = new HealthIndexScore(35,72,0);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(1,h.calculateHrrScore());
        assertEquals(6,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC016 HRR = 1
    @Test
    void testTC016() {
        HealthIndexScore h = new HealthIndexScore(35,72,1);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(1,h.calculateHrrScore());
        assertEquals(6,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC017 HRR = 29
    @Test
    void testTC017() {
        HealthIndexScore h = new HealthIndexScore(35,72,29);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(5,h.calculateHrrScore());
        assertEquals(10,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC018 HRR = 30
    @Test
    void testTC018() {
        HealthIndexScore h = new HealthIndexScore(35,72,30);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(5,h.calculateHrrScore());
        assertEquals(10,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

    // TC019 HRR = 31 (Source Code ยังยอมรับ)
    @Test
    void testTC019() {
        HealthIndexScore h = new HealthIndexScore(35,72,31);

        assertEquals(2,h.calculateVo2MaxScore());
        assertEquals(3,h.calculateRhrScore());
        assertEquals(5,h.calculateHrrScore());
        assertEquals(10,h.getTotalScore());
        assertEquals(HealthIndexScore.FitnessLevel.STANDARD,h.getFitnessLevel());
    }

}