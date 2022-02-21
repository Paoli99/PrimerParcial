package ejercicio1;

public class DateUtils {
    public String nextDate(int day , String month, int year){
        String msg = "";
        int validData = 0;

        if (day <= 0 || day > 31){
            msg ="dia incorrecto";
            validData --;
        }

        if( year < 0){
            msg ="gestion incorrecto";
            validData --;
        }


        if((day <= 0 || day > 31) && year < 0){
            msg="ingresar nuevos datos";
        }

        if(validData >= 0){
            if(month.equals("enero")){
                if (day == 31){
                    msg = 1 + "febrero" + year;
                }
                else if(day >= 1 && day <= 30){
                    msg = day+1 + "enero" + year;
                }
            }

            else if(month.equals("febrero") ){
                if((year%4 ==0) && (year%100 !=0) || (year%4==0)){
                    if(day == 29){
                        msg = 1+ " marzo " + year;
                    }
                    else{
                        msg = day+1 + " febrero " + year;
                    }
                }
                else{
                    if(day == 28){
                        msg = 1 + " marzo " + year;
                    }
                    else{
                        msg = 1+day + " febrero " + year;
                    }
                }
            }

            else if(month.equals("marzo")){
                if (day == 31){
                    msg = 1 + "abril" + year;
                }
                else if(day >= 1 && day <= 30){
                    msg = day+1 + "marzo" + year;
                }
            }

            else if(month.equals("abril")){
                if (day == 30){
                    msg = 1 + "mayo" + year;
                }
                else if(day >= 1 && day <= 29){
                    msg = day+1 + "abril" + year;
                }
            }

            else if(month.equals("mayo")){
                if (day == 31){
                    msg = 1 + "junio" + year;
                }
                else if(day >= 1 && day <= 30){
                    msg = day+1 + " mayo " + year;
                }
            }

            else if(month.equals("junio")){
                if (day == 30){
                    msg = 1 + "julio" + year;
                }
                else if(day >= 1 && day <= 29){
                    msg = day+1 + "junio" + year;
                }
            }

            else if(month.equals("julio")){
                if (day == 31){
                    msg = 1 + "agosto" + year;
                }
                else if(day >= 1 && day <= 30){
                    msg = day+1 + "julio" + year;
                }
            }

            else if(month.equals("agosto")){
                if (day == 31){
                    msg = 1 + "septiembre" + year;
                }
                else if(day >= 1 && day <= 30){
                    msg = day+1 + "agosto" + year;
                }
            }

            else if(month.equals("septiembre")){
                if (day == 30){
                    msg = 1 + "octubre" + year;
                }
                else if(day >= 1 && day <= 29){
                    msg = day+1 + "septiembre" + year;
                }
            }

            else if(month.equals("octubre")){
                if (day == 31){
                    msg = 1 + "noviembre" + year;
                }
                else if(day >= 1 && day <= 30){
                    msg = day+1 + "octumbre" + year;
                }
            }

            else if(month.equals("noviembre")){
                if (day == 30){
                    msg = 1 + "diciembre" + year;
                }
                else if(day >= 1 && day <= 29){
                    msg = day+1 + "" + year;
                }
            }


            else if(month.equals("diciembre")){
                if (day == 31){
                    msg = 1 + "enero" + year+1;
                }
                else if(day >= 1 && day <= 30){
                    msg = day+1 + "" + year;
                }
            }

            else {
                msg = "mes incorrecto";
            }

        }

        else{
            return msg;
        }

        return msg;
    }
}
