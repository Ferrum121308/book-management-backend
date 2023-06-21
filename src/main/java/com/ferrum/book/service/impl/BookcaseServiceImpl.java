package com.ferrum.book.service.impl;

import com.ferrum.book.entity.Bookcase;
import com.ferrum.book.mapper.BookcaseMapper;
import com.ferrum.book.service.IBookcaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 书柜 服务实现类
 * </p>
 *
 * @author th
 * @since 2023-06-21
 */
@Service
public class BookcaseServiceImpl extends ServiceImpl<BookcaseMapper, Bookcase> implements IBookcaseService {

}
