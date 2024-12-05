package androidx.datastore.core;

import S5.d;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, d dVar);

    Object writeTo(T t8, OutputStream outputStream, d dVar);
}
