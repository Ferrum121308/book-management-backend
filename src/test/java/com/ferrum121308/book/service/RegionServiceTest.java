package com.ferrum121308.book.service;

import com.ferrum121308.book.entity.model.Region;
import com.ferrum121308.book.entity.model.common.Constants;
import com.ferrum121308.book.mapper.RegionMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class RegionServiceTest {

    @Autowired
    private RegionMapper regionMapper;

    @Test
    void testList(){
        List<Region> regions = regionMapper.selectList(null);
        if (!regions.isEmpty()) {
            for (Region region : regions) {
                log.debug(Constants.DEBUG_LOG_START + "类别：{}", region);
            }
        }
    }

    @Test
    void testInsert(){
        Region region = new Region();
        region.setRegionName("测试插入");
        region.setRegionCode("test-insert");
        regionMapper.insert(region);
    }

    @Test
    void testUpdate(){
        Region region = new Region();
        region.setRegionId(1607061397035888641L);
        region.setRegionName("测试修改");
        region.setRegionCode("test-update");
        regionMapper.updateById(region);
    }

    @Test
    void testDelete(){
        Region region = new Region();
        region.setRegionId(1607061397035888641L);
        regionMapper.deleteById(region);
    }

}