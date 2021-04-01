package br.unb.cic.oberon.interpreter

import java.nio.file.{Files, Paths}

import br.unb.cic.oberon.ast.{IntValue, RealValue, OberonModule}
import br.unb.cic.oberon.parser.ScalaParser
import org.scalatest.funsuite.AnyFunSuite

class WakaWaka extends AnyFunSuite{

  val interpreter = new Interpreter()

  interpreter.setTestEnvironment()

  ignore("Testing interpreter on simple real test program") {
    val path = Paths.get(getClass.getClassLoader.getResource("simple/simple11.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(30.toFloat))) // FOR TO x

  }
}