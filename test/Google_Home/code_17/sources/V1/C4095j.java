package v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntSupplier;
import w1.AbstractC4132i;

/* renamed from: v1.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4095j extends AbstractC4086a {

    /* renamed from: b, reason: collision with root package name */
    private IntSupplier f40114b;

    public C4095j(IntSupplier intSupplier, List list) {
        this.f40114b = intSupplier;
        d(list);
    }

    @Override // v1.AbstractC4086a
    public void a(String str) {
        this.f40108a = AbstractC4132i.a(str);
    }

    @Override // v1.AbstractC4086a
    public String b() {
        return AbstractC4132i.b((List) this.f40108a, this.f40114b.getAsInt());
    }

    @Override // v1.AbstractC4086a
    public void d(Object obj) {
        int asInt = this.f40114b.getAsInt();
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < asInt; size++) {
            arrayList.add(Boolean.FALSE);
        }
        if (arrayList.size() > asInt) {
            arrayList = arrayList.subList(0, asInt);
        }
        super.d(arrayList);
    }

    @Override // v1.AbstractC4086a
    public String e(String str, int i8) {
        return str.substring(i8, this.f40114b.getAsInt() + i8);
    }

    @Override // v1.AbstractC4086a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
