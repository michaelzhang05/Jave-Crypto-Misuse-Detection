package N;

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
import f0.AbstractC2651a;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.C3679j;
import r0.InterfaceC3671b;
import r0.InterfaceC3674e;
import r0.InterfaceC3678i;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1255c {

    /* renamed from: h, reason: collision with root package name */
    private static int f7095h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f7096i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f7097j = new Executor() { // from class: N.D
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f7098k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f7100b;

    /* renamed from: c, reason: collision with root package name */
    private final x f7101c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f7102d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f7104f;

    /* renamed from: g, reason: collision with root package name */
    private h f7105g;

    /* renamed from: a, reason: collision with root package name */
    private final SimpleArrayMap f7099a = new SimpleArrayMap();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f7103e = new Messenger(new e(this, Looper.getMainLooper()));

    public C1255c(Context context) {
        this.f7100b = context;
        this.f7101c = new x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7102d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Task b(Bundle bundle) {
        if (j(bundle)) {
            return r0.l.e(null);
        }
        return r0.l.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(C1255c c1255c, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof h) {
                        c1255c.f7105g = (h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1255c.f7104f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            str4 = "Unexpected response action: ".concat(valueOf);
                        } else {
                            str4 = new String("Unexpected response action: ");
                        }
                        Log.d("Rpc", str4);
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
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("Rpc", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra2.length() != 0) {
                            str3 = "Received InstanceID error ".concat(stringExtra2);
                        } else {
                            str3 = new String("Received InstanceID error ");
                        }
                        Log.d("Rpc", str3);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            c1255c.i(str5, intent2.putExtra(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str6).getExtras());
                            return;
                        }
                        if (stringExtra2.length() != 0) {
                            str2 = "Unexpected structured response ".concat(stringExtra2);
                        } else {
                            str2 = new String("Unexpected structured response ");
                        }
                        Log.w("Rpc", str2);
                        return;
                    }
                    synchronized (c1255c.f7099a) {
                        for (int i8 = 0; i8 < c1255c.f7099a.size(); i8++) {
                            try {
                                c1255c.i((String) c1255c.f7099a.keyAt(i8), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = f7098k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c1255c.i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task f(Bundle bundle) {
        final String g8 = g();
        final C3679j c3679j = new C3679j();
        synchronized (this.f7099a) {
            this.f7099a.put(g8, c3679j);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f7101c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        h(this.f7100b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g8).length() + 5);
        sb.append("|ID|");
        sb.append(g8);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f7103e);
        if (this.f7104f != null || this.f7105g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f7104f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f7105g.c(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f7102d.schedule(new Runnable() { // from class: N.C
                @Override // java.lang.Runnable
                public final void run() {
                    if (C3679j.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c3679j.a().b(f7097j, new InterfaceC3674e() { // from class: N.A
                @Override // r0.InterfaceC3674e
                public final void a(Task task) {
                    C1255c.this.e(g8, schedule, task);
                }
            });
            return c3679j.a();
        }
        if (this.f7101c.b() == 2) {
            this.f7100b.sendBroadcast(intent);
        } else {
            this.f7100b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f7102d.schedule(new Runnable() { // from class: N.C
            @Override // java.lang.Runnable
            public final void run() {
                if (C3679j.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c3679j.a().b(f7097j, new InterfaceC3674e() { // from class: N.A
            @Override // r0.InterfaceC3674e
            public final void a(Task task) {
                C1255c.this.e(g8, schedule2, task);
            }
        });
        return c3679j.a();
    }

    private static synchronized String g() {
        String num;
        synchronized (C1255c.class) {
            int i8 = f7095h;
            f7095h = i8 + 1;
            num = Integer.toString(i8);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (C1255c.class) {
            try {
                if (f7096i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f7096i = AbstractC2651a.a(context, 0, intent2, AbstractC2651a.f30950a);
                }
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, f7096i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void i(String str, Bundle bundle) {
        String str2;
        synchronized (this.f7099a) {
            try {
                C3679j c3679j = (C3679j) this.f7099a.remove(str);
                if (c3679j == null) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        str2 = "Missing callback for ".concat(valueOf);
                    } else {
                        str2 = new String("Missing callback for ");
                    }
                    Log.w("Rpc", str2);
                    return;
                }
                c3679j.c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    public Task a(final Bundle bundle) {
        if (this.f7101c.a() < 12000000) {
            if (this.f7101c.b() != 0) {
                return f(bundle).h(f7097j, new InterfaceC3671b() { // from class: N.y
                    @Override // r0.InterfaceC3671b
                    public final Object a(Task task) {
                        return C1255c.this.c(bundle, task);
                    }
                });
            }
            return r0.l.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return w.b(this.f7100b).d(1, bundle).f(f7097j, new InterfaceC3671b() { // from class: N.z
            @Override // r0.InterfaceC3671b
            public final Object a(Task task) {
                if (task.n()) {
                    return (Bundle) task.j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(task.i());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                    Log.d("Rpc", sb.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.i());
            }
        });
    }

    public final /* synthetic */ Task c(Bundle bundle, Task task) {
        if (!task.n()) {
            return task;
        }
        if (!j((Bundle) task.j())) {
            return task;
        }
        return f(bundle).o(f7097j, new InterfaceC3678i() { // from class: N.B
            @Override // r0.InterfaceC3678i
            public final Task a(Object obj) {
                return C1255c.b((Bundle) obj);
            }
        });
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f7099a) {
            this.f7099a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
