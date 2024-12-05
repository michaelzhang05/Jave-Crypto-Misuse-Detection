package J3;

import J3.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f4833a = new H();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4834a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m17invoke() {
        }
    }

    private H() {
    }

    public final G a(boolean z8, boolean z9, G.a editable) {
        int i8;
        int i9;
        G.a.C0093a c0093a;
        boolean z10;
        G.a.C0093a c0093a2;
        Function0 function0;
        AbstractC3159y.i(editable, "editable");
        if (z8) {
            i8 = q3.t.f37400g;
        } else {
            i8 = q3.t.f37411r;
        }
        int i10 = i8;
        if (z8) {
            i9 = b4.n.f14718c;
        } else {
            i9 = q3.w.f37429E;
        }
        int i11 = i9;
        boolean z11 = !z9;
        boolean z12 = editable instanceof G.a.C0093a;
        G.a.C0093a c0093a3 = null;
        if (z12) {
            c0093a = (G.a.C0093a) editable;
        } else {
            c0093a = null;
        }
        boolean z13 = false;
        if (c0093a != null && c0093a.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12) {
            c0093a2 = (G.a.C0093a) editable;
        } else {
            c0093a2 = null;
        }
        if (c0093a2 != null && c0093a2.c()) {
            z13 = true;
        }
        if (z12) {
            c0093a3 = (G.a.C0093a) editable;
        }
        if (c0093a3 == null || (function0 = c0093a3.b()) == null) {
            function0 = a.f4834a;
        }
        return new G(i10, i11, z11, z10, z13, function0);
    }
}
