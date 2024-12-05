package androidx.datastore.core;

import P5.d;
import X5.n;
import X5.o;

/* loaded from: classes3.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(o oVar, d dVar);

    Object writeScope(n nVar, d dVar);
}
