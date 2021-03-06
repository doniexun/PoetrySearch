package com.dong.web.service.impl;

import com.dong.web.dao.common.PoetryDao;
import com.dong.web.model.Poetry;
import com.dong.web.service.common.PoetryService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dchuan on 2016/3/14.
 */
@Transactional
public class PoetryServiceImpl implements PoetryService {

    // Fields

    private PoetryDao poetryDao;

    // Functions

    @Override
    public List<Poetry> getPoetriesByTitle(String title) {
        return poetryDao.getPoetryByTitle(title);
    }

    @Override
    public List<Poetry> getPoetriesByContent(String content) {
        return poetryDao.getPoetryByContent(content);
    }

    @Override
    public List<Poetry> getPoetriesByPoetName(String poetName) {
        return poetryDao.getPoetriesByPoetName(poetName);
    }

    @Override
    public List<Poetry> getPoetriesByTitleAndPoetName(String title, String name) {
        return poetryDao.getPoetryByTitleAndPoetName(title, name);
    }

    // Setters and getters

    public PoetryDao getPoetryDao() {
        return poetryDao;
    }

    public void setPoetryDao(PoetryDao poetryDao) {
        this.poetryDao = poetryDao;
    }
}
