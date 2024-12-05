package a5;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends AbstractList implements List {
    public abstract int h();

    public abstract Object i(int i6);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i6) {
        return i(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return h();
    }
}
