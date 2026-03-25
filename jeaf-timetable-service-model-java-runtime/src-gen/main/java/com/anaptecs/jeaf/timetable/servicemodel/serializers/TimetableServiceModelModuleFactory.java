/*
 * Please add organization file header by setting property "fileHeaderCompany"
 *
 * All rights reserved.
 */
package com.anaptecs.jeaf.timetable.servicemodel.serializers;

import com.anaptecs.jeaf.timetable.servicemodel.VehicleType;
import tools.jackson.databind.JacksonModule;
import tools.jackson.databind.module.SimpleModule;

/**
 * Factory assembles all configured serializers / deserializers into a module.
 */
public class TimetableServiceModelModuleFactory {
  /**
   * Method creates a module that consists of all serializers / deserializers for data types.
   */
  public static JacksonModule createDataTypeSerializerModule( ) {
    // Create module for serializers / deserializers that are located in this package
    SimpleModule lModule =
        new SimpleModule("DataTypeSerializerModule." + TimetableServiceModelModuleFactory.class.getName());
    // Add serializers and deserializers for data types
    // Return created module.
    return lModule;
  }

  /**
   * Method creates a module that consists of all serializers / deserializers for enums.
   */
  public static JacksonModule createEnumSerializerModule( ) {
    // Create module for serializers / deserializers that are located in this package
    SimpleModule lModule =
        new SimpleModule("EnumSerializerModule." + TimetableServiceModelModuleFactory.class.getName());
    // Add serializers and deserializers for enumerations
    lModule.addSerializer(VehicleType.class, new VehicleTypeSerializer());
    lModule.addDeserializer(VehicleType.class, new VehicleTypeDeserializer());
    // Return created module.
    return lModule;
  }
}