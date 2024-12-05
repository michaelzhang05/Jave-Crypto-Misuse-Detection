package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class BaseGmsClient<T extends IInterface> {

    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private int zzbu;
    private long zzbv;
    private long zzbw;
    private int zzbx;
    private long zzby;

    @VisibleForTesting
    private zzh zzbz;
    private final Looper zzca;
    private final GmsClientSupervisor zzcb;
    private final GoogleApiAvailabilityLight zzcc;
    private final Object zzcd;
    private IGmsServiceBroker zzce;

    @VisibleForTesting
    protected ConnectionProgressReportCallbacks zzcf;
    private T zzcg;
    private final ArrayList<zzc<?>> zzch;
    private zze zzci;
    private int zzcj;
    private final BaseConnectionCallbacks zzck;
    private final BaseOnConnectionFailedListener zzcl;
    private final int zzcm;
    private final String zzcn;
    private ConnectionResult zzco;
    private boolean zzcp;
    private volatile zzb zzcq;

    @VisibleForTesting
    protected AtomicInteger zzcr;
    private static final Feature[] zzbt = new Feature[0];

    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        void C(Bundle bundle);

        @KeepForSdk
        void u(int i2);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface BaseOnConnectionFailedListener {
        void i0(ConnectionResult connectionResult);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void a(ConnectionResult connectionResult);
    }

    /* loaded from: classes2.dex */
    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public void a(ConnectionResult connectionResult) {
            if (!connectionResult.L()) {
                if (BaseGmsClient.this.zzcl != null) {
                    BaseGmsClient.this.zzcl.i0(connectionResult);
                }
            } else {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            }
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface SignOutCallbacks {
        @KeepForSdk
        void a();
    }

    /* loaded from: classes2.dex */
    private abstract class a extends zzc<Boolean> {

        /* renamed from: d, reason: collision with root package name */
        private final int f10810d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f10811e;

        protected a(int i2, Bundle bundle) {
            super(Boolean.TRUE);
            this.f10810d = i2;
            this.f10811e = bundle;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zzc
        protected final /* synthetic */ void c(Boolean bool) {
            if (bool != null) {
                int i2 = this.f10810d;
                if (i2 == 0) {
                    if (g()) {
                        return;
                    }
                    BaseGmsClient.this.zza(1, (int) null);
                    f(new ConnectionResult(8, null));
                    return;
                }
                if (i2 != 10) {
                    BaseGmsClient.this.zza(1, (int) null);
                    Bundle bundle = this.f10811e;
                    f(new ConnectionResult(this.f10810d, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
                    return;
                }
                BaseGmsClient.this.zza(1, (int) null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), BaseGmsClient.this.getStartServiceAction(), BaseGmsClient.this.getServiceDescriptor()));
            }
            BaseGmsClient.this.zza(1, (int) null);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zzc
        protected final void d() {
        }

        protected abstract void f(ConnectionResult connectionResult);

        protected abstract boolean g();
    }

    /* loaded from: classes2.dex */
    final class b extends com.google.android.gms.internal.common.zze {
        public b(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            zzc zzcVar = (zzc) message.obj;
            zzcVar.d();
            zzcVar.b();
        }

        private static boolean b(Message message) {
            int i2 = message.what;
            return i2 == 2 || i2 == 1 || i2 == 7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (BaseGmsClient.this.zzcr.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                    return;
                }
                return;
            }
            int i2 = message.what;
            if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !BaseGmsClient.this.enableLocalFallback()) || message.what == 5)) && !BaseGmsClient.this.isConnecting()) {
                a(message);
                return;
            }
            int i3 = message.what;
            if (i3 == 4) {
                BaseGmsClient.this.zzco = new ConnectionResult(message.arg2);
                if (!BaseGmsClient.this.zzl() || BaseGmsClient.this.zzcp) {
                    if (BaseGmsClient.this.zzco != null) {
                        connectionResult2 = BaseGmsClient.this.zzco;
                    } else {
                        connectionResult2 = new ConnectionResult(8);
                    }
                    BaseGmsClient.this.zzcf.a(connectionResult2);
                    BaseGmsClient.this.onConnectionFailed(connectionResult2);
                    return;
                }
                BaseGmsClient.this.zza(3, (int) null);
                return;
            }
            if (i3 == 5) {
                if (BaseGmsClient.this.zzco != null) {
                    connectionResult = BaseGmsClient.this.zzco;
                } else {
                    connectionResult = new ConnectionResult(8);
                }
                BaseGmsClient.this.zzcf.a(connectionResult);
                BaseGmsClient.this.onConnectionFailed(connectionResult);
                return;
            }
            if (i3 == 3) {
                Object obj = message.obj;
                ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                BaseGmsClient.this.zzcf.a(connectionResult3);
                BaseGmsClient.this.onConnectionFailed(connectionResult3);
                return;
            }
            if (i3 != 6) {
                if (i3 == 2 && !BaseGmsClient.this.isConnected()) {
                    a(message);
                    return;
                }
                if (b(message)) {
                    ((zzc) message.obj).e();
                    return;
                }
                int i4 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i4);
                Log.wtf("GmsClient", sb.toString(), new Exception());
                return;
            }
            BaseGmsClient.this.zza(5, (int) null);
            if (BaseGmsClient.this.zzck != null) {
                BaseGmsClient.this.zzck.u(message.arg2);
            }
            BaseGmsClient.this.onConnectionSuspended(message.arg2);
            BaseGmsClient.this.zza(5, 1, (int) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public abstract class zzc<TListener> {
        private TListener a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f10813b = false;

        public zzc(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
        }

        public final void b() {
            a();
            synchronized (BaseGmsClient.this.zzch) {
                BaseGmsClient.this.zzch.remove(this);
            }
        }

        protected abstract void c(TListener tlistener);

        protected abstract void d();

        public final void e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.f10813b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    c(tlistener);
                } catch (RuntimeException e2) {
                    d();
                    throw e2;
                }
            } else {
                d();
            }
            synchronized (this) {
                this.f10813b = true;
            }
            b();
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class zzd extends IGmsCallbacks.zza {

        /* renamed from: f, reason: collision with root package name */
        private BaseGmsClient f10815f;

        /* renamed from: g, reason: collision with root package name */
        private final int f10816g;

        public zzd(BaseGmsClient baseGmsClient, int i2) {
            this.f10815f = baseGmsClient;
            this.f10816g = i2;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void M3(int i2, IBinder iBinder, Bundle bundle) {
            Preconditions.k(this.f10815f, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f10815f.onPostInitHandler(i2, iBinder, bundle, this.f10816g);
            this.f10815f = null;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void a3(int i2, IBinder iBinder, zzb zzbVar) {
            Preconditions.k(this.f10815f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.j(zzbVar);
            this.f10815f.zza(zzbVar);
            M3(i2, iBinder, zzbVar.f10913f);
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void n3(int i2, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public final class zze implements ServiceConnection {

        /* renamed from: f, reason: collision with root package name */
        private final int f10817f;

        public zze(int i2) {
            this.f10817f = i2;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IGmsServiceBroker aVar;
            if (iBinder == null) {
                BaseGmsClient.this.zzb(16);
                return;
            }
            synchronized (BaseGmsClient.this.zzcd) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                    aVar = (IGmsServiceBroker) queryLocalInterface;
                } else {
                    aVar = new IGmsServiceBroker.Stub.a(iBinder);
                }
                baseGmsClient.zzce = aVar;
            }
            BaseGmsClient.this.zza(0, (Bundle) null, this.f10817f);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (BaseGmsClient.this.zzcd) {
                BaseGmsClient.this.zzce = null;
            }
            Handler handler = BaseGmsClient.this.mHandler;
            handler.sendMessage(handler.obtainMessage(6, this.f10817f, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public final class zzf extends a {

        /* renamed from: g, reason: collision with root package name */
        private final IBinder f10819g;

        public zzf(int i2, IBinder iBinder, Bundle bundle) {
            super(i2, bundle);
            this.f10819g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.a
        protected final void f(ConnectionResult connectionResult) {
            if (BaseGmsClient.this.zzcl != null) {
                BaseGmsClient.this.zzcl.i0(connectionResult);
            }
            BaseGmsClient.this.onConnectionFailed(connectionResult);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.a
        protected final boolean g() {
            try {
                String interfaceDescriptor = this.f10819g.getInterfaceDescriptor();
                if (!BaseGmsClient.this.getServiceDescriptor().equals(interfaceDescriptor)) {
                    String serviceDescriptor = BaseGmsClient.this.getServiceDescriptor();
                    StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(serviceDescriptor);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface createServiceInterface = BaseGmsClient.this.createServiceInterface(this.f10819g);
                if (createServiceInterface == null || !(BaseGmsClient.this.zza(2, 4, (int) createServiceInterface) || BaseGmsClient.this.zza(3, 4, (int) createServiceInterface))) {
                    return false;
                }
                BaseGmsClient.this.zzco = null;
                Bundle connectionHint = BaseGmsClient.this.getConnectionHint();
                if (BaseGmsClient.this.zzck == null) {
                    return true;
                }
                BaseGmsClient.this.zzck.C(connectionHint);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public final class zzg extends a {
        public zzg(int i2, Bundle bundle) {
            super(i2, null);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.a
        protected final void f(ConnectionResult connectionResult) {
            if (!BaseGmsClient.this.enableLocalFallback() || !BaseGmsClient.this.zzl()) {
                BaseGmsClient.this.zzcf.a(connectionResult);
                BaseGmsClient.this.onConnectionFailed(connectionResult);
            } else {
                BaseGmsClient.this.zzb(16);
            }
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.a
        protected final boolean g() {
            BaseGmsClient.this.zzcf.a(ConnectionResult.f10493f);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public BaseGmsClient(Context context, Looper looper, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this(context, looper, GmsClientSupervisor.a(context), GoogleApiAvailabilityLight.h(), i2, (BaseConnectionCallbacks) Preconditions.j(baseConnectionCallbacks), (BaseOnConnectionFailedListener) Preconditions.j(baseOnConnectionFailedListener), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        this.zzcq = zzbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(int i2) {
        int i3;
        if (zzk()) {
            i3 = 5;
            this.zzcp = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i3, this.zzcr.get(), 16));
    }

    private final String zzj() {
        String str = this.zzcn;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    private final boolean zzk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzl() {
        if (this.zzcp || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int j2 = this.zzcc.j(this.mContext, getMinApkVersion());
        if (j2 != 0) {
            zza(1, (int) null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), j2, null);
        } else {
            connect(new LegacyClientCallbackAdapter());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @KeepForSdk
    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        this.zzcf = (ConnectionProgressReportCallbacks) Preconditions.k(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        zza(2, (int) null);
    }

    @KeepForSdk
    protected abstract T createServiceInterface(IBinder iBinder);

    @KeepForSdk
    public void disconnect() {
        this.zzcr.incrementAndGet();
        synchronized (this.zzch) {
            int size = this.zzch.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.zzch.get(i2).a();
            }
            this.zzch.clear();
        }
        synchronized (this.zzcd) {
            this.zzce = null;
        }
        zza(1, (int) null);
    }

    @KeepForSdk
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.mLock) {
            i2 = this.zzcj;
            t = this.zzcg;
        }
        synchronized (this.zzcd) {
            iGmsServiceBroker = this.zzce;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzbw > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzbw;
            String format = simpleDateFormat.format(new Date(this.zzbw));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzbv > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.zzbu;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 != 2) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzbv;
            String format2 = simpleDateFormat.format(new Date(this.zzbv));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzby > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.a(this.zzbx));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzby;
            String format3 = simpleDateFormat.format(new Date(this.zzby));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    @KeepForSdk
    protected boolean enableLocalFallback() {
        return false;
    }

    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @KeepForSdk
    public Feature[] getApiFeatures() {
        return zzbt;
    }

    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzb zzbVar = this.zzcq;
        if (zzbVar == null) {
            return null;
        }
        return zzbVar.f10914g;
    }

    @KeepForSdk
    public Bundle getConnectionHint() {
        return null;
    }

    @KeepForSdk
    public final Context getContext() {
        return this.mContext;
    }

    @KeepForSdk
    public String getEndpointPackageName() {
        zzh zzhVar;
        if (isConnected() && (zzhVar = this.zzbz) != null) {
            return zzhVar.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @KeepForSdk
    protected String getLocalStartServiceAction() {
        return null;
    }

    @KeepForSdk
    public final Looper getLooper() {
        return this.zzca;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.a;
    }

    @KeepForSdk
    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.zzcm);
        getServiceRequest.f10848i = this.mContext.getPackageName();
        getServiceRequest.l = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f10850k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            getServiceRequest.m = getAccount() != null ? getAccount() : new Account(DEFAULT_ACCOUNT, "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.f10849j = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.m = getAccount();
        }
        getServiceRequest.n = zzbt;
        getServiceRequest.o = getApiFeatures();
        try {
            synchronized (this.zzcd) {
                IGmsServiceBroker iGmsServiceBroker = this.zzce;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.H1(new zzd(this, this.zzcr.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(1);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzcr.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzcr.get());
        }
    }

    @KeepForSdk
    protected Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    @KeepForSdk
    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.mLock) {
            if (this.zzcj != 5) {
                checkConnected();
                Preconditions.m(this.zzcg != null, "Client is connected but service is null");
                t = this.zzcg;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzcd) {
            IGmsServiceBroker iGmsServiceBroker = this.zzce;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    @KeepForSdk
    protected abstract String getServiceDescriptor();

    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @KeepForSdk
    protected abstract String getStartServiceAction();

    @KeepForSdk
    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 4;
        }
        return z;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            int i2 = this.zzcj;
            z = i2 == 2 || i2 == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public void onConnectedLocked(T t) {
        this.zzbw = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbx = connectionResult.w();
        this.zzby = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public void onConnectionSuspended(int i2) {
        this.zzbu = i2;
        this.zzbv = System.currentTimeMillis();
    }

    @KeepForSdk
    protected void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new zzf(i2, iBinder, bundle)));
    }

    @KeepForSdk
    void onSetConnectState(int i2, T t) {
    }

    @KeepForSdk
    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.a();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.zzcr.get(), i2));
    }

    @VisibleForTesting
    @KeepForSdk
    protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i2, PendingIntent pendingIntent) {
        this.zzcf = (ConnectionProgressReportCallbacks) Preconditions.k(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.zzcr.get(), i2, pendingIntent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2, T t) {
        zzh zzhVar;
        zzh zzhVar2;
        Preconditions.a((i2 == 4) == (t != null));
        synchronized (this.mLock) {
            this.zzcj = i2;
            this.zzcg = t;
            onSetConnectState(i2, t);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (this.zzci != null && (zzhVar2 = this.zzbz) != null) {
                        String c2 = zzhVar2.c();
                        String a2 = this.zzbz.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c2);
                        sb.append(" on ");
                        sb.append(a2);
                        Log.e("GmsClient", sb.toString());
                        this.zzcb.b(this.zzbz.c(), this.zzbz.a(), this.zzbz.b(), this.zzci, zzj());
                        this.zzcr.incrementAndGet();
                    }
                    this.zzci = new zze(this.zzcr.get());
                    if (this.zzcj == 3 && getLocalStartServiceAction() != null) {
                        zzhVar = new zzh(getContext().getPackageName(), getLocalStartServiceAction(), true, 129);
                    } else {
                        zzhVar = new zzh(getStartServicePackage(), getStartServiceAction(), false, 129);
                    }
                    this.zzbz = zzhVar;
                    if (!this.zzcb.c(new GmsClientSupervisor.zza(zzhVar.c(), this.zzbz.a(), this.zzbz.b()), this.zzci, zzj())) {
                        String c3 = this.zzbz.c();
                        String a3 = this.zzbz.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c3).length() + 34 + String.valueOf(a3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c3);
                        sb2.append(" on ");
                        sb2.append(a3);
                        Log.e("GmsClient", sb2.toString());
                        zza(16, (Bundle) null, this.zzcr.get());
                    }
                } else if (i2 == 4) {
                    onConnectedLocked(t);
                }
            } else if (this.zzci != null) {
                this.zzcb.b(this.zzbz.c(), this.zzbz.a(), this.zzbz.b(), this.zzci, zzj());
                this.zzci = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    @KeepForSdk
    public BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.mLock = new Object();
        this.zzcd = new Object();
        this.zzch = new ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new AtomicInteger(0);
        this.mContext = (Context) Preconditions.k(context, "Context must not be null");
        this.zzca = (Looper) Preconditions.k(looper, "Looper must not be null");
        this.zzcb = (GmsClientSupervisor) Preconditions.k(gmsClientSupervisor, "Supervisor must not be null");
        this.zzcc = (GoogleApiAvailabilityLight) Preconditions.k(googleApiAvailabilityLight, "API availability must not be null");
        this.mHandler = new b(looper);
        this.zzcm = i2;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = str;
    }

    @VisibleForTesting
    @KeepForSdk
    protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i2, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.mLock = new Object();
        this.zzcd = new Object();
        this.zzch = new ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new AtomicInteger(0);
        this.mContext = (Context) Preconditions.k(context, "Context must not be null");
        this.mHandler = (Handler) Preconditions.k(handler, "Handler must not be null");
        this.zzca = handler.getLooper();
        this.zzcb = (GmsClientSupervisor) Preconditions.k(gmsClientSupervisor, "Supervisor must not be null");
        this.zzcc = (GoogleApiAvailabilityLight) Preconditions.k(googleApiAvailabilityLight, "API availability must not be null");
        this.zzcm = i2;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(int i2, int i3, T t) {
        synchronized (this.mLock) {
            if (this.zzcj != i2) {
                return false;
            }
            zza(i3, (int) t);
            return true;
        }
    }

    protected final void zza(int i2, Bundle bundle, int i3) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new zzg(i2, null)));
    }
}
