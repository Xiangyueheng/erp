package com.accp.erp.xiangyueheng.biz;

import com.accp.erp.xiangyueheng.dao.depttabMapper;
import com.accp.erp.xiangyueheng.pojo.depttab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiangyueheng
 * @create 2019-08-28 23:04
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class depttabBiz {
    @Autowired
    private depttabMapper dao;
    public List<depttab> sel(){
       return dao.selectList(null);
    }
}
