/**
 * Copyright (c) 2009 lfinfo.com
 */
package com.lfinfo.test;

import com.ai.appframe2.common.ServiceManager;
import org.junit.runners.model.Statement;

/**
 * @author wzg
 *
 */
public class AppFrameRunBefores extends Statement {

    private final Statement beforeStatement;

    public AppFrameRunBefores(Statement before) {
        beforeStatement = before;
    }

    @Override
    public void evaluate() throws Throwable {
        // wzg 添加 基于appframe 框架的事务调用
        ServiceManager.getSession().startTransaction();
        beforeStatement.evaluate();
    }

}
