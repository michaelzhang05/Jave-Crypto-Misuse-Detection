package J5;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4934a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4935b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4936c;

    public c(String str, a banner, List purposes) {
        AbstractC3255y.i(banner, "banner");
        AbstractC3255y.i(purposes, "purposes");
        this.f4934a = str;
        this.f4935b = banner;
        this.f4936c = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3255y.d(this.f4934a, cVar.f4934a) && AbstractC3255y.d(this.f4935b, cVar.f4935b) && AbstractC3255y.d(this.f4936c, cVar.f4936c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f4934a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f4936c.hashCode() + ((this.f4935b.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("GBCPurposeResponse(language=");
        a8.append((Object) this.f4934a);
        a8.append(", banner=");
        a8.append(this.f4935b);
        a8.append(", purposes=");
        a8.append(this.f4936c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ c(String str, a aVar, List list, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? new a(null, null, null, null, 15) : null, (i8 & 4) != 0 ? AbstractC1378t.m() : null);
    }
}
