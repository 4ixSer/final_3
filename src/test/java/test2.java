import com.DAO.factory.Factoty;
import com.entity.District;
import com.entity.Phone;
import com.entity.Sauna;
import com.entity.ServiceType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qny4i on 04.11.2016.
 */
public class test2 {

    public static void main(String[] args) {

        Sauna sauna1= new Sauna("Купель здоровья",250,8,4);
        sauna1.setAddress("ул. Пограничная, 12А");

        Factoty.getInstance().getSaunaDAO().createSauna(sauna1);

        District xoldDistrict =new District("Холодногорский");

//        sauna1.setDistrict(xoldDistrict); // программа еще не знает что сауна в дисткректе

        xoldDistrict.setSauna(sauna1);


        ServiceType type1 =new ServiceType("Руская");


        List<ServiceType> typeBySauna1 =  new ArrayList<>();
        typeBySauna1.add(type1);

        sauna1.setType(typeBySauna1);

        List<Sauna> saunaByType1 =  new ArrayList<>();
        saunaByType1.add(sauna1);

        type1.setSaunas(saunaByType1);

        Phone phone1 = new Phone("050-551-2555");
        phone1.setSauna(sauna1);
        Phone phone2 = new Phone("097-653-5455");
        phone2.setSauna(sauna1);

        List<Phone> phonesBySauna1 = new ArrayList<>();
        phonesBySauna1.add(phone1);
        phonesBySauna1.add(phone2);

        sauna1.setPhones(phonesBySauna1);

//        System.out.println(sauna1.getName());
//        System.out.println(sauna1.getPrice());
//        System.out.println(sauna1.getCapacity());
//        System.out.println(sauna1.getDistrict());
//        System.out.println(sauna1.getAddress());
//        System.out.println(sauna1.getType());
//        System.out.println(sauna1.getPhones());
//
//
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
//        System.out.println(xoldDistrict);
//        System.out.println(xoldDistrict.getSauna());


//
        Factoty.getInstance().getTypeDAO().createServiceType(type1);
        Factoty.getInstance().getDistrictDAO().createDistrict(xoldDistrict);    // но в БД мы уже запердолили
        Factoty.getInstance().getPhoneDAO().createPhone(phone1);
        Factoty.getInstance().getPhoneDAO().createPhone(phone2);


    }
}
