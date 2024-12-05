package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBridgeIds;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20322a = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f20323h;

    /* renamed from: b, reason: collision with root package name */
    private Context f20324b = com.mbridge.msdk.foundation.controller.c.m().c();

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f20325c = new com.mbridge.msdk.mbbanner.common.util.a();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.a.c> f20326d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Boolean> f20327e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Handler> f20328f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Integer> f20329g = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        if (f20323h == null) {
            synchronized (a.class) {
                try {
                    if (f20323h == null) {
                        f20323h = new a();
                    }
                } finally {
                }
            }
        }
        return f20323h;
    }

    public final void b(final String str, final String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, final com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        final MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (bVar != null && bVar.b() > 0) {
            if (this.f20328f.containsKey(str2)) {
                handler = this.f20328f.get(str2);
            } else {
                handler = new Handler();
                this.f20328f.put(str2, handler);
            }
            Handler handler2 = handler;
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    int i8;
                    Boolean bool;
                    if (a.this.f20327e != null && a.this.f20327e.containsKey(str2) && (bool = (Boolean) a.this.f20327e.get(str2)) != null && bool.booleanValue()) {
                        return;
                    }
                    if (a.this.f20329g.containsKey(str2)) {
                        Integer num = (Integer) a.this.f20329g.get(str2);
                        if (num != null) {
                            i8 = num.intValue();
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 2 || i8 == 4) {
                            ad.b(a.f20322a, "doUnitRotation: autoRotationStatus=" + i8 + " && unitId=" + str2);
                            if (a.this.f20325c != null) {
                                com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880026);
                                bVar3.a(mBridgeIds);
                                a.this.f20325c.a(bVar2, bVar3);
                                return;
                            }
                            return;
                        }
                    }
                    a.this.a(str, str2, bVar, bVar2);
                }
            };
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(runnable, bVar.b());
                return;
            }
            return;
        }
        ad.b(f20322a, "doUnitRotation: Illegal banner request parameters! && unitId=" + str2);
    }

    public final void a(String str, String str2, final com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        com.mbridge.msdk.mbbanner.common.a.c cVar;
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (this.f20324b == null) {
            com.mbridge.msdk.foundation.c.b bVar3 = new com.mbridge.msdk.foundation.c.b(880025);
            bVar3.a(mBridgeIds);
            this.f20325c.a(bVar2, bVar3);
            return;
        }
        if (bVar != null && bVar2 != null) {
            Map<String, Boolean> map = this.f20327e;
            if (map != null && map.containsKey(str2) && (bool = this.f20327e.get(str2)) != null && bool.booleanValue()) {
                com.mbridge.msdk.foundation.c.b bVar4 = new com.mbridge.msdk.foundation.c.b(880016, "Current unit is loading!");
                bVar4.a(mBridgeIds);
                this.f20325c.a(bVar2, bVar4);
                return;
            }
            this.f20327e.put(str2, Boolean.TRUE);
            if (this.f20326d.containsKey(str2)) {
                cVar = this.f20326d.get(str2);
            } else {
                k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (d8 == null) {
                    d8 = k.d(str2);
                }
                com.mbridge.msdk.mbbanner.common.a.c cVar2 = new com.mbridge.msdk.mbbanner.common.a.c(str2, "", 0, d8.w());
                this.f20326d.put(str2, cVar2);
                cVar = cVar2;
            }
            new b(this.f20324b, cVar, bVar2, this.f20325c).a(str, str2, bVar, new com.mbridge.msdk.mbbanner.common.b.d() { // from class: com.mbridge.msdk.mbbanner.common.c.a.1
                @Override // com.mbridge.msdk.mbbanner.common.b.d
                public final void a(String str3) {
                    synchronized (a.a()) {
                        bVar.a("");
                        a.this.f20327e.put(str3, Boolean.FALSE);
                    }
                }
            });
            return;
        }
        com.mbridge.msdk.foundation.c.b bVar5 = new com.mbridge.msdk.foundation.c.b(880001);
        bVar5.a(mBridgeIds);
        this.f20325c.a(bVar2, bVar5);
    }

    public final void b() {
        Map<String, com.mbridge.msdk.mbbanner.common.a.c> map = this.f20326d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f20327e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f20328f;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f20328f.clear();
        }
        Map<String, Integer> map4 = this.f20329g;
        if (map4 != null) {
            map4.clear();
        }
    }

    public final void a(String str) {
        if (this.f20328f.containsKey(str)) {
            Handler handler = this.f20328f.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f20328f.remove(str);
        }
    }

    public final void a(int i8, String str, String str2, com.mbridge.msdk.mbbanner.common.a.b bVar, com.mbridge.msdk.mbbanner.common.b.b bVar2) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int intValue = (!this.f20329g.containsKey(str2) || (num = this.f20329g.get(str2)) == null) ? 0 : num.intValue();
        if (i8 == 1) {
            if (this.f20328f.containsKey(str2) && (handler = this.f20328f.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f20329g.put(str2, Integer.valueOf(i8));
            return;
        }
        if (i8 == 2) {
            if (intValue == 1) {
                if (this.f20328f.containsKey(str2) && (handler2 = this.f20328f.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f20329g.put(str2, Integer.valueOf(i8));
                return;
            }
            return;
        }
        if (i8 == 3) {
            if (intValue == 2 || intValue == 4) {
                this.f20329g.put(str2, 1);
                b(str, str2, bVar, bVar2);
                return;
            }
            return;
        }
        if (i8 != 4) {
            return;
        }
        if (intValue == 0) {
            this.f20329g.put(str2, 0);
            return;
        }
        if (this.f20328f.containsKey(str2) && (handler3 = this.f20328f.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f20329g.put(str2, Integer.valueOf(i8));
    }
}
