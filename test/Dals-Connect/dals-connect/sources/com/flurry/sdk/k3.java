package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.j3;
import com.flurry.sdk.s3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class k3 implements j3 {
    Map<s6, u6> a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f9987b;

    /* renamed from: c, reason: collision with root package name */
    private i3 f9988c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9989d = false;

    /* renamed from: e, reason: collision with root package name */
    private Timer f9990e = null;

    /* renamed from: f, reason: collision with root package name */
    private TimerTask f9991f = null;

    /* renamed from: g, reason: collision with root package name */
    long f9992g = Long.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    long f9993h = Long.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    long f9994i = Long.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    int f9995j = f0.BACKGROUND.f9851j;

    /* renamed from: k, reason: collision with root package name */
    private d f9996k = d.INACTIVE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class a extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9997h;

        a(boolean z) {
            this.f9997h = z;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            if (this.f9997h) {
                d0 d0Var = e7.a().l;
                k3 k3Var = k3.this;
                d0Var.z(k3Var.f9992g, k3Var.f9993h);
            }
            d0 d0Var2 = e7.a().l;
            d0Var2.r.set(this.f9997h);
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.FOREGROUND_RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.FOREGROUND_ENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.BACKGROUND_RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.BACKGROUND_ENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c extends TimerTask {
        protected c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            k3.this.g();
            k3 k3Var = k3.this;
            g0.a().e();
            if (k3Var.f9994i <= 0) {
                k3Var.f9994i = SystemClock.elapsedRealtime();
            }
            if (k3.f(k3Var.f9992g)) {
                k3Var.i(k6.h(k3Var.f9992g, k3Var.f9993h, k3Var.f9994i, k3Var.f9995j));
            } else {
                d1.c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            j3.a aVar = j3.a.REASON_SESSION_FINALIZE;
            k3Var.i(r5.h(aVar.ordinal(), aVar.p));
            k3Var.e(false);
            k3Var.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum d {
        INACTIVE,
        FOREGROUND_RUNNING,
        FOREGROUND_ENDING,
        BACKGROUND_RUNNING,
        BACKGROUND_ENDING
    }

    public k3(i3 i3Var) {
        this.f9988c = i3Var;
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.clear();
        this.a.put(s6.SESSION_INFO, null);
        this.a.put(s6.APP_STATE, null);
        this.a.put(s6.APP_INFO, null);
        this.a.put(s6.REPORTED_ID, null);
        this.a.put(s6.DEVICE_PROPERTIES, null);
        this.a.put(s6.SESSION_ID, null);
        this.a = this.a;
        this.f9987b = new AtomicBoolean(false);
    }

    private static void a(long j2, long j3, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fl.session.elapsed.start.time", String.valueOf(j2));
        if (j3 != Long.MIN_VALUE) {
            hashMap.put("fl.session.elapsed.end.time", String.valueOf(j3));
            hashMap.put("fl.session.duration", String.valueOf(j3 - j2));
        }
        hashMap.put("fl.session.message", str);
        g0.a();
        g0.f("Session Duration", hashMap);
    }

    private void c(d dVar) {
        if (this.f9996k.equals(dVar)) {
            d1.c(3, "SessionRule", "Invalid state transition.");
            return;
        }
        d1.c(3, "SessionRule", "Previous session state: " + this.f9996k.name());
        this.f9996k = dVar;
        d1.c(3, "SessionRule", "Current session state: " + this.f9996k.name());
    }

    private void d(f4 f4Var) {
        if (!f4Var.f9876f.equals(e0.SESSION_START)) {
            d1.c(3, "SessionRule", "Only generate session id during session start");
            return;
        }
        if (this.f9992g == Long.MIN_VALUE && this.a.get(s6.SESSION_ID) == null) {
            d1.c(3, "SessionRule", "Generating Session Id:" + f4Var.f9873c);
            this.f9992g = f4Var.f9873c;
            this.f9993h = SystemClock.elapsedRealtime();
            this.f9995j = f4Var.f9872b.f9851j == 1 ? 2 : 0;
            if (f(this.f9992g)) {
                a(this.f9993h, this.f9994i, "Generate Session Id");
                m(k6.h(this.f9992g, this.f9993h, this.f9994i, this.f9995j));
            } else {
                d1.c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            e(true);
        }
    }

    static boolean f(long j2) {
        return j2 > 0;
    }

    private void h(long j2) {
        g();
        this.f9994i = SystemClock.elapsedRealtime();
        if (f(this.f9992g)) {
            a(this.f9993h, this.f9994i, "Start Session Finalize Timer");
            m(k6.h(this.f9992g, this.f9993h, this.f9994i, this.f9995j));
        } else {
            d1.c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        l(j2);
    }

    private static boolean j(f4 f4Var) {
        return f4Var.f9872b.equals(f0.FOREGROUND) && f4Var.f9876f.equals(e0.SESSION_START);
    }

    private synchronized void l(long j2) {
        if (this.f9990e != null) {
            g();
        }
        this.f9990e = new Timer("FlurrySessionTimer");
        c cVar = new c();
        this.f9991f = cVar;
        this.f9990e.schedule(cVar, j2);
    }

    private void m(u6 u6Var) {
        if (this.f9988c != null) {
            d1.c(3, "SessionRule", "Appending Frame:" + u6Var.d());
            this.f9988c.b(u6Var);
        }
    }

    private static boolean n(f4 f4Var) {
        return f4Var.f9872b.equals(f0.BACKGROUND) && f4Var.f9876f.equals(e0.SESSION_START);
    }

    private boolean o() {
        Iterator<Map.Entry<s6, u6>> it = this.a.entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (it.next().getValue() == null) {
                z = false;
            }
        }
        return z;
    }

    private void p() {
        if (this.f9992g <= 0) {
            d1.c(6, "SessionRule", "Finalize session " + this.f9992g);
            return;
        }
        g();
        g0.a().e();
        this.f9994i = SystemClock.elapsedRealtime();
        if (f(this.f9992g)) {
            i(k6.h(this.f9992g, this.f9993h, this.f9994i, this.f9995j));
        } else {
            d1.c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        j3.a aVar = j3.a.REASON_SESSION_FINALIZE;
        i(r5.h(aVar.ordinal(), aVar.p));
        e(false);
        k();
    }

    @Override // com.flurry.sdk.j3
    public final void b(u6 u6Var) {
        if (u6Var.a().equals(s6.FLUSH_FRAME)) {
            s5 s5Var = (s5) u6Var.f();
            if (j3.a.REASON_SESSION_FINALIZE.p.equals(s5Var.f10164c)) {
                return;
            }
            if (!j3.a.REASON_STICKY_SET_COMPLETE.p.equals(s5Var.f10164c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a(this.f9993h, elapsedRealtime, "Flush In Middle");
                i(k6.h(this.f9992g, this.f9993h, elapsedRealtime, this.f9995j));
            }
            u6 u6Var2 = this.a.get(s6.SESSION_ID);
            if (u6Var2 != null) {
                m(u6Var2);
                return;
            }
            return;
        }
        if (u6Var.a().equals(s6.REPORTING)) {
            f4 f4Var = (f4) u6Var.f();
            int i2 = b.a[this.f9996k.ordinal()];
            if (i2 == 1) {
                f0 f0Var = f4Var.f9872b;
                f0 f0Var2 = f0.FOREGROUND;
                if (f0Var.equals(f0Var2)) {
                    if (this.f9989d && !f4Var.f9877g) {
                        this.f9989d = false;
                    }
                    if ((f4Var.f9872b.equals(f0Var2) && f4Var.f9876f.equals(e0.SESSION_END)) && (this.f9989d || !f4Var.f9877g)) {
                        h(f4Var.f9875e);
                        c(d.FOREGROUND_ENDING);
                    }
                }
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            d1.c(6, "SessionRule", "Unreachable Code");
                        } else if (j(f4Var)) {
                            this.f9989d = f4Var.f9877g;
                            c(d.FOREGROUND_RUNNING);
                            d(f4Var);
                        } else if (n(f4Var)) {
                            c(d.BACKGROUND_RUNNING);
                            d(f4Var);
                        }
                    } else if (j(f4Var)) {
                        p();
                        c(d.FOREGROUND_RUNNING);
                        d(f4Var);
                    } else if (n(f4Var)) {
                        g();
                        this.f9994i = Long.MIN_VALUE;
                        c(d.BACKGROUND_RUNNING);
                    }
                } else if (j(f4Var)) {
                    p();
                    c(d.FOREGROUND_RUNNING);
                    d(f4Var);
                } else {
                    if (f4Var.f9872b.equals(f0.BACKGROUND) && f4Var.f9876f.equals(e0.SESSION_END)) {
                        h(f4Var.f9875e);
                        c(d.BACKGROUND_ENDING);
                    }
                }
            } else if (j(f4Var)) {
                g();
                this.f9994i = Long.MIN_VALUE;
                c(d.FOREGROUND_RUNNING);
            }
        }
        if (u6Var.a().equals(s6.ANALYTICS_ERROR) && ((t3) u6Var.f()).f10180h == s3.a.UNRECOVERABLE_CRASH.f10157j) {
            g();
            this.f9994i = SystemClock.elapsedRealtime();
            if (f(this.f9992g)) {
                a(this.f9993h, this.f9994i, "Process Crash");
                i(k6.h(this.f9992g, this.f9993h, this.f9994i, this.f9995j));
            } else {
                d1.c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
        }
        if (u6Var.a().equals(s6.CCPA_DELETION)) {
            j3.a aVar = j3.a.REASON_DATA_DELETION;
            m(r5.h(aVar.ordinal(), aVar.p));
        }
        s6 a2 = u6Var.a();
        if (this.a.containsKey(a2)) {
            d1.c(3, "SessionRule", "Adding Sticky Frame:" + u6Var.d());
            this.a.put(a2, u6Var);
        }
        if (!this.f9987b.get() && o()) {
            this.f9987b.set(true);
            j3.a aVar2 = j3.a.REASON_STICKY_SET_COMPLETE;
            m(r5.h(aVar2.ordinal(), aVar2.p));
            int e2 = p2.e("last_streaming_http_error_code", Integer.MIN_VALUE);
            String g2 = p2.g("last_streaming_http_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
            String g3 = p2.g("last_streaming_http_report_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
            if (e2 != Integer.MIN_VALUE) {
                c2.e(e2, g2, g3, false);
                p2.a("last_streaming_http_error_code");
                p2.a("last_streaming_http_error_message");
                p2.a("last_streaming_http_report_identifier");
            }
            int e3 = p2.e("last_legacy_http_error_code", Integer.MIN_VALUE);
            String g4 = p2.g("last_legacy_http_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
            String g5 = p2.g("last_legacy_http_report_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
            if (e3 != Integer.MIN_VALUE) {
                c2.e(e3, g4, g5, false);
                p2.a("last_legacy_http_error_code");
                p2.a("last_legacy_http_error_message");
                p2.a("last_legacy_http_report_identifier");
            }
            p2.c("last_streaming_session_id", this.f9992g);
            HashMap hashMap = new HashMap();
            hashMap.put("streaming.session.id", String.valueOf(this.f9992g));
            g0.a();
            g0.f("Session Ids", hashMap);
            g0.a().e();
            return;
        }
        if (this.f9987b.get() && u6Var.a().equals(s6.NOTIFICATION)) {
            g0.a();
            g0.f("Flush Token Refreshed", Collections.emptyMap());
            j3.a aVar3 = j3.a.REASON_PUSH_TOKEN_REFRESH;
            m(r5.h(aVar3.ordinal(), aVar3.p));
        }
    }

    final void e(boolean z) {
        i3 i3Var = this.f9988c;
        if (i3Var != null) {
            i3Var.a(new a(z));
        }
    }

    final synchronized void g() {
        Timer timer = this.f9990e;
        if (timer != null) {
            timer.cancel();
            this.f9990e = null;
        }
        TimerTask timerTask = this.f9991f;
        if (timerTask != null) {
            timerTask.cancel();
            this.f9991f = null;
        }
    }

    final void i(u6 u6Var) {
        if (this.f9988c != null) {
            d1.c(3, "SessionRule", "Forwarding Frame:" + u6Var.d());
            this.f9988c.c(u6Var);
        }
    }

    final void k() {
        d1.c(3, "SessionRule", "Reset session rule");
        this.a.put(s6.SESSION_ID, null);
        this.f9987b.set(false);
        this.f9992g = Long.MIN_VALUE;
        this.f9993h = Long.MIN_VALUE;
        this.f9994i = Long.MIN_VALUE;
        this.f9996k = d.INACTIVE;
        this.f9989d = false;
    }
}
