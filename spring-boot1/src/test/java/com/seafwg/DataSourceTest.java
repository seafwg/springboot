package com.seafwg;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class DataSourceTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSourceTest() {
        System.out.println("DataSource:"+dataSource);
    }
}
