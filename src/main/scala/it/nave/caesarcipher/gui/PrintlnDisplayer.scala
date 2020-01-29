/*
 * Copyright (C) 2019 2020 Claudio Nave
 *
 * This file is part of CaesarCipher.
 *
 * CaesarCipher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CaesarCipher is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package it.nave.caesarcipher.gui

/**
 * Un'implementazione di [[it.nave.caesarcipher.gui.OutputDisplayer OutputDisplayer]] che sfrutta la stampa su terminale
 * tramite il metodo [[scala.Predef#println println]].
 */
class PrintlnDisplayer extends OutputDisplayer {
  override def display(output: String): Unit = {
    println(s"Output string: $output")
  }
}
