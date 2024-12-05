package F1;

import B1.e;
import E1.h;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import y1.C3981n;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f2423a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f2424b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f2425c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f2426d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f2427e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f2428f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f2429g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map f2430h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f2431i;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final e f2432a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f2433b = new ArrayList();

        public a(e eVar, String str) {
            this.f2432a = eVar;
            b(str);
        }

        public e a() {
            return this.f2432a;
        }

        public void b(String str) {
            this.f2433b.add(str);
        }

        public ArrayList c() {
            return this.f2433b;
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
        this.f2426d.addAll(hashSet);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(e eVar, C3981n c3981n) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = (a) this.f2424b.get(view);
        if (aVar != null) {
            aVar.b(c3981n.v());
        } else {
            this.f2424b.put(view, new a(eVar, c3981n.v()));
        }
    }

    private void e(C3981n c3981n) {
        Iterator it = c3981n.q().iterator();
        while (it.hasNext()) {
            d((e) it.next(), c3981n);
        }
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f2430h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f2430h.containsKey(view)) {
            return (Boolean) this.f2430h.get(view);
        }
        Map map = this.f2430h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return (View) this.f2425c.get(str);
    }

    public void c() {
        this.f2423a.clear();
        this.f2424b.clear();
        this.f2425c.clear();
        this.f2426d.clear();
        this.f2427e.clear();
        this.f2428f.clear();
        this.f2429g.clear();
        this.f2431i = false;
    }

    public String g(String str) {
        return (String) this.f2429g.get(str);
    }

    public HashSet h() {
        return this.f2428f;
    }

    public a i(View view) {
        a aVar = (a) this.f2424b.get(view);
        if (aVar != null) {
            this.f2424b.remove(view);
        }
        return aVar;
    }

    public HashSet j() {
        return this.f2427e;
    }

    public String k(View view) {
        if (this.f2423a.size() == 0) {
            return null;
        }
        String str = (String) this.f2423a.get(view);
        if (str != null) {
            this.f2423a.remove(view);
        }
        return str;
    }

    public void l() {
        this.f2431i = true;
    }

    public d m(View view) {
        if (this.f2426d.contains(view)) {
            return d.PARENT_VIEW;
        }
        if (this.f2431i) {
            return d.OBSTRUCTION_VIEW;
        }
        return d.UNDERLYING_VIEW;
    }

    public void n() {
        B1.c e8 = B1.c.e();
        if (e8 != null) {
            for (C3981n c3981n : e8.a()) {
                View o8 = c3981n.o();
                if (c3981n.t()) {
                    String v8 = c3981n.v();
                    if (o8 != null) {
                        String b8 = b(o8);
                        if (b8 == null) {
                            this.f2427e.add(v8);
                            this.f2423a.put(o8, v8);
                            e(c3981n);
                        } else if (b8 != "noWindowFocus") {
                            this.f2428f.add(v8);
                            this.f2425c.put(v8, o8);
                            this.f2429g.put(v8, b8);
                        }
                    } else {
                        this.f2428f.add(v8);
                        this.f2429g.put(v8, "noAdView");
                    }
                }
            }
        }
    }

    public boolean o(View view) {
        if (this.f2430h.containsKey(view)) {
            this.f2430h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
