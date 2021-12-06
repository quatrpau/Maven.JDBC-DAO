package daos;

import org.junit.Assert;
import org.junit.Test;

public class AppRunnerAndTester {
    @Test
    public void findByIDTest() {
        VeggieDTO expected = new VeggieDTO(1,"Samuel",Type.SPINACH,Status.RIPE,"Smith");
        Assert.assertEquals(expected,(new VeggieDAO()).findById(1));
    }
    public void findAllTest(){

    }
    public void updateTest(){

    }
    public void createTest(){

    }
    public void deleteTest(){

    }
}
