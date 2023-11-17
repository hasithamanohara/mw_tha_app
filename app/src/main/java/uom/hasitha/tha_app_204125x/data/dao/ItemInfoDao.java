package uom.hasitha.tha_app_204125x.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import uom.hasitha.tha_app_204125x.data.entity.ItemInfo;

import java.util.List;

@Dao
public interface ItemInfoDao {
    @Insert
    void addItem(ItemInfo itemInfo);

    @Query("Select * from Item_Infor")
    LiveData<List<ItemInfo>> getAllItems();

    @Update
    void updateItem(ItemInfo itemInfo);

    @Delete
    void delete(ItemInfo itemInfo);

}
