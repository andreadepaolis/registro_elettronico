package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class InputController {
    
        private static InputController inputController;
    
        private InputController() {
        }

        public static InputController getIstance(){
            if(inputController==null){
                inputController= new InputController();
            }
            return inputController;
        }


            public Date convertDate(String data) {

            System.out.println(data);
                data = data.replace('-','/');


                try{

                    Date d = new SimpleDateFormat("yyyy/MM/dd").parse(data);
                    System.out.println(d);


                    return d;

                }catch(ParseException ps){
                    ps.printStackTrace();
                    return null;
                }
    }
    public int StringToInt(String value){

        try {
            return Integer.parseInt(value);
        } catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    public Date generateDate(int day_index, int index, int year) {

        return new GregorianCalendar(year, index - 1, day_index).getTime();
    }


    public boolean checkInRange(int num, int min, int max){

        return num > min && num < max;
    }


    public Date converDate(String date) {
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");

        Date d = null;
        try {
            d = formatter1.parse(date);
            return d;
        } catch (ParseException e) {
            return null;
        }
    }

    public boolean checkInt(int voto) {

        return true;
    }

    public boolean checkDate(Date d) throws ParseException {
        String date1="01/08/2020";
        String date2 = "01/09/2019";
        Date end =new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        Date start = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
        return d.after(start) && d.before(end);
    }

}
