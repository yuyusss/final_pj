package com.project.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.project.board.controller.BoardController;
import com.project.board.controller.IndexController;
import com.project.board.dao.IBoardDAO;


@ComponentScan(basePackageClasses = BoardController.class)
@ComponentScan(basePackageClasses = IndexController.class)


@SpringBootApplication
@MapperScan(basePackageClasses = IBoardDAO.class)
@MapperScan(basePackages = "com.project.board")
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
