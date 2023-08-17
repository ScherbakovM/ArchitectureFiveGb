public class FileSystem implements Data {

    private String getDataFromFs() {
        return "data from fs";
    }

    @Override
    public String getData() {
        return getDataFromFs();
    }
}
