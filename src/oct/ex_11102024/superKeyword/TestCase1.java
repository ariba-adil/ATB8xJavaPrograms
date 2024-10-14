package oct.ex_11102024.superKeyword;

public class TestCase1 extends BaseClass {

    TestCase1() {
        super();
        this.setBrowser("edge", true);// DC of parent
    }

    @Override
    public void setBrowser(String browser,boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
