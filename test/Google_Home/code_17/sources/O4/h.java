package O4;

import H4.j;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f8251h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f8252a;

    /* renamed from: b, reason: collision with root package name */
    private final NsdManager f8253b;

    /* renamed from: c, reason: collision with root package name */
    private NsdManager.ResolveListener f8254c;

    /* renamed from: d, reason: collision with root package name */
    private NsdManager.ServiceInfoCallback f8255d;

    /* renamed from: e, reason: collision with root package name */
    private NsdManager.DiscoveryListener f8256e;

    /* renamed from: f, reason: collision with root package name */
    private NsdServiceInfo f8257f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f8258g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final String a(String manufacturer, String model, int i8) {
            AbstractC3255y.i(manufacturer, "manufacturer");
            AbstractC3255y.i(model, "model");
            String str = manufacturer + ' ' + model;
            if (str.length() > i8) {
                String substring = str.substring(0, i8 - 1);
                AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return str;
        }

        public final String b(String deviceId) {
            AbstractC3255y.i(deviceId, "deviceId");
            if (deviceId.length() > 16) {
                deviceId = deviceId.substring(0, 15);
                AbstractC3255y.h(deviceId, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String d8 = d();
            int length = (52 - deviceId.length()) - d8.length();
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC3255y.h(MANUFACTURER, "MANUFACTURER");
            String MODEL = Build.MODEL;
            AbstractC3255y.h(MODEL, "MODEL");
            return a(MANUFACTURER, MODEL, length) + "_d:_" + deviceId + "_:d__t:_" + d8;
        }

        public final String c(String serviceName) {
            AbstractC3255y.i(serviceName, "serviceName");
            String substring = serviceName.substring(0, n.S(serviceName, "_d:_", 0, false, 6, null));
            AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final String d() {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements NsdManager.DiscoveryListener {
        b() {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String regType) {
            AbstractC3255y.i(regType, "regType");
            h.this.f8252a.u();
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String serviceType) {
            AbstractC3255y.i(serviceType, "serviceType");
            h.this.f8252a.g();
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo service) {
            AbstractC3255y.i(service, "service");
            if (h.this.m(service)) {
                h.this.g().add(service);
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo service) {
            AbstractC3255y.i(service, "service");
            if (h.this.g().size() > 0) {
                Iterator it = h.this.g().iterator();
                int i8 = 0;
                while (it.hasNext() && !AbstractC3255y.d(((NsdServiceInfo) it.next()).getServiceName(), service.getServiceName())) {
                    i8++;
                }
                if (i8 < h.this.g().size()) {
                    h.this.g().remove(i8);
                }
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String serviceType, int i8) {
            AbstractC3255y.i(serviceType, "serviceType");
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String serviceType, int i8) {
            AbstractC3255y.i(serviceType, "serviceType");
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements NsdManager.ResolveListener {
        d() {
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo serviceInfo, int i8) {
            AbstractC3255y.i(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo serviceInfo) {
            AbstractC3255y.i(serviceInfo, "serviceInfo");
            h.this.p(serviceInfo);
        }
    }

    public h(Context context, i nsdListener) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(nsdListener, "nsdListener");
        this.f8252a = nsdListener;
        Object systemService = context.getSystemService("servicediscovery");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
        this.f8253b = (NsdManager) systemService;
        this.f8258g = new ArrayList();
    }

    private final void h() {
        if (this.f8256e == null) {
            this.f8256e = new b();
        }
    }

    private final void i() {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.f8255d == null) {
                this.f8255d = g.a(new c());
            }
        } else if (this.f8254c == null) {
            this.f8254c = new d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(NsdServiceInfo nsdServiceInfo) {
        String serviceName = nsdServiceInfo.getServiceName();
        if (AbstractC3255y.d(nsdServiceInfo.getServiceType(), "_nsduptodown._tcp.") && serviceName != null && serviceName.length() != 0 && !n.s(serviceName, j.f3824g.m(), true)) {
            return true;
        }
        return false;
    }

    private final void o() {
        NsdManager.ServiceInfoCallback serviceInfoCallback;
        if (Build.VERSION.SDK_INT >= 34 && (serviceInfoCallback = this.f8255d) != null) {
            try {
                NsdManager nsdManager = this.f8253b;
                AbstractC3255y.f(serviceInfoCallback);
                nsdManager.unregisterServiceInfoCallback(serviceInfoCallback);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(NsdServiceInfo nsdServiceInfo) {
        if (AbstractC3255y.d(nsdServiceInfo.getServiceName(), j.f3824g.m())) {
            return;
        }
        this.f8257f = nsdServiceInfo;
        this.f8252a.a();
    }

    public final void d() {
        h();
        try {
            this.f8253b.discoverServices("_nsduptodown._tcp.", 1, this.f8256e);
        } catch (IllegalArgumentException e8) {
            e8.printStackTrace();
            this.f8252a.e();
        }
    }

    public final NsdServiceInfo e() {
        return this.f8257f;
    }

    public final NsdManager f() {
        return this.f8253b;
    }

    public final ArrayList g() {
        return this.f8258g;
    }

    public final void j(int i8, NsdManager.RegistrationListener mRegistrationListener) {
        AbstractC3255y.i(mRegistrationListener, "mRegistrationListener");
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setPort(i8);
        nsdServiceInfo.setServiceName(j.f3824g.m());
        nsdServiceInfo.setServiceType("_nsduptodown._tcp.");
        try {
            this.f8253b.registerService(nsdServiceInfo, 1, mRegistrationListener);
        } catch (Exception unused) {
            this.f8252a.i();
        }
    }

    public final void k() {
        n();
        o();
        this.f8258g.clear();
        this.f8257f = null;
    }

    public final void l(NsdServiceInfo service) {
        NsdManager.ServiceInfoCallback serviceInfoCallback;
        AbstractC3255y.i(service, "service");
        i();
        if (Build.VERSION.SDK_INT >= 34) {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            if (newSingleThreadScheduledExecutor != null && (serviceInfoCallback = this.f8255d) != null) {
                NsdManager nsdManager = this.f8253b;
                AbstractC3255y.f(serviceInfoCallback);
                nsdManager.registerServiceInfoCallback(service, newSingleThreadScheduledExecutor, serviceInfoCallback);
                return;
            }
            return;
        }
        this.f8253b.resolveService(service, this.f8254c);
    }

    public final void n() {
        NsdManager.DiscoveryListener discoveryListener = this.f8256e;
        if (discoveryListener != null) {
            try {
                this.f8253b.stopServiceDiscovery(discoveryListener);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            this.f8256e = null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements NsdManager.ServiceInfoCallback {
        c() {
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceUpdated(NsdServiceInfo serviceInfo) {
            AbstractC3255y.i(serviceInfo, "serviceInfo");
            h.this.p(serviceInfo);
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceInfoCallbackUnregistered() {
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceLost() {
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceInfoCallbackRegistrationFailed(int i8) {
        }
    }
}
