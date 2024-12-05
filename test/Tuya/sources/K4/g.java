package k4;

import L5.InterfaceC1227k;
import L5.l;
import L5.o;
import androidx.annotation.RestrictTo;
import j4.AbstractC3081g;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import r2.AbstractC3685e;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: B, reason: collision with root package name */
    private static final /* synthetic */ g[] f33486B;

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ R5.a f33487C;
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1227k f33488b;

    /* renamed from: a, reason: collision with root package name */
    private final int f33513a;

    /* renamed from: c, reason: collision with root package name */
    public static final g f33489c = new g("Area", 0, AbstractC3081g.f33196i);

    /* renamed from: d, reason: collision with root package name */
    public static final g f33490d = new g("Cedex", 1, AbstractC3081g.f33193f);

    /* renamed from: e, reason: collision with root package name */
    public static final g f33491e = new g("City", 2, AbstractC3685e.f37575b);

    /* renamed from: f, reason: collision with root package name */
    public static final g f33492f = new g("Country", 3, AbstractC3685e.f37576c);

    /* renamed from: g, reason: collision with root package name */
    public static final g f33493g = new g("County", 4, AbstractC3685e.f37577d);

    /* renamed from: h, reason: collision with root package name */
    public static final g f33494h = new g("Department", 5, AbstractC3081g.f33194g);

    /* renamed from: i, reason: collision with root package name */
    public static final g f33495i = new g("District", 6, AbstractC3081g.f33195h);

    /* renamed from: j, reason: collision with root package name */
    public static final g f33496j = new g("DoSi", 7, AbstractC3081g.f33202o);

    /* renamed from: k, reason: collision with root package name */
    public static final g f33497k = new g("Eircode", 8, AbstractC3081g.f33197j);

    /* renamed from: l, reason: collision with root package name */
    public static final g f33498l = new g("Emirate", 9, AbstractC3081g.f33190c);

    /* renamed from: m, reason: collision with root package name */
    public static final g f33499m = new g("Island", 10, AbstractC3081g.f33200m);

    /* renamed from: n, reason: collision with root package name */
    public static final g f33500n = new g("Neighborhood", 11, AbstractC3081g.f33203p);

    /* renamed from: o, reason: collision with root package name */
    public static final g f33501o = new g("Oblast", 12, AbstractC3081g.f33204q);

    /* renamed from: p, reason: collision with root package name */
    public static final g f33502p = new g("Parish", 13, AbstractC3081g.f33192e);

    /* renamed from: q, reason: collision with root package name */
    public static final g f33503q = new g("Pin", 14, AbstractC3081g.f33199l);

    /* renamed from: r, reason: collision with root package name */
    public static final g f33504r = new g("PostTown", 15, AbstractC3081g.f33205r);

    /* renamed from: s, reason: collision with root package name */
    public static final g f33505s = new g("Postal", 16, AbstractC3685e.f37580g);

    /* renamed from: t, reason: collision with root package name */
    public static final g f33506t = new g("Perfecture", 17, AbstractC3081g.f33201n);

    /* renamed from: u, reason: collision with root package name */
    public static final g f33507u = new g("Province", 18, AbstractC3685e.f37581h);

    /* renamed from: v, reason: collision with root package name */
    public static final g f33508v = new g("State", 19, AbstractC3685e.f37582i);

    /* renamed from: w, reason: collision with root package name */
    public static final g f33509w = new g("Suburb", 20, AbstractC3081g.f33206s);

    /* renamed from: x, reason: collision with root package name */
    public static final g f33510x = new g("SuburbOrCity", 21, AbstractC3081g.f33191d);

    /* renamed from: y, reason: collision with root package name */
    public static final g f33511y = new g("Townload", 22, AbstractC3081g.f33198k);

    /* renamed from: z, reason: collision with root package name */
    public static final g f33512z = new g("VillageTownship", 23, AbstractC3081g.f33207t);

    /* renamed from: A, reason: collision with root package name */
    public static final g f33485A = new g("Zip", 24, AbstractC3685e.f37583j);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33514a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.uicore.address.NameType", g.values(), new String[]{"area", "cedex", "city", "country", "county", "department", "district", "do_si", "eircode", "emirate", "island", "neighborhood", "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", "state", "suburb", "suburb_or_city", "townland", "village_township", "zip"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) g.f33488b.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        g[] a8 = a();
        f33486B = a8;
        f33487C = R5.b.a(a8);
        Companion = new b(null);
        f33488b = l.a(o.f6505b, a.f33514a);
    }

    private g(String str, int i8, int i9) {
        this.f33513a = i9;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f33489c, f33490d, f33491e, f33492f, f33493g, f33494h, f33495i, f33496j, f33497k, f33498l, f33499m, f33500n, f33501o, f33502p, f33503q, f33504r, f33505s, f33506t, f33507u, f33508v, f33509w, f33510x, f33511y, f33512z, f33485A};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f33486B.clone();
    }

    public final int c() {
        return this.f33513a;
    }
}
