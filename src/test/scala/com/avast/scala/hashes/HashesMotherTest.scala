package com.avast.scala.hashes

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HashesMotherTest extends FlatSpec with Matchers {
  it should "generate random sha256" in {
    val first = HashesMother.randomSha256()
    val second = HashesMother.randomSha256()

    first should not be second
  }

  it should "generate random sha1" in {
    val first = HashesMother.randomSha1()
    val second = HashesMother.randomSha1()

    first should not be second
  }

  it should "generate random md5" in {
    val first = HashesMother.randomMd5()
    val second = HashesMother.randomMd5()

    first should not be second
  }
}
