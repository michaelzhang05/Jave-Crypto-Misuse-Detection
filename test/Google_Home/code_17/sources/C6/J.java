package C6;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
final class J extends H {

    /* renamed from: k, reason: collision with root package name */
    private final B6.v f1614k;

    /* renamed from: l, reason: collision with root package name */
    private final List f1615l;

    /* renamed from: m, reason: collision with root package name */
    private final int f1616m;

    /* renamed from: n, reason: collision with root package name */
    private int f1617n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(B6.a json, B6.v value) {
        super(json, value, null, null, 12, null);
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(value, "value");
        this.f1614k = value;
        List W02 = AbstractC1378t.W0(s0().keySet());
        this.f1615l = W02;
        this.f1616m = W02.size() * 2;
        this.f1617n = -1;
    }

    @Override // C6.H, A6.V
    protected String a0(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return (String) this.f1615l.get(i8 / 2);
    }

    @Override // C6.H, C6.AbstractC1032c, z6.c
    public void b(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
    }

    @Override // C6.H, C6.AbstractC1032c
    protected B6.i e0(String tag) {
        AbstractC3255y.i(tag, "tag");
        if (this.f1617n % 2 == 0) {
            return B6.j.a(tag);
        }
        return (B6.i) P5.Q.i(s0(), tag);
    }

    @Override // C6.H, z6.c
    public int g(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        int i8 = this.f1617n;
        if (i8 < this.f1616m - 1) {
            int i9 = i8 + 1;
            this.f1617n = i9;
            return i9;
        }
        return -1;
    }

    @Override // C6.H, C6.AbstractC1032c
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public B6.v s0() {
        return this.f1614k;
    }
}
