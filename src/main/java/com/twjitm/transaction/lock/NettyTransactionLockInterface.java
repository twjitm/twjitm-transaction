package com.twjitm.transaction.lock;


import com.twjitm.transaction.transaction.exception.NettyTransactionException;

/**
 * 事务锁接口
 * <p>
 *     本类面向的是锁。主要是为事物实体提供原子操作
 *     利用redis 的原子操作实现分布式事物锁，
 *     该抽象接口定义了锁的基本操作。
 * </p>
 */
public interface NettyTransactionLockInterface {
    /**
     * 销毁
     */
     void destroy();

    /**
     * 创建
     * @return
     */
     boolean create(long seconds)  throws NettyTransactionException;

    /**
     * 获取信息
     * @return
     */
     String getInfo();

    /**
     * 设置内容
     */
     void setContent(String lockContent);

}

