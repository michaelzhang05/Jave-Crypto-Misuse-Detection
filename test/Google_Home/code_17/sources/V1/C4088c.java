package v1;

import j$.time.ZonedDateTime;
import w1.AbstractC4129f;

/* renamed from: v1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4088c extends AbstractC4086a {
    public C4088c(ZonedDateTime zonedDateTime) {
        d(zonedDateTime);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = AbstractC4129f.a(str);
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return AbstractC4129f.b((ZonedDateTime) this.f40108a);
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        return str.substring(i8, i8 + 36);
    }
}
