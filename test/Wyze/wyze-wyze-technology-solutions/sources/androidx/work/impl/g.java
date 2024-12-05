package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.n;
import androidx.work.q;
import androidx.work.w;
import androidx.work.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public class g extends w {
    private static final String a = n.f("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    private final j f1916b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1917c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.g f1918d;

    /* renamed from: e, reason: collision with root package name */
    private final List<? extends z> f1919e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f1920f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f1921g;

    /* renamed from: h, reason: collision with root package name */
    private final List<g> f1922h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1923i;

    /* renamed from: j, reason: collision with root package name */
    private q f1924j;

    public g(j jVar, List<? extends z> list) {
        this(jVar, null, androidx.work.g.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l = l(gVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (l.contains(it.next())) {
                return true;
            }
        }
        List<g> e2 = gVar.e();
        if (e2 != null && !e2.isEmpty()) {
            Iterator<g> it2 = e2.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e2 = gVar.e();
        if (e2 != null && !e2.isEmpty()) {
            Iterator<g> it = e2.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public q a() {
        if (!this.f1923i) {
            androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(this);
            this.f1916b.u().b(bVar);
            this.f1924j = bVar.d();
        } else {
            n.c().h(a, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f1920f)), new Throwable[0]);
        }
        return this.f1924j;
    }

    public androidx.work.g b() {
        return this.f1918d;
    }

    public List<String> c() {
        return this.f1920f;
    }

    public String d() {
        return this.f1917c;
    }

    public List<g> e() {
        return this.f1922h;
    }

    public List<? extends z> f() {
        return this.f1919e;
    }

    public j g() {
        return this.f1916b;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f1923i;
    }

    public void k() {
        this.f1923i = true;
    }

    public g(j jVar, String str, androidx.work.g gVar, List<? extends z> list) {
        this(jVar, str, gVar, list, null);
    }

    public g(j jVar, String str, androidx.work.g gVar, List<? extends z> list, List<g> list2) {
        this.f1916b = jVar;
        this.f1917c = str;
        this.f1918d = gVar;
        this.f1919e = list;
        this.f1922h = list2;
        this.f1920f = new ArrayList(list.size());
        this.f1921g = new ArrayList();
        if (list2 != null) {
            Iterator<g> it = list2.iterator();
            while (it.hasNext()) {
                this.f1921g.addAll(it.next().f1921g);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a2 = list.get(i2).a();
            this.f1920f.add(a2);
            this.f1921g.add(a2);
        }
    }
}
