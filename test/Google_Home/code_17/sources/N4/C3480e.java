package n4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0984e;
import A6.C0985e0;
import A6.C0989h;
import A6.n0;
import A6.r0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w6.l;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: n4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3480e {
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f35455d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final w6.b[] f35456e = {null, new C0984e(r0.f595a), g.Companion.serializer()};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35457a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f35458b;

    /* renamed from: c, reason: collision with root package name */
    private final g f35459c;

    /* renamed from: n4.e$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35460a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f35461b;

        static {
            a aVar = new a();
            f35460a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.uicore.address.FieldSchema", aVar, 3);
            c0985e0.k("isNumeric", true);
            c0985e0.k("examples", true);
            c0985e0.k("nameType", false);
            f35461b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f35461b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b[] bVarArr = C3480e.f35456e;
            return new w6.b[]{C0989h.f567a, bVarArr[1], bVarArr[2]};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3480e b(z6.e decoder) {
            boolean z8;
            int i8;
            ArrayList arrayList;
            g gVar;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = C3480e.f35456e;
            if (d8.w()) {
                boolean f8 = d8.f(a8, 0);
                ArrayList arrayList2 = (ArrayList) d8.x(a8, 1, bVarArr[1], null);
                gVar = (g) d8.x(a8, 2, bVarArr[2], null);
                z8 = f8;
                arrayList = arrayList2;
                i8 = 7;
            } else {
                ArrayList arrayList3 = null;
                g gVar2 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 == 2) {
                                    gVar2 = (g) d8.x(a8, 2, bVarArr[2], gVar2);
                                    i9 |= 4;
                                } else {
                                    throw new l(g8);
                                }
                            } else {
                                arrayList3 = (ArrayList) d8.x(a8, 1, bVarArr[1], arrayList3);
                                i9 |= 2;
                            }
                        } else {
                            z9 = d8.f(a8, 0);
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
            d8.b(a8);
            return new C3480e(i8, z8, arrayList, gVar, (n0) null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C3480e value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C3480e.d(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: n4.e$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f35460a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ C3480e(int i8, boolean z8, ArrayList arrayList, g gVar, n0 n0Var) {
        if (4 != (i8 & 4)) {
            AbstractC0983d0.a(i8, 4, a.f35460a.a());
        }
        this.f35457a = (i8 & 1) == 0 ? false : z8;
        if ((i8 & 2) == 0) {
            this.f35458b = new ArrayList();
        } else {
            this.f35458b = arrayList;
        }
        this.f35459c = gVar;
    }

    public static final /* synthetic */ void d(C3480e c3480e, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f35456e;
        if (dVar.p(fVar, 0) || c3480e.f35457a) {
            dVar.s(fVar, 0, c3480e.f35457a);
        }
        if (dVar.p(fVar, 1) || !AbstractC3255y.d(c3480e.f35458b, new ArrayList())) {
            dVar.C(fVar, 1, bVarArr[1], c3480e.f35458b);
        }
        dVar.C(fVar, 2, bVarArr[2], c3480e.f35459c);
    }

    public final g b() {
        return this.f35459c;
    }

    public final boolean c() {
        return this.f35457a;
    }

    public C3480e(boolean z8, ArrayList examples, g nameType) {
        AbstractC3255y.i(examples, "examples");
        AbstractC3255y.i(nameType, "nameType");
        this.f35457a = z8;
        this.f35458b = examples;
        this.f35459c = nameType;
    }

    public /* synthetic */ C3480e(boolean z8, ArrayList arrayList, g gVar, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? new ArrayList() : arrayList, gVar);
    }
}
