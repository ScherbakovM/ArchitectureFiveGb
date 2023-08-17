public class Db implements Data{
    String getDataFromDb() {
        return "data from db";
    }

    @Override
    public String getData() {
         return getDataFromDb();
    }
}
