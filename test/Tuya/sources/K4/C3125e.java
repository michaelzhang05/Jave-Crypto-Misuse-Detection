package k4;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.l;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3943e;
import x6.C3944e0;
import x6.C3948h;
import x6.n0;
import x6.r0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: k4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3125e {
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f33463d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final t6.b[] f33464e = {null, new C3943e(r0.f39600a), g.Companion.serializer()};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33465a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f33466b;

    /* renamed from: c, reason: collision with root package name */
    private final g f33467c;

    /* renamed from: k4.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33468a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f33469b;

        static {
            a aVar = new a();
            f33468a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.uicore.address.FieldSchema", aVar, 3);
            c3944e0.k("isNumeric", true);
            c3944e0.k("examples", true);
            c3944e0.k("nameType", false);
            f33469b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f33469b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b[] bVarArr = C3125e.f33464e;
            return new t6.b[]{C3948h.f39572a, bVarArr[1], bVarArr[2]};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3125e c(w6.e decoder) {
            boolean z8;
            int i8;
            ArrayList arrayList;
            g gVar;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = C3125e.f33464e;
            if (d8.z()) {
                boolean j8 = d8.j(a8, 0);
                ArrayList arrayList2 = (ArrayList) d8.r(a8, 1, bVarArr[1], null);
                gVar = (g) d8.r(a8, 2, bVarArr[2], null);
                z8 = j8;
                arrayList = arrayList2;
                i8 = 7;
            } else {
                ArrayList arrayList3 = null;
                g gVar2 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 == 2) {
                                    gVar2 = (g) d8.r(a8, 2, bVarArr[2], gVar2);
                                    i9 |= 4;
                                } else {
                                    throw new l(p8);
                                }
                            } else {
                                arrayList3 = (ArrayList) d8.r(a8, 1, bVarArr[1], arrayList3);
                                i9 |= 2;
                            }
                        } else {
                            z9 = d8.j(a8, 0);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                arrayList = arrayList3;
                gVar = gVar2;
            }
            d8.a(a8);
            return new C3125e(i8, z8, arrayList, gVar, (n0) null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C3125e value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C3125e.d(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: k4.e$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f33468a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ C3125e(int i8, boolean z8, ArrayList arrayList, g gVar, n0 n0Var) {
        if (4 != (i8 & 4)) {
            AbstractC3942d0.a(i8, 4, a.f33468a.a());
        }
        this.f33465a = (i8 & 1) == 0 ? false : z8;
        if ((i8 & 2) == 0) {
            this.f33466b = new ArrayList();
        } else {
            this.f33466b = arrayList;
        }
        this.f33467c = gVar;
    }

    public static final /* synthetic */ void d(C3125e c3125e, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f33464e;
        if (dVar.i(fVar, 0) || c3125e.f33465a) {
            dVar.o(fVar, 0, c3125e.f33465a);
        }
        if (dVar.i(fVar, 1) || !AbstractC3159y.d(c3125e.f33466b, new ArrayList())) {
            dVar.A(fVar, 1, bVarArr[1], c3125e.f33466b);
        }
        dVar.A(fVar, 2, bVarArr[2], c3125e.f33467c);
    }

    public final g b() {
        return this.f33467c;
    }

    public final boolean c() {
        return this.f33465a;
    }

    public C3125e(boolean z8, ArrayList examples, g nameType) {
        AbstractC3159y.i(examples, "examples");
        AbstractC3159y.i(nameType, "nameType");
        this.f33465a = z8;
        this.f33466b = examples;
        this.f33467c = nameType;
    }

    public /* synthetic */ C3125e(boolean z8, ArrayList arrayList, g gVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? new ArrayList() : arrayList, gVar);
    }
}
