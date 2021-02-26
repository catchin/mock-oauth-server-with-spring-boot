package com.example.demo

import no.nav.security.mock.oauth2.MockOAuth2Server
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	internal fun mockOauthServer() {
		val server = MockOAuth2Server()
		server.start()
        server.shutdown()
	}
}
