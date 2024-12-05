package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.j;
import androidx.work.impl.m.c;
import androidx.work.impl.m.d;
import androidx.work.impl.n.p;
import androidx.work.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public class b implements c, androidx.work.impl.b {

    /* renamed from: f, reason: collision with root package name */
    static final String f1907f = n.f("SystemFgDispatcher");

    /* renamed from: g, reason: collision with root package name */
    private Context f1908g;

    /* renamed from: h, reason: collision with root package name */
    private j f1909h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.work.impl.utils.p.a f1910i;

    /* renamed from: j, reason: collision with root package name */
    final Object f1911j = new Object();

    /* renamed from: k, reason: collision with root package name */
    String f1912k;
    final Map<String, h> l;
    final Map<String, p> m;
    final Set<p> n;
    final d o;
    private InterfaceC0037b p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f1913f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f1914g;

        a(WorkDatabase workDatabase, String str) {
            this.f1913f = workDatabase;
            this.f1914g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p m = this.f1913f.j().m(this.f1914g);
            if (m == null || !m.b()) {
                return;
            }
            synchronized (b.this.f1911j) {
                b.this.m.put(this.f1914g, m);
                b.this.n.add(m);
                b bVar = b.this;
                bVar.o.d(bVar.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037b {
        void b(int i2, int i3, Notification notification);

        void c(int i2, Notification notification);

        void d(int i2);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f1908g = context;
        j p = j.p(this.f1908g);
        this.f1909h = p;
        androidx.work.impl.utils.p.a u = p.u();
        this.f1910i = u;
        this.f1912k = null;
        this.l = new LinkedHashMap();
        this.n = new HashSet();
        this.m = new HashMap();
        this.o = new d(this.f1908g, u, this);
        this.f1909h.r().c(this);
    }

    public static Intent a(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.a());
        intent.putExtra("KEY_NOTIFICATION", hVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.a());
        intent.putExtra("KEY_NOTIFICATION", hVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent f(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        n.c().d(f1907f, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f1909h.j(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n.c().a(f1907f, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.p == null) {
            return;
        }
        this.l.put(stringExtra, new h(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f1912k)) {
            this.f1912k = stringExtra;
            this.p.b(intExtra, intExtra2, notification);
            return;
        }
        this.p.c(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, h>> it = this.l.entrySet().iterator();
        while (it.hasNext()) {
            i2 |= it.next().getValue().a();
        }
        h hVar = this.l.get(this.f1912k);
        if (hVar != null) {
            this.p.b(hVar.c(), i2, hVar.b());
        }
    }

    private void i(Intent intent) {
        n.c().d(f1907f, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f1910i.b(new a(this.f1909h.t(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // androidx.work.impl.m.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            n.c().a(f1907f, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f1909h.B(str);
        }
    }

    @Override // androidx.work.impl.b
    public void d(String str, boolean z) {
        Map.Entry<String, h> entry;
        synchronized (this.f1911j) {
            p remove = this.m.remove(str);
            if (remove != null ? this.n.remove(remove) : false) {
                this.o.d(this.n);
            }
        }
        h remove2 = this.l.remove(str);
        if (str.equals(this.f1912k) && this.l.size() > 0) {
            Iterator<Map.Entry<String, h>> it = this.l.entrySet().iterator();
            Map.Entry<String, h> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f1912k = entry.getKey();
            if (this.p != null) {
                h value = entry.getValue();
                this.p.b(value.c(), value.a(), value.b());
                this.p.d(value.c());
            }
        }
        InterfaceC0037b interfaceC0037b = this.p;
        if (remove2 == null || interfaceC0037b == null) {
            return;
        }
        n.c().a(f1907f, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        interfaceC0037b.d(remove2.c());
    }

    @Override // androidx.work.impl.m.c
    public void e(List<String> list) {
    }

    void j(Intent intent) {
        n.c().d(f1907f, "Stopping foreground service", new Throwable[0]);
        InterfaceC0037b interfaceC0037b = this.p;
        if (interfaceC0037b != null) {
            interfaceC0037b.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.p = null;
        synchronized (this.f1911j) {
            this.o.e();
        }
        this.f1909h.r().i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(InterfaceC0037b interfaceC0037b) {
        if (this.p != null) {
            n.c().b(f1907f, "A callback already exists.", new Throwable[0]);
        } else {
            this.p = interfaceC0037b;
        }
    }
}
