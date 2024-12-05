package P5;

import b6.InterfaceC1989e;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: P5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1367h extends AbstractSet implements Set, InterfaceC1989e {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
