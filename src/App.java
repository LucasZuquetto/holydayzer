import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HolyDay[] holydays = new HolyDay[11];
        holydays[0] = new HolyDay("01/01/2023", "Confraternização mundial");
        holydays[1] = new HolyDay("21/02/2023", "Carnaval");
        holydays[2] = new HolyDay("17/04/2023", "Páscoa");
        holydays[3] = new HolyDay("21/04/2023", "Tiradentes");
        holydays[4] = new HolyDay("01/05/2023", "Dia do trabalho");
        holydays[5] = new HolyDay("08/06/2023", "Corpus Christi");
        holydays[6] = new HolyDay("07/09/2023", "Independência do Brasil");
        holydays[7] = new HolyDay("12/10/2023", "Nossa Senhora Aparecida");
        holydays[8] = new HolyDay("02/11/2023", "Finados");
        holydays[9] = new HolyDay("15/11/2023", "Proclamação da República");
        holydays[10] = new HolyDay("25/12/2023", "Natal");

        HolyDayList list = new HolyDayList(holydays);

        Scanner input = new Scanner(System.in);
        System.out.print(
                "Digite uma data para encontrar um feriado ou pressione enter para encontrar todos os feriados: ");
        String date = input.nextLine();
        input.close();

        if (date.length() == 0) {
            list.getAllHolydays();
        } else {
            System.out.println(list.getHolyDayByDate(date));
        }

    }
}
