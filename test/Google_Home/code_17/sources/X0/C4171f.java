package x0;

import java.io.Serializable;
import w0.AbstractC4123f;
import w0.InterfaceC4120c;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4171f extends AbstractC4163G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC4120c f40608a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC4163G f40609b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4171f(InterfaceC4120c interfaceC4120c, AbstractC4163G abstractC4163G) {
        this.f40608a = (InterfaceC4120c) w0.h.i(interfaceC4120c);
        this.f40609b = (AbstractC4163G) w0.h.i(abstractC4163G);
    }

    @Override // x0.AbstractC4163G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f40609b.compare(this.f40608a.apply(obj), this.f40608a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4171f)) {
            return false;
        }
        C4171f c4171f = (C4171f) obj;
        if (this.f40608a.equals(c4171f.f40608a) && this.f40609b.equals(c4171f.f40609b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC4123f.b(this.f40608a, this.f40609b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f40609b);
        String valueOf2 = String.valueOf(this.f40608a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
