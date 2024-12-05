package o5;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2683a;
import com.uptodown.activities.MainActivity;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3682v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36544a;

    /* renamed from: b, reason: collision with root package name */
    private final a f36545b;

    /* renamed from: o5.v$a */
    /* loaded from: classes5.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC3255y.i(network, "network");
            C3680t c3680t = C3680t.f36531a;
            if (!c3680t.d()) {
                c3680t.h(true);
                UptodownApp.a aVar = UptodownApp.f29058B;
                if (aVar.Q()) {
                    aVar.e(C3682v.this.f36544a);
                    C3655A c3655a = C3655A.f36474a;
                    if (c3655a.d().size() > 0) {
                        Object obj = c3655a.d().get(c3655a.d().size() - 1);
                        AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                        Activity activity = (Activity) obj;
                        if (activity instanceof AbstractActivityC2683a) {
                            ((AbstractActivityC2683a) activity).y2();
                        }
                        if (activity instanceof MainActivity) {
                            MainActivity mainActivity = (MainActivity) activity;
                            if (mainActivity.R5()) {
                                activity.runOnUiThread(new MainActivity.RunnableC2674c());
                            }
                        }
                    }
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC3255y.i(network, "network");
            AbstractC3255y.i(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            C3680t c3680t = C3680t.f36531a;
            if (c3680t.a() != networkCapabilities.getLinkDownstreamBandwidthKbps() || c3680t.b() != networkCapabilities.getLinkUpstreamBandwidthKbps()) {
                c3680t.g(networkCapabilities.getLinkDownstreamBandwidthKbps());
                c3680t.i(networkCapabilities.getLinkUpstreamBandwidthKbps());
                c3680t.j(networkCapabilities.hasTransport(1));
                UptodownApp.f29058B.e(C3682v.this.f36544a);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC3255y.i(network, "network");
            C3680t c3680t = C3680t.f36531a;
            c3680t.h(false);
            c3680t.g(0);
            c3680t.i(0);
            c3680t.j(false);
        }
    }

    public C3682v(Context context) {
        AbstractC3255y.i(context, "context");
        this.f36544a = context;
        this.f36545b = new a();
    }

    public final void b() {
        Object systemService = this.f36544a.getSystemService("connectivity");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        if (Build.VERSION.SDK_INT >= 24) {
            connectivityManager.registerDefaultNetworkCallback(this.f36545b);
        } else {
            connectivityManager.registerNetworkCallback(builder.build(), this.f36545b);
        }
    }

    public final void c() {
        Object systemService = this.f36544a.getSystemService("connectivity");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).unregisterNetworkCallback(new ConnectivityManager.NetworkCallback());
    }
}
