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
    private static volatile a f21851a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, c> f21852b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f21853c;

    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0409a {
        void a(String str, long j8);
    }

    /* loaded from: classes4.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f21854a;

        /* renamed from: b, reason: collision with root package name */
        private final long f21855b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21856c;

        public b(String str, long j8) {
            this.f21854a = str;
            this.f21855b = j8;
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f21857a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0409a f21858b;

        public c(b bVar, InterfaceC0409a interfaceC0409a) {
            this.f21857a = bVar;
            this.f21858b = interfaceC0409a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0409a interfaceC0409a;
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeTimer", "TimerTask run taskID: " + this.f21857a.f21854a + " isStop: " + this.f21857a.f21856c);
            }
            if (this.f21857a.f21856c || (interfaceC0409a = this.f21858b) == null) {
                return;
            }
            try {
                interfaceC0409a.a(this.f21857a.f21854a, this.f21857a.f21855b);
            } catch (Exception unused) {
            }
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.f21853c = new Handler(handlerThread.getLooper());
        this.f21852b = new HashMap();
    }

    public static a a() {
        if (f21851a == null) {
            synchronized (a.class) {
                try {
                    if (f21851a == null) {
                        f21851a = new a();
                    }
                } finally {
                }
            }
        }
        return f21851a;
    }

    public final void a(String str, long j8, InterfaceC0409a interfaceC0409a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j8);
        }
        if (this.f21852b.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j8), interfaceC0409a);
        this.f21852b.put(str, cVar);
        this.f21853c.postDelayed(cVar, j8);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c remove = this.f21852b.remove(str);
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "stopTimer taskID: " + str);
        }
        if (remove != null) {
            remove.f21857a.f21856c = true;
            this.f21853c.removeCallbacks(remove);
        }
    }
}
