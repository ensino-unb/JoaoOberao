package br.unb.cic.oberon.interpreter

import java.nio.file.{Files, Paths}

import br.unb.cic.oberon.ast.{IntValue, RealValue, LongValue, ShortValue, LongRealValue, OberonModule}
import br.unb.cic.oberon.parser.ScalaParser
import org.scalatest.funsuite.AnyFunSuite

class WakaWaka extends AnyFunSuite{

  val interpreter = new Interpreter()

  interpreter.setTestEnvironment()

  test("Testing LONG and SHORT operations") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic1.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongValue(5000.toLong))) // FOR TO x
  }

  test("Testing LONGREAL and REAL +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic2.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(26.00000000000005.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and REAL -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic3.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(-0.04999999999995.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and REAL *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic4.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(175.500000000000675.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and REAL /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic5.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(0.96296296296296666666666666666667.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL LONGREAL +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic6.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(27.105294.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and SHORTINT /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic7.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(67.763235.toDouble))) // FOR TO x
  }

  test("Testing LONGINT and SHORTINT /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic8.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongValue(20L))) // FOR TO x
  }

  test("Testing LONGREAL and INTEGER +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic9.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(15.00000000000005))) // FOR TO x
  }

  test("Testing LONGREAL and INTEGER -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic10.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(5.00000000000005))) // FOR TO x
  }

  test("Testing LONGREAL and INTEGER *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic11.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(50.00000000000025))) // FOR TO x
  }

  test("Testing LONGREAL and INTEGER /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic12.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(2.00000000000001))) // FOR TO x
  }

  test("Testing REAL and INTEGER * -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic13.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(3582.25.toFloat))) // FOR TO x
  }

  test("Testing REAL and INTEGER / +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic14.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(80.25.toFloat))) // FOR TO x
  }

  test("Testing SHORT and SHORT operations") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic15.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(ShortValue(190.toShort))) // FOR TO x
  }

  test("Testing LONG and LONG +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic16.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongValue(4446744073709551614L))) // FOR TO x
  }

  test("Testing LONG and LONG -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic17.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(0.toLong))) // FOR TO x
  }

  test("Testing LONG and LONG *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic18.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongValue(4446744073709551614L))) // FOR TO x
  }

  test("Testing LONG and LONG /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic19.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(1.toLong))) // FOR TO x
  }

  test("Testing LONGINT and INTEGER operations") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic20.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(1000000.toLong))) // FOR TO x
  }

  test("Testing INTEGER and INTEGER +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic21.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(15))) // FOR TO x
  }

  test("Testing INTEGER and INTEGER -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic22.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(5))) // FOR TO x
  }

  test("Testing INTEGER and INTEGER *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic23.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(50))) // FOR TO x
  }

  test("Testing INTEGER and INTEGER /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic24.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(2))) // FOR TO x
  }

  test("Testing INTEGER and INTEGER / with division rem") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic25.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(2))) // FOR TO x
  }

  test("Testing REAL and REAL +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic26.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(17.7F))) // FOR TO x
  }

  test("Testing REAL and REAL -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic27.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(12.7F))) // FOR TO x
  }

  test("Testing REAL and REAL *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic28.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(38F))) // FOR TO x
  }

  test("Testing REAL and REAL /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic29.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(6.08F))) // FOR TO x
  }
}