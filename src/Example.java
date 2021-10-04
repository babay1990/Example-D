import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        ArrayList<Market> marketList = new ArrayList<>();
        ArrayList<Billing> billingList = new ArrayList<>();
        ArrayList<Result> resultList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String[] array = text.split(" ");

        try{
            List<String> lines = Files.readAllLines(Paths.get(array[0]));
            for(int i = 1; i < lines.size(); i++){
                String[] str = lines.get(i).split(",");
                marketList.add(new Market(Integer.parseInt(str[0]), str[1]));
            }

            List<String> lines2 = Files.readAllLines(Paths.get(array[1]));
            for(int i = 1; i < lines2.size(); i++){
                String[] str = lines2.get(i).split(",");
                billingList.add(new Billing(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])));
            }

            for(int i = 0; i < marketList.size(); i ++){
                for(int j = 0; j < billingList.size(); j++){
                    if(marketList.get(i).getShop_id() == billingList.get(j).getShop_id()){
                        resultList.add(new Result(billingList.get(j).getOrder_id(), marketList.get(i).getShop_name(), billingList.get(j).getShop_id(),
                                billingList.get(j).getCost()));
                    }
                }
            }

            System.out.println("order_id,shop_name,shop_id,cost");
            for(Result result : resultList){
                System.out.println(result.getOrder_id() + "," + result.getShop_name() + "," + result.getShop_id() + "," + result.getCost());
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }




    }
}
