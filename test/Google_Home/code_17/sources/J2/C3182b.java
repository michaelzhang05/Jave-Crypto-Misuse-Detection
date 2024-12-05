package j2;

import O5.I;
import O5.s;
import O5.t;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j2.C3182b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3182b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33905a;

    /* renamed from: b, reason: collision with root package name */
    private final List f33906b;

    /* renamed from: c, reason: collision with root package name */
    private C3181a f33907c;

    /* renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f33908d;

    /* renamed from: j2.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    /* renamed from: j2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0771b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f33909a = new Handler(Looper.getMainLooper());

        C0771b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C3182b this$0) {
            AbstractC3255y.i(this$0, "this$0");
            Iterator it = this$0.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C3182b this$0) {
            AbstractC3255y.i(this$0, "this$0");
            Iterator it = this$0.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC3255y.i(network, "network");
            Handler handler = this.f33909a;
            final C3182b c3182b = C3182b.this;
            handler.post(new Runnable() { // from class: j2.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3182b.C0771b.c(C3182b.this);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC3255y.i(network, "network");
            Handler handler = this.f33909a;
            final C3182b c3182b = C3182b.this;
            handler.post(new Runnable() { // from class: j2.d
                @Override // java.lang.Runnable
                public final void run() {
                    C3182b.C0771b.d(C3182b.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5599invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5599invoke() {
            Iterator it = C3182b.this.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5600invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5600invoke() {
            Iterator it = C3182b.this.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }
    }

    public C3182b(Context context) {
        AbstractC3255y.i(context, "context");
        this.f33905a = context;
        this.f33906b = new ArrayList();
    }

    private final void b(Context context) {
        C0771b c0771b = new C0771b();
        this.f33908d = c0771b;
        Object systemService = context.getSystemService("connectivity");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(c0771b);
    }

    private final void c(Context context) {
        C3181a c3181a = new C3181a(new c(), new d());
        this.f33907c = c3181a;
        context.registerReceiver(c3181a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager.NetworkCallback networkCallback = this.f33908d;
            if (networkCallback == null) {
                return;
            }
            Object systemService = this.f33905a.getSystemService("connectivity");
            AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
        } else {
            C3181a c3181a = this.f33907c;
            if (c3181a == null) {
                return;
            }
            try {
                s.a aVar = s.f8302b;
                this.f33905a.unregisterReceiver(c3181a);
                s.b(I.f8278a);
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                s.b(t.a(th));
            }
        }
        this.f33906b.clear();
        this.f33908d = null;
        this.f33907c = null;
    }

    public final List d() {
        return this.f33906b;
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 24) {
            b(this.f33905a);
        } else {
            c(this.f33905a);
        }
    }
}
