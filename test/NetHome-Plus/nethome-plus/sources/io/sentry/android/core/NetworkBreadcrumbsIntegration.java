package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.n1;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final Context f18576f;

    /* renamed from: g, reason: collision with root package name */
    private final s0 f18577g;

    /* renamed from: h, reason: collision with root package name */
    private final w1 f18578h;

    /* renamed from: i, reason: collision with root package name */
    b f18579i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final int f18580b;

        /* renamed from: c, reason: collision with root package name */
        final int f18581c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f18582d;

        /* renamed from: e, reason: collision with root package name */
        final String f18583e;

        @SuppressLint({"NewApi", "ObsoleteSdkInt"})
        a(NetworkCapabilities networkCapabilities, s0 s0Var) {
            io.sentry.util.q.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.q.c(s0Var, "BuildInfoProvider is required");
            this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f18580b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = s0Var.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f18581c = signalStrength > -100 ? signalStrength : 0;
            this.f18582d = networkCapabilities.hasTransport(4);
            String d2 = io.sentry.android.core.internal.util.k.d(networkCapabilities, s0Var);
            this.f18583e = d2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : d2;
        }

        boolean a(a aVar) {
            if (this.f18582d == aVar.f18582d && this.f18583e.equals(aVar.f18583e)) {
                int i2 = this.f18581c;
                int i3 = aVar.f18581c;
                if (-5 <= i2 - i3 && i2 - i3 <= 5) {
                    int i4 = this.a;
                    int i5 = aVar.a;
                    if (-1000 <= i4 - i5 && i4 - i5 <= 1000) {
                        int i6 = this.f18580b;
                        int i7 = aVar.f18580b;
                        if (-1000 <= i6 - i7 && i6 - i7 <= 1000) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* loaded from: classes2.dex */
    static final class b extends ConnectivityManager.NetworkCallback {
        final v1 a;

        /* renamed from: b, reason: collision with root package name */
        final s0 f18584b;

        /* renamed from: c, reason: collision with root package name */
        Network f18585c = null;

        /* renamed from: d, reason: collision with root package name */
        NetworkCapabilities f18586d = null;

        b(v1 v1Var, s0 s0Var) {
            this.a = (v1) io.sentry.util.q.c(v1Var, "Hub is required");
            this.f18584b = (s0) io.sentry.util.q.c(s0Var, "BuildInfoProvider is required");
        }

        private io.sentry.v0 a(String str) {
            io.sentry.v0 v0Var = new io.sentry.v0();
            v0Var.p("system");
            v0Var.l("network.event");
            v0Var.m("action", str);
            v0Var.n(s4.INFO);
            return v0Var;
        }

        private a b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f18584b);
            }
            a aVar = new a(networkCapabilities, this.f18584b);
            a aVar2 = new a(networkCapabilities2, this.f18584b);
            if (aVar2.a(aVar)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.f18585c)) {
                return;
            }
            this.a.e(a("NETWORK_AVAILABLE"));
            this.f18585c = network;
            this.f18586d = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            a b2;
            if (network.equals(this.f18585c) && (b2 = b(this.f18586d, networkCapabilities)) != null) {
                this.f18586d = networkCapabilities;
                io.sentry.v0 a = a("NETWORK_CAPABILITIES_CHANGED");
                a.m("download_bandwidth", Integer.valueOf(b2.a));
                a.m("upload_bandwidth", Integer.valueOf(b2.f18580b));
                a.m("vpn_active", Boolean.valueOf(b2.f18582d));
                a.m("network_type", b2.f18583e);
                int i2 = b2.f18581c;
                if (i2 != 0) {
                    a.m("signal_strength", Integer.valueOf(i2));
                }
                n1 n1Var = new n1();
                n1Var.j("android:networkCapabilities", b2);
                this.a.i(a, n1Var);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(this.f18585c)) {
                this.a.e(a("NETWORK_LOST"));
                this.f18585c = null;
                this.f18586d = null;
            }
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, s0 s0Var, w1 w1Var) {
        this.f18576f = (Context) io.sentry.util.q.c(context, "Context is required");
        this.f18577g = (s0) io.sentry.util.q.c(s0Var, "BuildInfoProvider is required");
        this.f18578h = (w1) io.sentry.util.q.c(w1Var, "ILogger is required");
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.f18579i;
        if (bVar != null) {
            io.sentry.android.core.internal.util.k.g(this.f18576f, this.f18578h, this.f18577g, bVar);
            this.f18578h.c(s4.DEBUG, "NetworkBreadcrumbsIntegration remove.", new Object[0]);
        }
        this.f18579i = null;
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
    public void f(v1 v1Var, x4 x4Var) {
        io.sentry.util.q.c(v1Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        w1 w1Var = this.f18578h;
        s4 s4Var = s4.DEBUG;
        w1Var.c(s4Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f18577g.d() < 21) {
                this.f18579i = null;
                this.f18578h.c(s4Var, "NetworkBreadcrumbsIntegration requires Android 5+", new Object[0]);
                return;
            }
            b bVar = new b(v1Var, this.f18577g);
            this.f18579i = bVar;
            if (!io.sentry.android.core.internal.util.k.f(this.f18576f, this.f18578h, this.f18577g, bVar)) {
                this.f18579i = null;
                this.f18578h.c(s4Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
            } else {
                this.f18578h.c(s4Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                a();
            }
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }
}
