package androidx.work.impl.m.f;

import android.content.Context;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {
    private static final String a = n.f("ConstraintTracker");

    /* renamed from: b, reason: collision with root package name */
    protected final androidx.work.impl.utils.p.a f1988b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f1989c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f1990d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set<androidx.work.impl.m.a<T>> f1991e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    T f1992f;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f1993f;

        a(List list) {
            this.f1993f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1993f.iterator();
            while (it.hasNext()) {
                ((androidx.work.impl.m.a) it.next()).a(d.this.f1992f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, androidx.work.impl.utils.p.a aVar) {
        this.f1989c = context.getApplicationContext();
        this.f1988b = aVar;
    }

    public void a(androidx.work.impl.m.a<T> aVar) {
        synchronized (this.f1990d) {
            if (this.f1991e.add(aVar)) {
                if (this.f1991e.size() == 1) {
                    this.f1992f = b();
                    n.c().a(a, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f1992f), new Throwable[0]);
                    e();
                }
                aVar.a(this.f1992f);
            }
        }
    }

    public abstract T b();

    public void c(androidx.work.impl.m.a<T> aVar) {
        synchronized (this.f1990d) {
            if (this.f1991e.remove(aVar) && this.f1991e.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t) {
        synchronized (this.f1990d) {
            T t2 = this.f1992f;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f1992f = t;
                this.f1988b.a().execute(new a(new ArrayList(this.f1991e)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
