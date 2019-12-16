package com.by.service.impl;

import com.by.entity.TZtree;
import com.by.dao.TZtreeDao;
import com.by.service.TZtreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TZtree)表服务实现类
 *
 * @author makejava
 * @since 2019-12-05 10:14:52
 */
@Service("tZtreeService")
public class TZtreeServiceImpl implements TZtreeService {
    @Resource
    private TZtreeDao tZtreeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TZtree queryById(Integer id) {
        return this.tZtreeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TZtree> queryAllByLimit(int offset, int limit) {
        return this.tZtreeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tZtree 实例对象
     * @return 实例对象
     */
    @Override
    public TZtree insert(TZtree tZtree) {
        this.tZtreeDao.insert(tZtree);
        return tZtree;
    }

    /**
     * 修改数据
     *
     * @param tZtree 实例对象
     * @return 实例对象
     */
    @Override
    public TZtree update(TZtree tZtree) {
        this.tZtreeDao.update(tZtree);
        return this.queryById(tZtree.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tZtreeDao.deleteById(id) > 0;
    }
}