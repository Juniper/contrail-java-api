/*
 *  * Copyright (c) 2013 Juniper Networks, Inc. All rights reserved.
 *   */
package net.juniper.contrail.api;

import net.juniper.contrail.api.ApiConnectorFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.log4j.Logger;

public class ContrailApiTest {
    public static ApiTestCommon _apiTest;
    private static final Logger s_logger =
        Logger.getLogger(ContrailApiTest.class);
        
    @Before
    public void setUp() throws Exception {

        if (_apiTest != null ) return;

        int  port = ApiTestCommon.findFreePort();
        ApiTestCommon.launchContrailServer(port);
        s_logger.debug("test api server launched <localhost" + ", " + port + ">");
        _apiTest = new ApiTestCommon(ApiConnectorFactory.build("localhost", port));
    }

    @After
    public void tearDown() throws Exception {
        _apiTest.tearDown();
    }

    @Test
    public void testNetwork() {
        _apiTest.testNetwork();
    }
   
    @Test
    public void testDeserializeReferenceList() {
        _apiTest.testDeserializeReferenceList();
    }

    @Test
    public void testAddressAllocation() {
        _apiTest.testAddressAllocation();
    }
}
