package n4;

import A6.AbstractC1005y;
import O5.InterfaceC1355k;
import O5.l;
import O5.o;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3435g;
import u2.AbstractC4058e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: B, reason: collision with root package name */
    private static final /* synthetic */ g[] f35478B;

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ U5.a f35479C;
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1355k f35480b;

    /* renamed from: a, reason: collision with root package name */
    private final int f35505a;

    /* renamed from: c, reason: collision with root package name */
    public static final g f35481c = new g("Area", 0, AbstractC3435g.f35172i);

    /* renamed from: d, reason: collision with root package name */
    public static final g f35482d = new g("Cedex", 1, AbstractC3435g.f35169f);

    /* renamed from: e, reason: collision with root package name */
    public static final g f35483e = new g("City", 2, AbstractC4058e.f39955b);

    /* renamed from: f, reason: collision with root package name */
    public static final g f35484f = new g("Country", 3, AbstractC4058e.f39956c);

    /* renamed from: g, reason: collision with root package name */
    public static final g f35485g = new g("County", 4, AbstractC4058e.f39957d);

    /* renamed from: h, reason: collision with root package name */
    public static final g f35486h = new g("Department", 5, AbstractC3435g.f35170g);

    /* renamed from: i, reason: collision with root package name */
    public static final g f35487i = new g("District", 6, AbstractC3435g.f35171h);

    /* renamed from: j, reason: collision with root package name */
    public static final g f35488j = new g("DoSi", 7, AbstractC3435g.f35178o);

    /* renamed from: k, reason: collision with root package name */
    public static final g f35489k = new g("Eircode", 8, AbstractC3435g.f35173j);

    /* renamed from: l, reason: collision with root package name */
    public static final g f35490l = new g("Emirate", 9, AbstractC3435g.f35166c);

    /* renamed from: m, reason: collision with root package name */
    public static final g f35491m = new g("Island", 10, AbstractC3435g.f35176m);

    /* renamed from: n, reason: collision with root package name */
    public static final g f35492n = new g("Neighborhood", 11, AbstractC3435g.f35179p);

    /* renamed from: o, reason: collision with root package name */
    public static final g f35493o = new g("Oblast", 12, AbstractC3435g.f35180q);

    /* renamed from: p, reason: collision with root package name */
    public static final g f35494p = new g("Parish", 13, AbstractC3435g.f35168e);

    /* renamed from: q, reason: collision with root package name */
    public static final g f35495q = new g("Pin", 14, AbstractC3435g.f35175l);

    /* renamed from: r, reason: collision with root package name */
    public static final g f35496r = new g("PostTown", 15, AbstractC3435g.f35181r);

    /* renamed from: s, reason: collision with root package name */
    public static final g f35497s = new g("Postal", 16, AbstractC4058e.f39960g);

    /* renamed from: t, reason: collision with root package name */
    public static final g f35498t = new g("Perfecture", 17, AbstractC3435g.f35177n);

    /* renamed from: u, reason: collision with root package name */
    public static final g f35499u = new g("Province", 18, AbstractC4058e.f39961h);

    /* renamed from: v, reason: collision with root package name */
    public static final g f35500v = new g("State", 19, AbstractC4058e.f39962i);

    /* renamed from: w, reason: collision with root package name */
    public static final g f35501w = new g("Suburb", 20, AbstractC3435g.f35182s);

    /* renamed from: x, reason: collision with root package name */
    public static final g f35502x = new g("SuburbOrCity", 21, AbstractC3435g.f35167d);

    /* renamed from: y, reason: collision with root package name */
    public static final g f35503y = new g("Townload", 22, AbstractC3435g.f35174k);

    /* renamed from: z, reason: collision with root package name */
    public static final g f35504z = new g("VillageTownship", 23, AbstractC3435g.f35183t);

    /* renamed from: A, reason: collision with root package name */
    public static final g f35477A = new g("Zip", 24, AbstractC4058e.f39963j);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35506a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return AbstractC1005y.a("com.stripe.android.uicore.address.NameType", g.values(), new String[]{"area", "cedex", "city", "country", "county", "department", "district", "do_si", "eircode", "emirate", "island", "neighborhood", "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", "state", "suburb", "suburb_or_city", "townland", "village_township", "zip"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ w6.b a() {
            return (w6.b) g.f35480b.getValue();
        }

        public final w6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        g[] a8 = a();
        f35478B = a8;
        f35479C = U5.b.a(a8);
        Companion = new b(null);
        f35480b = l.a(o.f8296b, a.f35506a);
    }

    private g(String str, int i8, int i9) {
        this.f35505a = i9;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f35481c, f35482d, f35483e, f35484f, f35485g, f35486h, f35487i, f35488j, f35489k, f35490l, f35491m, f35492n, f35493o, f35494p, f35495q, f35496r, f35497s, f35498t, f35499u, f35500v, f35501w, f35502x, f35503y, f35504z, f35477A};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f35478B.clone();
    }

    public final int c() {
        return this.f35505a;
    }
}
