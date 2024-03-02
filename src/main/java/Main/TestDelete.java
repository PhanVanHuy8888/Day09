package Main;

import Dao.ProductDAOImpl;

public class TestDelete {
	public static void main(String[] args) {
		boolean flag = new ProductDAOImpl().deleteProduct("P0005");
		if(flag == true) {
			System.out.printf("Đã xoá sản phẩm có mã P005  !!!");
		}else {
			System.out.printf("Sảy ra lỗi khi xoá sản phẩm :))");
		}
	}
}
