package com.ferrum.book.controller;

import com.ferrum.book.entity.base.CommonResult;
import com.ferrum.book.entity.dto.BookDTO;
import com.ferrum.book.service.IBookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 书籍 前端控制器
 * </p>
 *
 * @author th
 * @since 2023-06-21
 */

@Slf4j
@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

	private final IBookService bookService;

	@GetMapping("/{id}")
	public CommonResult<BookDTO> getBookDetail(@NotBlank @PathVariable("id") String id) {
		return CommonResult.success();
	}

}
