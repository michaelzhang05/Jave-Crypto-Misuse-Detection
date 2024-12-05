package q6;

import S5.g;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class L implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f38377a;

    public L(ThreadLocal threadLocal) {
        this.f38377a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L) && AbstractC3255y.d(this.f38377a, ((L) obj).f38377a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f38377a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f38377a + ')';
    }
}
