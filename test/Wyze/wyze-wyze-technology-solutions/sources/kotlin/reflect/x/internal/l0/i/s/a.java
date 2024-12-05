package kotlin.reflect.x.internal.l0.i.s;

import kotlin.jvm.internal.l;

/* compiled from: DeprecationInfo.kt */
/* loaded from: classes2.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        l.f(aVar, "other");
        int compareTo = f().compareTo(aVar.f());
        if (compareTo == 0 && !i() && aVar.i()) {
            return 1;
        }
        return compareTo;
    }

    public abstract b f();

    public abstract boolean i();
}
