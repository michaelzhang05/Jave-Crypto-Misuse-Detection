package V3;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Build;
import c4.InterfaceC2046d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f10838a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2046d f10839b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10840b = new a("MARKET_OR_REGION_RESTRICTION", 0, "RE01");

        /* renamed from: c, reason: collision with root package name */
        public static final a f10841c = new a("PLATFORM_VERSION", 1, "RE02");

        /* renamed from: d, reason: collision with root package name */
        public static final a f10842d = new a("PERMISSION", 2, "RE03");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f10843e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f10844f;

        /* renamed from: a, reason: collision with root package name */
        private final String f10845a;

        static {
            a[] a8 = a();
            f10843e = a8;
            f10844f = U5.b.a(a8);
        }

        private a(String str, int i8, String str2) {
            this.f10845a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f10840b, f10841c, f10842d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10843e.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f10845a;
        }
    }

    public i(int i8, InterfaceC2046d hardwareIdSupplier) {
        AbstractC3255y.i(hardwareIdSupplier, "hardwareIdSupplier");
        this.f10838a = i8;
        this.f10839b = hardwareIdSupplier;
    }

    @Override // V3.h
    public Map a() {
        return Q.q(Q.q(b(), d()), c());
    }

    public final Map b() {
        HashMap hashMap = new HashMap();
        List p8 = AbstractC1378t.p(g.f10767b, g.f10770c, g.f10773d, g.f10776e, g.f10779f, g.f10782g, g.f10785h, g.f10788i);
        for (g gVar : g.b()) {
            if (!p8.contains(gVar)) {
                hashMap.put(gVar.toString(), a.f10840b.toString());
            }
        }
        return hashMap;
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        String gVar = g.f10729O.toString();
        a aVar = a.f10842d;
        hashMap.put(gVar, aVar.toString());
        hashMap.put(g.f10732P.toString(), aVar.toString());
        hashMap.put(g.f10735Q.toString(), aVar.toString());
        hashMap.put(g.f10738R.toString(), aVar.toString());
        hashMap.put(g.f10741S.toString(), aVar.toString());
        hashMap.put(g.f10744T.toString(), aVar.toString());
        hashMap.put(g.f10747U.toString(), aVar.toString());
        hashMap.put(g.f10750V.toString(), aVar.toString());
        hashMap.put(g.f10753W.toString(), aVar.toString());
        hashMap.put(g.f10756X.toString(), aVar.toString());
        hashMap.put(g.f10759Y.toString(), aVar.toString());
        hashMap.put(g.f10796l.toString(), aVar.toString());
        hashMap.put(g.f10798m.toString(), aVar.toString());
        if (!((j) this.f10839b.get()).b()) {
            hashMap.put(g.f10785h.toString(), a.f10841c.toString());
        }
        hashMap.put(g.f10791j.toString(), aVar.toString());
        hashMap.put(g.f10762Z.toString(), aVar.toString());
        hashMap.put(g.f10805p0.toString(), aVar.toString());
        hashMap.put(g.f10808q0.toString(), aVar.toString());
        hashMap.put(g.f10800n.toString(), aVar.toString());
        hashMap.put(g.f10802o.toString(), aVar.toString());
        hashMap.put(g.f10804p.toString(), aVar.toString());
        hashMap.put(g.f10807q.toString(), aVar.toString());
        hashMap.put(g.f10696D.toString(), aVar.toString());
        hashMap.put(g.f10702F.toString(), aVar.toString());
        hashMap.put(g.f10705G.toString(), aVar.toString());
        hashMap.put(g.f10720L.toString(), aVar.toString());
        hashMap.put(g.f10726N.toString(), aVar.toString());
        hashMap.put(g.f10694C0.toString(), aVar.toString());
        hashMap.put(g.f10763Z0.toString(), aVar.toString());
        return hashMap;
    }

    public final Map d() {
        HashMap hashMap = new HashMap();
        if (this.f10838a < 26) {
            String gVar = g.f10804p.toString();
            a aVar = a.f10841c;
            hashMap.put(gVar, aVar.toString());
            hashMap.put(g.f10694C0.toString(), aVar.toString());
            hashMap.put(g.f10763Z0.toString(), aVar.toString());
        }
        if (this.f10838a < 23) {
            String gVar2 = g.f10831y.toString();
            a aVar2 = a.f10841c;
            hashMap.put(gVar2, aVar2.toString());
            hashMap.put(g.f10711I.toString(), aVar2.toString());
            hashMap.put(g.f10720L.toString(), aVar2.toString());
            hashMap.put(g.f10726N.toString(), aVar2.toString());
            hashMap.put(g.f10721L0.toString(), aVar2.toString());
            hashMap.put(g.f10724M0.toString(), aVar2.toString());
            hashMap.put(g.f10727N0.toString(), aVar2.toString());
            hashMap.put(g.f10689A1.toString(), aVar2.toString());
            hashMap.put(g.f10749U1.toString(), aVar2.toString());
        }
        if (this.f10838a > 23) {
            hashMap.put(g.f10771c1.toString(), a.f10841c.toString());
        }
        if (this.f10838a < 22) {
            hashMap.put(g.f10723M.toString(), a.f10841c.toString());
        }
        return hashMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC2046d hardwareIdSupplier) {
        this(Build.VERSION.SDK_INT, hardwareIdSupplier);
        AbstractC3255y.i(hardwareIdSupplier, "hardwareIdSupplier");
    }
}
