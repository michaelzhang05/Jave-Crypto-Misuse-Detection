package z6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y6.AbstractC3999a;
import y6.AbstractC4007i;

/* renamed from: z6.J, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C4039J extends C4037H {

    /* renamed from: k, reason: collision with root package name */
    private final y6.v f40496k;

    /* renamed from: l, reason: collision with root package name */
    private final List f40497l;

    /* renamed from: m, reason: collision with root package name */
    private final int f40498m;

    /* renamed from: n, reason: collision with root package name */
    private int f40499n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4039J(AbstractC3999a json, y6.v value) {
        super(json, value, null, null, 12, null);
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(value, "value");
        this.f40496k = value;
        List W02 = AbstractC1246t.W0(s0().keySet());
        this.f40497l = W02;
        this.f40498m = W02.size() * 2;
        this.f40499n = -1;
    }

    @Override // z6.C4037H, z6.AbstractC4043c, w6.c
    public void a(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
    }

    @Override // z6.C4037H, x6.V
    protected String a0(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return (String) this.f40497l.get(i8 / 2);
    }

    @Override // z6.C4037H, z6.AbstractC4043c
    protected AbstractC4007i e0(String tag) {
        AbstractC3159y.i(tag, "tag");
        if (this.f40499n % 2 == 0) {
            return y6.j.a(tag);
        }
        return (AbstractC4007i) M5.Q.i(s0(), tag);
    }

    @Override // z6.C4037H, w6.c
    public int p(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        int i8 = this.f40499n;
        if (i8 < this.f40498m - 1) {
            int i9 = i8 + 1;
            this.f40499n = i9;
            return i9;
        }
        return -1;
    }

    @Override // z6.C4037H, z6.AbstractC4043c
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public y6.v s0() {
        return this.f40496k;
    }
}
