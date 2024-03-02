package Main;


import Dao.ProductDAOImpl;
import Entity.Product;

public class TestInsert {
	public static void main(String[] args) {
		Product p = new Product();
		p.setMaSP("P0006");
		p.setTenSanPham("Tủ lạnh SHARP");
		p.setAnhSanPham("P0006.jpg");
		p.setSoLuong(500);
		p.setDonGia(5990000d);
		p.setTrangThai(true);
		
		boolean flag = new ProductDAOImpl().insertProduct(p);
		if(flag == true) {
			System.out.printf("Thêm mới thành công !!!");
		}else {
			System.out.printf("Xảy ra lỗi khi thêm mới sản phẩm :))");
		}
	}
}
