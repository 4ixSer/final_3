import com.DAO.factory.Factoty;
import com.entity.District;
import com.entity.Sauna;
import com.sun.jnlp.ApiDialog;

/**
 * Created by qny4i on 04.11.2016.
 *
 * тест на выгрузку с базы данныъ
 */
public class test {

    public static void main(String[] args) {
        Sauna sauna1 = Factoty.getInstance().getSaunaDAO().findSauna(1);

        System.out.println(sauna1.getName());
        System.out.println(sauna1.getPrice());
        System.out.println(sauna1.getCapacity());
        System.out.println(sauna1.getDistrict());
        System.out.println(sauna1.getAddress());
        System.out.println(sauna1.getType());
        System.out.println(sauna1.getPhones());


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
