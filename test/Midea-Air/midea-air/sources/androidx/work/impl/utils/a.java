package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.n.q;
import androidx.work.q;
import androidx.work.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final androidx.work.impl.c f2047f = new androidx.work.impl.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: androidx.work.impl.utils.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0040a extends a {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f2048g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UUID f2049h;

        C0040a(androidx.work.impl.j jVar, UUID uuid) {
            this.f2048g = jVar;
            this.f2049h = uuid;
        }

        @Override // androidx.work.impl.utils.a
        void h() {
            WorkDatabase t = this.f2048g.t();
            t.beginTransaction();
            try {
                a(this.f2048g, this.f2049h.toString());
                t.setTransactionSuccessful();
                t.endTransaction();
                g(this.f2048g);
            } catch (Throwable th) {
                t.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class b extends a {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f2050g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f2051h;

        b(androidx.work.impl.j jVar, String str) {
            this.f2050g = jVar;
            this.f2051h = str;
        }

        @Override // androidx.work.impl.utils.a
        void h() {
            WorkDatabase t = this.f2050g.t();
            t.beginTransaction();
            try {
                Iterator<String> it = t.j().o(this.f2051h).iterator();
                while (it.hasNext()) {
                    a(this.f2050g, it.next());
                }
                t.setTransactionSuccessful();
                t.endTransaction();
                g(this.f2050g);
            } catch (Throwable th) {
                t.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class c extends a {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.j f2052g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f2053h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f2054i;

        c(androidx.work.impl.j jVar, String str, boolean z) {
            this.f2052g = jVar;
            this.f2053h = str;
            this.f2054i = z;
        }

        @Override // androidx.work.impl.utils.a
        void h() {
            WorkDatabase t = this.f2052g.t();
            t.beginTransaction();
            try {
                Iterator<String> it = t.j().k(this.f2053h).iterator();
                while (it.hasNext()) {
                    a(this.f2052g, it.next());
                }
                t.setTransactionSuccessful();
                t.endTransaction();
                if (this.f2054i) {
                    g(this.f2052g);
                }
            } catch (Throwable th) {
                t.endTransaction();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, androidx.work.impl.j jVar) {
        return new C0040a(jVar, uuid);
    }

    public static a c(String str, androidx.work.impl.j jVar, boolean z) {
        return new c(jVar, str, z);
    }

    public static a d(String str, androidx.work.impl.j jVar) {
        return new b(jVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q j2 = workDatabase.j();
        androidx.work.impl.n.b b2 = workDatabase.b();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            x l = j2.l(str2);
            if (l != x.SUCCEEDED && l != x.FAILED) {
                j2.a(x.CANCELLED, str2);
            }
            linkedList.addAll(b2.b(str2));
        }
    }

    void a(androidx.work.impl.j jVar, String str) {
        f(jVar.t(), str);
        jVar.r().l(str);
        Iterator<androidx.work.impl.e> it = jVar.s().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public androidx.work.q e() {
        return this.f2047f;
    }

    void g(androidx.work.impl.j jVar) {
        androidx.work.impl.f.b(jVar.n(), jVar.t(), jVar.s());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f2047f.a(androidx.work.q.a);
        } catch (Throwable th) {
            this.f2047f.a(new q.b.a(th));
        }
    }
}
