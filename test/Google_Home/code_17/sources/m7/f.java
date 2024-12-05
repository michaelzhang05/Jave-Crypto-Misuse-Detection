package M7;

import B5.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7317b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7319d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7320e;

    public f(String identifier, String type, int i8, String domain, List purposes) {
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(domain, "domain");
        AbstractC3255y.i(purposes, "purposes");
        this.f7316a = identifier;
        this.f7317b = type;
        this.f7318c = i8;
        this.f7319d = domain;
        this.f7320e = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3255y.d(this.f7316a, fVar.f7316a) && AbstractC3255y.d(this.f7317b, fVar.f7317b) && this.f7318c == fVar.f7318c && AbstractC3255y.d(this.f7319d, fVar.f7319d) && AbstractC3255y.d(this.f7320e, fVar.f7320e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7320e.hashCode() + t.a(this.f7319d, F6.k.a(this.f7318c, t.a(this.f7317b, this.f7316a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("Disclosure(identifier=");
        a8.append(this.f7316a);
        a8.append(", type=");
        a8.append(this.f7317b);
        a8.append(", maxAgeSeconds=");
        a8.append(this.f7318c);
        a8.append(", domain=");
        a8.append(this.f7319d);
        a8.append(", purposes=");
        a8.append(this.f7320e);
        a8.append(')');
        return a8.toString();
    }
}
