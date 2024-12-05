package x0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* renamed from: x0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4184t extends u implements NavigableSet, O {

    /* renamed from: c, reason: collision with root package name */
    final transient Comparator f40664c;

    /* renamed from: d, reason: collision with root package name */
    transient AbstractC4184t f40665d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4184t(Comparator comparator) {
        this.f40664c = comparator;
    }

    static AbstractC4184t A(Comparator comparator, int i8, Object... objArr) {
        if (i8 == 0) {
            return F(comparator);
        }
        AbstractC4162F.c(objArr, i8);
        Arrays.sort(objArr, 0, i8, comparator);
        int i9 = 1;
        for (int i10 = 1; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (comparator.compare(obj, objArr[i9 - 1]) != 0) {
                objArr[i9] = obj;
                i9++;
            }
        }
        Arrays.fill(objArr, i9, i8, (Object) null);
        if (i9 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new L(AbstractC4180o.m(objArr, i9), comparator);
    }

    public static AbstractC4184t B(Comparator comparator, Iterable iterable) {
        w0.h.i(comparator);
        if (P.b(comparator, iterable) && (iterable instanceof AbstractC4184t)) {
            AbstractC4184t abstractC4184t = (AbstractC4184t) iterable;
            if (!abstractC4184t.j()) {
                return abstractC4184t;
            }
        }
        Object[] b8 = v.b(iterable);
        return A(comparator, b8.length, b8);
    }

    public static AbstractC4184t C(Comparator comparator, Collection collection) {
        return B(comparator, collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static L F(Comparator comparator) {
        if (AbstractC4163G.c().equals(comparator)) {
            return L.f40590f;
        }
        return new L(AbstractC4180o.t(), comparator);
    }

    static int S(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract AbstractC4184t D();

    @Override // java.util.NavigableSet
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC4184t descendingSet() {
        AbstractC4184t abstractC4184t = this.f40665d;
        if (abstractC4184t == null) {
            AbstractC4184t D8 = D();
            this.f40665d = D8;
            D8.f40665d = this;
            return D8;
        }
        return abstractC4184t;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public AbstractC4184t headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC4184t headSet(Object obj, boolean z8) {
        return K(w0.h.i(obj), z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC4184t K(Object obj, boolean z8);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC4184t subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public AbstractC4184t subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        boolean z10;
        w0.h.i(obj);
        w0.h.i(obj2);
        if (this.f40664c.compare(obj, obj2) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0.h.d(z10);
        return N(obj, z8, obj2, z9);
    }

    abstract AbstractC4184t N(Object obj, boolean z8, Object obj2, boolean z9);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC4184t tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public AbstractC4184t tailSet(Object obj, boolean z8) {
        return Q(w0.h.i(obj), z8);
    }

    abstract AbstractC4184t Q(Object obj, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R(Object obj, Object obj2) {
        return S(this.f40664c, obj, obj2);
    }

    @Override // java.util.SortedSet, x0.O
    public Comparator comparator() {
        return this.f40664c;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
