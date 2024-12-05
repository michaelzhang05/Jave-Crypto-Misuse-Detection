package I1;

import B1.n;
import E1.e;
import H1.h;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f3963a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f3964b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f3965c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f3966d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f3967e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f3968f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f3969g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map f3970h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f3971i;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final e f3972a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f3973b = new ArrayList();

        public a(e eVar, String str) {
            this.f3972a = eVar;
            b(str);
        }

        public e a() {
            return this.f3972a;
        }

        public void b(String str) {
            this.f3973b.add(str);
        }

        public ArrayList c() {
            return this.f3973b;
        }
    }

    private String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a8 = h.a(view);
            if (a8 != null) {
                return a8;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        this.f3966d.addAll(hashSet);
        return null;
    }

    private void d(n nVar) {
        Iterator it = nVar.q().iterator();
        while (it.hasNext()) {
            e((e) it.next(), nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(e eVar, n nVar) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = (a) this.f3964b.get(view);
        if (aVar != null) {
            aVar.b(nVar.v());
        } else {
            this.f3964b.put(view, new a(eVar, nVar.v()));
        }
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f3970h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f3970h.containsKey(view)) {
            return (Boolean) this.f3970h.get(view);
        }
        Map map = this.f3970h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return (View) this.f3965c.get(str);
    }

    public void c() {
        this.f3963a.clear();
        this.f3964b.clear();
        this.f3965c.clear();
        this.f3966d.clear();
        this.f3967e.clear();
        this.f3968f.clear();
        this.f3969g.clear();
        this.f3971i = false;
    }

    public String g(String str) {
        return (String) this.f3969g.get(str);
    }

    public HashSet h() {
        return this.f3968f;
    }

    public a i(View view) {
        a aVar = (a) this.f3964b.get(view);
        if (aVar != null) {
            this.f3964b.remove(view);
        }
        return aVar;
    }

    public HashSet j() {
        return this.f3967e;
    }

    public String k(View view) {
        if (this.f3963a.size() == 0) {
            return null;
        }
        String str = (String) this.f3963a.get(view);
        if (str != null) {
            this.f3963a.remove(view);
        }
        return str;
    }

    public void l() {
        this.f3971i = true;
    }

    public d m(View view) {
        if (this.f3966d.contains(view)) {
            return d.PARENT_VIEW;
        }
        if (this.f3971i) {
            return d.OBSTRUCTION_VIEW;
        }
        return d.UNDERLYING_VIEW;
    }

    public void n() {
        E1.c e8 = E1.c.e();
        if (e8 != null) {
            for (n nVar : e8.a()) {
                View o8 = nVar.o();
                if (nVar.t()) {
                    String v8 = nVar.v();
                    if (o8 != null) {
                        String b8 = b(o8);
                        if (b8 == null) {
                            this.f3967e.add(v8);
                            this.f3963a.put(o8, v8);
                            d(nVar);
                        } else if (b8 != "noWindowFocus") {
                            this.f3968f.add(v8);
                            this.f3965c.put(v8, o8);
                            this.f3969g.put(v8, b8);
                        }
                    } else {
                        this.f3968f.add(v8);
                        this.f3969g.put(v8, "noAdView");
                    }
                }
            }
        }
    }

    public boolean o(View view) {
        if (this.f3970h.containsKey(view)) {
            this.f3970h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
