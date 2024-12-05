package s1;

import j$.time.ZonedDateTime;
import t1.AbstractC3775f;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3735c extends AbstractC3733a {
    public C3735c(ZonedDateTime zonedDateTime) {
        d(zonedDateTime);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = AbstractC3775f.a(str);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return AbstractC3775f.b((ZonedDateTime) this.f37835a);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, i8 + 36);
    }
}
