package c0;

import a5.e0;
import a5.j0;
import a5.v;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3843a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static C0068c f3844b = C0068c.f3855d;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: c0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f3854c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final C0068c f3855d;

        /* renamed from: a, reason: collision with root package name */
        private final Set f3856a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f3857b;

        /* renamed from: c0.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f5.f fVar) {
                this();
            }
        }

        static {
            Set a6;
            Map d6;
            a6 = j0.a();
            d6 = e0.d();
            f3855d = new C0068c(a6, null, d6);
        }

        public C0068c(Set set, b bVar, Map map) {
            f5.h.e(set, "flags");
            f5.h.e(map, "allowedViolations");
            this.f3856a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f3857b = linkedHashMap;
        }

        public final Set a() {
            return this.f3856a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f3857b;
        }
    }

    private c() {
    }

    private final C0068c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.b0()) {
                w I = fragment.I();
                f5.h.d(I, "declaringFragment.parentFragmentManager");
                if (I.A0() != null) {
                    C0068c A0 = I.A0();
                    f5.h.b(A0);
                    return A0;
                }
            }
            fragment = fragment.H();
        }
        return f3844b;
    }

    private final void c(C0068c c0068c, final g gVar) {
        Fragment a6 = gVar.a();
        final String name = a6.getClass().getName();
        if (c0068c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        c0068c.b();
        if (c0068c.a().contains(a.PENALTY_DEATH)) {
            j(a6, new Runnable() { // from class: c0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, gVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, g gVar) {
        f5.h.e(gVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, gVar);
        throw gVar;
    }

    private final void e(g gVar) {
        if (w.H0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + gVar.a().getClass().getName(), gVar);
        }
    }

    public static final void f(Fragment fragment, String str) {
        f5.h.e(fragment, "fragment");
        f5.h.e(str, "previousFragmentId");
        c0.a aVar = new c0.a(fragment, str);
        c cVar = f3843a;
        cVar.e(aVar);
        C0068c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.k(b6, fragment.getClass(), aVar.getClass())) {
            cVar.c(b6, aVar);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        f5.h.e(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f3843a;
        cVar.e(dVar);
        C0068c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.k(b6, fragment.getClass(), dVar.getClass())) {
            cVar.c(b6, dVar);
        }
    }

    public static final void h(Fragment fragment) {
        f5.h.e(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f3843a;
        cVar.e(eVar);
        C0068c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.k(b6, fragment.getClass(), eVar.getClass())) {
            cVar.c(b6, eVar);
        }
    }

    public static final void i(Fragment fragment, ViewGroup viewGroup) {
        f5.h.e(fragment, "fragment");
        f5.h.e(viewGroup, "container");
        h hVar = new h(fragment, viewGroup);
        c cVar = f3843a;
        cVar.e(hVar);
        C0068c b6 = cVar.b(fragment);
        if (b6.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.k(b6, fragment.getClass(), hVar.getClass())) {
            cVar.c(b6, hVar);
        }
    }

    private final void j(Fragment fragment, Runnable runnable) {
        if (fragment.b0()) {
            Handler t5 = fragment.I().u0().t();
            f5.h.d(t5, "fragment.parentFragmentManager.host.handler");
            if (!f5.h.a(t5.getLooper(), Looper.myLooper())) {
                t5.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean k(C0068c c0068c, Class cls, Class cls2) {
        boolean i6;
        Set set = (Set) c0068c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!f5.h.a(cls2.getSuperclass(), g.class)) {
            i6 = v.i(set, cls2.getSuperclass());
            if (i6) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
