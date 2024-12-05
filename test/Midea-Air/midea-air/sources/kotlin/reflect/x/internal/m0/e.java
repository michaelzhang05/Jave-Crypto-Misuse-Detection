package kotlin.reflect.x.internal.m0;

import java.io.Serializable;

/* compiled from: MapEntry.java */
/* loaded from: classes2.dex */
final class e<K, V> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final K f21463f;

    /* renamed from: g, reason: collision with root package name */
    public final V f21464g;

    public e(K k2, V v) {
        this.f21463f = k2;
        this.f21464g = v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        K k2 = this.f21463f;
        if (k2 == null) {
            if (eVar.f21463f != null) {
                return false;
            }
        } else if (!k2.equals(eVar.f21463f)) {
            return false;
        }
        V v = this.f21464g;
        V v2 = eVar.f21464g;
        if (v == null) {
            if (v2 != null) {
                return false;
            }
        } else if (!v.equals(v2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        K k2 = this.f21463f;
        int hashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f21464g;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.f21463f + "=" + this.f21464g;
    }
}
