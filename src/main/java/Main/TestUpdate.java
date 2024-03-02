package Main;

import Dao.ProductDAOImpl;
import Entity.Product;

public class TestUpdate {
	public static void main(String[] args) {
		Product p = new ProductDAOImpl().getProductById("P0005");
		p.setMaSP("P0005");
		p.setTenSanPham("Kệ để giày hàn quốc");
		p.setAnhSanPham("P0005.jpg");
		p.setSoLuong(150);
		p.setDonGia(2990000d);
		
		boolean flag = new ProductDAOImpl().updateProduct(p);
		if(flag == true) {
			System.out.printf("Sửa đổi dữ liệu thành công !!!");
		}else {
			System.out.printf("Xảy ra lỗi khi sửa sản phẩm :))");
		}
		
	}
}
