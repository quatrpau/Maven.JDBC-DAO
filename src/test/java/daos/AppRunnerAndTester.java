package daos;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AppRunnerAndTester {
    @Test
    public void findByIDTest() {
        VeggieDTO expected = new VeggieDTO(1,"Samuel",Type.SPINACH,Status.RIPE,"Smith");
        Assert.assertEquals(expected,(new VeggieDAO()).findById(1));
    }
    @Test
    public void findAllTest(){
        VeggieDTO one = new VeggieDTO(1,"Samuel",Type.SPINACH,Status.RIPE,"Smith");
        VeggieDTO two = new VeggieDTO(2,"Riley",Type.RUTABEGA,Status.RIPE,"Ramos");
        VeggieDTO three = new VeggieDTO(3,"Caylee",Type.CARROT,Status.RIPE,"Carter");
        VeggieDTO four = new VeggieDTO(4,"Bill",Type.BROCCOLI,Status.UNRIPE,"Burns");
        VeggieDTO five = new VeggieDTO(5,"Eduardo",Type.EGGPLANT,Status.ROTTEN,"Evans");
        List<VeggieDTO> expected = new LinkedList<>(Arrays.asList(one,two,three,four,five));
        Assert.assertEquals(expected,(new VeggieDAO()).findAll());

    }
    @Test
    public void updateTest(){
        VeggieDTO too = new VeggieDTO(2,"Ruby",Type.RUTABEGA,Status.RIPE,"Rathers");
        Assert.assertEquals(too,(new VeggieDAO()).update(too));
    }
    @Test
    public void createTest(){
        VeggieDTO six = new VeggieDTO(6,"Collin",Type.CAULIFLOWER,Status.UNRIPE,"Collier");
        Assert.assertEquals(six,(new VeggieDAO()).create(six));
    }
    @Test
    public void deleteTest(){
        VeggieDTO one = new VeggieDTO(1,"Samuel",Type.SPINACH,Status.RIPE,"Smith");
        VeggieDTO two = new VeggieDTO(2,"Riley",Type.RUTABEGA,Status.RIPE,"Ramos");
        VeggieDTO three = new VeggieDTO(3,"Caylee",Type.CARROT,Status.RIPE,"Carter");
        VeggieDTO four = new VeggieDTO(4,"Bill",Type.BROCCOLI,Status.UNRIPE,"Burns");
        VeggieDTO five = new VeggieDTO(5,"Eduardo",Type.EGGPLANT,Status.ROTTEN,"Evans");
        VeggieDTO six = new VeggieDTO(6,"Collin",Type.CAULIFLOWER,Status.UNRIPE,"Collier");
        List<VeggieDTO> expected = new LinkedList<>(Arrays.asList(one,two,three,four,five));
        VeggieDAO dao = new VeggieDAO();
        dao.create(six);
        dao.delete(12);
        Assert.assertEquals(expected,dao.findAll());
    }
    //test verified thru observation of sql database
}
