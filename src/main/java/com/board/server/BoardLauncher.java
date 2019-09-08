package com.board.server;

import com.board.dao.BoardDao;
import com.board.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardLauncher {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BoardDao dao = context.getBean(BoardDao.class);

        int count = dao.countBooks();
		System.out.println(count);

		context.close();
    }
}
