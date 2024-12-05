package s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: s1.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3739g extends AbstractC3733a {

    /* renamed from: b, reason: collision with root package name */
    private int f37838b;

    /* renamed from: c, reason: collision with root package name */
    private int f37839c;

    public C3739g(int i8, List list) {
        this.f37838b = i8;
        this.f37839c = list.size();
        d(list);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = t1.k.a(str, this.f37838b, this.f37839c);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return t1.k.b((List) this.f37835a, this.f37838b, this.f37839c);
    }

    @Override // s1.AbstractC3733a
    public void d(Object obj) {
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < this.f37839c; size++) {
            arrayList.add(0);
        }
        int size2 = arrayList.size();
        int i8 = this.f37839c;
        if (size2 > i8) {
            arrayList = arrayList.subList(0, i8);
        }
        super.d(arrayList);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f37838b * this.f37839c) + i8);
    }

    @Override // s1.AbstractC3733a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
