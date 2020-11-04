
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;

public class NguoiGuiTien implements Comparable<NguoiGuiTien> {

    private String ma;
    private String Hoten;
    private String Diachi;
    private String Sodienthoai;
    private Date Ngaysinh;

    public NguoiGuiTien() {
    }

    public NguoiGuiTien(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public NguoiGuiTien(String ma, String hoten, String diachi, String sodienthoai, Date ngaysinh) {
        this.ma = ma;
        Hoten = hoten;
        Diachi = diachi;
        Sodienthoai = sodienthoai;
        Ngaysinh = ngaysinh;
    }

    @Override
    public String toString() {
        return "NguoiGuiTien{"
                + "ma='" + ma + '\''
                + ", Hoten='" + Hoten + '\''
                + ", Diachi='" + Diachi + '\''
                + ", Sodienthoai='" + Sodienthoai + '\''
                + ", Ngaysinh=" + Ngaysinh
                + '}';
    }

    @Override
    public int compareTo(NguoiGuiTien o) {
        return this.ma.compareTo(o.ma);
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";
        String password = "361234";
        TreeMap<NguoiGuiTien, Double> ngtTreeMap = new TreeMap<>();
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from nguoiguitien");
            while (rs.next()) {
                {
                    NguoiGuiTien ngt
                            = new NguoiGuiTien(rs.getString(1), rs.getString(2),
                                    rs.getString(3), rs.getString(4),
                                    rs.getDate(5));
                    System.out.println(ngt);
                    ngtTreeMap.put(ngt, 0.0);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        NguoiGuiTien ngt = new NguoiGuiTien("B16DCCN070");
        if (ngtTreeMap.containsKey(ngt)) {
            ngtTreeMap.put(ngt, ngtTreeMap.get(ngt) + 1000.0);
        } else {
            ngtTreeMap.put(ngt, 0.0);
        }
        Set set = ngtTreeMap.keySet();
        for (Object key : set) {
            System.out.println(key + " " + ngtTreeMap.get(key));
        }
    }
}
