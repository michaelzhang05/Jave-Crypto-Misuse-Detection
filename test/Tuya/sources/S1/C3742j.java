package s1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntSupplier;
import t1.AbstractC3778i;

/* renamed from: s1.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3742j extends AbstractC3733a {

    /* renamed from: b, reason: collision with root package name */
    private IntSupplier f37841b;

    public C3742j(IntSupplier intSupplier, List list) {
        this.f37841b = intSupplier;
        d(list);
    }

    @Override // s1.AbstractC3733a
    public void a(String str) {
        this.f37835a = AbstractC3778i.a(str);
    }

    @Override // s1.AbstractC3733a
    public String b() {
        return AbstractC3778i.b((List) this.f37835a, this.f37841b.getAsInt());
    }

    @Override // s1.AbstractC3733a
    public void d(Object obj) {
        int asInt = this.f37841b.getAsInt();
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < asInt; size++) {
            arrayList.add(Boolean.FALSE);
        }
        if (arrayList.size() > asInt) {
            arrayList = arrayList.subList(0, asInt);
        }
        super.d(arrayList);
    }

    @Override // s1.AbstractC3733a
    public String e(String str, int i8) {
        return str.substring(i8, this.f37841b.getAsInt() + i8);
    }

    @Override // s1.AbstractC3733a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
