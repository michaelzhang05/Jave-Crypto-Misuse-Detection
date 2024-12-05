package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import cm.aptoide.pt.notification.sync.LocalNotificationSyncManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zaaw extends GoogleApiClient implements zabt {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f10684b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10685c;

    /* renamed from: d, reason: collision with root package name */
    private final GmsClientEventManager f10686d;

    /* renamed from: f, reason: collision with root package name */
    private final int f10688f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f10689g;

    /* renamed from: h, reason: collision with root package name */
    private final Looper f10690h;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f10692j;

    /* renamed from: k, reason: collision with root package name */
    private long f10693k;
    private long l;
    private final u m;
    private final GoogleApiAvailability n;

    @VisibleForTesting
    private zabq o;
    final Map<Api.AnyClientKey<?>, Api.Client> p;
    Set<Scope> q;
    private final ClientSettings r;
    private final Map<Api<?>, Boolean> s;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> t;
    private final ListenerHolders u;
    private final ArrayList<zaq> v;
    private Integer w;
    Set<zacm> x;
    final zacp y;
    private final GmsClientEventManager.GmsClientEventState z;

    /* renamed from: e, reason: collision with root package name */
    private zabs f10687e = null;

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> f10691i = new LinkedList();

    public zaaw(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i2, int i3, ArrayList<zaq> arrayList, boolean z) {
        this.f10693k = ClientLibraryUtils.b() ? 10000L : LocalNotificationSyncManager.TWO_MINUTES;
        this.l = 5000L;
        this.q = new HashSet();
        this.u = new ListenerHolders();
        this.w = null;
        this.x = null;
        q qVar = new q(this);
        this.z = qVar;
        this.f10689g = context;
        this.f10684b = lock;
        this.f10685c = false;
        this.f10686d = new GmsClientEventManager(looper, qVar);
        this.f10690h = looper;
        this.m = new u(this, looper);
        this.n = googleApiAvailability;
        this.f10688f = i2;
        if (i2 >= 0) {
            this.w = Integer.valueOf(i3);
        }
        this.s = map;
        this.p = map2;
        this.v = arrayList;
        this.y = new zacp(map2);
        Iterator<GoogleApiClient.ConnectionCallbacks> it = list.iterator();
        while (it.hasNext()) {
            this.f10686d.f(it.next());
        }
        Iterator<GoogleApiClient.OnConnectionFailedListener> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f10686d.g(it2.next());
        }
        this.r = clientSettings;
        this.t = abstractClientBuilder;
    }

    private final void C() {
        this.f10686d.b();
        this.f10687e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        this.f10684b.lock();
        try {
            if (E()) {
                C();
            }
        } finally {
            this.f10684b.unlock();
        }
    }

    private final void J(int i2) {
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String K = K(i2);
            String K2 = K(this.w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(K).length() + 51 + String.valueOf(K2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(K);
            sb.append(". Mode was already set to ");
            sb.append(K2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f10687e != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (Api.Client client : this.p.values()) {
            if (client.requiresSignIn()) {
                z = true;
            }
            if (client.providesSignIn()) {
                z2 = true;
            }
        }
        int intValue = this.w.intValue();
        if (intValue == 1) {
            if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (intValue == 2 && z) {
            if (this.f10685c) {
                this.f10687e = new zax(this.f10689g, this.f10684b, this.f10690h, this.n, this.p, this.r, this.s, this.t, this.v, this, true);
                return;
            } else {
                this.f10687e = r0.h(this.f10689g, this, this.f10684b, this.f10690h, this.n, this.p, this.r, this.s, this.t, this.v);
                return;
            }
        }
        if (this.f10685c && !z2) {
            this.f10687e = new zax(this.f10689g, this.f10684b, this.f10690h, this.n, this.p, this.r, this.s, this.t, this.v, this, false);
        } else {
            this.f10687e = new zabe(this.f10689g, this, this.f10684b, this.f10690h, this.n, this.p, this.r, this.s, this.t, this.v, this);
        }
    }

    private static String K(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        this.f10684b.lock();
        try {
            if (this.f10692j) {
                C();
            }
        } finally {
            this.f10684b.unlock();
        }
    }

    public static int y(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client client : iterable) {
            if (client.requiresSignIn()) {
                z2 = true;
            }
            if (client.providesSignIn()) {
                z3 = true;
            }
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.f10911d.a(googleApiClient).f(new t(this, statusPendingResult, z, googleApiClient));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E() {
        if (!this.f10692j) {
            return false;
        }
        this.f10692j = false;
        this.m.removeMessages(2);
        this.m.removeMessages(1);
        zabq zabqVar = this.o;
        if (zabqVar != null) {
            zabqVar.a();
            this.o = null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F() {
        this.f10684b.lock();
        try {
            if (this.x == null) {
                this.f10684b.unlock();
                return false;
            }
            return !r0.isEmpty();
        } finally {
            this.f10684b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String G() {
        StringWriter stringWriter = new StringWriter();
        i(HttpUrl.FRAGMENT_ENCODE_SET, null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void a(ConnectionResult connectionResult) {
        if (!this.n.k(this.f10689g, connectionResult.w())) {
            E();
        }
        if (this.f10692j) {
            return;
        }
        this.f10686d.c(connectionResult);
        this.f10686d.a();
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void b(Bundle bundle) {
        while (!this.f10691i.isEmpty()) {
            k(this.f10691i.remove());
        }
        this.f10686d.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void c(int i2, boolean z) {
        if (i2 == 1 && !z && !this.f10692j) {
            this.f10692j = true;
            if (this.o == null && !ClientLibraryUtils.b()) {
                this.o = this.n.w(this.f10689g.getApplicationContext(), new v(this));
            }
            u uVar = this.m;
            uVar.sendMessageDelayed(uVar.obtainMessage(1), this.f10693k);
            u uVar2 = this.m;
            uVar2.sendMessageDelayed(uVar2.obtainMessage(2), this.l);
        }
        this.y.c();
        this.f10686d.e(i2);
        this.f10686d.a();
        if (i2 == 2) {
            C();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult d() {
        boolean z = true;
        Preconditions.m(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f10684b.lock();
        try {
            if (this.f10688f >= 0) {
                if (this.w == null) {
                    z = false;
                }
                Preconditions.m(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(y(this.p.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            J(this.w.intValue());
            this.f10686d.b();
            return this.f10687e.e();
        } finally {
            this.f10684b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> e() {
        Preconditions.m(p(), "GoogleApiClient is not connected yet.");
        Preconditions.m(this.w.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.p.containsKey(Common.a)) {
            z(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient e2 = new GoogleApiClient.Builder(this.f10689g).a(Common.f10910c).c(new r(this, atomicReference, statusPendingResult)).d(new s(this, statusPendingResult)).g(this.m).e();
            atomicReference.set(e2);
            e2.f();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void f() {
        this.f10684b.lock();
        try {
            if (this.f10688f >= 0) {
                Preconditions.m(this.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(y(this.p.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            g(this.w.intValue());
        } finally {
            this.f10684b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void g(int i2) {
        this.f10684b.lock();
        boolean z = true;
        if (i2 != 3 && i2 != 1 && i2 != 2) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i2);
            Preconditions.b(z, sb.toString());
            J(i2);
            C();
        } finally {
            this.f10684b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void h() {
        this.f10684b.lock();
        try {
            this.y.a();
            zabs zabsVar = this.f10687e;
            if (zabsVar != null) {
                zabsVar.disconnect();
            }
            this.u.a();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.f10691i) {
                apiMethodImpl.n(null);
                apiMethodImpl.d();
            }
            this.f10691i.clear();
            if (this.f10687e == null) {
                return;
            }
            E();
            this.f10686d.a();
        } finally {
            this.f10684b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f10689g);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f10692j);
        printWriter.append(" mWorkQueue.size()=").print(this.f10691i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.y.f10719c.size());
        zabs zabsVar = this.f10687e;
        if (zabsVar != null) {
            zabsVar.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T j(T t) {
        Preconditions.b(t.u() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.p.containsKey(t.u());
        String b2 = t.t() != null ? t.t().b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b2);
        sb.append(" required for this call.");
        Preconditions.b(containsKey, sb.toString());
        this.f10684b.lock();
        try {
            zabs zabsVar = this.f10687e;
            if (zabsVar == null) {
                this.f10691i.add(t);
                return t;
            }
            return (T) zabsVar.T(t);
        } finally {
            this.f10684b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T k(T t) {
        Preconditions.b(t.u() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.p.containsKey(t.u());
        String b2 = t.t() != null ? t.t().b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b2);
        sb.append(" required for this call.");
        Preconditions.b(containsKey, sb.toString());
        this.f10684b.lock();
        try {
            if (this.f10687e != null) {
                if (this.f10692j) {
                    this.f10691i.add(t);
                    while (!this.f10691i.isEmpty()) {
                        BaseImplementation.ApiMethodImpl<?, ?> remove = this.f10691i.remove();
                        this.y.b(remove);
                        remove.y(Status.f10558h);
                    }
                    return t;
                }
                return (T) this.f10687e.S(t);
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f10684b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends Api.Client> C m(Api.AnyClientKey<C> anyClientKey) {
        C c2 = (C) this.p.get(anyClientKey);
        Preconditions.k(c2, "Appropriate Api was not requested.");
        return c2;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context n() {
        return this.f10689g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper o() {
        return this.f10690h;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean p() {
        zabs zabsVar = this.f10687e;
        return zabsVar != null && zabsVar.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean q(SignInConnectionListener signInConnectionListener) {
        zabs zabsVar = this.f10687e;
        return zabsVar != null && zabsVar.b(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void r() {
        zabs zabsVar = this.f10687e;
        if (zabsVar != null) {
            zabsVar.d();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void s() {
        h();
        f();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void t(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f10686d.g(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void u(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f10686d.h(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void v(zacm zacmVar) {
        this.f10684b.lock();
        try {
            Set<zacm> set = this.x;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(zacmVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!F()) {
                this.f10687e.c();
            }
        } finally {
            this.f10684b.unlock();
        }
    }
}
