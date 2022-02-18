package com.project.board;


import com.project.board.controller.CalendarController;
import com.project.board.dao.IMediaDAO;
import com.project.board.model.MediaVO;
import com.project.board.service.CalendarService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.project.board.controller.BoardController;
import com.project.board.controller.BoardController2;
import com.project.board.controller.BoardController3;
import com.project.board.controller.IndexController;
import com.project.board.controller.RankController;
import com.project.board.dao.IBoardDAO;
import com.project.board.dao.IBoardDAO2;
import com.project.board.dao.IBoardDAO3;


@ComponentScan(basePackageClasses = BoardController.class)
@ComponentScan(basePackageClasses = BoardController2.class)
@ComponentScan(basePackageClasses = BoardController3.class)
@ComponentScan(basePackageClasses = IndexController.class)
@ComponentScan(basePackageClasses = RankController.class)


@SpringBootApplication

@MapperScan(basePackageClasses = IBoardDAO.class)
@MapperScan(basePackageClasses = IBoardDAO2.class)
@MapperScan(basePackageClasses = IBoardDAO3.class)

@ComponentScan(basePackages = "com.project.board")
//@MapperScan(basePackageClasses = Board.class)
//@MapperScan(basePackageClasses = Reply.class)

@MapperScan(basePackages = "com.project.board")
@MapperScan(basePackageClasses = IMediaDAO.class)
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
