package oct.ex_11102024.Tasks;

public class TestCaseAPI extends BaseTestAPI {
    TestCaseAPI(){
        super();
        System.out.println("TestcaseApi :called parent Constructor");
    }
    @Override
    public void performGET(){
        System.out.println("TestcaseApi : Overridden GET operation");
    }
    @Override
    public void performPOST(){
        System.out.println("TesCaseApi : Overidden POST operation");
    }
    @Override
    public void performPUT() {
        System.out.println("TestCaseApi : Overridden PUT operation");

    }
    @Override
    public void performPATCH(){
        System.out.println("TestCaseApi : Overidden PATCH operation");
    }
    @Override
    public void performDELETE(){
        System.out.println("TestCaseApi : Overridden DELETE operation");
    }
}
