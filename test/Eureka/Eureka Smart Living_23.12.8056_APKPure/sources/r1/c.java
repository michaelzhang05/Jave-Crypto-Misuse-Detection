package r1;

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
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static int f9061h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f9062i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f9063j = new Executor() { // from class: r1.d0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f9064k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f9066b;

    /* renamed from: c, reason: collision with root package name */
    private final x f9067c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f9068d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f9070f;

    /* renamed from: g, reason: collision with root package name */
    private h f9071g;

    /* renamed from: a, reason: collision with root package name */
    private final l.g f9065a = new l.g();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f9069e = new Messenger(new e(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f9066b = context;
        this.f9067c = new x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f9068d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ l2.i b(Bundle bundle) {
        return j(bundle) ? l2.l.e(null) : l2.l.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof h) {
                        cVar.f9071g = (h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f9070f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f9064k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        cVar.i(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (cVar.f9065a) {
                        for (int i6 = 0; i6 < cVar.f9065a.size(); i6++) {
                            cVar.i((String) cVar.f9065a.i(i6), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                cVar.i(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final l2.i f(Bundle bundle) {
        final String g6 = g();
        final l2.j jVar = new l2.j();
        synchronized (this.f9065a) {
            this.f9065a.put(g6, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f9067c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        h(this.f9066b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g6).length() + 5);
        sb.append("|ID|");
        sb.append(g6);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f9069e);
        if (this.f9070f != null || this.f9071g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f9070f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f9071g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f9068d.schedule(new Runnable() { // from class: r1.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (l2.j.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            jVar.a().b(f9063j, new l2.d() { // from class: r1.a0
                @Override // l2.d
                public final void a(l2.i iVar) {
                    c.this.e(g6, schedule, iVar);
                }
            });
            return jVar.a();
        }
        if (this.f9067c.b() == 2) {
            this.f9066b.sendBroadcast(intent);
        } else {
            this.f9066b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f9068d.schedule(new Runnable() { // from class: r1.c0
            @Override // java.lang.Runnable
            public final void run() {
                if (l2.j.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        jVar.a().b(f9063j, new l2.d() { // from class: r1.a0
            @Override // l2.d
            public final void a(l2.i iVar) {
                c.this.e(g6, schedule2, iVar);
            }
        });
        return jVar.a();
    }

    private static synchronized String g() {
        String num;
        synchronized (c.class) {
            int i6 = f9061h;
            f9061h = i6 + 1;
            num = Integer.toString(i6);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (c.class) {
            if (f9062i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f9062i = e2.a.a(context, 0, intent2, e2.a.f6516a);
            }
            intent.putExtra("app", f9062i);
        }
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.f9065a) {
            l2.j jVar = (l2.j) this.f9065a.remove(str);
            if (jVar != null) {
                jVar.c(bundle);
            } else {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            }
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public l2.i a(final Bundle bundle) {
        return this.f9067c.a() < 12000000 ? this.f9067c.b() != 0 ? f(bundle).g(f9063j, new l2.a() { // from class: r1.y
            @Override // l2.a
            public final Object a(l2.i iVar) {
                return c.this.c(bundle, iVar);
            }
        }) : l2.l.d(new IOException("MISSING_INSTANCEID_SERVICE")) : w.b(this.f9066b).d(1, bundle).f(f9063j, new l2.a() { // from class: r1.z
            @Override // l2.a
            public final Object a(l2.i iVar) {
                if (iVar.m()) {
                    return (Bundle) iVar.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(iVar.h());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                    Log.d("Rpc", sb.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", iVar.h());
            }
        });
    }

    public final /* synthetic */ l2.i c(Bundle bundle, l2.i iVar) {
        return (iVar.m() && j((Bundle) iVar.i())) ? f(bundle).n(f9063j, new l2.h() { // from class: r1.b0
            @Override // l2.h
            public final l2.i a(Object obj) {
                return c.b((Bundle) obj);
            }
        }) : iVar;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, l2.i iVar) {
        synchronized (this.f9065a) {
            this.f9065a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
