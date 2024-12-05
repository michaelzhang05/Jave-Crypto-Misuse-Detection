package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.A7;
import com.google.android.gms.internal.measurement.B7;
import com.google.android.gms.internal.measurement.C1978e0;
import com.google.android.gms.internal.measurement.C2039l2;
import com.google.android.gms.internal.measurement.C2050m5;
import com.google.android.gms.internal.measurement.C2055n2;
import com.google.android.gms.internal.measurement.C2109u1;
import com.google.android.gms.internal.measurement.C2117v1;
import com.google.android.gms.internal.measurement.C2133x1;
import com.google.android.gms.internal.measurement.C2141y1;
import com.google.android.gms.internal.measurement.C2148z0;
import com.google.android.gms.internal.measurement.InterfaceC2003g7;
import com.google.android.gms.measurement.internal.S1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class S1 extends AbstractC2190f4 implements InterfaceC2191g {

    /* renamed from: d, reason: collision with root package name */
    private final Map f16272d;

    /* renamed from: e, reason: collision with root package name */
    final Map f16273e;

    /* renamed from: f, reason: collision with root package name */
    final Map f16274f;

    /* renamed from: g, reason: collision with root package name */
    final Map f16275g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f16276h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f16277i;

    /* renamed from: j, reason: collision with root package name */
    final LruCache f16278j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC2003g7 f16279k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f16280l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f16281m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f16282n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S1(r4 r4Var) {
        super(r4Var);
        this.f16272d = new ArrayMap();
        this.f16273e = new ArrayMap();
        this.f16274f = new ArrayMap();
        this.f16275g = new ArrayMap();
        this.f16276h = new ArrayMap();
        this.f16280l = new ArrayMap();
        this.f16281m = new ArrayMap();
        this.f16282n = new ArrayMap();
        this.f16277i = new ArrayMap();
        this.f16278j = new P1(this, 20);
        this.f16279k = new Q1(this);
    }

    private final C2141y1 m(String str, byte[] bArr) {
        Long l8;
        if (bArr == null) {
            return C2141y1.H();
        }
        try {
            C2141y1 c2141y1 = (C2141y1) ((C2133x1) t4.E(C2141y1.F(), bArr)).k();
            C2257s1 v8 = this.f16777a.d().v();
            String str2 = null;
            if (c2141y1.W()) {
                l8 = Long.valueOf(c2141y1.D());
            } else {
                l8 = null;
            }
            if (c2141y1.V()) {
                str2 = c2141y1.J();
            }
            v8.c("Parsed config. version, gmp_app_id", l8, str2);
            return c2141y1;
        } catch (com.google.android.gms.internal.measurement.D4 e8) {
            this.f16777a.d().w().c("Unable to merge remote config. appId", C2267u1.z(str), e8);
            return C2141y1.H();
        } catch (RuntimeException e9) {
            this.f16777a.d().w().c("Unable to merge remote config. appId", C2267u1.z(str), e9);
            return C2141y1.H();
        }
    }

    private final void n(String str, C2133x1 c2133x1) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        Iterator it = c2133x1.v().iterator();
        while (it.hasNext()) {
            hashSet.add(((C2109u1) it.next()).C());
        }
        for (int i8 = 0; i8 < c2133x1.o(); i8++) {
            C2117v1 c2117v1 = (C2117v1) c2133x1.p(i8).j();
            if (c2117v1.q().isEmpty()) {
                this.f16777a.d().w().a("EventConfig contained null event name");
            } else {
                String q8 = c2117v1.q();
                String b8 = m0.q.b(c2117v1.q());
                if (!TextUtils.isEmpty(b8)) {
                    c2117v1.p(b8);
                    c2133x1.r(i8, c2117v1);
                }
                if (c2117v1.t() && c2117v1.r()) {
                    arrayMap.put(q8, Boolean.TRUE);
                }
                if (c2117v1.v() && c2117v1.s()) {
                    arrayMap2.put(c2117v1.q(), Boolean.TRUE);
                }
                if (c2117v1.w()) {
                    if (c2117v1.o() >= 2 && c2117v1.o() <= 65535) {
                        arrayMap3.put(c2117v1.q(), Integer.valueOf(c2117v1.o()));
                    } else {
                        this.f16777a.d().w().c("Invalid sampling rate. Event name, sample rate", c2117v1.q(), Integer.valueOf(c2117v1.o()));
                    }
                }
            }
        }
        this.f16273e.put(str, hashSet);
        this.f16274f.put(str, arrayMap);
        this.f16275g.put(str, arrayMap2);
        this.f16277i.put(str, arrayMap3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0082: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:131), block:B:33:0x0082 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.S1.o(java.lang.String):void");
    }

    private final void p(final String str, C2141y1 c2141y1) {
        if (c2141y1.B() != 0) {
            this.f16777a.d().v().b("EES programs found", Integer.valueOf(c2141y1.B()));
            C2055n2 c2055n2 = (C2055n2) c2141y1.Q().get(0);
            try {
                C1978e0 c1978e0 = new C1978e0();
                c1978e0.d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.N1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C2050m5("internal.remoteConfig", new R1(S1.this, str));
                    }
                });
                c1978e0.d("internal.appMetadata", new Callable() { // from class: m0.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final S1 s12 = S1.this;
                        final String str2 = str;
                        return new B7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.M1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                S1 s13 = S1.this;
                                String str3 = str2;
                                C2268u2 R8 = s13.f16482b.V().R(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, str3);
                                s13.f16777a.z().q();
                                hashMap.put("gmp_version", 79000L);
                                if (R8 != null) {
                                    String o02 = R8.o0();
                                    if (o02 != null) {
                                        hashMap.put("app_version", o02);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(R8.R()));
                                    hashMap.put("dynamite_version", Long.valueOf(R8.a0()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c1978e0.d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.O1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new A7(S1.this.f16279k);
                    }
                });
                c1978e0.c(c2055n2);
                this.f16278j.put(str, c1978e0);
                this.f16777a.d().v().c("EES program loaded for appId, activities", str, Integer.valueOf(c2055n2.B().B()));
                Iterator it = c2055n2.B().E().iterator();
                while (it.hasNext()) {
                    this.f16777a.d().v().b("EES program activity", ((C2039l2) it.next()).C());
                }
                return;
            } catch (C2148z0 unused) {
                this.f16777a.d().r().b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f16278j.remove(str);
    }

    private static final Map q(C2141y1 c2141y1) {
        ArrayMap arrayMap = new ArrayMap();
        if (c2141y1 != null) {
            for (com.google.android.gms.internal.measurement.C1 c12 : c2141y1.R()) {
                arrayMap.put(c12.C(), c12.D());
            }
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ C1978e0 s(S1 s12, String str) {
        s12.i();
        AbstractC1319p.f(str);
        if (!s12.C(str)) {
            return null;
        }
        if (s12.f16276h.containsKey(str) && s12.f16276h.get(str) != null) {
            s12.p(str, (C2141y1) s12.f16276h.get(str));
        } else {
            s12.o(str);
        }
        return (C1978e0) s12.f16278j.snapshot().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str) {
        h();
        this.f16276h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(String str) {
        h();
        C2141y1 t8 = t(str);
        if (t8 == null) {
            return false;
        }
        return t8.U();
    }

    public final boolean C(String str) {
        C2141y1 c2141y1;
        if (TextUtils.isEmpty(str) || (c2141y1 = (C2141y1) this.f16276h.get(str)) == null || c2141y1.B() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E(String str, String str2) {
        Boolean bool;
        h();
        o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f16275g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F(String str, String str2) {
        Boolean bool;
        h();
        o(str);
        if (D(str) && y4.Y(str2)) {
            return true;
        }
        if (G(str) && y4.Z(str2)) {
            return true;
        }
        Map map = (Map) this.f16274f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G(String str) {
        return "1".equals(e(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        i();
        h();
        AbstractC1319p.f(str);
        C2133x1 c2133x1 = (C2133x1) m(str, bArr).j();
        n(str, c2133x1);
        p(str, (C2141y1) c2133x1.k());
        this.f16276h.put(str, (C2141y1) c2133x1.k());
        this.f16280l.put(str, c2133x1.s());
        this.f16281m.put(str, str2);
        this.f16282n.put(str, str3);
        this.f16272d.put(str, q((C2141y1) c2133x1.k()));
        this.f16482b.V().n(str, new ArrayList(c2133x1.t()));
        try {
            c2133x1.q();
            bArr = ((C2141y1) c2133x1.k()).g();
        } catch (RuntimeException e8) {
            this.f16777a.d().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2267u1.z(str), e8);
        }
        C2221l V7 = this.f16482b.V();
        AbstractC1319p.f(str);
        V7.h();
        V7.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (V7.P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                V7.f16777a.d().r().b("Failed to update remote config (got 0). appId", C2267u1.z(str));
            }
        } catch (SQLiteException e9) {
            V7.f16777a.d().r().c("Error storing remote config. appId", C2267u1.z(str), e9);
        }
        this.f16276h.put(str, (C2141y1) c2133x1.k());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I(String str) {
        h();
        o(str);
        if (this.f16273e.get(str) != null && ((Set) this.f16273e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J(String str) {
        h();
        o(str);
        if (this.f16273e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f16273e.get(str)).contains("device_model") && !((Set) this.f16273e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K(String str) {
        h();
        o(str);
        if (this.f16273e.get(str) != null && ((Set) this.f16273e.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L(String str) {
        h();
        o(str);
        if (this.f16273e.get(str) != null && ((Set) this.f16273e.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str) {
        h();
        o(str);
        if (this.f16273e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f16273e.get(str)).contains("os_version") && !((Set) this.f16273e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str) {
        h();
        o(str);
        if (this.f16273e.get(str) != null && ((Set) this.f16273e.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2191g
    public final String e(String str, String str2) {
        h();
        o(str);
        Map map = (Map) this.f16272d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2190f4
    protected final boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int r(String str, String str2) {
        Integer num;
        h();
        o(str);
        Map map = (Map) this.f16277i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C2141y1 t(String str) {
        i();
        h();
        AbstractC1319p.f(str);
        o(str);
        return (C2141y1) this.f16276h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String u(String str) {
        h();
        return (String) this.f16282n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String v(String str) {
        h();
        return (String) this.f16281m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String w(String str) {
        h();
        o(str);
        return (String) this.f16280l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set y(String str) {
        h();
        o(str);
        return (Set) this.f16273e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(String str) {
        h();
        this.f16281m.put(str, null);
    }
}
