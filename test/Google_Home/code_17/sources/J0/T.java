package J0;

import L0.F;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
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
import q0.AbstractC3828l;
import q0.InterfaceC3818b;

/* loaded from: classes3.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    private final C1285u f4641a;

    /* renamed from: b, reason: collision with root package name */
    private final O0.e f4642b;

    /* renamed from: c, reason: collision with root package name */
    private final P0.b f4643c;

    /* renamed from: d, reason: collision with root package name */
    private final K0.e f4644d;

    /* renamed from: e, reason: collision with root package name */
    private final K0.l f4645e;

    /* renamed from: f, reason: collision with root package name */
    private final D f4646f;

    T(C1285u c1285u, O0.e eVar, P0.b bVar, K0.e eVar2, K0.l lVar, D d8) {
        this.f4641a = c1285u;
        this.f4642b = eVar;
        this.f4643c = bVar;
        this.f4644d = eVar2;
        this.f4645e = lVar;
        this.f4646f = d8;
    }

    private F.e.d c(F.e.d dVar, K0.e eVar, K0.l lVar) {
        F.e.d.b h8 = dVar.h();
        String c8 = eVar.c();
        if (c8 != null) {
            h8.d(F.e.d.AbstractC0096d.a().b(c8).a());
        } else {
            G0.h.f().i("No log data to include with this event.");
        }
        List m8 = m(lVar.d());
        List m9 = m(lVar.e());
        if (!m8.isEmpty() || !m9.isEmpty()) {
            h8.b(dVar.b().i().e(m8).g(m9).a());
        }
        return h8.a();
    }

    private F.e.d d(F.e.d dVar) {
        return e(c(dVar, this.f4644d, this.f4645e), this.f4645e);
    }

    private F.e.d e(F.e.d dVar, K0.l lVar) {
        List f8 = lVar.f();
        if (f8.isEmpty()) {
            return dVar;
        }
        F.e.d.b h8 = dVar.h();
        h8.e(F.e.d.f.a().b(f8).a());
        return h8.a();
    }

    private static F.a f(ApplicationExitInfo applicationExitInfo) {
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
                str = g(traceInputStream);
            }
        } catch (IOException e8) {
            G0.h f8 = G0.h.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e8);
            f8.k(sb.toString());
        }
        F.a.b a8 = F.a.a();
        importance = applicationExitInfo.getImportance();
        F.a.b c8 = a8.c(importance);
        processName = applicationExitInfo.getProcessName();
        F.a.b e9 = c8.e(processName);
        reason = applicationExitInfo.getReason();
        F.a.b g8 = e9.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        F.a.b i8 = g8.i(timestamp);
        pid = applicationExitInfo.getPid();
        F.a.b d8 = i8.d(pid);
        pss = applicationExitInfo.getPss();
        F.a.b f9 = d8.f(pss);
        rss = applicationExitInfo.getRss();
        return f9.h(rss).j(str).a();
    }

    public static String g(InputStream inputStream) {
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

    public static T h(Context context, D d8, O0.g gVar, C1267b c1267b, K0.e eVar, K0.l lVar, R0.d dVar, Q0.i iVar, I i8, C1279n c1279n) {
        return new T(new C1285u(context, d8, c1267b, dVar, iVar), new O0.e(gVar, iVar, c1279n), P0.b.b(context, iVar, i8), eVar, lVar, d8);
    }

    private AbstractC1286v i(AbstractC1286v abstractC1286v) {
        if (abstractC1286v.b().h() != null && abstractC1286v.b().g() != null) {
            return abstractC1286v;
        }
        C d8 = this.f4646f.d(true);
        return AbstractC1286v.a(abstractC1286v.b().t(d8.b()).s(d8.a()), abstractC1286v.d(), abstractC1286v.c());
    }

    private ApplicationExitInfo l(String str, List list) {
        long timestamp;
        int reason;
        long q8 = this.f4642b.q(str);
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

    private static List m(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(F.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: J0.Q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int o8;
                o8 = T.o((F.c) obj, (F.c) obj2);
                return o8;
            }
        });
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int o(F.c cVar, F.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(Task task) {
        if (task.n()) {
            AbstractC1286v abstractC1286v = (AbstractC1286v) task.j();
            G0.h.f().b("Crashlytics report successfully enqueued to DataTransport: " + abstractC1286v.d());
            File c8 = abstractC1286v.c();
            if (c8.delete()) {
                G0.h.f().b("Deleted report file: " + c8.getPath());
                return true;
            }
            G0.h.f().k("Crashlytics could not delete report file: " + c8.getPath());
            return true;
        }
        G0.h.f().l("Crashlytics report could not be enqueued to DataTransport", task.i());
        return false;
    }

    private void s(Throwable th, Thread thread, String str, String str2, long j8, boolean z8) {
        this.f4642b.y(d(this.f4641a.d(th, thread, str2, j8, 4, 8, z8)), str, str2.equals("crash"));
    }

    public void j(String str, List list, F.a aVar) {
        G0.h.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.d.b b8 = ((G) it.next()).b();
            if (b8 != null) {
                arrayList.add(b8);
            }
        }
        this.f4642b.l(str, F.d.a().b(DesugarCollections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void k(long j8, String str) {
        this.f4642b.k(str, j8);
    }

    public boolean n() {
        return this.f4642b.r();
    }

    public SortedSet p() {
        return this.f4642b.p();
    }

    public void q(String str, long j8) {
        this.f4642b.z(this.f4641a.e(str, j8));
    }

    public void t(Throwable th, Thread thread, String str, long j8) {
        G0.h.f().i("Persisting fatal event for session " + str);
        s(th, thread, str, "crash", j8, true);
    }

    public void u(String str, List list, K0.e eVar, K0.l lVar) {
        ApplicationExitInfo l8 = l(str, list);
        if (l8 == null) {
            G0.h.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d c8 = this.f4641a.c(f(l8));
        G0.h.f().b("Persisting anr for session " + str);
        this.f4642b.y(e(c(c8, eVar, lVar), lVar), str, true);
    }

    public void v() {
        this.f4642b.i();
    }

    public Task w(Executor executor) {
        return x(executor, null);
    }

    public Task x(Executor executor, String str) {
        boolean z8;
        List<AbstractC1286v> w8 = this.f4642b.w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC1286v abstractC1286v : w8) {
            if (str == null || str.equals(abstractC1286v.d())) {
                P0.b bVar = this.f4643c;
                AbstractC1286v i8 = i(abstractC1286v);
                if (str != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                arrayList.add(bVar.c(i8, z8).f(executor, new InterfaceC3818b() { // from class: J0.S
                    @Override // q0.InterfaceC3818b
                    public final Object a(Task task) {
                        boolean r8;
                        r8 = T.this.r(task);
                        return Boolean.valueOf(r8);
                    }
                }));
            }
        }
        return AbstractC3828l.f(arrayList);
    }
}
