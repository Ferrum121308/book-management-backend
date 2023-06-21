package com.ferrum.book.service.impl;

import com.ferrum.book.entity.Bookshelf;
import com.ferrum.book.mapper.BookshelfMapper;
import com.ferrum.book.service.IBookshelfService;
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
public class BookshelfServiceImpl extends ServiceImpl<BookshelfMapper, Bookshelf> implements IBookshelfService {

}
