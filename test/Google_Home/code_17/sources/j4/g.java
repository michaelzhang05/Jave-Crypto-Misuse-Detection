package j4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0984e;
import A6.C0985e0;
import A6.n0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import j4.b;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w6.l;
import x6.AbstractC4193a;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class g {
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f33962b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final w6.b[] f33963c = {new C0984e(b.a.f33950a)};

    /* renamed from: a, reason: collision with root package name */
    private final List f33964a;

    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33965a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f33966b;

        static {
            a aVar = new a();
            f33965a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.autocomplete.model.Place", aVar, 1);
            c0985e0.k("address_components", false);
            f33966b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f33966b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{AbstractC4193a.p(g.f33963c[0])};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g b(z6.e decoder) {
            List list;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = g.f33963c;
            int i8 = 1;
            n0 n0Var = null;
            if (d8.w()) {
                list = (List) d8.q(a8, 0, bVarArr[0], null);
            } else {
                List list2 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 == 0) {
                            list2 = (List) d8.q(a8, 0, bVarArr[0], list2);
                            i9 = 1;
                        } else {
                            throw new l(g8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                list = list2;
                i8 = i9;
            }
            d8.b(a8);
            return new g(i8, list, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, g value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            g.c(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f33965a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f33967b = new c("ADMINISTRATIVE_AREA_LEVEL_1", 0, "administrative_area_level_1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f33968c = new c("ADMINISTRATIVE_AREA_LEVEL_2", 1, "administrative_area_level_2");

        /* renamed from: d, reason: collision with root package name */
        public static final c f33969d = new c("ADMINISTRATIVE_AREA_LEVEL_3", 2, "administrative_area_level_3");

        /* renamed from: e, reason: collision with root package name */
        public static final c f33970e = new c("ADMINISTRATIVE_AREA_LEVEL_4", 3, "administrative_area_level_4");

        /* renamed from: f, reason: collision with root package name */
        public static final c f33971f = new c("COUNTRY", 4, "country");

        /* renamed from: g, reason: collision with root package name */
        public static final c f33972g = new c("LOCALITY", 5, "locality");

        /* renamed from: h, reason: collision with root package name */
        public static final c f33973h = new c("NEIGHBORHOOD", 6, "neighborhood");

        /* renamed from: i, reason: collision with root package name */
        public static final c f33974i = new c("POSTAL_TOWN", 7, "postal_town");

        /* renamed from: j, reason: collision with root package name */
        public static final c f33975j = new c("POSTAL_CODE", 8, "postal_code");

        /* renamed from: k, reason: collision with root package name */
        public static final c f33976k = new c("PREMISE", 9, "premise");

        /* renamed from: l, reason: collision with root package name */
        public static final c f33977l = new c("ROUTE", 10, "route");

        /* renamed from: m, reason: collision with root package name */
        public static final c f33978m = new c("STREET_NUMBER", 11, "street_number");

        /* renamed from: n, reason: collision with root package name */
        public static final c f33979n = new c("SUBLOCALITY", 12, "sublocality");

        /* renamed from: o, reason: collision with root package name */
        public static final c f33980o = new c("SUBLOCALITY_LEVEL_1", 13, "sublocality_level_1");

        /* renamed from: p, reason: collision with root package name */
        public static final c f33981p = new c("SUBLOCALITY_LEVEL_2", 14, "sublocality_level_2");

        /* renamed from: q, reason: collision with root package name */
        public static final c f33982q = new c("SUBLOCALITY_LEVEL_3", 15, "sublocality_level_3");

        /* renamed from: r, reason: collision with root package name */
        public static final c f33983r = new c("SUBLOCALITY_LEVEL_4", 16, "sublocality_level_4");

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ c[] f33984s;

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ U5.a f33985t;

        /* renamed from: a, reason: collision with root package name */
        private final String f33986a;

        static {
            c[] a8 = a();
            f33984s = a8;
            f33985t = U5.b.a(a8);
        }

        private c(String str, int i8, String str2) {
            this.f33986a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f33967b, f33968c, f33969d, f33970e, f33971f, f33972g, f33973h, f33974i, f33975j, f33976k, f33977l, f33978m, f33979n, f33980o, f33981p, f33982q, f33983r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f33984s.clone();
        }

        public final String b() {
            return this.f33986a;
        }
    }

    public /* synthetic */ g(int i8, List list, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC0983d0.a(i8, 1, a.f33965a.a());
        }
        this.f33964a = list;
    }

    public static final /* synthetic */ void c(g gVar, z6.d dVar, y6.f fVar) {
        dVar.x(fVar, 0, f33963c[0], gVar.f33964a);
    }

    public final List b() {
        return this.f33964a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3255y.d(this.f33964a, ((g) obj).f33964a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List list = this.f33964a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Place(addressComponents=" + this.f33964a + ")";
    }

    public g(List list) {
        this.f33964a = list;
    }
}
