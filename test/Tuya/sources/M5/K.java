package M5;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final int f7014a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7015b;

    public K(int i8, Object obj) {
        this.f7014a = i8;
        this.f7015b = obj;
    }

    public final int a() {
        return this.f7014a;
    }

    public final Object b() {
        return this.f7015b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (this.f7014a == k8.f7014a && AbstractC3159y.d(this.f7015b, k8.f7015b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i8 = this.f7014a * 31;
        Object obj = this.f7015b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i8 + hashCode;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f7014a + ", value=" + this.f7015b + ')';
    }
}
