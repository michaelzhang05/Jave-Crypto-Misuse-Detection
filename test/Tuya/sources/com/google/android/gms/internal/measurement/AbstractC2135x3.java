package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2135x3 extends AbstractC2095s3 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final F3 f15955b = new C2111u3(B3.f15266f, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15956c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2135x3 m(Object[] objArr, int i8) {
        if (i8 == 0) {
            return B3.f15266f;
        }
        return new B3(objArr, i8);
    }

    public static AbstractC2135x3 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        A3.b(objArr, 2);
        return m(objArr, 2);
    }

    public static AbstractC2135x3 q(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am"};
        A3.b(objArr, 3);
        return m(objArr, 3);
    }

    public static AbstractC2135x3 r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        A3.b(objArr, 7);
        return m(objArr, 7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    int a(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i8 = 0; i8 < size; i8++) {
                        if (AbstractC1972d3.a(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC1972d3.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = (i8 * 31) + get(i9).hashCode();
        }
        return i8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (obj.equals(get(i8))) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2135x3 subList(int i8, int i9) {
        AbstractC1990f3.c(i8, i9, size());
        int i10 = i9 - i8;
        if (i10 == size()) {
            return this;
        }
        if (i10 == 0) {
            return B3.f15266f;
        }
        return new C2119v3(this, i8, i10);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final F3 listIterator(int i8) {
        AbstractC1990f3.b(i8, size(), "index");
        if (isEmpty()) {
            return f15955b;
        }
        return new C2111u3(this, i8);
    }
}
