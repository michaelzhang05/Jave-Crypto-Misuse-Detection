package L4;

import E4.j;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import g6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f6460h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f6461a;

    /* renamed from: b, reason: collision with root package name */
    private final NsdManager f6462b;

    /* renamed from: c, reason: collision with root package name */
    private NsdManager.ResolveListener f6463c;

    /* renamed from: d, reason: collision with root package name */
    private NsdManager.ServiceInfoCallback f6464d;

    /* renamed from: e, reason: collision with root package name */
    private NsdManager.DiscoveryListener f6465e;

    /* renamed from: f, reason: collision with root package name */
    private NsdServiceInfo f6466f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f6467g;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final String a(String manufacturer, String model, int i8) {
            AbstractC3159y.i(manufacturer, "manufacturer");
            AbstractC3159y.i(model, "model");
            String str = manufacturer + ' ' + model;
            if (str.length() > i8) {
                String substring = str.substring(0, i8 - 1);
                AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            return str;
        }

        public final String b(String deviceId) {
            AbstractC3159y.i(deviceId, "deviceId");
            if (deviceId.length() > 16) {
                deviceId = deviceId.substring(0, 15);
                AbstractC3159y.h(deviceId, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String d8 = d();
            int length = (52 - deviceId.length()) - d8.length();
            String MANUFACTURER = Build.MANUFACTURER;
            AbstractC3159y.h(MANUFACTURER, "MANUFACTURER");
            String MODEL = Build.MODEL;
            AbstractC3159y.h(MODEL, "MODEL");
            return a(MANUFACTURER, MODEL, length) + "_d:_" + deviceId + "_:d__t:_" + d8;
        }

        public final String c(String serviceName) {
            AbstractC3159y.i(serviceName, "serviceName");
            String substring = serviceName.substring(0, n.S(serviceName, "_d:_", 0, false, 6, null));
            AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final String d() {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements NsdManager.DiscoveryListener {
        b() {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String regType) {
            AbstractC3159y.i(regType, "regType");
            h.this.f6461a.s();
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String serviceType) {
            AbstractC3159y.i(serviceType, "serviceType");
            h.this.f6461a.g();
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo service) {
            AbstractC3159y.i(service, "service");
            if (h.this.m(service)) {
                h.this.g().add(service);
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo service) {
            AbstractC3159y.i(service, "service");
            if (h.this.g().size() > 0) {
                Iterator it = h.this.g().iterator();
                int i8 = 0;
                while (it.hasNext() && !AbstractC3159y.d(((NsdServiceInfo) it.next()).getServiceName(), service.getServiceName())) {
                    i8++;
                }
                if (i8 < h.this.g().size()) {
                    h.this.g().remove(i8);
                }
            }
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String serviceType, int i8) {
            AbstractC3159y.i(serviceType, "serviceType");
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String serviceType, int i8) {
            AbstractC3159y.i(serviceType, "serviceType");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements NsdManager.ResolveListener {
        d() {
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo serviceInfo, int i8) {
            AbstractC3159y.i(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo serviceInfo) {
            AbstractC3159y.i(serviceInfo, "serviceInfo");
            h.this.p(serviceInfo);
        }
    }

    public h(Context context, i nsdListener) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(nsdListener, "nsdListener");
        this.f6461a = nsdListener;
        Object systemService = context.getSystemService("servicediscovery");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
        this.f6462b = (NsdManager) systemService;
        this.f6467g = new ArrayList();
    }

    private final void h() {
        if (this.f6465e == null) {
            this.f6465e = new b();
        }
    }

    private final void i() {
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.f6464d == null) {
                this.f6464d = g.a(new c());
            }
        } else if (this.f6463c == null) {
            this.f6463c = new d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(NsdServiceInfo nsdServiceInfo) {
        String serviceName = nsdServiceInfo.getServiceName();
        if (AbstractC3159y.d(nsdServiceInfo.getServiceType(), "_nsduptodown._tcp.") && serviceName != null && serviceName.length() != 0 && !n.s(serviceName, j.f2274g.m(), true)) {
            return true;
        }
        return false;
    }

    private final void o() {
        NsdManager.ServiceInfoCallback serviceInfoCallback;
        if (Build.VERSION.SDK_INT >= 34 && (serviceInfoCallback = this.f6464d) != null) {
            try {
                NsdManager nsdManager = this.f6462b;
                AbstractC3159y.f(serviceInfoCallback);
                nsdManager.unregisterServiceInfoCallback(serviceInfoCallback);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(NsdServiceInfo nsdServiceInfo) {
        if (AbstractC3159y.d(nsdServiceInfo.getServiceName(), j.f2274g.m())) {
            return;
        }
        this.f6466f = nsdServiceInfo;
        this.f6461a.a();
    }

    public final void d() {
        h();
        try {
            this.f6462b.discoverServices("_nsduptodown._tcp.", 1, this.f6465e);
        } catch (IllegalArgumentException e8) {
            e8.printStackTrace();
            this.f6461a.e();
        }
    }

    public final NsdServiceInfo e() {
        return this.f6466f;
    }

    public final NsdManager f() {
        return this.f6462b;
    }

    public final ArrayList g() {
        return this.f6467g;
    }

    public final void j(int i8, NsdManager.RegistrationListener mRegistrationListener) {
        AbstractC3159y.i(mRegistrationListener, "mRegistrationListener");
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setPort(i8);
        nsdServiceInfo.setServiceName(j.f2274g.m());
        nsdServiceInfo.setServiceType("_nsduptodown._tcp.");
        try {
            this.f6462b.registerService(nsdServiceInfo, 1, mRegistrationListener);
        } catch (Exception unused) {
            this.f6461a.i();
        }
    }

    public final void k() {
        n();
        o();
        this.f6467g.clear();
        this.f6466f = null;
    }

    public final void l(NsdServiceInfo service) {
        NsdManager.ServiceInfoCallback serviceInfoCallback;
        AbstractC3159y.i(service, "service");
        i();
        if (Build.VERSION.SDK_INT >= 34) {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            if (newSingleThreadScheduledExecutor != null && (serviceInfoCallback = this.f6464d) != null) {
                NsdManager nsdManager = this.f6462b;
                AbstractC3159y.f(serviceInfoCallback);
                nsdManager.registerServiceInfoCallback(service, newSingleThreadScheduledExecutor, serviceInfoCallback);
                return;
            }
            return;
        }
        this.f6462b.resolveService(service, this.f6463c);
    }

    public final void n() {
        NsdManager.DiscoveryListener discoveryListener = this.f6465e;
        if (discoveryListener != null) {
            try {
                this.f6462b.stopServiceDiscovery(discoveryListener);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            this.f6465e = null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements NsdManager.ServiceInfoCallback {
        c() {
        }

        @Override // android.net.nsd.NsdManager.ServiceInfoCallback
        public void onServiceUpdated(NsdServiceInfo serviceInfo) {
            AbstractC3159y.i(serviceInfo, "serviceInfo");
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
