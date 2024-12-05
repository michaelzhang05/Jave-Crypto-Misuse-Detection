package P5;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class X extends AbstractC1362c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final List f8843a;

    /* renamed from: b, reason: collision with root package name */
    private int f8844b;

    /* renamed from: c, reason: collision with root package name */
    private int f8845c;

    public X(List list) {
        AbstractC3255y.i(list, "list");
        this.f8843a = list;
    }

    public final void c(int i8, int i9) {
        AbstractC1362c.Companion.d(i8, i9, this.f8843a.size());
        this.f8844b = i8;
        this.f8845c = i9 - i8;
    }

    @Override // P5.AbstractC1362c, java.util.List
    public Object get(int i8) {
        AbstractC1362c.Companion.b(i8, this.f8845c);
        return this.f8843a.get(this.f8844b + i8);
    }

    @Override // P5.AbstractC1362c, P5.AbstractC1360a
    public int getSize() {
        return this.f8845c;
    }
}
