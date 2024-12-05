package androidx.datastore.core;

import S5.d;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;

/* loaded from: classes3.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(InterfaceC1669o interfaceC1669o, d dVar);

    Object writeScope(InterfaceC1668n interfaceC1668n, d dVar);
}
