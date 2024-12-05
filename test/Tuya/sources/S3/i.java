package S3;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f9195a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.d f9196b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9197b = new a("MARKET_OR_REGION_RESTRICTION", 0, "RE01");

        /* renamed from: c, reason: collision with root package name */
        public static final a f9198c = new a("PLATFORM_VERSION", 1, "RE02");

        /* renamed from: d, reason: collision with root package name */
        public static final a f9199d = new a("PERMISSION", 2, "RE03");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f9200e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f9201f;

        /* renamed from: a, reason: collision with root package name */
        private final String f9202a;

        static {
            a[] a8 = a();
            f9200e = a8;
            f9201f = R5.b.a(a8);
        }

        private a(String str, int i8, String str2) {
            this.f9202a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f9197b, f9198c, f9199d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9200e.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9202a;
        }
    }

    public i(int i8, Z3.d hardwareIdSupplier) {
        AbstractC3159y.i(hardwareIdSupplier, "hardwareIdSupplier");
        this.f9195a = i8;
        this.f9196b = hardwareIdSupplier;
    }

    @Override // S3.h
    public Map a() {
        return Q.q(Q.q(b(), d()), c());
    }

    public final Map b() {
        HashMap hashMap = new HashMap();
        List p8 = AbstractC1246t.p(g.f9124b, g.f9127c, g.f9130d, g.f9133e, g.f9136f, g.f9139g, g.f9142h, g.f9145i);
        for (g gVar : g.b()) {
            if (!p8.contains(gVar)) {
                hashMap.put(gVar.toString(), a.f9197b.toString());
            }
        }
        return hashMap;
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        String gVar = g.f9086O.toString();
        a aVar = a.f9199d;
        hashMap.put(gVar, aVar.toString());
        hashMap.put(g.f9089P.toString(), aVar.toString());
        hashMap.put(g.f9092Q.toString(), aVar.toString());
        hashMap.put(g.f9095R.toString(), aVar.toString());
        hashMap.put(g.f9098S.toString(), aVar.toString());
        hashMap.put(g.f9101T.toString(), aVar.toString());
        hashMap.put(g.f9104U.toString(), aVar.toString());
        hashMap.put(g.f9107V.toString(), aVar.toString());
        hashMap.put(g.f9110W.toString(), aVar.toString());
        hashMap.put(g.f9113X.toString(), aVar.toString());
        hashMap.put(g.f9116Y.toString(), aVar.toString());
        hashMap.put(g.f9153l.toString(), aVar.toString());
        hashMap.put(g.f9155m.toString(), aVar.toString());
        if (!((j) this.f9196b.get()).c()) {
            hashMap.put(g.f9142h.toString(), a.f9198c.toString());
        }
        hashMap.put(g.f9148j.toString(), aVar.toString());
        hashMap.put(g.f9119Z.toString(), aVar.toString());
        hashMap.put(g.f9162p0.toString(), aVar.toString());
        hashMap.put(g.f9165q0.toString(), aVar.toString());
        hashMap.put(g.f9157n.toString(), aVar.toString());
        hashMap.put(g.f9159o.toString(), aVar.toString());
        hashMap.put(g.f9161p.toString(), aVar.toString());
        hashMap.put(g.f9164q.toString(), aVar.toString());
        hashMap.put(g.f9053D.toString(), aVar.toString());
        hashMap.put(g.f9059F.toString(), aVar.toString());
        hashMap.put(g.f9062G.toString(), aVar.toString());
        hashMap.put(g.f9077L.toString(), aVar.toString());
        hashMap.put(g.f9083N.toString(), aVar.toString());
        hashMap.put(g.f9051C0.toString(), aVar.toString());
        hashMap.put(g.f9120Z0.toString(), aVar.toString());
        return hashMap;
    }

    public final Map d() {
        HashMap hashMap = new HashMap();
        if (this.f9195a < 26) {
            String gVar = g.f9161p.toString();
            a aVar = a.f9198c;
            hashMap.put(gVar, aVar.toString());
            hashMap.put(g.f9051C0.toString(), aVar.toString());
            hashMap.put(g.f9120Z0.toString(), aVar.toString());
        }
        if (this.f9195a < 23) {
            String gVar2 = g.f9188y.toString();
            a aVar2 = a.f9198c;
            hashMap.put(gVar2, aVar2.toString());
            hashMap.put(g.f9068I.toString(), aVar2.toString());
            hashMap.put(g.f9077L.toString(), aVar2.toString());
            hashMap.put(g.f9083N.toString(), aVar2.toString());
            hashMap.put(g.f9078L0.toString(), aVar2.toString());
            hashMap.put(g.f9081M0.toString(), aVar2.toString());
            hashMap.put(g.f9084N0.toString(), aVar2.toString());
            hashMap.put(g.f9046A1.toString(), aVar2.toString());
            hashMap.put(g.f9106U1.toString(), aVar2.toString());
        }
        if (this.f9195a > 23) {
            hashMap.put(g.f9128c1.toString(), a.f9198c.toString());
        }
        if (this.f9195a < 22) {
            hashMap.put(g.f9080M.toString(), a.f9198c.toString());
        }
        return hashMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Z3.d hardwareIdSupplier) {
        this(Build.VERSION.SDK_INT, hardwareIdSupplier);
        AbstractC3159y.i(hardwareIdSupplier, "hardwareIdSupplier");
    }
}
