package v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: v1.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4092g extends AbstractC4086a {

    /* renamed from: b, reason: collision with root package name */
    private int f40111b;

    /* renamed from: c, reason: collision with root package name */
    private int f40112c;

    public C4092g(int i8, List list) {
        this.f40111b = i8;
        this.f40112c = list.size();
        d(list);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = w1.k.a(str, this.f40111b, this.f40112c);
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return w1.k.b((List) this.f40108a, this.f40111b, this.f40112c);
    }

    @Override // v1.AbstractC4086a
    public void d(Object obj) {
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < this.f40112c; size++) {
            arrayList.add(0);
        }
        int size2 = arrayList.size();
        int i8 = this.f40112c;
        if (size2 > i8) {
            arrayList = arrayList.subList(0, i8);
        }
        super.d(arrayList);
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f40111b * this.f40112c) + i8);
    }

    @Override // v1.AbstractC4086a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
