package s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import t1.AbstractC3778i;

/* renamed from: s1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3737e extends AbstractC3733a {

    /* renamed from: b, reason: collision with root package name */
    private int f37836b;

    public C3737e(List list) {
        this.f37836b = list.size();
        d(list);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = AbstractC3778i.a(str);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return AbstractC3778i.b((List) this.f37835a, this.f37836b);
    }

    @Override // s1.AbstractC3733a
    public void d(Object obj) {
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < this.f37836b; size++) {
            arrayList.add(Boolean.FALSE);
        }
        int size2 = arrayList.size();
        int i8 = this.f37836b;
        if (size2 > i8) {
            arrayList = arrayList.subList(0, i8);
        }
        super.d(arrayList);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, this.f37836b + i8);
    }

    @Override // s1.AbstractC3733a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
