package com.panda.utils;

import com.panda.entity.PandaMongoTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PandaMongoDBUtilsTest {

    @Autowired
    private PandaMongoDBUtils pandaMongoDBUtils;

    @Test
    void saveTest() {
        PandaMongoTest pandaMongoTest = new PandaMongoTest();
        pandaMongoTest.setTestParam("芜湖");
        PandaMongoTest save = pandaMongoDBUtils.save(pandaMongoTest);
        System.out.println();
    }

    @Test
    void searchAllTest() {
        List<PandaMongoTest> pandaMongoTests =
                pandaMongoDBUtils.searchAll(PandaMongoTest.class);
        System.out.println();
    }

}
