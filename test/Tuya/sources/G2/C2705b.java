package g2;

import L5.I;
import L5.s;
import L5.t;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g2.C2705b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2705b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31178a;

    /* renamed from: b, reason: collision with root package name */
    private final List f31179b;

    /* renamed from: c, reason: collision with root package name */
    private C2704a f31180c;

    /* renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f31181d;

    /* renamed from: g2.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    /* renamed from: g2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0746b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f31182a = new Handler(Looper.getMainLooper());

        C0746b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C2705b this$0) {
            AbstractC3159y.i(this$0, "this$0");
            Iterator it = this$0.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C2705b this$0) {
            AbstractC3159y.i(this$0, "this$0");
            Iterator it = this$0.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC3159y.i(network, "network");
            Handler handler = this.f31182a;
            final C2705b c2705b = C2705b.this;
            handler.post(new Runnable() { // from class: g2.c
                @Override // java.lang.Runnable
                public final void run() {
                    C2705b.C0746b.c(C2705b.this);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC3159y.i(network, "network");
            Handler handler = this.f31182a;
            final C2705b c2705b = C2705b.this;
            handler.post(new Runnable() { // from class: g2.d
                @Override // java.lang.Runnable
                public final void run() {
                    C2705b.C0746b.d(C2705b.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5586invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5586invoke() {
            Iterator it = C2705b.this.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5587invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5587invoke() {
            Iterator it = C2705b.this.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }
    }

    public C2705b(Context context) {
        AbstractC3159y.i(context, "context");
        this.f31178a = context;
        this.f31179b = new ArrayList();
    }

    private final void b(Context context) {
        C0746b c0746b = new C0746b();
        this.f31181d = c0746b;
        Object systemService = context.getSystemService("connectivity");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(c0746b);
    }

    private final void c(Context context) {
        C2704a c2704a = new C2704a(new c(), new d());
        this.f31180c = c2704a;
        context.registerReceiver(c2704a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager.NetworkCallback networkCallback = this.f31181d;
            if (networkCallback == null) {
                return;
            }
            Object systemService = this.f31178a.getSystemService("connectivity");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
        } else {
            C2704a c2704a = this.f31180c;
            if (c2704a == null) {
                return;
            }
            try {
                s.a aVar = s.f6511b;
                this.f31178a.unregisterReceiver(c2704a);
                s.b(I.f6487a);
            } catch (Throwable th) {
                s.a aVar2 = s.f6511b;
                s.b(t.a(th));
            }
        }
        this.f31179b.clear();
        this.f31181d = null;
        this.f31180c = null;
    }

    public final List d() {
        return this.f31179b;
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 24) {
            b(this.f31178a);
        } else {
            c(this.f31178a);
        }
    }
}
