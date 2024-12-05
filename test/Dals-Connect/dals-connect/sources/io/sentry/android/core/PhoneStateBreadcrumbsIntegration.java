package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class PhoneStateBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final Context f18587f;

    /* renamed from: g, reason: collision with root package name */
    private SentryAndroidOptions f18588g;

    /* renamed from: h, reason: collision with root package name */
    a f18589h;

    /* renamed from: i, reason: collision with root package name */
    private TelephonyManager f18590i;

    /* loaded from: classes2.dex */
    static final class a extends PhoneStateListener {
        private final v1 a;

        a(v1 v1Var) {
            this.a = v1Var;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i2, String str) {
            if (i2 == 1) {
                io.sentry.v0 v0Var = new io.sentry.v0();
                v0Var.p("system");
                v0Var.l("device.event");
                v0Var.m("action", "CALL_STATE_RINGING");
                v0Var.o("Device ringing");
                v0Var.n(s4.INFO);
                this.a.e(v0Var);
            }
        }
    }

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.f18587f = (Context) io.sentry.util.q.c(context, "Context is required");
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a aVar;
        TelephonyManager telephonyManager = this.f18590i;
        if (telephonyManager == null || (aVar = this.f18589h) == null) {
            return;
        }
        telephonyManager.listen(aVar, 0);
        this.f18589h = null;
        SentryAndroidOptions sentryAndroidOptions = this.f18588g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(s4.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.Integration
    public void f(v1 v1Var, x4 x4Var) {
        io.sentry.util.q.c(v1Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        this.f18588g = sentryAndroidOptions;
        w1 logger = sentryAndroidOptions.getLogger();
        s4 s4Var = s4.DEBUG;
        logger.c(s4Var, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f18588g.isEnableSystemEventBreadcrumbs()));
        if (this.f18588g.isEnableSystemEventBreadcrumbs() && io.sentry.android.core.internal.util.q.a(this.f18587f, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f18587f.getSystemService("phone");
            this.f18590i = telephonyManager;
            if (telephonyManager != null) {
                try {
                    a aVar = new a(v1Var);
                    this.f18589h = aVar;
                    this.f18590i.listen(aVar, 32);
                    x4Var.getLogger().c(s4Var, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                    a();
                    return;
                } catch (Throwable th) {
                    this.f18588g.getLogger().a(s4.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
                    return;
                }
            }
            this.f18588g.getLogger().c(s4.INFO, "TelephonyManager is not available", new Object[0]);
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }
}
