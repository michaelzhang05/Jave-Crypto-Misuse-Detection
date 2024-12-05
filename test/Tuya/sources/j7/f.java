package J7;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5612c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5613d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5614e;

    public f(String identifier, String type, int i8, String domain, List purposes) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(domain, "domain");
        AbstractC3159y.i(purposes, "purposes");
        this.f5610a = identifier;
        this.f5611b = type;
        this.f5612c = i8;
        this.f5613d = domain;
        this.f5614e = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f5610a, fVar.f5610a) && AbstractC3159y.d(this.f5611b, fVar.f5611b) && this.f5612c == fVar.f5612c && AbstractC3159y.d(this.f5613d, fVar.f5613d) && AbstractC3159y.d(this.f5614e, fVar.f5614e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5614e.hashCode() + t.a(this.f5613d, C6.k.a(this.f5612c, t.a(this.f5611b, this.f5610a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("Disclosure(identifier=");
        a8.append(this.f5610a);
        a8.append(", type=");
        a8.append(this.f5611b);
        a8.append(", maxAgeSeconds=");
        a8.append(this.f5612c);
        a8.append(", domain=");
        a8.append(this.f5613d);
        a8.append(", purposes=");
        a8.append(this.f5614e);
        a8.append(')');
        return a8.toString();
    }
}
