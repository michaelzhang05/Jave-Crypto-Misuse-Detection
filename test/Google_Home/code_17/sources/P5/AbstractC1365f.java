package P5;

import b6.InterfaceC1986b;
import java.util.AbstractList;
import java.util.List;

/* renamed from: P5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1365f extends AbstractList implements List, InterfaceC1986b {
    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i8) {
        return removeAt(i8);
    }

    public abstract Object removeAt(int i8);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
