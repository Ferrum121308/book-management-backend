package com.ferrum.book.service.impl;

import com.ferrum.book.entity.Book;
import com.ferrum.book.mapper.BookMapper;
import com.ferrum.book.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 书籍 服务实现类
 * </p>
 *
 * @author th
 * @since 2023-06-21
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
