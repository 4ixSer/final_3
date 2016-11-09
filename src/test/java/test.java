import com.DAO.factory.Factoty;
import com.entity.District;
import com.entity.Sauna;
import com.sun.jnlp.ApiDialog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qny4i on 04.11.2016.
 *
 * тест на выгрузку с базы данныъ
 */
public class test {

    public static void main(String[] args) {

//        System.out.println("SELECt a from Sauna a  where price >=" +10 +" and price<=" +12+"\'");

        Factoty.getInstance().getPhoneDAO();

        List<String> newList = new ArrayList<>();
        newList.add("151");
        newList.add("198");
        newList.add("10");
        newList.add("15");


//
//
        List<Sauna> saunas = Factoty.getInstance().getSaunaDAO().findByCapacity(10,15);

        for (int i = 0; i <saunas.size() ; i++) {
            System.out.print("Название - "+saunas.get(i).getName());
            System.out.print(", цена = "+ saunas.get(i).getPrice());
            System.out.print(", вместимость = "+saunas.get(i).getCapacity());
            System.out.println(", расположенны на = "+ saunas.get(i).getAddress());
            System.out.println(saunas.get(i).getDistrict());
            System.out.println(saunas.get(i).getType());
            System.out.println(saunas.get(i).getPhones());
            System.out.println();
        }

        List<Sauna> saunas1 = Factoty.getInstance().getSaunaDAO().findByPrice(151,198);
        for (int i = 0; i <saunas1.size() ; i++) {
            System.out.print("Название - "+saunas1.get(i).getName());
            System.out.print(", цена = "+ saunas1.get(i).getPrice());
            System.out.print(", вместимость = "+saunas1.get(i).getCapacity());
            System.out.println(", расположенны на = "+ saunas1.get(i).getAddress());
            System.out.println(saunas1.get(i).getDistrict());
            System.out.println(saunas1.get(i).getType());
            System.out.println(saunas1.get(i).getPhones());
            System.out.println();
        }

        List<Sauna> saunas2 = Factoty.getInstance().getSaunaDAO().findByAll(newList);
        for (int i = 0; i <saunas2.size() ; i++) {
            System.out.print("Название - "+saunas2.get(i).getName());
            System.out.print(", цена = "+ saunas2.get(i).getPrice());
            System.out.print(", вместимость = "+saunas2.get(i).getCapacity());
            System.out.println(", расположенны на = "+ saunas2.get(i).getAddress());
            System.out.println(saunas2.get(i).getDistrict());
            System.out.println(saunas2.get(i).getType());
            System.out.println(saunas2.get(i).getPhones());
            System.out.println();
        }


//        Factoty.getInstance().getSaunaDAO().changeSaunaName(1, "«Купель здоровья»");

//        Sauna sauna = Factoty.getInstance().getSaunaDAO().findSauna(1);
//
//        System.out.println(sauna.getName());
//        System.out.println(sauna.getPrice());
//        System.out.println(sauna.getCapacity());
//        System.out.println(sauna.getDistrict());
//        System.out.println(sauna.getAddress());
//        System.out.println(sauna.getType());
//        System.out.println(sauna.getPhones());

//        District district = Factoty.getInstance().getDistrictDAO().findDistrict(2);

//        System.out.println(phone1);
//        System.out.println(phone1.getSauna());
//
//        System.out.println(phone2);
//        System.out.println(phone2.getSauna());
//
//
//        System.out.println(type1);
//        System.out.println(type1.getSaunas());
//
//        System.out.println(district);
//        System.out.println(district.getSauna());
    }
}
