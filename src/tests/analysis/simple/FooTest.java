package analysis.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FooTest {

    @Test
    public void test0() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1168268032,1168267780);

        // perform assertions
        assertEquals(-328, result);

    }

    @Test
    public void test1() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1435654912,1171413508);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test2() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1704090368,-976070140);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test3() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1073741823,1073741825);

        // perform assertions
        assertEquals(-79, result);

    }

    @Test
    public void test4() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1440897791,1168267781);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test5() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-2147483595,-1073741807);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test6() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-2147483627,-2147483596);

        // perform assertions
        assertEquals(-113, result);

    }

    @Test
    public void test7() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1610612683,-402653164);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test8() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-2147483595,-1073741804);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test9() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1171413760,1171413509);

        // perform assertions
        assertEquals(-406, result);

    }

    @Test
    public void test10() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1761298420,32773);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test11() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-2147483648,-2147450875);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test12() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-2147483627,-2147483628);

        // perform assertions
        assertEquals(-26, result);

    }

    @Test
    public void test13() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1416920763,-730560652);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test14() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-1286897339,-864778380);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test15() {
        int result = analysis.simple.ControlFlowSimple.foo(0,0,4);

        // perform assertions
        assertEquals(31, result);

    }

    @Test
    public void test16() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1530536620,981126504);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test17() {
        int result = analysis.simple.ControlFlowSimple.foo(0,4194304,134217736);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test18() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1,1);

        // perform assertions
        assertEquals(24, result);

    }

    @Test
    public void test19() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1207959553,939524097);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test20() {
        int result = analysis.simple.ControlFlowSimple.foo(0,331218425,402653185);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test21() {
        int result = analysis.simple.ControlFlowSimple.foo(0,16,6);

        // perform assertions
        assertEquals(-61, result);

    }

    @Test
    public void test22() {
        int result = analysis.simple.ControlFlowSimple.foo(0,864416772,1619003398);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test23() {
        int result = analysis.simple.ControlFlowSimple.foo(0,331218425,402653184);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test24() {
        int result = analysis.simple.ControlFlowSimple.foo(0,17,7);

        // perform assertions
        assertEquals(-28, result);

    }

    @Test
    public void test25() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1073741855,1073741863);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test26() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1073741855,1073741831);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test27() {
        int result = analysis.simple.ControlFlowSimple.foo(0,0,1);

        // perform assertions
        assertEquals(91, result);

    }

    @Test
    public void test28() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1932919436,1112065321);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test29() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1530790572,307807593);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test30() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147451200,-2147450876);

        // perform assertions
        assertEquals(248, result);

    }

    @Test
    public void test31() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1610612684,-2147483600);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test32() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1610612492,-1073741768);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test33() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147451200,-2147450873);

        // perform assertions
        assertEquals(238, result);

    }

    @Test
    public void test34() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147189056,-2147450873);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test35() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147459392,-2147450873);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test36() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147451200,-2147450874);

        // perform assertions
        assertEquals(140, result);

    }

    @Test
    public void test37() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147197248,-2147450874);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test38() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147459392,-2147450874);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test39() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147451200,-2147450875);

        // perform assertions
        assertEquals(170, result);

    }

    @Test
    public void test40() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147189056,-2147450875);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test41() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147459392,-2147450875);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test42() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1073741855,-1073741817);

        // perform assertions
        assertEquals(-19, result);

    }

    @Test
    public void test43() {
        int result = analysis.simple.ControlFlowSimple.foo(0,536866828,-2147483623);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test44() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1610612492,-1073741767);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test45() {
        int result = analysis.simple.ControlFlowSimple.foo(-2,-838860803,838860800);

        // perform assertions
        assertEquals(-73, result);

    }

    @Test
    public void test46() {
        int result = analysis.simple.ControlFlowSimple.foo(-706,-838926339,838860800);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test47() {
        int result = analysis.simple.ControlFlowSimple.foo(-30405566,-278856703,-1845493760);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test48() {
        int result = analysis.simple.ControlFlowSimple.foo(-1,-838860803,838860800);

        // perform assertions
        assertEquals(-83, result);

    }

    @Test
    public void test49() {
        int result = analysis.simple.ControlFlowSimple.foo(-1912602617,-1744830461,1744830464);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test50() {
        int result = analysis.simple.ControlFlowSimple.foo(-1895825409,-268435457,-512);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test51() {
        int result = analysis.simple.ControlFlowSimple.foo(-396,-2147483571,-2147483648);

        // perform assertions
        assertEquals(-497, result);

    }

    @Test
    public void test52() {
        int result = analysis.simple.ControlFlowSimple.foo(-30406654,-60884996,-1826617344);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test53() {
        int result = analysis.simple.ControlFlowSimple.foo(-30405566,-278856704,-1845493760);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test54() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483647,-2147483645,8);

        // perform assertions
        assertEquals(-133, result);

    }

    @Test
    public void test55() {
        int result = analysis.simple.ControlFlowSimple.foo(-31,-2147450845,8);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test56() {
        int result = analysis.simple.ControlFlowSimple.foo(-1876688799,-268435417,-2359296);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test57() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483625,-2013265915,-134217680);

        // perform assertions
        assertEquals(-67, result);

    }

    @Test
    public void test58() {
        int result = analysis.simple.ControlFlowSimple.foo(-796917953,-1166016417,1166016512);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test59() {
        int result = analysis.simple.ControlFlowSimple.foo(-1912602625,-1056964577,268435520);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test60() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483648,1073741824,1073741828);

        // perform assertions
        assertEquals(31, result);

    }

    @Test
    public void test61() {
        int result = analysis.simple.ControlFlowSimple.foo(-645930496,2143288048,1077938192);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test62() {
        int result = analysis.simple.ControlFlowSimple.foo(-645930496,1069546224,1077938192);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test63() {
        int result = analysis.simple.ControlFlowSimple.foo(-79,64,16);

        // perform assertions
        assertEquals(25, result);

    }

    @Test
    public void test64() {
        int result = analysis.simple.ControlFlowSimple.foo(-3,1073741911,1073741838);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test65() {
        int result = analysis.simple.ControlFlowSimple.foo(-645930495,1069546224,1077938192);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test66() {
        int result = analysis.simple.ControlFlowSimple.foo(-64,65,32);

        // perform assertions
        assertEquals(-42, result);

    }

    @Test
    public void test67() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483638,2,64);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test68() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483646,0,64);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test69() {
        int result = analysis.simple.ControlFlowSimple.foo(-63,65,32);

        // perform assertions
        assertEquals(-8, result);

    }

    @Test
    public void test70() {
        int result = analysis.simple.ControlFlowSimple.foo(-130154488,1475018767,806682615);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test71() {
        int result = analysis.simple.ControlFlowSimple.foo(-264372216,1475018767,806682615);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test72() {
        int result = analysis.simple.ControlFlowSimple.foo(-1,2147483647,2147483136);

        // perform assertions
        assertEquals(-422, result);

    }

    @Test
    public void test73() {
        int result = analysis.simple.ControlFlowSimple.foo(-666911105,1117257967,1701822626);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test74() {
        int result = analysis.simple.ControlFlowSimple.foo(-1895825409,1879048191,2147483136);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test75() {
        int result = analysis.simple.ControlFlowSimple.foo(-518,1073741809,-1073741824);

        // perform assertions
        assertEquals(-498, result);

    }

    @Test
    public void test76() {
        int result = analysis.simple.ControlFlowSimple.foo(-1879048198,1342177283,-1342177216);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test77() {
        int result = analysis.simple.ControlFlowSimple.foo(-2146664960,1091076092,-1102544896);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test78() {
        int result = analysis.simple.ControlFlowSimple.foo(-17,1488519031,-1488519040);

        // perform assertions
        assertEquals(-2, result);

    }

    @Test
    public void test79() {
        int result = analysis.simple.ControlFlowSimple.foo(-32637439,1099464684,-2142732288);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test80() {
        int result = analysis.simple.ControlFlowSimple.foo(-2146566655,17334252,-2142732288);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test81() {
        int result = analysis.simple.ControlFlowSimple.foo(-18,1488519030,-1488519040);

        // perform assertions
        assertEquals(-103, result);

    }

    @Test
    public void test82() {
        int result = analysis.simple.ControlFlowSimple.foo(-18,1488519030,-1555627904);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test83() {
        int result = analysis.simple.ControlFlowSimple.foo(-805306386,142671734,-1589182336);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test84() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483647,3,-2147483644);

        // perform assertions
        assertEquals(-42, result);

    }

    @Test
    public void test85() {
        int result = analysis.simple.ControlFlowSimple.foo(-268439569,142667638,-1589182336);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test86() {
        int result = analysis.simple.ControlFlowSimple.foo(-805306385,142671734,-1589182336);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test87() {
        int result = analysis.simple.ControlFlowSimple.foo(-6,1342177314,-1342177216);

        // perform assertions
        assertEquals(4, result);

    }

    @Test
    public void test88() {
        int result = analysis.simple.ControlFlowSimple.foo(-1124602393,1646702636,-2126159544);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test89() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483647,0,-864778380);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test90() {
        int result = analysis.simple.ControlFlowSimple.foo(-4,201326606,-201326592);

        // perform assertions
        assertEquals(-58, result);

    }

    @Test
    public void test91() {
        int result = analysis.simple.ControlFlowSimple.foo(-4,189399042,-977666044);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test92() {
        int result = analysis.simple.ControlFlowSimple.foo(-4,64,-2147483648);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test93() {
        int result = analysis.simple.ControlFlowSimple.foo(-3,536870978,-536870912);

        // perform assertions
        assertEquals(-16, result);

    }

    @Test
    public void test94() {
        int result = analysis.simple.ControlFlowSimple.foo(-3,66,-2113929216);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test95() {
        int result = analysis.simple.ControlFlowSimple.foo(-3,0,-2147483648);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test96() {
        int result = analysis.simple.ControlFlowSimple.foo(-4,524238889,-524238820);

        // perform assertions
        assertEquals(-121, result);

    }

    @Test
    public void test97() {
        int result = analysis.simple.ControlFlowSimple.foo(-4,457130061,-1027555300);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test98() {
        int result = analysis.simple.ControlFlowSimple.foo(-2,0,-2147483648);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test99() {
        int result = analysis.simple.ControlFlowSimple.foo(-1,201326606,-201326592);

        // perform assertions
        assertEquals(-132, result);

    }

    @Test
    public void test100() {
        int result = analysis.simple.ControlFlowSimple.foo(-3,151005691,-805306368);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test101() {
        int result = analysis.simple.ControlFlowSimple.foo(-3,3,-2147483644);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test102() {
        int result = analysis.simple.ControlFlowSimple.foo(-4,1061109801,-1061109732);

        // perform assertions
        assertEquals(-114, result);

    }

    @Test
    public void test103() {
        int result = analysis.simple.ControlFlowSimple.foo(-4,1056915497,-1069498340);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test104() {
        int result = analysis.simple.ControlFlowSimple.foo(-3,87,-2147483634);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test105() {
        int result = analysis.simple.ControlFlowSimple.foo(-1941962750,-473956359,-1879048192);

        // perform assertions
        assertEquals(127, result);

    }

    @Test
    public void test106() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483648,-134217728,-2147483648);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test107() {
        int result = analysis.simple.ControlFlowSimple.foo(-1941831680,-474021892,-1879048192);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test108() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483643,2506718,2144976928);

        // perform assertions
        assertEquals(124, result);

    }

    @Test
    public void test109() {
        int result = analysis.simple.ControlFlowSimple.foo(-1941831679,-1547763716,-1879048192);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test110() {
        int result = analysis.simple.ControlFlowSimple.foo(-868089855,-474021892,-1879048192);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test111() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483642,2506718,2144976928);

        // perform assertions
        assertEquals(26, result);

    }

    @Test
    public void test112() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483648,335624712,1805829122);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test113() {
        int result = analysis.simple.ControlFlowSimple.foo(-2139095040,335624712,1805829122);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test114() {
        int result = analysis.simple.ControlFlowSimple.foo(-2141716480,335624713,1806091299);

        // perform assertions
        assertEquals(-415, result);

    }

    @Test
    public void test115() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483648,335624713,1805829155);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test116() {
        int result = analysis.simple.ControlFlowSimple.foo(-2139095040,335624713,1805829155);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test117() {
        int result = analysis.simple.ControlFlowSimple.foo(-2087731201,1391805438,695925248);

        // perform assertions
        assertEquals(-454, result);

    }

    @Test
    public void test118() {
        int result = analysis.simple.ControlFlowSimple.foo(-2130185655,1039868762,34523136);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test119() {
        int result = analysis.simple.ControlFlowSimple.foo(-1013989377,-1831517186,-382010880);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test120() {
        int result = analysis.simple.ControlFlowSimple.foo(-1073741824,1073741824,0);

        // perform assertions
        assertEquals(36, result);

    }

    @Test
    public void test121() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-26935296,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test122() {
        int result = analysis.simple.ControlFlowSimple.foo(-2054651873,2054651871,0);

        // perform assertions
        assertEquals(23, result);

    }

    @Test
    public void test123() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483133,1432417025,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test124() {
        int result = analysis.simple.ControlFlowSimple.foo(-936340228,936340101,0);

        // perform assertions
        assertEquals(-201, result);

    }

    @Test
    public void test125() {
        int result = analysis.simple.ControlFlowSimple.foo(-2144296958,1292328832,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test126() {
        int result = analysis.simple.ControlFlowSimple.foo(0,-2147483581,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test127() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483135,2147483133,0);

        // perform assertions
        assertEquals(-43, result);

    }

    @Test
    public void test128() {
        int result = analysis.simple.ControlFlowSimple.foo(-1073741821,-1073741760,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test129() {
        int result = analysis.simple.ControlFlowSimple.foo(-1069465599,-1078018039,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test130() {
        int result = analysis.simple.ControlFlowSimple.foo(-510,254,0);

        // perform assertions
        assertEquals(-167, result);

    }

    @Test
    public void test131() {
        int result = analysis.simple.ControlFlowSimple.foo(-1705134236,1,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test132() {
        int result = analysis.simple.ControlFlowSimple.foo(0,0,0);

        // perform assertions
        assertEquals(39, result);

    }

    @Test
    public void test133() {
        int result = analysis.simple.ControlFlowSimple.foo(-1073741840,0,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test134() {
        int result = analysis.simple.ControlFlowSimple.foo(-1073741856,0,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test135() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483646,0,0);

        // perform assertions
        assertEquals(80, result);

    }

    @Test
    public void test136() {
        int result = analysis.simple.ControlFlowSimple.foo(-218,0,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test137() {
        int result = analysis.simple.ControlFlowSimple.foo(-1073741869,0,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test138() {
        int result = analysis.simple.ControlFlowSimple.foo(-1933574111,1933574164,0);

        // perform assertions
        assertEquals(97, result);

    }

    @Test
    public void test139() {
        int result = analysis.simple.ControlFlowSimple.foo(-1397147207,-750336484,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test140() {
        int result = analysis.simple.ControlFlowSimple.foo(-864026197,1095106647,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test141() {
        int result = analysis.simple.ControlFlowSimple.foo(-1073741315,1073741835,0);

        // perform assertions
        assertEquals(498, result);

    }

    @Test
    public void test142() {
        int result = analysis.simple.ControlFlowSimple.foo(-1397147237,-750336452,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test143() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483645,2147483647,0);

        // perform assertions
        assertEquals(66, result);

    }

    @Test
    public void test144() {
        int result = analysis.simple.ControlFlowSimple.foo(-39,-2147483631,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test145() {
        int result = analysis.simple.ControlFlowSimple.foo(-1069465599,-2147483648,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test146() {
        int result = analysis.simple.ControlFlowSimple.foo(0,14,0);

        // perform assertions
        assertEquals(71, result);

    }

    @Test
    public void test147() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147483598,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test148() {
        int result = analysis.simple.ControlFlowSimple.foo(0,1073741838,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test149() {
        int result = analysis.simple.ControlFlowSimple.foo(0,15,0);

        // perform assertions
        assertEquals(-38, result);

    }

    @Test
    public void test150() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483140,-1040186865,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test151() {
        int result = analysis.simple.ControlFlowSimple.foo(-2147483644,-2147483171,0);

        // perform assertions
        assertEquals(419, result);

    }

    @Test
    public void test152() {
        int result = analysis.simple.ControlFlowSimple.foo(0,2147483643,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test153() {
        int result = analysis.simple.ControlFlowSimple.foo(-2071986172,-2147483171,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test154() {
        int result = analysis.simple.ControlFlowSimple.foo(1879048192,1480589300,935329800);

        // perform assertions
        assertEquals(33, result);

    }

    @Test
    public void test155() {
        int result = analysis.simple.ControlFlowSimple.foo(1476411392,270533120,2013265920);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test156() {
        int result = analysis.simple.ControlFlowSimple.foo(535310224,1612206140,-1073741824);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test157() {
        int result = analysis.simple.ControlFlowSimple.foo(2090870759,2105530357,98566176);

        // perform assertions
        assertEquals(22, result);

    }

    @Test
    public void test158() {
        int result = analysis.simple.ControlFlowSimple.foo(1151346663,1971312629,232783904);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test159() {
        int result = analysis.simple.ControlFlowSimple.foo(1879048193,1950351344,929038368);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test160() {
        int result = analysis.simple.ControlFlowSimple.foo(1,2,3);

        // perform assertions
        assertEquals(-74, result);

    }

    @Test
    public void test161() {
        int result = analysis.simple.ControlFlowSimple.foo(1258074018,906186844,1073741824);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test162() {
        int result = analysis.simple.ControlFlowSimple.foo(184332194,1979928668,-1073741824);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test163() {
        int result = analysis.simple.ControlFlowSimple.foo(2122318209,549453763,1623195844);

        // perform assertions
        assertEquals(213, result);

    }

    @Test
    public void test164() {
        int result = analysis.simple.ControlFlowSimple.foo(1151346663,1971312629,232783906);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test165() {
        int result = analysis.simple.ControlFlowSimple.foo(2122580353,549453763,1623195844);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test166() {
        int result = analysis.simple.ControlFlowSimple.foo(1780899832,1041866755,1472200704);

        // perform assertions
        assertEquals(-91, result);

    }

    @Test
    public void test167() {
        int result = analysis.simple.ControlFlowSimple.foo(570697729,2013749921,1408430080);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test168() {
        int result = analysis.simple.ControlFlowSimple.foo(39847937,33924095,132861952);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test169() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483132,2147483644,0);

        // perform assertions
        assertEquals(-484, result);

    }

    @Test
    public void test170() {
        int result = analysis.simple.ControlFlowSimple.foo(1225787392,1073750530,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test171() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483523,2147483393,0);

        // perform assertions
        assertEquals(-355, result);

    }

    @Test
    public void test172() {
        int result = analysis.simple.ControlFlowSimple.foo(1073873183,1778384925,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test173() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483586,2147483520,0);

        // perform assertions
        assertEquals(-264, result);

    }

    @Test
    public void test174() {
        int result = analysis.simple.ControlFlowSimple.foo(1098944514,1711276032,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test175() {
        int result = analysis.simple.ControlFlowSimple.foo(138,2147483582,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test176() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483461,2147483429,0);

        // perform assertions
        assertEquals(-447, result);

    }

    @Test
    public void test177() {
        int result = analysis.simple.ControlFlowSimple.foo(137,2147483583,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test178() {
        int result = analysis.simple.ControlFlowSimple.foo(25,2147483639,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test179() {
        int result = analysis.simple.ControlFlowSimple.foo(1780899832,1041866755,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test180() {
        int result = analysis.simple.ControlFlowSimple.foo(25,2147483639,2147483639);

        // perform assertions
        assertEquals(33, result);

    }

    @Test
    public void test181() {
        int result = analysis.simple.ControlFlowSimple.foo(1344,2147482368,2147482368);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test182() {
        int result = analysis.simple.ControlFlowSimple.foo(1024,2147483392,2147483392);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test183() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741826,1610612736,1610612736);

        // perform assertions
        assertEquals(80, result);

    }

    @Test
    public void test184() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741826,1073741824,1073741824);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test185() {
        int result = analysis.simple.ControlFlowSimple.foo(1342177282,1610612736,1610612736);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test186() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368384,-612368255);

        // perform assertions
        assertEquals(311, result);

    }

    @Test
    public void test187() {
        int result = analysis.simple.ControlFlowSimple.foo(129,545259520,-612368255);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test188() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368384,-610271103);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test189() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368384,-612368256);

        // perform assertions
        assertEquals(301, result);

    }

    @Test
    public void test190() {
        int result = analysis.simple.ControlFlowSimple.foo(129,545259520,-612368256);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test191() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368384,-610271104);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test192() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368385,-612368255);

        // perform assertions
        assertEquals(202, result);

    }

    @Test
    public void test193() {
        int result = analysis.simple.ControlFlowSimple.foo(129,545259521,-612368255);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test194() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368385,-610271103);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test195() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368385,-612368256);

        // perform assertions
        assertEquals(236, result);

    }

    @Test
    public void test196() {
        int result = analysis.simple.ControlFlowSimple.foo(129,545259521,-612368256);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test197() {
        int result = analysis.simple.ControlFlowSimple.foo(129,612368385,-610271104);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test198() {
        int result = analysis.simple.ControlFlowSimple.foo(268435459,857735168,-1126170623);

        // perform assertions
        assertEquals(66, result);

    }

    @Test
    public void test199() {
        int result = analysis.simple.ControlFlowSimple.foo(528513,1955340289,1539330176);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test200() {
        int result = analysis.simple.ControlFlowSimple.foo(129,880803841,-610271104);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test201() {
        int result = analysis.simple.ControlFlowSimple.foo(128,612368384,-612368256);

        // perform assertions
        assertEquals(313, result);

    }

    @Test
    public void test202() {
        int result = analysis.simple.ControlFlowSimple.foo(2098186,1409286273,736100480);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test203() {
        int result = analysis.simple.ControlFlowSimple.foo(2097162,1946157057,-1411383168);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test204() {
        int result = analysis.simple.ControlFlowSimple.foo(128,612368385,-612368255);

        // perform assertions
        assertEquals(302, result);

    }

    @Test
    public void test205() {
        int result = analysis.simple.ControlFlowSimple.foo(128,545259521,-612368255);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test206() {
        int result = analysis.simple.ControlFlowSimple.foo(128,612368385,-610271103);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test207() {
        int result = analysis.simple.ControlFlowSimple.foo(128,612368385,-612368256);

        // perform assertions
        assertEquals(204, result);

    }

    @Test
    public void test208() {
        int result = analysis.simple.ControlFlowSimple.foo(128,545259521,-612368256);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test209() {
        int result = analysis.simple.ControlFlowSimple.foo(128,612368385,-610271104);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test210() {
        int result = analysis.simple.ControlFlowSimple.foo(128,612368384,-612368255);

        // perform assertions
        assertEquals(235, result);

    }

    @Test
    public void test211() {
        int result = analysis.simple.ControlFlowSimple.foo(128,545259520,-612368255);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test212() {
        int result = analysis.simple.ControlFlowSimple.foo(128,612368384,-610271103);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test213() {
        int result = analysis.simple.ControlFlowSimple.foo(2097162,1409286144,-1411383168);

        // perform assertions
        assertEquals(248, result);

    }

    @Test
    public void test214() {
        int result = analysis.simple.ControlFlowSimple.foo(738198136,805305411,-1946157055);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test215() {
        int result = analysis.simple.ControlFlowSimple.foo(1342177282,1610612736,-2147483648);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test216() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108482,-2113278280,705169410);

        // perform assertions
        assertEquals(-456, result);

    }

    @Test
    public void test217() {
        int result = analysis.simple.ControlFlowSimple.foo(1406011328,-837685239,1912604738);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test218() {
        int result = analysis.simple.ControlFlowSimple.foo(1406011328,-1674448887,805308482);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test219() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108483,-2113278280,705169410);

        // perform assertions
        assertEquals(-466, result);

    }

    @Test
    public void test220() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108483,-2113278328,705169410);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test221() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108483,-2109084024,705169410);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test222() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108482,-2113277407,705169410);

        // perform assertions
        assertEquals(307, result);

    }

    @Test
    public void test223() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108482,-2113278327,705169410);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test224() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108482,-2109084023,705169410);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test225() {
        int result = analysis.simple.ControlFlowSimple.foo(1408108483,-2113277407,705169410);

        // perform assertions
        assertEquals(341, result);

    }

    @Test
    public void test226() {
        int result = analysis.simple.ControlFlowSimple.foo(1408116675,-1613633480,-1941962752);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test227() {
        int result = analysis.simple.ControlFlowSimple.foo(1408116675,-1613665240,-1941962752);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test228() {
        int result = analysis.simple.ControlFlowSimple.foo(1406011329,-63836160,-1342175166);

        // perform assertions
        assertEquals(-60, result);

    }

    @Test
    public void test229() {
        int result = analysis.simple.ControlFlowSimple.foo(1409157057,-2147483648,-1342175166);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test230() {
        int result = analysis.simple.ControlFlowSimple.foo(1406011329,-600707064,805308482);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test231() {
        int result = analysis.simple.ControlFlowSimple.foo(32,0,36);

        // perform assertions
        assertEquals(95, result);

    }

    @Test
    public void test232() {
        int result = analysis.simple.ControlFlowSimple.foo(134217728,0,2013265924);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test233() {
        int result = analysis.simple.ControlFlowSimple.foo(134217728,0,524288);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test234() {
        int result = analysis.simple.ControlFlowSimple.foo(32,0,3);

        // perform assertions
        assertEquals(57, result);

    }

    @Test
    public void test235() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741856,0,1073741827);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test236() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741856,0,411041795);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test237() {
        int result = analysis.simple.ControlFlowSimple.foo(6,0,4);

        // perform assertions
        assertEquals(-73, result);

    }

    @Test
    public void test238() {
        int result = analysis.simple.ControlFlowSimple.foo(1455770646,0,960148484);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test239() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741856,0,5522982);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test240() {
        int result = analysis.simple.ControlFlowSimple.foo(19,0,16);

        // perform assertions
        assertEquals(-7, result);

    }

    @Test
    public void test241() {
        int result = analysis.simple.ControlFlowSimple.foo(1342177283,0,939524096);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test242() {
        int result = analysis.simple.ControlFlowSimple.foo(67108867,0,33554432);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test243() {
        int result = analysis.simple.ControlFlowSimple.foo(13,0,16);

        // perform assertions
        assertEquals(69, result);

    }

    @Test
    public void test244() {
        int result = analysis.simple.ControlFlowSimple.foo(541065729,0,1606434308);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test245() {
        int result = analysis.simple.ControlFlowSimple.foo(536871425,0,1602240004);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test246() {
        int result = analysis.simple.ControlFlowSimple.foo(536870912,0,-536870396);

        // perform assertions
        assertEquals(440, result);

    }

    @Test
    public void test247() {
        int result = analysis.simple.ControlFlowSimple.foo(4,0,-536870396);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test248() {
        int result = analysis.simple.ControlFlowSimple.foo(536871168,0,-536870396);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test249() {
        int result = analysis.simple.ControlFlowSimple.foo(536870913,0,-536870396);

        // perform assertions
        assertEquals(430, result);

    }

    @Test
    public void test250() {
        int result = analysis.simple.ControlFlowSimple.foo(536871425,0,-545243644);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test251() {
        int result = analysis.simple.ControlFlowSimple.foo(536871169,0,-536870396);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test252() {
        int result = analysis.simple.ControlFlowSimple.foo(536870918,0,-536870396);

        // perform assertions
        assertEquals(336, result);

    }

    @Test
    public void test253() {
        int result = analysis.simple.ControlFlowSimple.foo(6,0,-536870396);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test254() {
        int result = analysis.simple.ControlFlowSimple.foo(536871174,0,-536870396);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test255() {
        int result = analysis.simple.ControlFlowSimple.foo(536870919,0,-536870396);

        // perform assertions
        assertEquals(370, result);

    }

    @Test
    public void test256() {
        int result = analysis.simple.ControlFlowSimple.foo(7,0,-536870396);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test257() {
        int result = analysis.simple.ControlFlowSimple.foo(536871175,0,-536870396);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test258() {
        int result = analysis.simple.ControlFlowSimple.foo(1124386821,0,-1124386810);

        // perform assertions
        assertEquals(-60, result);

    }

    @Test
    public void test259() {
        int result = analysis.simple.ControlFlowSimple.foo(1090519041,0,-2114842622);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test260() {
        int result = analysis.simple.ControlFlowSimple.foo(1409157057,0,-1342175166);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test261() {
        int result = analysis.simple.ControlFlowSimple.foo(8388608,-8388608,0);

        // perform assertions
        assertEquals(-68, result);

    }

    @Test
    public void test262() {
        int result = analysis.simple.ControlFlowSimple.foo(16384,-2147483648,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test263() {
        int result = analysis.simple.ControlFlowSimple.foo(12,-2147483648,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test264() {
        int result = analysis.simple.ControlFlowSimple.foo(13,-6,0);

        // perform assertions
        assertEquals(-72, result);

    }

    @Test
    public void test265() {
        int result = analysis.simple.ControlFlowSimple.foo(13,-2130706432,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test266() {
        int result = analysis.simple.ControlFlowSimple.foo(13,-2147483648,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test267() {
        int result = analysis.simple.ControlFlowSimple.foo(12,-5,0);

        // perform assertions
        assertEquals(-171, result);

    }

    @Test
    public void test268() {
        int result = analysis.simple.ControlFlowSimple.foo(32505004,-1106247669,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test269() {
        int result = analysis.simple.ControlFlowSimple.foo(602930348,-300941301,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test270() {
        int result = analysis.simple.ControlFlowSimple.foo(65,-31,0);

        // perform assertions
        assertEquals(-111, result);

    }

    @Test
    public void test271() {
        int result = analysis.simple.ControlFlowSimple.foo(268435459,-2146959360,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test272() {
        int result = analysis.simple.ControlFlowSimple.foo(13,-2147483643,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test273() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741440,-1073741767,0);

        // perform assertions
        assertEquals(-498, result);

    }

    @Test
    public void test274() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741440,-1073741761,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test275() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483604,-1073741803,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test276() {
        int result = analysis.simple.ControlFlowSimple.foo(128,0,0);

        // perform assertions
        assertEquals(163, result);

    }

    @Test
    public void test277() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483616,0,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test278() {
        int result = analysis.simple.ControlFlowSimple.foo(1073741440,0,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test279() {
        int result = analysis.simple.ControlFlowSimple.foo(353,0,0);

        // perform assertions
        assertEquals(377, result);

    }

    @Test
    public void test280() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483633,0,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test281() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483617,0,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test282() {
        int result = analysis.simple.ControlFlowSimple.foo(50,0,0);

        // perform assertions
        assertEquals(-25, result);

    }

    @Test
    public void test283() {
        int result = analysis.simple.ControlFlowSimple.foo(2147483634,0,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test284() {
        int result = analysis.simple.ControlFlowSimple.foo(51,0,0);

        // perform assertions
        assertEquals(9, result);

    }

    @Test
    public void test285() {
        int result = analysis.simple.ControlFlowSimple.foo(134217779,0,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test286() {
        int result = analysis.simple.ControlFlowSimple.foo(4,-32,0);

        // perform assertions
        assertEquals(8, result);

    }

    @Test
    public void test287() {
        int result = analysis.simple.ControlFlowSimple.foo(4,-1073741824,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test288() {
        int result = analysis.simple.ControlFlowSimple.foo(1,-2139095040,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test289() {
        int result = analysis.simple.ControlFlowSimple.foo(8,-1073741831,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test290() {
        int result = analysis.simple.ControlFlowSimple.foo(2,-2147483584,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test291() {
        int result = analysis.simple.ControlFlowSimple.foo(7,-2147483402,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test292() {
        int result = analysis.simple.ControlFlowSimple.foo(7,-2147483640,0);

        // perform assertions
        assertEquals(500, result);

    }

    @Test
    public void test293() {
        int result = analysis.simple.ControlFlowSimple.foo(2,-2,0);

        // perform assertions
        assertEquals(89, result);

    }

    @Test
    public void test294() {
        int result = analysis.simple.ControlFlowSimple.foo(4,-134217731,0);

        // perform assertions
        assertEquals(-500, result);

    }

    @Test
    public void test295() {
        int result = analysis.simple.ControlFlowSimple.foo(5,0,0);

        // perform assertions
        assertEquals(49, result);

    }

    @Test
    public void test296() {
        int result = analysis.simple.ControlFlowSimple.foo(7,0,0);

        // perform assertions
        assertEquals(-15, result);

    }

    @Test
    public void test297() {
        int result = analysis.simple.ControlFlowSimple.foo(5,-3,0);

        // perform assertions
        assertEquals(66, result);

    }

    @Test
    public void test298() {
        int result = analysis.simple.ControlFlowSimple.foo(8,0,0);

        // perform assertions
        assertEquals(65, result);

    }

    @Test
    public void test299() {
        int result = analysis.simple.ControlFlowSimple.foo(2,0,0);

        // perform assertions
        assertEquals(-51, result);

    }

    @Test
    public void test300() {
        int result = analysis.simple.ControlFlowSimple.foo(4,-3,0);

        // perform assertions
        assertEquals(67, result);

    }

}

