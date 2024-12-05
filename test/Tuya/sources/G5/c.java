package G5;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3216b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3217c;

    public c(String str, a banner, List purposes) {
        AbstractC3159y.i(banner, "banner");
        AbstractC3159y.i(purposes, "purposes");
        this.f3215a = str;
        this.f3216b = banner;
        this.f3217c = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3159y.d(this.f3215a, cVar.f3215a) && AbstractC3159y.d(this.f3216b, cVar.f3216b) && AbstractC3159y.d(this.f3217c, cVar.f3217c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f3215a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f3217c.hashCode() + ((this.f3216b.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("GBCPurposeResponse(language=");
        a8.append((Object) this.f3215a);
        a8.append(", banner=");
        a8.append(this.f3216b);
        a8.append(", purposes=");
        a8.append(this.f3217c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ c(String str, a aVar, List list, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? new a(null, null, null, null, 15) : null, (i8 & 4) != 0 ? AbstractC1246t.m() : null);
    }
}
