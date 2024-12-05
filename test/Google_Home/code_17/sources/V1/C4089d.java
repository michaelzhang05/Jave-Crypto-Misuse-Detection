package v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import w1.AbstractC4131h;
import w1.AbstractC4133j;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4089d extends AbstractC4086a {
    public C4089d(List list) {
        d(list);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = AbstractC4131h.a(str);
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return AbstractC4131h.b((List) this.f40108a);
    }

    @Override // v1.AbstractC4086a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        int indexOf;
        int i9 = i8 + 12;
        int a8 = AbstractC4133j.a(str.substring(i8, i9));
        for (int i10 = 0; i10 < a8; i10++) {
            if (str.charAt(i9) == '1') {
                indexOf = str.indexOf("11", str.indexOf("11", i9 + 1) + 2);
            } else {
                indexOf = str.indexOf("11", i9 + 1);
            }
            i9 = indexOf + 2;
        }
        return str.substring(i8, i9);
    }

    @Override // v1.AbstractC4086a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
