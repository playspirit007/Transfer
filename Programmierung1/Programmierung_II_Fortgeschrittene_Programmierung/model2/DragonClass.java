package model2;

import java.util.Objects;

/**
 * Dragon
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class DragonClass {

   private final String name;
   private final DragonType type;
   private int age;

   public DragonClass(String name, DragonType type, int age) {
      this.name = name;
      this.type = type;
      this.age = age;
   }

   public DragonClass(String name, DragonType type) {
      this.name = name;
      this.type = type;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public DragonType getType() {
      return type;
   }

   @Override
   public String toString() {
      return "DragonClass [name=" + name + ", type=" + type + ", age=" + age + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(age, name, type);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      DragonClass other = (DragonClass) obj;
      return age == other.age && Objects.equals(name, other.name) && type == other.type;
   }

}
