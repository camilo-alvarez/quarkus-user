package org.user;

import io.quarkus.test.junit.DisabledOnIntegrationTest;
import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
public class UserControllerIT extends UserControllerTest {
    // Execute the same tests but in packaged mode.
}
