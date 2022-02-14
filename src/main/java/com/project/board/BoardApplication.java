package com.project.board;

import com.project.board.controller.CalendarController;
import com.project.board.dao.IMediaDAO;
import com.project.board.model.MediaVO;
import com.project.board.service.CalendarService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.project.board.dao.Board;
import com.project.board.dao.Reply;


@SpringBootApplication
@ComponentScan(basePackages = "com.project.board")
@MapperScan(basePackageClasses = Board.class)
@MapperScan(basePackageClasses = Reply.class)
@MapperScan(basePackages = "com.project.board")
@MapperScan(basePackageClasses = IMediaDAO.class)
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
