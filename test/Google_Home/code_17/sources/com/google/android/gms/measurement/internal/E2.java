package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.C2088c2;
import com.google.android.gms.internal.measurement.C2099d3;
import com.google.android.gms.internal.measurement.C2106e0;
import com.google.android.gms.internal.measurement.C2109e3;
import com.google.android.gms.internal.measurement.C2171k5;
import com.google.android.gms.internal.measurement.C2278w5;
import com.google.android.gms.internal.measurement.F8;
import com.google.android.gms.internal.measurement.H8;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.X7;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.measurement.internal.C2472x3;
import com.google.android.gms.measurement.internal.E2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import l0.AbstractC3282q;
import l0.EnumC3280o;

/* loaded from: classes3.dex */
public final class E2 extends F5 implements InterfaceC2378k {

    /* renamed from: d, reason: collision with root package name */
    private final Map f17011d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f17012e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f17013f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f17014g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f17015h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f17016i;

    /* renamed from: j, reason: collision with root package name */
    final LruCache f17017j;

    /* renamed from: k, reason: collision with root package name */
    final F8 f17018k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f17019l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f17020m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f17021n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(I5 i52) {
        super(i52);
        this.f17011d = new ArrayMap();
        this.f17012e = new ArrayMap();
        this.f17013f = new ArrayMap();
        this.f17014g = new ArrayMap();
        this.f17015h = new ArrayMap();
        this.f17019l = new ArrayMap();
        this.f17020m = new ArrayMap();
        this.f17021n = new ArrayMap();
        this.f17016i = new ArrayMap();
        this.f17017j = new J2(this, 20);
        this.f17018k = new I2(this);
    }

    private final com.google.android.gms.internal.measurement.Y1 A(String str, byte[] bArr) {
        Long l8;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.Y1.O();
        }
        try {
            com.google.android.gms.internal.measurement.Y1 y12 = (com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) ((Y1.a) W5.G(com.google.android.gms.internal.measurement.Y1.M(), bArr)).k());
            C2381k2 K8 = c().K();
            String str2 = null;
            if (y12.a0()) {
                l8 = Long.valueOf(y12.K());
            } else {
                l8 = null;
            }
            if (y12.Y()) {
                str2 = y12.Q();
            }
            K8.c("Parsed config. version, gmp_app_id", l8, str2);
            return y12;
        } catch (C2171k5 e8) {
            c().L().c("Unable to merge remote config. appId", C2367i2.s(str), e8);
            return com.google.android.gms.internal.measurement.Y1.O();
        } catch (RuntimeException e9) {
            c().L().c("Unable to merge remote config. appId", C2367i2.s(str), e9);
            return com.google.android.gms.internal.measurement.Y1.O();
        }
    }

    private static C2472x3.a B(V1.e eVar) {
        int i8 = K2.f17236b[eVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return null;
                    }
                    return C2472x3.a.AD_PERSONALIZATION;
                }
                return C2472x3.a.AD_USER_DATA;
            }
            return C2472x3.a.ANALYTICS_STORAGE;
        }
        return C2472x3.a.AD_STORAGE;
    }

    private static Map C(com.google.android.gms.internal.measurement.Y1 y12) {
        ArrayMap arrayMap = new ArrayMap();
        if (y12 != null) {
            for (C2088c2 c2088c2 : y12.V()) {
                arrayMap.put(c2088c2.H(), c2088c2.I());
            }
        }
        return arrayMap;
    }

    private final void F(String str, Y1.a aVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (aVar != null) {
            Iterator it = aVar.w().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.W1) it.next()).H());
            }
            for (int i8 = 0; i8 < aVar.o(); i8++) {
                X1.a aVar2 = (X1.a) aVar.p(i8).x();
                if (aVar2.q().isEmpty()) {
                    c().L().a("EventConfig contained null event name");
                } else {
                    String q8 = aVar2.q();
                    String b8 = AbstractC3282q.b(aVar2.q());
                    if (!TextUtils.isEmpty(b8)) {
                        aVar2 = aVar2.p(b8);
                        aVar.q(i8, aVar2);
                    }
                    if (aVar2.t() && aVar2.r()) {
                        arrayMap.put(q8, Boolean.TRUE);
                    }
                    if (aVar2.w() && aVar2.s()) {
                        arrayMap2.put(aVar2.q(), Boolean.TRUE);
                    }
                    if (aVar2.x()) {
                        if (aVar2.o() >= 2 && aVar2.o() <= 65535) {
                            arrayMap3.put(aVar2.q(), Integer.valueOf(aVar2.o()));
                        } else {
                            c().L().c("Invalid sampling rate. Event name, sample rate", aVar2.q(), Integer.valueOf(aVar2.o()));
                        }
                    }
                }
            }
        }
        this.f17012e.put(str, hashSet);
        this.f17013f.put(str, arrayMap);
        this.f17014g.put(str, arrayMap2);
        this.f17016i.put(str, arrayMap3);
    }

    private final void G(final String str, com.google.android.gms.internal.measurement.Y1 y12) {
        if (y12.j() == 0) {
            this.f17017j.remove(str);
            return;
        }
        c().K().b("EES programs found", Integer.valueOf(y12.j()));
        C2109e3 c2109e3 = (C2109e3) y12.U().get(0);
        try {
            com.google.android.gms.internal.measurement.C c8 = new com.google.android.gms.internal.measurement.C();
            c8.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.F2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C2278w5("internal.remoteConfig", new L2(E2.this, str));
                }
            });
            c8.c("internal.appMetadata", new Callable() { // from class: l0.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final E2 e22 = E2.this;
                    final String str2 = str;
                    return new H8("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.G2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            E2 e23 = E2.this;
                            String str3 = str2;
                            C2485z2 L02 = e23.n().L0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, str3);
                            hashMap.put("gmp_version", 102001L);
                            if (L02 != null) {
                                String o8 = L02.o();
                                if (o8 != null) {
                                    hashMap.put("app_version", o8);
                                }
                                hashMap.put("app_version_int", Long.valueOf(L02.U()));
                                hashMap.put("dynamite_version", Long.valueOf(L02.v0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            c8.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.H2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new X7(E2.this.f17018k);
                }
            });
            c8.b(c2109e3);
            this.f17017j.put(str, c8);
            c().K().c("EES program loaded for appId, activities", str, Integer.valueOf(c2109e3.G().j()));
            Iterator it = c2109e3.G().I().iterator();
            while (it.hasNext()) {
                c().K().b("EES program activity", ((C2099d3) it.next()).H());
            }
        } catch (C2106e0 unused) {
            c().G().b("Failed to load EES program. appId", str);
        }
    }

    private final void h0(String str) {
        r();
        k();
        AbstractC1400p.f(str);
        if (this.f17015h.get(str) == null) {
            C2399n N02 = n().N0(str);
            if (N02 == null) {
                this.f17011d.put(str, null);
                this.f17013f.put(str, null);
                this.f17012e.put(str, null);
                this.f17014g.put(str, null);
                this.f17015h.put(str, null);
                this.f17019l.put(str, null);
                this.f17020m.put(str, null);
                this.f17021n.put(str, null);
                this.f17016i.put(str, null);
                return;
            }
            Y1.a aVar = (Y1.a) A(str, N02.f17728a).x();
            F(str, aVar);
            this.f17011d.put(str, C((com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k())));
            this.f17015h.put(str, (com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k()));
            G(str, (com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k()));
            this.f17019l.put(str, aVar.s());
            this.f17020m.put(str, N02.f17729b);
            this.f17021n.put(str, N02.f17730c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.internal.measurement.C z(E2 e22, String str) {
        e22.r();
        AbstractC1400p.f(str);
        if (!e22.X(str)) {
            return null;
        }
        if (e22.f17015h.containsKey(str) && e22.f17015h.get(str) != null) {
            e22.G(str, (com.google.android.gms.internal.measurement.Y1) e22.f17015h.get(str));
        } else {
            e22.h0(str);
        }
        return (com.google.android.gms.internal.measurement.C) e22.f17017j.snapshot().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC3280o E(String str, C2472x3.a aVar) {
        k();
        h0(str);
        com.google.android.gms.internal.measurement.V1 J8 = J(str);
        if (J8 == null) {
            return EnumC3280o.UNINITIALIZED;
        }
        for (V1.b bVar : J8.L()) {
            if (B(bVar.I()) == aVar) {
                int i8 = K2.f17237c[bVar.H().ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        return EnumC3280o.UNINITIALIZED;
                    }
                    return EnumC3280o.GRANTED;
                }
                return EnumC3280o.DENIED;
            }
        }
        return EnumC3280o.UNINITIALIZED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        r();
        k();
        AbstractC1400p.f(str);
        Y1.a aVar = (Y1.a) A(str, bArr).x();
        if (aVar == null) {
            return false;
        }
        F(str, aVar);
        G(str, (com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k()));
        this.f17015h.put(str, (com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k()));
        this.f17019l.put(str, aVar.s());
        this.f17020m.put(str, str2);
        this.f17021n.put(str, str3);
        this.f17011d.put(str, C((com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k())));
        n().b0(str, new ArrayList(aVar.t()));
        try {
            aVar.r();
            bArr = ((com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k())).i();
        } catch (RuntimeException e8) {
            c().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2367i2.s(str), e8);
        }
        C2392m n8 = n();
        AbstractC1400p.f(str);
        n8.k();
        n8.r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (n8.B().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                n8.c().G().b("Failed to update remote config (got 0). appId", C2367i2.s(str));
            }
        } catch (SQLiteException e9) {
            n8.c().G().c("Error storing remote config. appId", C2367i2.s(str), e9);
        }
        this.f17015h.put(str, (com.google.android.gms.internal.measurement.Y1) ((AbstractC2091c5) aVar.k()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int I(String str, String str2) {
        Integer num;
        k();
        h0(str);
        Map map = (Map) this.f17016i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.V1 J(String str) {
        k();
        h0(str);
        com.google.android.gms.internal.measurement.Y1 L8 = L(str);
        if (L8 != null && L8.X()) {
            return L8.L();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2472x3.a K(String str, C2472x3.a aVar) {
        k();
        h0(str);
        com.google.android.gms.internal.measurement.V1 J8 = J(str);
        if (J8 == null) {
            return null;
        }
        for (V1.c cVar : J8.K()) {
            if (aVar == B(cVar.I())) {
                return B(cVar.H());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.Y1 L(String str) {
        r();
        k();
        AbstractC1400p.f(str);
        h0(str);
        return (com.google.android.gms.internal.measurement.Y1) this.f17015h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str, C2472x3.a aVar) {
        k();
        h0(str);
        com.google.android.gms.internal.measurement.V1 J8 = J(str);
        if (J8 == null) {
            return false;
        }
        Iterator it = J8.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            V1.b bVar = (V1.b) it.next();
            if (aVar == B(bVar.I())) {
                if (bVar.H() == V1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str, String str2) {
        Boolean bool;
        k();
        h0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f17014g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String O(String str) {
        k();
        return (String) this.f17021n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P(String str, String str2) {
        Boolean bool;
        k();
        h0(str);
        if (Y(str) && a6.J0(str2)) {
            return true;
        }
        if (a0(str) && a6.L0(str2)) {
            return true;
        }
        Map map = (Map) this.f17013f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String Q(String str) {
        k();
        return (String) this.f17020m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String R(String str) {
        k();
        h0(str);
        return (String) this.f17019l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set S(String str) {
        k();
        h0(str);
        return (Set) this.f17012e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SortedSet T(String str) {
        k();
        h0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.V1 J8 = J(str);
        if (J8 == null) {
            return treeSet;
        }
        Iterator it = J8.I().iterator();
        while (it.hasNext()) {
            treeSet.add(((V1.f) it.next()).H());
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U(String str) {
        k();
        this.f17020m.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(String str) {
        k();
        this.f17015h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean W(String str) {
        k();
        com.google.android.gms.internal.measurement.Y1 L8 = L(str);
        if (L8 == null) {
            return false;
        }
        return L8.W();
    }

    public final boolean X(String str) {
        com.google.android.gms.internal.measurement.Y1 y12;
        if (TextUtils.isEmpty(str) || (y12 = (com.google.android.gms.internal.measurement.Y1) this.f17015h.get(str)) == null || y12.j() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Y(String str) {
        return "1".equals(g(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z(String str) {
        k();
        h0(str);
        com.google.android.gms.internal.measurement.V1 J8 = J(str);
        if (J8 == null || !J8.N() || J8.M()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a0(String str) {
        return "1".equals(g(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b0(String str) {
        k();
        h0(str);
        if (this.f17012e.get(str) != null && ((Set) this.f17012e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0(String str) {
        k();
        h0(str);
        if (this.f17012e.get(str) != null) {
            if (((Set) this.f17012e.get(str)).contains("device_model") || ((Set) this.f17012e.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0(String str) {
        k();
        h0(str);
        if (this.f17012e.get(str) != null && ((Set) this.f17012e.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e0(String str) {
        k();
        h0(str);
        if (this.f17012e.get(str) != null && ((Set) this.f17012e.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f0(String str) {
        k();
        h0(str);
        if (this.f17012e.get(str) != null) {
            if (((Set) this.f17012e.get(str)).contains("os_version") || ((Set) this.f17012e.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2378k
    public final String g(String str, String str2) {
        k();
        h0(str);
        Map map = (Map) this.f17011d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g0(String str) {
        k();
        h0(str);
        if (this.f17012e.get(str) != null && ((Set) this.f17012e.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ W5 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ g6 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2392m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2356g5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    protected final boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long v(String str) {
        String g8 = g(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(g8)) {
            try {
                return Long.parseLong(g8);
            } catch (NumberFormatException e8) {
                c().L().c("Unable to parse timezone offset. appId", C2367i2.s(str), e8);
                return 0L;
            }
        }
        return 0L;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }
}
