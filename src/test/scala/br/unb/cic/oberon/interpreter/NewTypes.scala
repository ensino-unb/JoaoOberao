package br.unb.cic.oberon.interpreter

import java.nio.file.{Files, Paths}

import br.unb.cic.oberon.ast.{IntValue, RealValue, LongValue, ShortValue, LongRealValue, OberonModule, Value}
import br.unb.cic.oberon.parser.ScalaParser
import org.scalatest.funsuite.AnyFunSuite

class WakaWaka extends AnyFunSuite{

  val interpreter = new Interpreter()

  interpreter.setTestEnvironment()

  test("Testing a lot of assignments") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic0.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("b") == Some(IntValue(2.toInt))) // FOR TO x
    assert(interpreter.env.lookup("h") == Some(IntValue(8.toInt))) // FOR TO x
    assert(interpreter.env.lookup("n") == Some(IntValue(14.toInt))) // FOR TO x
    assert(interpreter.env.lookup("y") == Some(IntValue(24.toInt))) // FOR TO x

    assert(interpreter.env.lookup("a") == Some(RealValue(1.5.toFloat))) // FOR TO x
    assert(interpreter.env.lookup("g") == Some(RealValue(7.5.toFloat))) // FOR TO x
    assert(interpreter.env.lookup("l") == Some(RealValue(12.5.toFloat))) // FOR TO x
    assert(interpreter.env.lookup("w") == Some(RealValue(21.5.toFloat))) // FOR TO x

    assert(interpreter.env.lookup("e") == Some(LongValue(5.toLong))) // FOR TO x
    assert(interpreter.env.lookup("f") == Some(LongValue(6.toLong))) // FOR TO x
    assert(interpreter.env.lookup("m") == Some(LongValue(13.toLong))) // FOR TO x
    assert(interpreter.env.lookup("z") == Some(LongValue(24.toLong))) // FOR TO x
    
    assert(interpreter.env.lookup("c") == Some(ShortValue(3.toShort))) // FOR TO x
    assert(interpreter.env.lookup("j") == Some(ShortValue(10.toShort))) // FOR TO x
    assert(interpreter.env.lookup("k") == Some(ShortValue(11.toShort))) // FOR TO x
    assert(interpreter.env.lookup("x") == Some(ShortValue(24.toShort))) // FOR TO x
    
    assert(interpreter.env.lookup("d") == Some(LongRealValue(4.5.toDouble))) // FOR TO x
    assert(interpreter.env.lookup("i") == Some(LongRealValue(9.5.toDouble))) // FOR TO x
    assert(interpreter.env.lookup("o") == Some(LongRealValue(15.5.toDouble))) // FOR TO x
    assert(interpreter.env.lookup("t") == Some(LongRealValue(29.5.toDouble))) // FOR TO x
  }

  test("Testing LONG and SHORT operations") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic1.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongValue(5000L))) // FOR TO x
  }

  test("Testing LONGREAL and REAL +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic2.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(26.500000005.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and REAL -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic3.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(13.5D - 13.00000000000005D))) // FOR TO x
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
    assert(interpreter.env.lookup("x") == Some(LongRealValue(13.5D / 13.00000000000005D))) // FOR TO x
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

  test("Testing LONGREAL and SHORTINT *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic7.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue((13.552647D * 5).toDouble))) // FOR TO x
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
    assert(interpreter.env.lookup("x") == Some(LongRealValue(15.00000000000005.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and INTEGER -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic10.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue(5.00000000000005.toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and INTEGER *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic11.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue((10.00000000000005D * 5).toDouble))) // FOR TO x
  }

  test("Testing LONGREAL and INTEGER /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic12.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongRealValue((10.00000000000005D / 5).toDouble))) // FOR TO x
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
    assert(interpreter.env.lookup("x") == Some(LongValue(0L))) // FOR TO x
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
    assert(interpreter.env.lookup("x") == Some(LongValue(1L))) // FOR TO x
  }

  test("Testing LONGINT and INTEGER operations") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic20.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(LongValue(1000000L))) // FOR TO x
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
    assert(interpreter.env.lookup("x") == Some(RealValue(17.7.toFloat))) // FOR TO x
  }

  test("Testing REAL and REAL -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic27.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(12.7.toFloat))) // FOR TO x
  }

  test("Testing REAL and REAL *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic28.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(38.toFloat))) // FOR TO x
  }

  test("Testing REAL and REAL /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic29.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(6.08.toFloat))) // FOR TO x
  }

  test("Testing REAL and INT +") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic30.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(19.2.toFloat))) // FOR TO x
  }

  test("Testing REAL and INT -") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic31.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(11.2.toFloat))) // FOR TO x
  }

  test("Testing REAL and INT *") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic32.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(60.8.toFloat))) // FOR TO x
  }

  test("Testing REAL and INT /") {
    val path = Paths.get(getClass.getClassLoader.getResource("aritmetic/aritmetic33.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(3.8.toFloat))) // FOR TO x
  }

  test("Comparing REAL and REAL <") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean1.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(2))) // FOR TO x
  }

  test("Comparing REAL and REAL >") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean2.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(2))) // FOR TO x
  }

  test("Comparing REAL and REAL <=") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean3.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(2))) // FOR TO x
  }

  test("Comparing REAL and REAL >=") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean4.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(2))) // FOR TO x
  }

  test("Comparing REAL and REAL ==") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean5.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(2))) // FOR TO x
  }

  test("Comparing REAL and REAL #") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean6.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(2))) // FOR TO x
  }

  test("Comparing INTEGER and INTEGER = and >") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean7.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(1))) // FOR TO x
  }

  test("Comparing INTEGER and INTEGER >= and <") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean8.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(1))) // FOR TO x
  }

  test("Comparing INTEGER and INTEGER <= and >") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean9.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(1))) // FOR TO x
  }

  test("Comparing INTEGER and INTEGER !=") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean10.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(1))) // FOR TO x
  }

  test("Comparing REAL and INTEGER <= and >") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean11.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(1))) // FOR TO x
  }

  test("Comparing REAL and INTEGER > and <=") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean12.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(1))) // FOR TO x
  }

  test("Comparing REAL and INTEGER !=") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean13.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(IntValue(1))) // FOR TO x
  }

  test("Comparing REAL and INTEGER < and >=") {
    val path = Paths.get(getClass.getClassLoader.getResource("boolean/boolean14.oberon").getFile)

    assert(path != null)

    val content = String.join("\n", Files.readAllLines(path))
    val module = ScalaParser.parse(content)

    assert(module.name == "SimpleModule")

    module.accept(interpreter)
    assert(interpreter.env.lookup("x") == Some(RealValue(1))) // FOR TO x
  }
}