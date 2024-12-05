package n4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
import A6.C0989h;
import A6.n0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import n4.C3480e;
import w6.l;
import x6.AbstractC4193a;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: n4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3479d {
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f35448d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final w6.b[] f35449e = {EnumC3481f.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3481f f35450a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35451b;

    /* renamed from: c, reason: collision with root package name */
    private final C3480e f35452c;

    /* renamed from: n4.d$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35453a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f35454b;

        static {
            a aVar = new a();
            f35453a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.uicore.address.CountryAddressSchema", aVar, 3);
            c0985e0.k("type", false);
            c0985e0.k("required", false);
            c0985e0.k("schema", true);
            f35454b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f35454b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{AbstractC4193a.p(C3479d.f35449e[0]), C0989h.f567a, AbstractC4193a.p(C3480e.a.f35460a)};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3479d b(z6.e decoder) {
            boolean z8;
            int i8;
            EnumC3481f enumC3481f;
            C3480e c3480e;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = C3479d.f35449e;
            if (d8.w()) {
                enumC3481f = (EnumC3481f) d8.q(a8, 0, bVarArr[0], null);
                z8 = d8.f(a8, 1);
                c3480e = (C3480e) d8.q(a8, 2, C3480e.a.f35460a, null);
                i8 = 7;
            } else {
                EnumC3481f enumC3481f2 = null;
                C3480e c3480e2 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 == 2) {
                                    c3480e2 = (C3480e) d8.q(a8, 2, C3480e.a.f35460a, c3480e2);
                                    i9 |= 4;
                                } else {
                                    throw new l(g8);
                                }
                            } else {
                                z9 = d8.f(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            enumC3481f2 = (EnumC3481f) d8.q(a8, 0, bVarArr[0], enumC3481f2);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                enumC3481f = enumC3481f2;
                c3480e = c3480e2;
            }
            d8.b(a8);
            return new C3479d(i8, enumC3481f, z8, c3480e, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C3479d value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C3479d.e(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: n4.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f35453a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ C3479d(int i8, EnumC3481f enumC3481f, boolean z8, C3480e c3480e, n0 n0Var) {
        if (3 != (i8 & 3)) {
            AbstractC0983d0.a(i8, 3, a.f35453a.a());
        }
        this.f35450a = enumC3481f;
        this.f35451b = z8;
        if ((i8 & 4) == 0) {
            this.f35452c = null;
        } else {
            this.f35452c = c3480e;
        }
    }

    public static final /* synthetic */ void e(C3479d c3479d, z6.d dVar, y6.f fVar) {
        dVar.x(fVar, 0, f35449e[0], c3479d.f35450a);
        dVar.s(fVar, 1, c3479d.f35451b);
        if (dVar.p(fVar, 2) || c3479d.f35452c != null) {
            dVar.x(fVar, 2, C3480e.a.f35460a, c3479d.f35452c);
        }
    }

    public final boolean b() {
        return this.f35451b;
    }

    public final C3480e c() {
        return this.f35452c;
    }

    public final EnumC3481f d() {
        return this.f35450a;
    }

    public C3479d(EnumC3481f enumC3481f, boolean z8, C3480e c3480e) {
        this.f35450a = enumC3481f;
        this.f35451b = z8;
        this.f35452c = c3480e;
    }
}
