package v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import w1.AbstractC4132i;

/* renamed from: v1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4090e extends AbstractC4086a {

    /* renamed from: b, reason: collision with root package name */
    private int f40109b;

    public C4090e(List list) {
        this.f40109b = list.size();
        d(list);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = AbstractC4132i.a(str);
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return AbstractC4132i.b((List) this.f40108a, this.f40109b);
    }

    @Override // v1.AbstractC4086a
    public void d(Object obj) {
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < this.f40109b; size++) {
            arrayList.add(Boolean.FALSE);
        }
        int size2 = arrayList.size();
        int i8 = this.f40109b;
        if (size2 > i8) {
            arrayList = arrayList.subList(0, i8);
        }
        super.d(arrayList);
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        return str.substring(i8, this.f40109b + i8);
    }

    @Override // v1.AbstractC4086a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
