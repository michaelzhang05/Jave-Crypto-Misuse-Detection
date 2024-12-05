package androidx.datastore.core.okio;

import P5.d;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;

/* loaded from: classes3.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(InterfaceC1281g interfaceC1281g, d dVar);

    Object writeTo(T t8, InterfaceC1280f interfaceC1280f, d dVar);
}
