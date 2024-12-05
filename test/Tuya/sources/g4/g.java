package g4;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import g4.b;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.l;
import u6.AbstractC3808a;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3943e;
import x6.C3944e0;
import x6.n0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class g {
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f31235b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final t6.b[] f31236c = {new C3943e(b.a.f31223a)};

    /* renamed from: a, reason: collision with root package name */
    private final List f31237a;

    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31238a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f31239b;

        static {
            a aVar = new a();
            f31238a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.autocomplete.model.Place", aVar, 1);
            c3944e0.k("address_components", false);
            f31239b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f31239b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{AbstractC3808a.p(g.f31236c[0])};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g c(w6.e decoder) {
            List list;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = g.f31236c;
            int i8 = 1;
            n0 n0Var = null;
            if (d8.z()) {
                list = (List) d8.y(a8, 0, bVarArr[0], null);
            } else {
                List list2 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 == 0) {
                            list2 = (List) d8.y(a8, 0, bVarArr[0], list2);
                            i9 = 1;
                        } else {
                            throw new l(p8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                list = list2;
                i8 = i9;
            }
            d8.a(a8);
            return new g(i8, list, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, g value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            g.c(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f31238a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f31240b = new c("ADMINISTRATIVE_AREA_LEVEL_1", 0, "administrative_area_level_1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f31241c = new c("ADMINISTRATIVE_AREA_LEVEL_2", 1, "administrative_area_level_2");

        /* renamed from: d, reason: collision with root package name */
        public static final c f31242d = new c("ADMINISTRATIVE_AREA_LEVEL_3", 2, "administrative_area_level_3");

        /* renamed from: e, reason: collision with root package name */
        public static final c f31243e = new c("ADMINISTRATIVE_AREA_LEVEL_4", 3, "administrative_area_level_4");

        /* renamed from: f, reason: collision with root package name */
        public static final c f31244f = new c("COUNTRY", 4, "country");

        /* renamed from: g, reason: collision with root package name */
        public static final c f31245g = new c("LOCALITY", 5, "locality");

        /* renamed from: h, reason: collision with root package name */
        public static final c f31246h = new c("NEIGHBORHOOD", 6, "neighborhood");

        /* renamed from: i, reason: collision with root package name */
        public static final c f31247i = new c("POSTAL_TOWN", 7, "postal_town");

        /* renamed from: j, reason: collision with root package name */
        public static final c f31248j = new c("POSTAL_CODE", 8, "postal_code");

        /* renamed from: k, reason: collision with root package name */
        public static final c f31249k = new c("PREMISE", 9, "premise");

        /* renamed from: l, reason: collision with root package name */
        public static final c f31250l = new c("ROUTE", 10, "route");

        /* renamed from: m, reason: collision with root package name */
        public static final c f31251m = new c("STREET_NUMBER", 11, "street_number");

        /* renamed from: n, reason: collision with root package name */
        public static final c f31252n = new c("SUBLOCALITY", 12, "sublocality");

        /* renamed from: o, reason: collision with root package name */
        public static final c f31253o = new c("SUBLOCALITY_LEVEL_1", 13, "sublocality_level_1");

        /* renamed from: p, reason: collision with root package name */
        public static final c f31254p = new c("SUBLOCALITY_LEVEL_2", 14, "sublocality_level_2");

        /* renamed from: q, reason: collision with root package name */
        public static final c f31255q = new c("SUBLOCALITY_LEVEL_3", 15, "sublocality_level_3");

        /* renamed from: r, reason: collision with root package name */
        public static final c f31256r = new c("SUBLOCALITY_LEVEL_4", 16, "sublocality_level_4");

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ c[] f31257s;

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ R5.a f31258t;

        /* renamed from: a, reason: collision with root package name */
        private final String f31259a;

        static {
            c[] a8 = a();
            f31257s = a8;
            f31258t = R5.b.a(a8);
        }

        private c(String str, int i8, String str2) {
            this.f31259a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f31240b, f31241c, f31242d, f31243e, f31244f, f31245g, f31246h, f31247i, f31248j, f31249k, f31250l, f31251m, f31252n, f31253o, f31254p, f31255q, f31256r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f31257s.clone();
        }

        public final String b() {
            return this.f31259a;
        }
    }

    public /* synthetic */ g(int i8, List list, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC3942d0.a(i8, 1, a.f31238a.a());
        }
        this.f31237a = list;
    }

    public static final /* synthetic */ void c(g gVar, w6.d dVar, v6.f fVar) {
        dVar.u(fVar, 0, f31236c[0], gVar.f31237a);
    }

    public final List b() {
        return this.f31237a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && AbstractC3159y.d(this.f31237a, ((g) obj).f31237a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List list = this.f31237a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Place(addressComponents=" + this.f31237a + ")";
    }

    public g(List list) {
        this.f31237a = list;
    }
}
