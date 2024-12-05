package P5;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final int f8838a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8839b;

    public K(int i8, Object obj) {
        this.f8838a = i8;
        this.f8839b = obj;
    }

    public final int a() {
        return this.f8838a;
    }

    public final Object b() {
        return this.f8839b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (this.f8838a == k8.f8838a && AbstractC3255y.d(this.f8839b, k8.f8839b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i8 = this.f8838a * 31;
        Object obj = this.f8839b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i8 + hashCode;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f8838a + ", value=" + this.f8839b + ')';
    }
}
