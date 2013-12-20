package test.com.khubla.jvmbasic.jvmbasicc;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.io.FileInputStream;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/**
 * test compiler
 * 
 * @author tom
 */
public class TestJVMBASICCompiler {
   @Test
   public void test1() {
      try {
         final String fileName = "src/test/resources/bas/a/hello.bas";
         final InputStream inputStream = new FileInputStream(fileName);
         final JVMBasicCompiler compiler = new JVMBasicCompiler();
         final byte[] bytecode = compiler.compile(inputStream, "hello", true);
         Assert.assertNotNull(bytecode);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}