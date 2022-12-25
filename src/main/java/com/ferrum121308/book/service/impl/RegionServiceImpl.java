package com.ferrum121308.book.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ferrum121308.book.entity.model.Region;
import com.ferrum121308.book.mapper.RegionMapper;
import com.ferrum121308.book.service.RegionService;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements RegionService {
}
