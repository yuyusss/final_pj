package com.project.board.service;

import com.project.board.dao.IMediaDAO;
import com.project.board.model.MediaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MediaService implements IMediaService{
    @Autowired
    @Qualifier("IMediaDAO")
    IMediaDAO dao;

    @Override
    public ArrayList<MediaVO> listAllMedia() {
        return dao.listAllMedia();
    }
}
