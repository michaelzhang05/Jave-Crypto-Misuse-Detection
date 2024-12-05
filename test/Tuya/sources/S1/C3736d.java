package s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import t1.AbstractC3777h;
import t1.AbstractC3779j;

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3736d extends AbstractC3733a {
    public C3736d(List list) {
        d(list);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = AbstractC3777h.a(str);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return AbstractC3777h.b((List) this.f37835a);
    }

    @Override // s1.AbstractC3733a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        int indexOf;
        int i9 = i8 + 12;
        int a8 = AbstractC3779j.a(str.substring(i8, i9));
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

    @Override // s1.AbstractC3733a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
