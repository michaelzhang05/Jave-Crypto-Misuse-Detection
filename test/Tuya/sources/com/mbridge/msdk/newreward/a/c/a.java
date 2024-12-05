package com.mbridge.msdk.newreward.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f20796a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, c> f20797b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f20798c;

    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0413a {
        void a(String str, long j8);
    }

    /* loaded from: classes4.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f20799a;

        /* renamed from: b, reason: collision with root package name */
        private final long f20800b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20801c;

        public b(String str, long j8) {
            this.f20799a = str;
            this.f20800b = j8;
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f20802a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0413a f20803b;

        public c(b bVar, InterfaceC0413a interfaceC0413a) {
            this.f20802a = bVar;
            this.f20803b = interfaceC0413a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0413a interfaceC0413a;
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeTimer", "TimerTask run taskID: " + this.f20802a.f20799a + " isStop: " + this.f20802a.f20801c);
            }
            if (this.f20802a.f20801c || (interfaceC0413a = this.f20803b) == null) {
                return;
            }
            try {
                interfaceC0413a.a(this.f20802a.f20799a, this.f20802a.f20800b);
            } catch (Exception unused) {
            }
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.f20798c = new Handler(handlerThread.getLooper());
        this.f20797b = new HashMap();
    }

    public static a a() {
        if (f20796a == null) {
            synchronized (a.class) {
                try {
                    if (f20796a == null) {
                        f20796a = new a();
                    }
                } finally {
                }
            }
        }
        return f20796a;
    }

    public final void a(String str, long j8, InterfaceC0413a interfaceC0413a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j8);
        }
        if (this.f20797b.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j8), interfaceC0413a);
        this.f20797b.put(str, cVar);
        this.f20798c.postDelayed(cVar, j8);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c remove = this.f20797b.remove(str);
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "stopTimer taskID: " + str);
        }
        if (remove != null) {
            remove.f20802a.f20801c = true;
            this.f20798c.removeCallbacks(remove);
        }
    }
}
