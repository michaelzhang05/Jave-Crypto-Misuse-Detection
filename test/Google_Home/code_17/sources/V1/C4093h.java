package v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import w1.AbstractC4133j;
import w1.l;

/* renamed from: v1.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4093h extends AbstractC4086a {
    /* JADX INFO: Access modifiers changed from: protected */
    public C4093h() {
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = l.a(str);
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return l.b((List) this.f40108a);
    }

    @Override // v1.AbstractC4086a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        int i9 = i8 + 12;
        int a8 = AbstractC4133j.a(str.substring(i8, i9));
        for (int i10 = 0; i10 < a8; i10++) {
            if (str.charAt(i9) == '1') {
                i9 += 33;
            } else {
                i9 += 17;
            }
        }
        return str.substring(i8, i9);
    }

    @Override // v1.AbstractC4086a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }

    public C4093h(List list) {
        d(list);
    }
}
