package androidx.datastore.core;

import P5.d;

/* loaded from: classes3.dex */
public interface CorruptionHandler<T> {
    Object handleCorruption(CorruptionException corruptionException, d dVar);
}
