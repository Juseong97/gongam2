public interface Common {
    public String reservation(String bookNm, int bCode, String userInfo);
    public void check(String bookNm);
    public void rental(String bCode, String userInfo);

}
