package M;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e0.AbstractC2764a;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.AbstractC3828l;
import q0.C3826j;
import q0.InterfaceC3818b;
import q0.InterfaceC3821e;
import q0.InterfaceC3825i;

/* renamed from: M.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1300c {

    /* renamed from: h, reason: collision with root package name */
    private static int f6347h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f6348i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f6349j = new Executor() { // from class: M.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f6350k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f6352b;

    /* renamed from: c, reason: collision with root package name */
    private final E f6353c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f6354d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f6356f;

    /* renamed from: g, reason: collision with root package name */
    private l f6357g;

    /* renamed from: a, reason: collision with root package name */
    private final SimpleArrayMap f6351a = new SimpleArrayMap();

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f6355e = new Messenger(new i(this, Looper.getMainLooper()));

    public C1300c(Context context) {
        this.f6352b = context;
        this.f6353c = new E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6354d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Task e(Bundle bundle) {
        if (m(bundle)) {
            return AbstractC3828l.e(null);
        }
        return AbstractC3828l.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void g(C1300c c1300c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c1300c.f6357g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1300c.f6356f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && Objects.equals(split[1], "ID")) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            c1300c.l(str, intent2.putExtra(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (c1300c.f6351a) {
                        for (int i8 = 0; i8 < c1300c.f6351a.size(); i8++) {
                            try {
                                c1300c.l((String) c1300c.f6351a.keyAt(i8), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = f6350k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c1300c.l(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task i(Bundle bundle) {
        final String j8 = j();
        final C3826j c3826j = new C3826j();
        synchronized (this.f6351a) {
            this.f6351a.put(j8, c3826j);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f6353c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f6352b, intent);
        intent.putExtra("kid", "|ID|" + j8 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f6355e);
        if (this.f6356f != null || this.f6357g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f6356f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f6357g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f6354d.schedule(new Runnable() { // from class: M.g
                @Override // java.lang.Runnable
                public final void run() {
                    if (C3826j.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c3826j.a().b(f6349j, new InterfaceC3821e() { // from class: M.h
                @Override // q0.InterfaceC3821e
                public final void a(Task task) {
                    C1300c.this.h(j8, schedule, task);
                }
            });
            return c3826j.a();
        }
        if (this.f6353c.b() == 2) {
            this.f6352b.sendBroadcast(intent);
        } else {
            this.f6352b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f6354d.schedule(new Runnable() { // from class: M.g
            @Override // java.lang.Runnable
            public final void run() {
                if (C3826j.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c3826j.a().b(f6349j, new InterfaceC3821e() { // from class: M.h
            @Override // q0.InterfaceC3821e
            public final void a(Task task) {
                C1300c.this.h(j8, schedule2, task);
            }
        });
        return c3826j.a();
    }

    private static synchronized String j() {
        String num;
        synchronized (C1300c.class) {
            int i8 = f6347h;
            f6347h = i8 + 1;
            num = Integer.toString(i8);
        }
        return num;
    }

    private static synchronized void k(Context context, Intent intent) {
        synchronized (C1300c.class) {
            try {
                if (f6348i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f6348i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC2764a.f31237a);
                }
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, f6348i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f6351a) {
            try {
                C3826j c3826j = (C3826j) this.f6351a.remove(str);
                if (c3826j == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                c3826j.c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    public Task a() {
        if (this.f6353c.a() >= 241100000) {
            return D.b(this.f6352b).d(5, Bundle.EMPTY).f(f6349j, new InterfaceC3818b() { // from class: M.f
                @Override // q0.InterfaceC3818b
                public final Object a(Task task) {
                    Intent intent = (Intent) ((Bundle) task.j()).getParcelable("notification_data");
                    if (intent != null) {
                        return new C1298a(intent);
                    }
                    return null;
                }
            });
        }
        return AbstractC3828l.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(C1298a c1298a) {
        if (this.f6353c.a() >= 233700000) {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", c1298a.u());
            Integer v8 = c1298a.v();
            if (v8 != null) {
                bundle.putInt("google.product_id", v8.intValue());
            }
            return D.b(this.f6352b).c(3, bundle);
        }
        return AbstractC3828l.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task c(final Bundle bundle) {
        if (this.f6353c.a() < 12000000) {
            if (this.f6353c.b() != 0) {
                return i(bundle).h(f6349j, new InterfaceC3818b() { // from class: M.H
                    @Override // q0.InterfaceC3818b
                    public final Object a(Task task) {
                        return C1300c.this.f(bundle, task);
                    }
                });
            }
            return AbstractC3828l.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return D.b(this.f6352b).d(1, bundle).f(f6349j, new InterfaceC3818b() { // from class: M.e
            @Override // q0.InterfaceC3818b
            public final Object a(Task task) {
                if (task.n()) {
                    return (Bundle) task.j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.i())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.i());
            }
        });
    }

    public Task d(boolean z8) {
        if (this.f6353c.a() >= 241100000) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("proxy_retention", z8);
            return D.b(this.f6352b).c(4, bundle);
        }
        return AbstractC3828l.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        if (task.n() && m((Bundle) task.j())) {
            return i(bundle).o(f6349j, new InterfaceC3825i() { // from class: M.F
                @Override // q0.InterfaceC3825i
                public final Task a(Object obj) {
                    return C1300c.e((Bundle) obj);
                }
            });
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f6351a) {
            this.f6351a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
