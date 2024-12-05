package kotlin.reflect.x.internal.l0.l.w1;

import java.util.ArrayList;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes2.dex */
public final class a extends ArrayList<m> implements l {
    public a(int i2) {
        super(i2);
    }

    public /* bridge */ int K(m mVar) {
        return super.indexOf(mVar);
    }

    public /* bridge */ int M(m mVar) {
        return super.lastIndexOf(mVar);
    }

    public /* bridge */ boolean N(m mVar) {
        return super.remove(mVar);
    }

    public /* bridge */ boolean b(m mVar) {
        return super.contains(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return b((m) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof m) {
            return K((m) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof m) {
            return M((m) obj);
        }
        return -1;
    }

    public /* bridge */ int o() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof m) {
            return N((m) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return o();
    }
}
