public class HolyDayList {
    private HolyDay[] list;

    HolyDayList(HolyDay[] list) {
        this.list = list;
    }

    public void getAllHolydays() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName()+" => "+ list[i].getDate());
        }
    }

    public String getHolyDayByDate(String date) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getDate().equals(date)) {
                return list[i].getName();
            }
        }
        return "Não foi encontrado nenhum feriado";
    }

    public HolyDay[] getList() {
        return list;
    }
}
