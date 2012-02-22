/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.facebook.puzzles.dinoisland.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

/**
 * Register Client results
 * 
 * This structure is returned to your client after it calls the registerClient
 * function. It includes a string message welcoming you to Dinosaur Island,
 * as well as your randomly generated species name. It is important to note
 * that this randomly generated species name is how other clients will see your
 * dinosaur, and this is different from the highScoreName you chose originally
 * if your dinosaur makes it into the evolutionary hall of fame. Lastly, it
 * includes an integer egg ID which your client can then use to take over
 * control of the very first instance of your dinosaur species.
 */
public class RegisterClientResults implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("RegisterClientResults");
  private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRING, (short)1);
  private static final TField SPECIES_FIELD_DESC = new TField("species", TType.STRING, (short)2);
  private static final TField EGG_ID_FIELD_DESC = new TField("eggID", TType.I64, (short)3);

  public String message;
  public static final int MESSAGE = 1;
  public String species;
  public static final int SPECIES = 2;
  public long eggID;
  public static final int EGGID = 3;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean eggID = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(MESSAGE, new FieldMetaData("message", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(SPECIES, new FieldMetaData("species", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(EGGID, new FieldMetaData("eggID", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(RegisterClientResults.class, metaDataMap);
  }

  public RegisterClientResults() {
  }

  public RegisterClientResults(
    String message,
    String species,
    long eggID)
  {
    this();
    this.message = message;
    this.species = species;
    this.eggID = eggID;
    this.__isset.eggID = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RegisterClientResults(RegisterClientResults other) {
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetSpecies()) {
      this.species = other.species;
    }
    __isset.eggID = other.__isset.eggID;
    this.eggID = other.eggID;
  }

  @Override
  public RegisterClientResults clone() {
    return new RegisterClientResults(this);
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void unsetMessage() {
    this.message = null;
  }

  // Returns true if field message is set (has been asigned a value) and false otherwise
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public String getSpecies() {
    return this.species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public void unsetSpecies() {
    this.species = null;
  }

  // Returns true if field species is set (has been asigned a value) and false otherwise
  public boolean isSetSpecies() {
    return this.species != null;
  }

  public void setSpeciesIsSet(boolean value) {
    if (!value) {
      this.species = null;
    }
  }

  public long getEggID() {
    return this.eggID;
  }

  public void setEggID(long eggID) {
    this.eggID = eggID;
    this.__isset.eggID = true;
  }

  public void unsetEggID() {
    this.__isset.eggID = false;
  }

  // Returns true if field eggID is set (has been asigned a value) and false otherwise
  public boolean isSetEggID() {
    return this.__isset.eggID;
  }

  public void setEggIDIsSet(boolean value) {
    this.__isset.eggID = value;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case SPECIES:
      if (value == null) {
        unsetSpecies();
      } else {
        setSpecies((String)value);
      }
      break;

    case EGGID:
      if (value == null) {
        unsetEggID();
      } else {
        setEggID((Long)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MESSAGE:
      return getMessage();

    case SPECIES:
      return getSpecies();

    case EGGID:
      return new Long(getEggID());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case MESSAGE:
      return isSetMessage();
    case SPECIES:
      return isSetSpecies();
    case EGGID:
      return isSetEggID();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RegisterClientResults)
      return this.equals((RegisterClientResults)that);
    return false;
  }

  public boolean equals(RegisterClientResults that) {
    if (that == null)
      return false;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_species = true && this.isSetSpecies();
    boolean that_present_species = true && that.isSetSpecies();
    if (this_present_species || that_present_species) {
      if (!(this_present_species && that_present_species))
        return false;
      if (!this.species.equals(that.species))
        return false;
    }

    boolean this_present_eggID = true;
    boolean that_present_eggID = true;
    if (this_present_eggID || that_present_eggID) {
      if (!(this_present_eggID && that_present_eggID))
        return false;
      if (this.eggID != that.eggID)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case MESSAGE:
          if (field.type == TType.STRING) {
            this.message = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SPECIES:
          if (field.type == TType.STRING) {
            this.species = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EGGID:
          if (field.type == TType.I64) {
            this.eggID = iprot.readI64();
            this.__isset.eggID = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    if (this.species != null) {
      oprot.writeFieldBegin(SPECIES_FIELD_DESC);
      oprot.writeString(this.species);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(EGG_ID_FIELD_DESC);
    oprot.writeI64(this.eggID);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RegisterClientResults(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("species:");
    if (this.species == null) {
      sb.append("null");
    } else {
      sb.append(this.species);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eggID:");
    sb.append(this.eggID);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
