package org.openx.data.jsonserde.objectinspector.primitive;

import org.apache.hadoop.hive.serde2.typeinfo.PrimitiveTypeInfo;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfoFactory;

public class TypeEntryShim {
	public static PrimitiveTypeInfo byteType   = TypeInfoFactory.byteTypeInfo;
    public static PrimitiveTypeInfo doubleType = TypeInfoFactory.doubleTypeInfo;
    public static PrimitiveTypeInfo floatType = TypeInfoFactory.floatTypeInfo;
    public static PrimitiveTypeInfo intType = TypeInfoFactory.intTypeInfo;
    public static PrimitiveTypeInfo longType = TypeInfoFactory.longTypeInfo;
    public static PrimitiveTypeInfo shortType = TypeInfoFactory.shortTypeInfo;
    public static PrimitiveTypeInfo timestampType = TypeInfoFactory.timestampTypeInfo;
    public static PrimitiveTypeInfo stringType = TypeInfoFactory.stringTypeInfo;
}
