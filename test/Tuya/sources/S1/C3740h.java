package s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import t1.AbstractC3779j;
import t1.l;

/* renamed from: s1.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3740h extends AbstractC3733a {
    /* JADX INFO: Access modifiers changed from: protected */
    public C3740h() {
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = l.a(str);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return l.b((List) this.f37835a);
    }

    @Override // s1.AbstractC3733a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        int i9 = i8 + 12;
        int a8 = AbstractC3779j.a(str.substring(i8, i9));
        for (int i10 = 0; i10 < a8; i10++) {
            if (str.charAt(i9) == '1') {
                i9 += 33;
            } else {
                i9 += 17;
            }
        }
        return str.substring(i8, i9);
    }

    @Override // s1.AbstractC3733a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }

    public C3740h(List list) {
        d(list);
    }
}
