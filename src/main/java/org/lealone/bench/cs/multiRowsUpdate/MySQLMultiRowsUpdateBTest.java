/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.bench.cs.multiRowsUpdate;

import java.sql.Connection;

public class MySQLMultiRowsUpdateBTest extends MultiRowsUpdateBTest {

    public static void main(String[] args) throws Throwable {
        new MySQLMultiRowsUpdateBTest().run();
    }

    @Override
    public Connection getConnection() throws Exception {
        return getMySQLConnection();
    }
}
