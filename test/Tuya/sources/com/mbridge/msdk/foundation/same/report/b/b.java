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
    private static volatile b f19809a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f19810b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f19811c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.b.a f19812d;

    /* renamed from: e, reason: collision with root package name */
    private int f19813e;

    /* loaded from: classes4.dex */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private long f19815b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f19816c;

        /* renamed from: d, reason: collision with root package name */
        private long f19817d;

        private a() {
            this.f19815b = SystemClock.uptimeMillis();
        }

        final void b() {
            this.f19816c = false;
            this.f19817d = SystemClock.uptimeMillis();
            b.this.f19810b.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this) {
                this.f19816c = true;
                this.f19815b = SystemClock.uptimeMillis();
            }
        }

        final boolean a() {
            return !this.f19816c || this.f19815b - this.f19817d >= ((long) b.this.f19813e);
        }
    }

    private b() {
        super("AnrMonitor-Thread");
        this.f19810b = new Handler(Looper.getMainLooper());
        this.f19813e = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (!isInterrupted() && (this.f19811c == null || this.f19811c.f19816c)) {
                synchronized (this) {
                    try {
                        if (this.f19811c == null) {
                            this.f19811c = new a();
                        }
                        this.f19811c.b();
                        long j8 = this.f19813e;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        while (j8 > 0) {
                            try {
                                wait(j8);
                            } catch (InterruptedException e8) {
                                Log.w("AnrMonitor", e8.toString());
                            }
                            j8 = this.f19813e - (SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        if (!this.f19811c.a()) {
                            com.mbridge.msdk.foundation.same.report.b.a aVar = this.f19812d;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f19812d != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f19812d.a(c.a(stackTrace), stackTrace);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                try {
                    Thread.sleep(this.f19813e);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static b a() {
        if (f19809a == null) {
            synchronized (b.class) {
                try {
                    if (f19809a == null) {
                        f19809a = new b();
                    }
                } finally {
                }
            }
        }
        return f19809a;
    }

    public final b a(int i8, com.mbridge.msdk.foundation.same.report.b.a aVar) {
        this.f19813e = i8;
        this.f19812d = aVar;
        return this;
    }
}
