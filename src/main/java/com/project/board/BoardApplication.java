package com.project.board;


import com.project.board.controller.CalendarController;
import com.project.board.dao.IMediaDAO;
import com.project.board.dao.IMusicalDAO;
import com.project.board.model.MediaVO;
import com.project.board.service.CalendarService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.project.board.controller.BoardController;
import com.project.board.controller.IndexController;
import com.project.board.controller.detailPageController;
import com.project.board.dao.IBoardDAO;
import com.project.board.dao.ICalendarDAO;


@ComponentScan(basePackageClasses = BoardController.class)
@ComponentScan(basePackageClasses = IndexController.class)
@ComponentScan(basePackageClasses = detailPageController.class)
@ComponentScan(basePackageClasses = CalendarController.class)

@SpringBootApplication

@MapperScan(basePackageClasses = IBoardDAO.class)
@MapperScan(basePackageClasses = IMusicalDAO.class)
@MapperScan(basePackageClasses = ICalendarDAO.class)

@ComponentScan(basePackages = "com.project.board")

@MapperScan(basePackages = "com.project.board")
@MapperScan(basePackageClasses = IMediaDAO.class)
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
