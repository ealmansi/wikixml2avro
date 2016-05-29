/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package de.mpg.mpi.inf.d5.wikipedia.export.schemas;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WikipediaRevisionMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7517287633949392275L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WikipediaRevisionMetadata\",\"namespace\":\"de.mpg.mpi.inf.d5.wikipedia.export.schemas\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"]},{\"name\":\"parent_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"timestamp\",\"type\":[\"null\",\"string\"]},{\"name\":\"contributor_ip\",\"type\":[\"null\",\"string\"]},{\"name\":\"contributor_username\",\"type\":[\"null\",\"string\"]},{\"name\":\"contributor_id\",\"type\":[\"null\",\"long\"]},{\"name\":\"minor\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"comment\",\"type\":[\"null\",\"string\"]},{\"name\":\"model\",\"type\":[\"null\",\"string\"]},{\"name\":\"format\",\"type\":[\"null\",\"string\"]},{\"name\":\"text_size\",\"type\":[\"null\",\"long\"]},{\"name\":\"sha1\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Long id;
  @Deprecated public java.lang.Long parent_id;
  @Deprecated public java.lang.CharSequence timestamp;
  @Deprecated public java.lang.CharSequence contributor_ip;
  @Deprecated public java.lang.CharSequence contributor_username;
  @Deprecated public java.lang.Long contributor_id;
  @Deprecated public java.lang.Boolean minor;
  @Deprecated public java.lang.CharSequence comment;
  @Deprecated public java.lang.CharSequence model;
  @Deprecated public java.lang.CharSequence format;
  @Deprecated public java.lang.Long text_size;
  @Deprecated public java.lang.CharSequence sha1;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WikipediaRevisionMetadata() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param parent_id The new value for parent_id
   * @param timestamp The new value for timestamp
   * @param contributor_ip The new value for contributor_ip
   * @param contributor_username The new value for contributor_username
   * @param contributor_id The new value for contributor_id
   * @param minor The new value for minor
   * @param comment The new value for comment
   * @param model The new value for model
   * @param format The new value for format
   * @param text_size The new value for text_size
   * @param sha1 The new value for sha1
   */
  public WikipediaRevisionMetadata(java.lang.Long id, java.lang.Long parent_id, java.lang.CharSequence timestamp, java.lang.CharSequence contributor_ip, java.lang.CharSequence contributor_username, java.lang.Long contributor_id, java.lang.Boolean minor, java.lang.CharSequence comment, java.lang.CharSequence model, java.lang.CharSequence format, java.lang.Long text_size, java.lang.CharSequence sha1) {
    this.id = id;
    this.parent_id = parent_id;
    this.timestamp = timestamp;
    this.contributor_ip = contributor_ip;
    this.contributor_username = contributor_username;
    this.contributor_id = contributor_id;
    this.minor = minor;
    this.comment = comment;
    this.model = model;
    this.format = format;
    this.text_size = text_size;
    this.sha1 = sha1;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return parent_id;
    case 2: return timestamp;
    case 3: return contributor_ip;
    case 4: return contributor_username;
    case 5: return contributor_id;
    case 6: return minor;
    case 7: return comment;
    case 8: return model;
    case 9: return format;
    case 10: return text_size;
    case 11: return sha1;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: parent_id = (java.lang.Long)value$; break;
    case 2: timestamp = (java.lang.CharSequence)value$; break;
    case 3: contributor_ip = (java.lang.CharSequence)value$; break;
    case 4: contributor_username = (java.lang.CharSequence)value$; break;
    case 5: contributor_id = (java.lang.Long)value$; break;
    case 6: minor = (java.lang.Boolean)value$; break;
    case 7: comment = (java.lang.CharSequence)value$; break;
    case 8: model = (java.lang.CharSequence)value$; break;
    case 9: format = (java.lang.CharSequence)value$; break;
    case 10: text_size = (java.lang.Long)value$; break;
    case 11: sha1 = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'parent_id' field.
   * @return The value of the 'parent_id' field.
   */
  public java.lang.Long getParentId() {
    return parent_id;
  }

  /**
   * Sets the value of the 'parent_id' field.
   * @param value the value to set.
   */
  public void setParentId(java.lang.Long value) {
    this.parent_id = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.CharSequence getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.CharSequence value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'contributor_ip' field.
   * @return The value of the 'contributor_ip' field.
   */
  public java.lang.CharSequence getContributorIp() {
    return contributor_ip;
  }

  /**
   * Sets the value of the 'contributor_ip' field.
   * @param value the value to set.
   */
  public void setContributorIp(java.lang.CharSequence value) {
    this.contributor_ip = value;
  }

  /**
   * Gets the value of the 'contributor_username' field.
   * @return The value of the 'contributor_username' field.
   */
  public java.lang.CharSequence getContributorUsername() {
    return contributor_username;
  }

  /**
   * Sets the value of the 'contributor_username' field.
   * @param value the value to set.
   */
  public void setContributorUsername(java.lang.CharSequence value) {
    this.contributor_username = value;
  }

  /**
   * Gets the value of the 'contributor_id' field.
   * @return The value of the 'contributor_id' field.
   */
  public java.lang.Long getContributorId() {
    return contributor_id;
  }

  /**
   * Sets the value of the 'contributor_id' field.
   * @param value the value to set.
   */
  public void setContributorId(java.lang.Long value) {
    this.contributor_id = value;
  }

  /**
   * Gets the value of the 'minor' field.
   * @return The value of the 'minor' field.
   */
  public java.lang.Boolean getMinor() {
    return minor;
  }

  /**
   * Sets the value of the 'minor' field.
   * @param value the value to set.
   */
  public void setMinor(java.lang.Boolean value) {
    this.minor = value;
  }

  /**
   * Gets the value of the 'comment' field.
   * @return The value of the 'comment' field.
   */
  public java.lang.CharSequence getComment() {
    return comment;
  }

  /**
   * Sets the value of the 'comment' field.
   * @param value the value to set.
   */
  public void setComment(java.lang.CharSequence value) {
    this.comment = value;
  }

  /**
   * Gets the value of the 'model' field.
   * @return The value of the 'model' field.
   */
  public java.lang.CharSequence getModel() {
    return model;
  }

  /**
   * Sets the value of the 'model' field.
   * @param value the value to set.
   */
  public void setModel(java.lang.CharSequence value) {
    this.model = value;
  }

  /**
   * Gets the value of the 'format' field.
   * @return The value of the 'format' field.
   */
  public java.lang.CharSequence getFormat() {
    return format;
  }

  /**
   * Sets the value of the 'format' field.
   * @param value the value to set.
   */
  public void setFormat(java.lang.CharSequence value) {
    this.format = value;
  }

  /**
   * Gets the value of the 'text_size' field.
   * @return The value of the 'text_size' field.
   */
  public java.lang.Long getTextSize() {
    return text_size;
  }

  /**
   * Sets the value of the 'text_size' field.
   * @param value the value to set.
   */
  public void setTextSize(java.lang.Long value) {
    this.text_size = value;
  }

  /**
   * Gets the value of the 'sha1' field.
   * @return The value of the 'sha1' field.
   */
  public java.lang.CharSequence getSha1() {
    return sha1;
  }

  /**
   * Sets the value of the 'sha1' field.
   * @param value the value to set.
   */
  public void setSha1(java.lang.CharSequence value) {
    this.sha1 = value;
  }

  /**
   * Creates a new WikipediaRevisionMetadata RecordBuilder.
   * @return A new WikipediaRevisionMetadata RecordBuilder
   */
  public static de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder newBuilder() {
    return new de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder();
  }

  /**
   * Creates a new WikipediaRevisionMetadata RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WikipediaRevisionMetadata RecordBuilder
   */
  public static de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder newBuilder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder other) {
    return new de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder(other);
  }

  /**
   * Creates a new WikipediaRevisionMetadata RecordBuilder by copying an existing WikipediaRevisionMetadata instance.
   * @param other The existing instance to copy.
   * @return A new WikipediaRevisionMetadata RecordBuilder
   */
  public static de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder newBuilder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata other) {
    return new de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder(other);
  }

  /**
   * RecordBuilder for WikipediaRevisionMetadata instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WikipediaRevisionMetadata>
    implements org.apache.avro.data.RecordBuilder<WikipediaRevisionMetadata> {

    private java.lang.Long id;
    private java.lang.Long parent_id;
    private java.lang.CharSequence timestamp;
    private java.lang.CharSequence contributor_ip;
    private java.lang.CharSequence contributor_username;
    private java.lang.Long contributor_id;
    private java.lang.Boolean minor;
    private java.lang.CharSequence comment;
    private java.lang.CharSequence model;
    private java.lang.CharSequence format;
    private java.lang.Long text_size;
    private java.lang.CharSequence sha1;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parent_id)) {
        this.parent_id = data().deepCopy(fields()[1].schema(), other.parent_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contributor_ip)) {
        this.contributor_ip = data().deepCopy(fields()[3].schema(), other.contributor_ip);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.contributor_username)) {
        this.contributor_username = data().deepCopy(fields()[4].schema(), other.contributor_username);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.contributor_id)) {
        this.contributor_id = data().deepCopy(fields()[5].schema(), other.contributor_id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.minor)) {
        this.minor = data().deepCopy(fields()[6].schema(), other.minor);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.comment)) {
        this.comment = data().deepCopy(fields()[7].schema(), other.comment);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.model)) {
        this.model = data().deepCopy(fields()[8].schema(), other.model);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.format)) {
        this.format = data().deepCopy(fields()[9].schema(), other.format);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.text_size)) {
        this.text_size = data().deepCopy(fields()[10].schema(), other.text_size);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.sha1)) {
        this.sha1 = data().deepCopy(fields()[11].schema(), other.sha1);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing WikipediaRevisionMetadata instance
     * @param other The existing instance to copy.
     */
    private Builder(de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parent_id)) {
        this.parent_id = data().deepCopy(fields()[1].schema(), other.parent_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contributor_ip)) {
        this.contributor_ip = data().deepCopy(fields()[3].schema(), other.contributor_ip);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.contributor_username)) {
        this.contributor_username = data().deepCopy(fields()[4].schema(), other.contributor_username);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.contributor_id)) {
        this.contributor_id = data().deepCopy(fields()[5].schema(), other.contributor_id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.minor)) {
        this.minor = data().deepCopy(fields()[6].schema(), other.minor);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.comment)) {
        this.comment = data().deepCopy(fields()[7].schema(), other.comment);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.model)) {
        this.model = data().deepCopy(fields()[8].schema(), other.model);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.format)) {
        this.format = data().deepCopy(fields()[9].schema(), other.format);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.text_size)) {
        this.text_size = data().deepCopy(fields()[10].schema(), other.text_size);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.sha1)) {
        this.sha1 = data().deepCopy(fields()[11].schema(), other.sha1);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setId(java.lang.Long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'parent_id' field.
      * @return The value.
      */
    public java.lang.Long getParentId() {
      return parent_id;
    }

    /**
      * Sets the value of the 'parent_id' field.
      * @param value The value of 'parent_id'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setParentId(java.lang.Long value) {
      validate(fields()[1], value);
      this.parent_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'parent_id' field has been set.
      * @return True if the 'parent_id' field has been set, false otherwise.
      */
    public boolean hasParentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'parent_id' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearParentId() {
      parent_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setTimestamp(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'contributor_ip' field.
      * @return The value.
      */
    public java.lang.CharSequence getContributorIp() {
      return contributor_ip;
    }

    /**
      * Sets the value of the 'contributor_ip' field.
      * @param value The value of 'contributor_ip'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setContributorIp(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.contributor_ip = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'contributor_ip' field has been set.
      * @return True if the 'contributor_ip' field has been set, false otherwise.
      */
    public boolean hasContributorIp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'contributor_ip' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearContributorIp() {
      contributor_ip = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'contributor_username' field.
      * @return The value.
      */
    public java.lang.CharSequence getContributorUsername() {
      return contributor_username;
    }

    /**
      * Sets the value of the 'contributor_username' field.
      * @param value The value of 'contributor_username'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setContributorUsername(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.contributor_username = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'contributor_username' field has been set.
      * @return True if the 'contributor_username' field has been set, false otherwise.
      */
    public boolean hasContributorUsername() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'contributor_username' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearContributorUsername() {
      contributor_username = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'contributor_id' field.
      * @return The value.
      */
    public java.lang.Long getContributorId() {
      return contributor_id;
    }

    /**
      * Sets the value of the 'contributor_id' field.
      * @param value The value of 'contributor_id'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setContributorId(java.lang.Long value) {
      validate(fields()[5], value);
      this.contributor_id = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'contributor_id' field has been set.
      * @return True if the 'contributor_id' field has been set, false otherwise.
      */
    public boolean hasContributorId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'contributor_id' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearContributorId() {
      contributor_id = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'minor' field.
      * @return The value.
      */
    public java.lang.Boolean getMinor() {
      return minor;
    }

    /**
      * Sets the value of the 'minor' field.
      * @param value The value of 'minor'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setMinor(java.lang.Boolean value) {
      validate(fields()[6], value);
      this.minor = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'minor' field has been set.
      * @return True if the 'minor' field has been set, false otherwise.
      */
    public boolean hasMinor() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'minor' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearMinor() {
      minor = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'comment' field.
      * @return The value.
      */
    public java.lang.CharSequence getComment() {
      return comment;
    }

    /**
      * Sets the value of the 'comment' field.
      * @param value The value of 'comment'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setComment(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.comment = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'comment' field has been set.
      * @return True if the 'comment' field has been set, false otherwise.
      */
    public boolean hasComment() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'comment' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearComment() {
      comment = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'model' field.
      * @return The value.
      */
    public java.lang.CharSequence getModel() {
      return model;
    }

    /**
      * Sets the value of the 'model' field.
      * @param value The value of 'model'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setModel(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.model = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'model' field has been set.
      * @return True if the 'model' field has been set, false otherwise.
      */
    public boolean hasModel() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'model' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearModel() {
      model = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'format' field.
      * @return The value.
      */
    public java.lang.CharSequence getFormat() {
      return format;
    }

    /**
      * Sets the value of the 'format' field.
      * @param value The value of 'format'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setFormat(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.format = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'format' field has been set.
      * @return True if the 'format' field has been set, false otherwise.
      */
    public boolean hasFormat() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'format' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearFormat() {
      format = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'text_size' field.
      * @return The value.
      */
    public java.lang.Long getTextSize() {
      return text_size;
    }

    /**
      * Sets the value of the 'text_size' field.
      * @param value The value of 'text_size'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setTextSize(java.lang.Long value) {
      validate(fields()[10], value);
      this.text_size = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'text_size' field has been set.
      * @return True if the 'text_size' field has been set, false otherwise.
      */
    public boolean hasTextSize() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'text_size' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearTextSize() {
      text_size = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'sha1' field.
      * @return The value.
      */
    public java.lang.CharSequence getSha1() {
      return sha1;
    }

    /**
      * Sets the value of the 'sha1' field.
      * @param value The value of 'sha1'.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder setSha1(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.sha1 = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'sha1' field has been set.
      * @return True if the 'sha1' field has been set, false otherwise.
      */
    public boolean hasSha1() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'sha1' field.
      * @return This builder.
      */
    public de.mpg.mpi.inf.d5.wikipedia.export.schemas.WikipediaRevisionMetadata.Builder clearSha1() {
      sha1 = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public WikipediaRevisionMetadata build() {
      try {
        WikipediaRevisionMetadata record = new WikipediaRevisionMetadata();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.parent_id = fieldSetFlags()[1] ? this.parent_id : (java.lang.Long) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.contributor_ip = fieldSetFlags()[3] ? this.contributor_ip : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.contributor_username = fieldSetFlags()[4] ? this.contributor_username : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.contributor_id = fieldSetFlags()[5] ? this.contributor_id : (java.lang.Long) defaultValue(fields()[5]);
        record.minor = fieldSetFlags()[6] ? this.minor : (java.lang.Boolean) defaultValue(fields()[6]);
        record.comment = fieldSetFlags()[7] ? this.comment : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.model = fieldSetFlags()[8] ? this.model : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.format = fieldSetFlags()[9] ? this.format : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.text_size = fieldSetFlags()[10] ? this.text_size : (java.lang.Long) defaultValue(fields()[10]);
        record.sha1 = fieldSetFlags()[11] ? this.sha1 : (java.lang.CharSequence) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}