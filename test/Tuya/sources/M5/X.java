package M5;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class X extends AbstractC1230c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final List f7019a;

    /* renamed from: b, reason: collision with root package name */
    private int f7020b;

    /* renamed from: c, reason: collision with root package name */
    private int f7021c;

    public X(List list) {
        AbstractC3159y.i(list, "list");
        this.f7019a = list;
    }

    public final void a(int i8, int i9) {
        AbstractC1230c.Companion.d(i8, i9, this.f7019a.size());
        this.f7020b = i8;
        this.f7021c = i9 - i8;
    }

    @Override // M5.AbstractC1230c, java.util.List
    public Object get(int i8) {
        AbstractC1230c.Companion.b(i8, this.f7021c);
        return this.f7019a.get(this.f7020b + i8);
    }

    @Override // M5.AbstractC1230c, M5.AbstractC1228a
    public int getSize() {
        return this.f7021c;
    }
}
