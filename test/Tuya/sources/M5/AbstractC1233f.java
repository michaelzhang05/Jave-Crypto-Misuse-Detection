package M5;

import java.util.AbstractList;
import java.util.List;

/* renamed from: M5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1233f extends AbstractList implements List, Y5.b {
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
