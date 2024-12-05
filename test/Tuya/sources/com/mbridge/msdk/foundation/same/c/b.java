package com.mbridge.msdk.foundation.same.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.c.d;
import com.mbridge.msdk.foundation.same.c.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f19486a;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.a.c<String, Bitmap> f19488c;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f19490e;

    /* renamed from: b, reason: collision with root package name */
    private LinkedHashMap<String, List<c>> f19487b = new LinkedHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private Handler f19489d = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.foundation.same.c.b.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i8 = message.what;
                if (i8 == 1) {
                    String string = message.getData().getString("message_key");
                    Bitmap a8 = a.a(message.getData().getString("message_bitmap"));
                    b.this.a(string, a8);
                    LinkedList linkedList = (LinkedList) b.this.f19487b.get(string);
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            if (cVar != null) {
                                cVar.onSuccessLoad(a8, string);
                            }
                        }
                    }
                    b.this.f19487b.remove(string);
                    return;
                }
                if (i8 == 2) {
                    String string2 = message.getData().getString("message_key");
                    String string3 = message.getData().getString("message_message");
                    LinkedList linkedList2 = (LinkedList) b.this.f19487b.get(string2);
                    if (linkedList2 != null) {
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            c cVar2 = (c) it2.next();
                            if (cVar2 != null) {
                                cVar2.onFailedLoad(string3, string2);
                            }
                        }
                    }
                    b.this.f19487b.remove(string2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    private b(Context context) {
        int i8;
        this.f19490e = new com.mbridge.msdk.foundation.same.e.b(context);
        com.mbridge.msdk.c.g a8 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (a8 != null) {
            i8 = a8.Q();
        } else {
            i8 = 10;
        }
        this.f19488c = new com.mbridge.msdk.foundation.same.a.a(((int) Runtime.getRuntime().maxMemory()) / (i8 > 0 ? i8 : 10));
    }

    private Bitmap d(String str) {
        return this.f19488c.b(str);
    }

    public final boolean c(String str) {
        if (ai.k(str)) {
            return false;
        }
        if (g.c()) {
            return d.a.a().b(str);
        }
        File file = new File(ah.a(str));
        if (d(str) != null) {
            return true;
        }
        return file.exists() && file.isFile() && file.length() > 1;
    }

    public static b a(Context context) {
        if (f19486a == null) {
            f19486a = new b(context);
        }
        return f19486a;
    }

    public final Bitmap b(String str) {
        Bitmap a8;
        if (ai.k(str)) {
            return null;
        }
        if (g.c()) {
            return d.a.a().a(str);
        }
        String a9 = ah.a(str);
        File file = new File(a9);
        if (d(str) != null) {
            return d(str);
        }
        if (!file.exists() || (a8 = a.a(a9)) == null) {
            return null;
        }
        a(str, a8);
        return a8;
    }

    public final void a(String str, Bitmap bitmap) {
        if (d(str) != null || bitmap == null) {
            return;
        }
        this.f19488c.a(str, bitmap);
    }

    private void a(String str, String str2, String str3, boolean z8, boolean z9, c cVar) {
        if (!this.f19487b.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            this.f19487b.put(str2, linkedList);
            e.a aVar = new e.a() { // from class: com.mbridge.msdk.foundation.same.c.b.6
                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void a(String str4, String str5) {
                    Message obtainMessage = b.this.f19489d.obtainMessage();
                    obtainMessage.what = 1;
                    Bundle bundle = new Bundle();
                    bundle.putString("message_key", str4);
                    bundle.putString("message_bitmap", str5);
                    obtainMessage.setData(bundle);
                    b.this.f19489d.sendMessage(obtainMessage);
                }

                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void b(String str4, String str5) {
                    Message obtainMessage = b.this.f19489d.obtainMessage();
                    obtainMessage.what = 2;
                    Bundle bundle = new Bundle();
                    bundle.putString("message_key", str4);
                    bundle.putString("message_message", str5);
                    obtainMessage.setData(bundle);
                    b.this.f19489d.sendMessage(obtainMessage);
                }
            };
            e eVar = new e(str, str2, str3);
            eVar.a(z8);
            eVar.a(aVar);
            this.f19490e.a(eVar);
            return;
        }
        LinkedList linkedList2 = (LinkedList) this.f19487b.get(str2);
        if (linkedList2 == null || linkedList2.contains(cVar)) {
            return;
        }
        linkedList2.add(cVar);
    }

    public final void c() {
        if (g.c()) {
            return;
        }
        this.f19488c.b();
        LinkedHashMap<String, List<c>> linkedHashMap = this.f19487b;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    public final void b() {
        com.mbridge.msdk.foundation.same.a.c<String, Bitmap> cVar;
        if (g.c() || (cVar = this.f19488c) == null) {
            return;
        }
        cVar.b();
    }

    public static void a() {
        if (g.c()) {
            return;
        }
        f19486a.b();
    }

    public final void a(String str) {
        if (g.c()) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.a.c<String, Bitmap> cVar = this.f19488c;
            if (cVar == null || !cVar.a().contains(str)) {
                return;
            }
            this.f19488c.a(str);
        } catch (Throwable th) {
            ad.b("ImageLoader", th.getMessage());
        }
    }

    public final void a(final String str, final c cVar) {
        if (g.c()) {
            d.a.a().a(str, null, cVar);
            return;
        }
        final String a8 = ah.a(str);
        if (g.b()) {
            if (ai.k(str) || ai.k(str) || ai.k(a8)) {
                return;
            }
            final h hVar = null;
            if (g.c()) {
                d.a.a().a(str, null, cVar);
                return;
            }
            final boolean z8 = false;
            g.a().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (new File(a8).exists()) {
                        Bitmap a9 = a.a(a8);
                        if (a9 != null && !a9.isRecycled()) {
                            h hVar2 = hVar;
                            if (hVar2 != null) {
                                try {
                                    Bitmap a10 = hVar2.a(a9);
                                    if (a10 != null) {
                                        b.a(b.this, str, a10, cVar);
                                    } else {
                                        b.a(b.this, str, "image transform failed", cVar);
                                    }
                                    return;
                                } catch (Exception unused) {
                                    b.a(b.this, str, "image transform failed", cVar);
                                    return;
                                }
                            }
                            b.a(b.this, str, a9, cVar);
                            return;
                        }
                        b.a(b.this, str, str, a8, true, z8, cVar, hVar);
                        return;
                    }
                    b.a(b.this, str, str, a8, false, z8, cVar, hVar);
                }
            });
            return;
        }
        if (ai.k(str) || ai.k(str) || ai.k(a8)) {
            return;
        }
        if (g.c()) {
            d.a.a().a(str, null, cVar);
            return;
        }
        File file = new File(a8);
        Bitmap d8 = d(str);
        if (d8 != null && !d8.isRecycled()) {
            cVar.onSuccessLoad(d8, str);
            return;
        }
        if (file.exists()) {
            Bitmap a9 = a.a(a8);
            if (a9 != null && !a9.isRecycled()) {
                a(str, a9);
                cVar.onSuccessLoad(a9, str);
                return;
            } else {
                a(str, str, a8, true, false, cVar);
                return;
            }
        }
        a(str, str, a8, false, false, cVar);
    }

    static /* synthetic */ void a(b bVar, final String str, final Bitmap bitmap, final c cVar) {
        if (MBridgeConstans.DEBUG) {
            ad.a("ImageLoader", "handler image load success event");
        }
        if (cVar == null) {
            return;
        }
        bVar.f19489d.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.b.3
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.onSuccessLoad(bitmap, str);
                    try {
                        LinkedList linkedList = (LinkedList) b.this.f19487b.get(str);
                        if (linkedList != null) {
                            linkedList.remove(cVar);
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                c cVar3 = (c) it.next();
                                if (cVar3 != null) {
                                    cVar3.onSuccessLoad(bitmap, str);
                                }
                            }
                        }
                        b.this.f19487b.remove(str);
                    } catch (Throwable th) {
                        ad.b("ImageLoader", th.getMessage());
                    }
                }
            }
        });
    }

    static /* synthetic */ void a(b bVar, final String str, final String str2, final c cVar) {
        if (MBridgeConstans.DEBUG) {
            ad.a("ImageLoader", "handler image load failed event");
        }
        if (cVar == null) {
            return;
        }
        bVar.f19489d.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.onFailedLoad(str2, str);
                    try {
                        LinkedList linkedList = (LinkedList) b.this.f19487b.get(str);
                        if (linkedList != null) {
                            linkedList.remove(cVar);
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                c cVar3 = (c) it.next();
                                if (cVar3 != null) {
                                    cVar3.onFailedLoad(str2, str);
                                }
                            }
                        }
                        b.this.f19487b.remove(str);
                    } catch (Throwable th) {
                        ad.b("ImageLoader", th.getMessage());
                    }
                }
            }
        });
    }

    static /* synthetic */ void a(b bVar, final String str, String str2, String str3, boolean z8, boolean z9, final c cVar, final h hVar) {
        if (!bVar.f19487b.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            bVar.f19487b.put(str2, linkedList);
            e.a aVar = new e.a() { // from class: com.mbridge.msdk.foundation.same.c.b.5
                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void a(String str4, String str5) {
                    Bitmap a8 = a.a(str5);
                    if (a8 != null && !a8.isRecycled()) {
                        h hVar2 = hVar;
                        if (hVar2 != null) {
                            try {
                                Bitmap a9 = hVar2.a(a8);
                                if (a9 != null) {
                                    b.a(b.this, str, a9, cVar);
                                } else {
                                    b.a(b.this, str, "bitmap transform failed", cVar);
                                }
                                return;
                            } catch (Exception unused) {
                                b.a(b.this, str, "bitmap transform failed", cVar);
                                return;
                            }
                        }
                        b.a(b.this, str, a8, cVar);
                        return;
                    }
                    b.a(b.this, str, "bitmap file not found", cVar);
                }

                @Override // com.mbridge.msdk.foundation.same.c.e.a
                public final void b(String str4, String str5) {
                    b.a(b.this, str, str5, cVar);
                }
            };
            e eVar = new e(str, str2, str3, hVar);
            eVar.a(z8);
            eVar.a(aVar);
            com.mbridge.msdk.foundation.same.f.b.d().execute(eVar);
            return;
        }
        LinkedList linkedList2 = (LinkedList) bVar.f19487b.get(str2);
        if (linkedList2 == null || linkedList2.contains(cVar)) {
            return;
        }
        linkedList2.add(cVar);
    }
}
