package com.by.service;

import com.by.entity.TZtree;
import java.util.List;

/**
 * (TZtree)表服务接口
 *
 * @author makejava
 * @since 2019-12-05 10:14:52
 */
public interface TZtreeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TZtree queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TZtree> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tZtree 实例对象
     * @return 实例对象
     */
    TZtree insert(TZtree tZtree);

    /**
     * 修改数据
     *
     * @param tZtree 实例对象
     * @return 实例对象
     */
    TZtree update(TZtree tZtree);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}