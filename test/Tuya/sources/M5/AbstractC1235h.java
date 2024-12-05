package M5;

import java.util.AbstractSet;
import java.util.Set;

/* renamed from: M5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1235h extends AbstractSet implements Set, Y5.e {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
