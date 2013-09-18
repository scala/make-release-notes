import java.io.File

object IO {
  def write(f: java.io.File, contents: String) {
  	val buf = new java.io.BufferedWriter(new java.io.FileWriter(f))
    try buf.write(contents)
    finally buf.close()
  }
}
