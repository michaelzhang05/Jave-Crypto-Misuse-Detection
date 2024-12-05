package H0;

import J0.B;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import r0.InterfaceC3671b;

/* loaded from: classes3.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    private final r f3265a;

    /* renamed from: b, reason: collision with root package name */
    private final M0.e f3266b;

    /* renamed from: c, reason: collision with root package name */
    private final N0.b f3267c;

    /* renamed from: d, reason: collision with root package name */
    private final I0.c f3268d;

    /* renamed from: e, reason: collision with root package name */
    private final I0.h f3269e;

    /* renamed from: f, reason: collision with root package name */
    private final z f3270f;

    O(r rVar, M0.e eVar, N0.b bVar, I0.c cVar, I0.h hVar, z zVar) {
        this.f3265a = rVar;
        this.f3266b = eVar;
        this.f3267c = bVar;
        this.f3268d = cVar;
        this.f3269e = hVar;
        this.f3270f = zVar;
    }

    private B.e.d c(B.e.d dVar) {
        return d(dVar, this.f3268d, this.f3269e);
    }

    private B.e.d d(B.e.d dVar, I0.c cVar, I0.h hVar) {
        B.e.d.b g8 = dVar.g();
        String c8 = cVar.c();
        if (c8 != null) {
            g8.d(B.e.d.AbstractC0086d.a().b(c8).a());
        } else {
            E0.f.f().i("No log data to include with this event.");
        }
        List l8 = l(hVar.d());
        List l9 = l(hVar.e());
        if (!l8.isEmpty() || !l9.isEmpty()) {
            g8.b(dVar.b().g().c(J0.C.a(l8)).e(J0.C.a(l9)).a());
        }
        return g8.a();
    }

    private static B.a e(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e8) {
            E0.f f8 = E0.f.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e8);
            f8.k(sb.toString());
        }
        B.a.b a8 = B.a.a();
        importance = applicationExitInfo.getImportance();
        B.a.b c8 = a8.c(importance);
        processName = applicationExitInfo.getProcessName();
        B.a.b e9 = c8.e(processName);
        reason = applicationExitInfo.getReason();
        B.a.b g8 = e9.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        B.a.b i8 = g8.i(timestamp);
        pid = applicationExitInfo.getPid();
        B.a.b d8 = i8.d(pid);
        pss = applicationExitInfo.getPss();
        B.a.b f9 = d8.f(pss);
        rss = applicationExitInfo.getRss();
        return f9.h(rss).j(str).a();
    }

    public static String f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static O g(Context context, z zVar, M0.f fVar, C1168b c1168b, I0.c cVar, I0.h hVar, P0.d dVar, O0.i iVar, E e8, C1177k c1177k) {
        return new O(new r(context, zVar, c1168b, dVar, iVar), new M0.e(fVar, iVar, c1177k), N0.b.b(context, iVar, e8), cVar, hVar, zVar);
    }

    private AbstractC1184s h(AbstractC1184s abstractC1184s) {
        if (abstractC1184s.b().f() == null) {
            return AbstractC1184s.a(abstractC1184s.b().q(this.f3270f.d()), abstractC1184s.d(), abstractC1184s.c());
        }
        return abstractC1184s;
    }

    private ApplicationExitInfo k(String str, List list) {
        long timestamp;
        int reason;
        long q8 = this.f3266b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a8 = androidx.work.impl.utils.b.a(it.next());
            timestamp = a8.getTimestamp();
            if (timestamp >= q8) {
                reason = a8.getReason();
                if (reason == 6) {
                    return a8;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    private static List l(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(B.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: H0.M
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int n8;
                n8 = O.n((B.c) obj, (B.c) obj2);
                return n8;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int n(B.c cVar, B.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(Task task) {
        if (task.n()) {
            AbstractC1184s abstractC1184s = (AbstractC1184s) task.j();
            E0.f.f().b("Crashlytics report successfully enqueued to DataTransport: " + abstractC1184s.d());
            File c8 = abstractC1184s.c();
            if (c8.delete()) {
                E0.f.f().b("Deleted report file: " + c8.getPath());
                return true;
            }
            E0.f.f().k("Crashlytics could not delete report file: " + c8.getPath());
            return true;
        }
        E0.f.f().l("Crashlytics report could not be enqueued to DataTransport", task.i());
        return false;
    }

    private void r(Throwable th, Thread thread, String str, String str2, long j8, boolean z8) {
        this.f3266b.y(c(this.f3265a.d(th, thread, str2, j8, 4, 8, z8)), str, str2.equals("crash"));
    }

    public void i(String str, List list, B.a aVar) {
        E0.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B.d.b b8 = ((C) it.next()).b();
            if (b8 != null) {
                arrayList.add(b8);
            }
        }
        this.f3266b.l(str, B.d.a().b(J0.C.a(arrayList)).a(), aVar);
    }

    public void j(long j8, String str) {
        this.f3266b.k(str, j8);
    }

    public boolean m() {
        return this.f3266b.r();
    }

    public SortedSet o() {
        return this.f3266b.p();
    }

    public void p(String str, long j8) {
        this.f3266b.z(this.f3265a.e(str, j8));
    }

    public void s(Throwable th, Thread thread, String str, long j8) {
        E0.f.f().i("Persisting fatal event for session " + str);
        r(th, thread, str, "crash", j8, true);
    }

    public void t(String str, List list, I0.c cVar, I0.h hVar) {
        ApplicationExitInfo k8 = k(str, list);
        if (k8 == null) {
            E0.f.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        B.e.d c8 = this.f3265a.c(e(k8));
        E0.f.f().b("Persisting anr for session " + str);
        this.f3266b.y(d(c8, cVar, hVar), str, true);
    }

    public void u() {
        this.f3266b.i();
    }

    public Task v(Executor executor) {
        return w(executor, null);
    }

    public Task w(Executor executor, String str) {
        boolean z8;
        List<AbstractC1184s> w8 = this.f3266b.w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC1184s abstractC1184s : w8) {
            if (str == null || str.equals(abstractC1184s.d())) {
                N0.b bVar = this.f3267c;
                AbstractC1184s h8 = h(abstractC1184s);
                if (str != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                arrayList.add(bVar.c(h8, z8).f(executor, new InterfaceC3671b() { // from class: H0.N
                    @Override // r0.InterfaceC3671b
                    public final Object a(Task task) {
                        boolean q8;
                        q8 = O.this.q(task);
                        return Boolean.valueOf(q8);
                    }
                }));
            }
        }
        return r0.l.f(arrayList);
    }
}
