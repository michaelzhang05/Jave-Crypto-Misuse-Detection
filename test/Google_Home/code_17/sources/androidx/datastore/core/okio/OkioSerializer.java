package androidx.datastore.core.okio;

import S5.d;
import S6.InterfaceC1418f;
import S6.InterfaceC1419g;

/* loaded from: classes3.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(InterfaceC1419g interfaceC1419g, d dVar);

    Object writeTo(T t8, InterfaceC1418f interfaceC1418f, d dVar);
}
