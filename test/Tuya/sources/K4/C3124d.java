package k4;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import k4.C3125e;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.l;
import u6.AbstractC3808a;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;
import x6.C3948h;
import x6.n0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: k4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3124d {
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f33456d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final t6.b[] f33457e = {EnumC3126f.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3126f f33458a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33459b;

    /* renamed from: c, reason: collision with root package name */
    private final C3125e f33460c;

    /* renamed from: k4.d$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33461a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f33462b;

        static {
            a aVar = new a();
            f33461a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.uicore.address.CountryAddressSchema", aVar, 3);
            c3944e0.k("type", false);
            c3944e0.k("required", false);
            c3944e0.k("schema", true);
            f33462b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f33462b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{AbstractC3808a.p(C3124d.f33457e[0]), C3948h.f39572a, AbstractC3808a.p(C3125e.a.f33468a)};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3124d c(w6.e decoder) {
            boolean z8;
            int i8;
            EnumC3126f enumC3126f;
            C3125e c3125e;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = C3124d.f33457e;
            if (d8.z()) {
                enumC3126f = (EnumC3126f) d8.y(a8, 0, bVarArr[0], null);
                z8 = d8.j(a8, 1);
                c3125e = (C3125e) d8.y(a8, 2, C3125e.a.f33468a, null);
                i8 = 7;
            } else {
                EnumC3126f enumC3126f2 = null;
                C3125e c3125e2 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 == 2) {
                                    c3125e2 = (C3125e) d8.y(a8, 2, C3125e.a.f33468a, c3125e2);
                                    i9 |= 4;
                                } else {
                                    throw new l(p8);
                                }
                            } else {
                                z9 = d8.j(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            enumC3126f2 = (EnumC3126f) d8.y(a8, 0, bVarArr[0], enumC3126f2);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                enumC3126f = enumC3126f2;
                c3125e = c3125e2;
            }
            d8.a(a8);
            return new C3124d(i8, enumC3126f, z8, c3125e, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C3124d value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C3124d.e(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: k4.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f33461a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ C3124d(int i8, EnumC3126f enumC3126f, boolean z8, C3125e c3125e, n0 n0Var) {
        if (3 != (i8 & 3)) {
            AbstractC3942d0.a(i8, 3, a.f33461a.a());
        }
        this.f33458a = enumC3126f;
        this.f33459b = z8;
        if ((i8 & 4) == 0) {
            this.f33460c = null;
        } else {
            this.f33460c = c3125e;
        }
    }

    public static final /* synthetic */ void e(C3124d c3124d, w6.d dVar, v6.f fVar) {
        dVar.u(fVar, 0, f33457e[0], c3124d.f33458a);
        dVar.o(fVar, 1, c3124d.f33459b);
        if (dVar.i(fVar, 2) || c3124d.f33460c != null) {
            dVar.u(fVar, 2, C3125e.a.f33468a, c3124d.f33460c);
        }
    }

    public final boolean b() {
        return this.f33459b;
    }

    public final C3125e c() {
        return this.f33460c;
    }

    public final EnumC3126f d() {
        return this.f33458a;
    }

    public C3124d(EnumC3126f enumC3126f, boolean z8, C3125e c3125e) {
        this.f33458a = enumC3126f;
        this.f33459b = z8;
        this.f33460c = c3125e;
    }
}
