package x0;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: x0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4176k extends AbstractC4163G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f40633a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4176k(Comparator comparator) {
        this.f40633a = (Comparator) w0.h.i(comparator);
    }

    @Override // x0.AbstractC4163G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f40633a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4176k) {
            return this.f40633a.equals(((C4176k) obj).f40633a);
        }
        return false;
    }

    public int hashCode() {
        return this.f40633a.hashCode();
    }

    public String toString() {
        return this.f40633a.toString();
    }
}
