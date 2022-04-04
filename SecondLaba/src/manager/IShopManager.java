package manager;

import java.util.List;
import model.ShoeInfo;

public interface IShopManager {
  List<ShoeInfo> sortByPrice();

  List<ShoeInfo> sortByModel();

  List<ShoeInfo> searchBySize(int size);
}
