package n6;

import P5.g;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class L implements g.c {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f36249a;

    public L(ThreadLocal threadLocal) {
        this.f36249a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L) && AbstractC3159y.d(this.f36249a, ((L) obj).f36249a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f36249a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f36249a + ')';
    }
}
