package oct.ex_11102024.Tasks;

public class BaseTestAPI {
    private String name;
    private  int id;
    BaseTestAPI(){
        System.out.println("BestTestApi : Default Constructor");
    }
    BaseTestAPI(String name, int id){
        this.name=name;
        this.id=id;
        System.out.println("baseTestApi : Parameterized Constructor");
    }
    public String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }
        else {
            System.out.println("BetaTestApi : Please enter a valid id");
        }
    }
    public void performGET(){
        System.out.println("BaseTestApi :Performing GET operation");
    }
    public void performPOST(){
        System.out.println("BaseTestApi : Performing POST operation");
    }
    public void performPUT(){
        System.out.println("BaseTestApi : Performing PUT operation");
    }
    public void performPATCH(){
        System.out.println("BaseTestApi : Performing PATCH operation");
    }
    public void performDELETE(){
        System.out.println("BaseTestApi : Performing DELETE operation");
    }
}
