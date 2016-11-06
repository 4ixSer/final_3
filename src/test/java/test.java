import com.DAO.factory.Factoty;
import com.entity.District;
import com.entity.Sauna;
import com.sun.jnlp.ApiDialog;

import java.util.List;

/**
 * Created by qny4i on 04.11.2016.
 *
 * тест на выгрузку с базы данныъ
 */
public class test {

    public static void main(String[] args) {



        Factoty.getInstance().getPhoneDAO();

        Sauna sauna1 = Factoty.getInstance().getSaunaDAO().findSauna(1);
        List<Sauna> saunas = Factoty.getInstance().getSaunaDAO().findByName("Сауна");

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
