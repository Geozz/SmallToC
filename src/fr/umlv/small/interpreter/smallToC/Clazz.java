package fr.umlv.small.interpreter.smallToC;

import java.util.LinkedHashMap;
import java.util.Objects;

import fr.umlv.small.grammar.ast.ClassDefNode;

public class Clazz {
  private final String name;
  private final ClassDefNode classDef;
  private final LinkedHashMap<String, Integer> fieldMap = new LinkedHashMap<>();
  private int instanceSize;  // in 32 bits word, 0 means not frozen
  private int metaDataIndex; // index in metadata space
  
  public Clazz(String name, /*maybenull*/ClassDefNode classDef) {
    this.name = Objects.requireNonNull(name);
    this.classDef = classDef;
  }
 
  public String getName() {
    return name;
  }
  
  @Override
  public String toString() {
    return name;
  }
  
  // in 32bits word
  public int getInstanceSize() {
    if (instanceSize == 0) {
      throw new IllegalStateException("class is not frozen");
    }
    return instanceSize;
  }
  
  public int getMetaDataIndex() {
    return metaDataIndex;
  }
  
  public int getFieldCount() {
    return fieldMap.size();
  }
  
  public String getFieldName(int index) {
    return classDef.getFields().get(index).getFieldName();
  }
  
  // return the field offset from the base instance address
  // the offset is already shifted by the OBJECT_HEADER 
  public int getFieldOffset(String name) {
    Integer offset = fieldMap.get(name);
    return (offset == null)? -1: offset;
  }
  
  public void addField(String name) {
    if (instanceSize != 0) {
      throw new IllegalStateException("class already frozen");
    }
    fieldMap.put(name, fieldMap.size());
  }
  
  public void freeze(int metaDataIndex) {
    int size = fieldMap.size();
    freeze(metaDataIndex, size + (size % 2 == 0? 0: 1));
  }
  
  //set the instance size and froze it
  public void freeze(int metaDataIndex, int instanceSize) {
    if (instanceSize % 2 != 0) {
      throw new IllegalArgumentException("instance size must be aligned to 64 bits");
    }
    if (instanceSize == 0) {
      throw new IllegalStateException("class is already frozen");
    }
    this.instanceSize = instanceSize;
    this.metaDataIndex = metaDataIndex;
  }
}
