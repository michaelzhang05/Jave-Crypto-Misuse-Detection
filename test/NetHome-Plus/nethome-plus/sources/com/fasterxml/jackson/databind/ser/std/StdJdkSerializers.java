package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class StdJdkSerializers {

    /* loaded from: classes2.dex */
    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        public AtomicBooleanSerializer() {
            super(AtomicBoolean.class, false);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
            jsonGenerator.writeBoolean(atomicBoolean.get());
        }
    }

    /* loaded from: classes2.dex */
    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        public AtomicIntegerSerializer() {
            super(AtomicInteger.class, false);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
            jsonGenerator.writeNumber(atomicInteger.get());
        }
    }

    /* loaded from: classes2.dex */
    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        public AtomicLongSerializer() {
            super(AtomicLong.class, false);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
            jsonGenerator.writeNumber(atomicLong.get());
        }
    }

    public static Collection<Map.Entry<Class<?>, Object>> all() {
        HashMap hashMap = new HashMap();
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        hashMap.put(URL.class, toStringSerializer);
        hashMap.put(URI.class, toStringSerializer);
        hashMap.put(Currency.class, toStringSerializer);
        hashMap.put(UUID.class, new UUIDSerializer());
        hashMap.put(Pattern.class, toStringSerializer);
        hashMap.put(Locale.class, toStringSerializer);
        hashMap.put(AtomicBoolean.class, AtomicBooleanSerializer.class);
        hashMap.put(AtomicInteger.class, AtomicIntegerSerializer.class);
        hashMap.put(AtomicLong.class, AtomicLongSerializer.class);
        hashMap.put(File.class, FileSerializer.class);
        hashMap.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.instance;
        hashMap.put(Void.class, nullSerializer);
        hashMap.put(Void.TYPE, nullSerializer);
        try {
            hashMap.put(Timestamp.class, DateSerializer.instance);
            hashMap.put(Date.class, SqlDateSerializer.class);
            hashMap.put(Time.class, SqlTimeSerializer.class);
        } catch (NoClassDefFoundError unused) {
        }
        return hashMap.entrySet();
    }
}
