import java.io.{ByteArrayInputStream, ByteArrayOutputStream, ObjectInputStream, ObjectOutputStream}

/**
  * Created by joescii on 8/4/17.
  */
object code {
  def roundTrip[T](obj: T): T = {
    def serialize(in: T): Array[Byte] = {
      val bos = new ByteArrayOutputStream()
      val oos = new ObjectOutputStream(bos)
      oos.writeObject(in)
      oos.flush()
      bos.toByteArray()
    }

    def deserialize(in: Array[Byte]): T = {
      val bis = new ByteArrayInputStream(in)
      val ois = new ObjectInputStream(bis)
      ois.readObject.asInstanceOf[T]
    }

    deserialize(serialize(obj))
  }
}
