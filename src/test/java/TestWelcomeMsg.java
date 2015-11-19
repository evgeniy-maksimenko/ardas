import ardas.WelcomeMsg;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWelcomeMsg {

    @Test (expected = IllegalArgumentException.class)
    public void testGetMsgExc_1(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setAM_PM(2);
        msg.getMsg();
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetMsgExc_2(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setHOUR(13);
        msg.getMsg();
    }
    
    @Test
    public void testGetMsg1_0(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(0);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_1(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(1);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_2(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(2);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_3(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(3);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMs1_4(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(4);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_5(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(5);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_6(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(6);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good morning, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_7(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(7);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good morning, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_8(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(8);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good morning, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_9(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(9);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_10(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(10);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_11(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(11);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg1_12(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(12);
        msg.setAM_PM(0);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_12(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(0);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_13(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(1);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_14(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(2);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }


    @Test
    public void testGetMsg2_15(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(3);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_16(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(4);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_17(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(5);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_18(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(6);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good day, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_19(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(7);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good evening, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_20(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(8);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good evening, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_21(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(9);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good evening, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_22(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(10);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good evening, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_23(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(11);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }

    @Test
    public void testGetMsg2_24(){
        WelcomeMsg msg = new WelcomeMsg();
        msg.setLocal("en");
        msg.setHOUR(12);
        msg.setAM_PM(1);
        String Actual = msg.getMsg();
        String Expected = "Good night, World!";
        assertEquals(Expected,Actual);
    }
}