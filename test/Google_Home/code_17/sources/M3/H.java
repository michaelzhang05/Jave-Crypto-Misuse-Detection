package M3;

import M3.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f6539a = new H();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6540a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m22invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m22invoke() {
        }
    }

    private H() {
    }

    public final G a(boolean z8, boolean z9, G.a editable) {
        int i8;
        int i9;
        G.a.C0118a c0118a;
        boolean z10;
        G.a.C0118a c0118a2;
        Function0 function0;
        AbstractC3255y.i(editable, "editable");
        if (z8) {
            i8 = t3.t.f39722g;
        } else {
            i8 = t3.t.f39733r;
        }
        int i10 = i8;
        if (z8) {
            i9 = e4.n.f31724c;
        } else {
            i9 = t3.w.f39751E;
        }
        int i11 = i9;
        boolean z11 = !z9;
        boolean z12 = editable instanceof G.a.C0118a;
        G.a.C0118a c0118a3 = null;
        if (z12) {
            c0118a = (G.a.C0118a) editable;
        } else {
            c0118a = null;
        }
        boolean z13 = false;
        if (c0118a != null && c0118a.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12) {
            c0118a2 = (G.a.C0118a) editable;
        } else {
            c0118a2 = null;
        }
        if (c0118a2 != null && c0118a2.c()) {
            z13 = true;
        }
        if (z12) {
            c0118a3 = (G.a.C0118a) editable;
        }
        if (c0118a3 == null || (function0 = c0118a3.b()) == null) {
            function0 = a.f6540a;
        }
        return new G(i10, i11, z11, z10, z13, function0);
    }
}
