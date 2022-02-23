package com.lamoroso.example

import com.linecorp.armeria.client.{Clients, WebClient}

object SimpleHttpClient {

  val a = Clients.builder("http://localhost:8080/stream/a").build(classOf[WebClient])
  val b = Clients.builder("http://localhost:8080/stream/b").build(classOf[WebClient])
  val c = Clients.builder("http://localhost:8080/stream/c").build(classOf[WebClient])

}
