package com.mcmaintank.androidapp.mapper;

import com.mcmaintank.androidapp.model.Geocache;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author MCMainTank
 * @version 1.0
 * @date 2022-01-9 21:11
 */
public interface GeocacheMapper {


    @Insert("insert into t_geocache_info(geocache_latitudes,geocache_longitudes,geocache_location_description,pid,deleted,geocache_date_of_upload,) " +
            "values(#{geocacheLatitudes},#{geocacheLongitudes},#{geocacheLocationDescription},#{pid},#{deleted},#{geocacheDateOfUpload})")
    int insertGeocache(Geocache geocache);

    @Select("select * from t_geocache_info where geocache_id = #{geocacheId}")
    Geocache selectGeocacheById(@Param("geocahceId")Long geocacheId);


}
