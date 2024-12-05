package com.mbridge.msdk.foundation.same.report.b;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f20864a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f20865b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f20866c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.b.a f20867d;

    /* renamed from: e, reason: collision with root package name */
    private int f20868e;

    /* loaded from: classes4.dex */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private long f20870b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20871c;

        /* renamed from: d, reason: collision with root package name */
        private long f20872d;

        private a() {
            this.f20870b = SystemClock.uptimeMillis();
        }

        final void b() {
            this.f20871c = false;
            this.f20872d = SystemClock.uptimeMillis();
            b.this.f20865b.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                this.f20871c = true;
                this.f20870b = SystemClock.uptimeMillis();
            }
        }

        final boolean a() {
            return !this.f20871c || this.f20870b - this.f20872d >= ((long) b.this.f20868e);
        }
    }

    private b() {
        super("AnrMonitor-Thread");
        this.f20865b = new Handler(Looper.getMainLooper());
        this.f20868e = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.f20866c == null || this.f20866c.f20871c)) {
                synchronized (this) {
                    try {
                        if (this.f20866c == null) {
                            this.f20866c = new a();
                        }
                        this.f20866c.b();
                        long j8 = this.f20868e;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (j8 > 0) {
                            try {
                                wait(j8);
                            } catch (InterruptedException e8) {
                                Log.w("AnrMonitor", e8.toString());
                            }
                            j8 = this.f20868e - (SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        if (!this.f20866c.a()) {
                            com.mbridge.msdk.foundation.same.report.b.a aVar = this.f20867d;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f20867d != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f20867d.a(c.a(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                try {
                    Thread.sleep(this.f20868e);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static b a() {
        if (f20864a == null) {
            synchronized (b.class) {
                try {
                    if (f20864a == null) {
                        f20864a = new b();
                    }
                } finally {
                }
            }
        }
        return f20864a;
    }

    public final b a(int i8, com.mbridge.msdk.foundation.same.report.b.a aVar) {
        this.f20868e = i8;
        this.f20867d = aVar;
        return this;
    }
}
