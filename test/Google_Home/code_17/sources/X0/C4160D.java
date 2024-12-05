package x0;

import java.io.Serializable;

/* renamed from: x0.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4160D extends AbstractC4163G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final C4160D f40565a = new C4160D();

    private C4160D() {
    }

    @Override // x0.AbstractC4163G, java.util.Comparator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        w0.h.i(comparable);
        w0.h.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
