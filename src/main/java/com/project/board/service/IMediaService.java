package com.project.board.service;

import com.project.board.model.MediaVO;
import com.project.board.model.VoteVO;

import java.util.ArrayList;

public interface IMediaService {
    ArrayList<MediaVO> listAllMedia();

    /* 뮤지컬 배우 투표 */
    ArrayList<VoteVO> listAllActor();
}
