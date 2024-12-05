package c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f3011f = {2, 1, 3, 4};

    /* renamed from: g, reason: collision with root package name */
    private static final g f3012g = new a();

    /* renamed from: h, reason: collision with root package name */
    private static ThreadLocal<c.e.a<Animator, d>> f3013h = new ThreadLocal<>();
    private ArrayList<s> B;
    private ArrayList<s> C;
    p L;
    private e M;
    private c.e.a<String, String> N;

    /* renamed from: i, reason: collision with root package name */
    private String f3014i = getClass().getName();

    /* renamed from: j, reason: collision with root package name */
    private long f3015j = -1;

    /* renamed from: k, reason: collision with root package name */
    long f3016k = -1;
    private TimeInterpolator l = null;
    ArrayList<Integer> m = new ArrayList<>();
    ArrayList<View> n = new ArrayList<>();
    private ArrayList<String> o = null;
    private ArrayList<Class<?>> p = null;
    private ArrayList<Integer> q = null;
    private ArrayList<View> r = null;
    private ArrayList<Class<?>> s = null;
    private ArrayList<String> t = null;
    private ArrayList<Integer> u = null;
    private ArrayList<View> v = null;
    private ArrayList<Class<?>> w = null;
    private t x = new t();
    private t y = new t();
    q z = null;
    private int[] A = f3011f;
    private ViewGroup D = null;
    boolean E = false;
    ArrayList<Animator> F = new ArrayList<>();
    private int G = 0;
    private boolean H = false;
    private boolean I = false;
    private ArrayList<f> J = null;
    private ArrayList<Animator> K = new ArrayList<>();
    private g O = f3012g;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    static class a extends g {
        a() {
        }

        @Override // c.s.g
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ c.e.a a;

        b(c.e.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            m.this.F.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.F.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.q();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class d {
        View a;

        /* renamed from: b, reason: collision with root package name */
        String f3018b;

        /* renamed from: c, reason: collision with root package name */
        s f3019c;

        /* renamed from: d, reason: collision with root package name */
        m0 f3020d;

        /* renamed from: e, reason: collision with root package name */
        m f3021e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.a = view;
            this.f3018b = str;
            this.f3019c = sVar;
            this.f3020d = m0Var;
            this.f3021e = mVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static c.e.a<Animator, d> A() {
        c.e.a<Animator, d> aVar = f3013h.get();
        if (aVar != null) {
            return aVar;
        }
        c.e.a<Animator, d> aVar2 = new c.e.a<>();
        f3013h.set(aVar2);
        return aVar2;
    }

    private static boolean N(s sVar, s sVar2, String str) {
        Object obj = sVar.a.get(str);
        Object obj2 = sVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void O(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && M(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && M(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.B.add(sVar);
                    this.C.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(c.e.a<View, s> aVar, c.e.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i2 = aVar.i(size);
            if (i2 != null && M(i2) && (remove = aVar2.remove(i2)) != null && M(remove.f3030b)) {
                this.B.add(aVar.k(size));
                this.C.add(remove);
            }
        }
    }

    private void R(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, c.e.d<View> dVar, c.e.d<View> dVar2) {
        View g2;
        int n = dVar.n();
        for (int i2 = 0; i2 < n; i2++) {
            View p = dVar.p(i2);
            if (p != null && M(p) && (g2 = dVar2.g(dVar.j(i2))) != null && M(g2)) {
                s sVar = aVar.get(p);
                s sVar2 = aVar2.get(g2);
                if (sVar != null && sVar2 != null) {
                    this.B.add(sVar);
                    this.C.add(sVar2);
                    aVar.remove(p);
                    aVar2.remove(g2);
                }
            }
        }
    }

    private void S(c.e.a<View, s> aVar, c.e.a<View, s> aVar2, c.e.a<String, View> aVar3, c.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View m = aVar3.m(i2);
            if (m != null && M(m) && (view = aVar4.get(aVar3.i(i2))) != null && M(view)) {
                s sVar = aVar.get(m);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.B.add(sVar);
                    this.C.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void T(t tVar, t tVar2) {
        c.e.a<View, s> aVar = new c.e.a<>(tVar.a);
        c.e.a<View, s> aVar2 = new c.e.a<>(tVar2.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.A;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    Q(aVar, aVar2);
                } else if (i3 == 2) {
                    S(aVar, aVar2, tVar.f3034d, tVar2.f3034d);
                } else if (i3 == 3) {
                    O(aVar, aVar2, tVar.f3032b, tVar2.f3032b);
                } else if (i3 == 4) {
                    R(aVar, aVar2, tVar.f3033c, tVar2.f3033c);
                }
                i2++;
            } else {
                d(aVar, aVar2);
                return;
            }
        }
    }

    private void a0(Animator animator, c.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            g(animator);
        }
    }

    private void d(c.e.a<View, s> aVar, c.e.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s m = aVar.m(i2);
            if (M(m.f3030b)) {
                this.B.add(m);
                this.C.add(null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s m2 = aVar2.m(i3);
            if (M(m2.f3030b)) {
                this.C.add(m2);
                this.B.add(null);
            }
        }
    }

    private static void e(t tVar, View view, s sVar) {
        tVar.a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f3032b.indexOfKey(id) >= 0) {
                tVar.f3032b.put(id, null);
            } else {
                tVar.f3032b.put(id, view);
            }
        }
        String G = androidx.core.view.u.G(view);
        if (G != null) {
            if (tVar.f3034d.containsKey(G)) {
                tVar.f3034d.put(G, null);
            } else {
                tVar.f3034d.put(G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f3033c.i(itemIdAtPosition) >= 0) {
                    View g2 = tVar.f3033c.g(itemIdAtPosition);
                    if (g2 != null) {
                        androidx.core.view.u.s0(g2, false);
                        tVar.f3033c.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                androidx.core.view.u.s0(view, true);
                tVar.f3033c.k(itemIdAtPosition, view);
            }
        }
    }

    private void i(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.q;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.r;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.s;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.s.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z) {
                        k(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f3031c.add(this);
                    j(sVar);
                    if (z) {
                        e(this.x, view, sVar);
                    } else {
                        e(this.y, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.u;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.v;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.w;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.w.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                i(viewGroup.getChildAt(i4), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public long B() {
        return this.f3015j;
    }

    public List<Integer> C() {
        return this.m;
    }

    public List<String> E() {
        return this.o;
    }

    public List<Class<?>> F() {
        return this.p;
    }

    public List<View> G() {
        return this.n;
    }

    public String[] H() {
        return null;
    }

    public s I(View view, boolean z) {
        q qVar = this.z;
        if (qVar != null) {
            return qVar.I(view, z);
        }
        return (z ? this.x : this.y).a.get(view);
    }

    public boolean K(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] H = H();
        if (H != null) {
            for (String str : H) {
                if (!N(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        Iterator<String> it = sVar.a.keySet().iterator();
        while (it.hasNext()) {
            if (N(sVar, sVar2, it.next())) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.q;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.r;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.s;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.s.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.t != null && androidx.core.view.u.G(view) != null && this.t.contains(androidx.core.view.u.G(view))) {
            return false;
        }
        if ((this.m.size() == 0 && this.n.size() == 0 && (((arrayList = this.p) == null || arrayList.isEmpty()) && ((arrayList2 = this.o) == null || arrayList2.isEmpty()))) || this.m.contains(Integer.valueOf(id)) || this.n.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.o;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.u.G(view))) {
            return true;
        }
        if (this.p != null) {
            for (int i3 = 0; i3 < this.p.size(); i3++) {
                if (this.p.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void U(View view) {
        if (this.I) {
            return;
        }
        c.e.a<Animator, d> A = A();
        int size = A.size();
        m0 d2 = c0.d(view);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            d m = A.m(i2);
            if (m.a != null && d2.equals(m.f3020d)) {
                c.s.a.b(A.i(i2));
            }
        }
        ArrayList<f> arrayList = this.J;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.J.clone();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((f) arrayList2.get(i3)).b(this);
            }
        }
        this.H = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(ViewGroup viewGroup) {
        d dVar;
        this.B = new ArrayList<>();
        this.C = new ArrayList<>();
        T(this.x, this.y);
        c.e.a<Animator, d> A = A();
        int size = A.size();
        m0 d2 = c0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator i3 = A.i(i2);
            if (i3 != null && (dVar = A.get(i3)) != null && dVar.a != null && d2.equals(dVar.f3020d)) {
                s sVar = dVar.f3019c;
                View view = dVar.a;
                s I = I(view, true);
                s u = u(view, true);
                if (I == null && u == null) {
                    u = this.y.a.get(view);
                }
                if (!(I == null && u == null) && dVar.f3021e.K(sVar, u)) {
                    if (!i3.isRunning() && !i3.isStarted()) {
                        A.remove(i3);
                    } else {
                        i3.cancel();
                    }
                }
            }
        }
        p(viewGroup, this.x, this.y, this.B, this.C);
        b0();
    }

    public m W(f fVar) {
        ArrayList<f> arrayList = this.J;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.J.size() == 0) {
            this.J = null;
        }
        return this;
    }

    public m X(View view) {
        this.n.remove(view);
        return this;
    }

    public void Z(View view) {
        if (this.H) {
            if (!this.I) {
                c.e.a<Animator, d> A = A();
                int size = A.size();
                m0 d2 = c0.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d m = A.m(i2);
                    if (m.a != null && d2.equals(m.f3020d)) {
                        c.s.a.c(A.i(i2));
                    }
                }
                ArrayList<f> arrayList = this.J;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.J.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).e(this);
                    }
                }
            }
            this.H = false;
        }
    }

    public m b(f fVar) {
        if (this.J == null) {
            this.J = new ArrayList<>();
        }
        this.J.add(fVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0() {
        j0();
        c.e.a<Animator, d> A = A();
        Iterator<Animator> it = this.K.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (A.containsKey(next)) {
                j0();
                a0(next, A);
            }
        }
        this.K.clear();
        q();
    }

    public m c(View view) {
        this.n.add(view);
        return this;
    }

    public m c0(long j2) {
        this.f3016k = j2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).cancel();
        }
        ArrayList<f> arrayList = this.J;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.J.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((f) arrayList2.get(i2)).d(this);
        }
    }

    public void d0(e eVar) {
        this.M = eVar;
    }

    public m e0(TimeInterpolator timeInterpolator) {
        this.l = timeInterpolator;
        return this;
    }

    public void f0(g gVar) {
        if (gVar == null) {
            this.O = f3012g;
        } else {
            this.O = gVar;
        }
    }

    protected void g(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (t() != null) {
            animator.setInterpolator(t());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void g0(p pVar) {
    }

    public abstract void h(s sVar);

    public m h0(long j2) {
        this.f3015j = j2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(s sVar) {
        if (this.L != null && !sVar.a.isEmpty()) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j0() {
        if (this.G == 0) {
            ArrayList<f> arrayList = this.J;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.J.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.I = false;
        }
        this.G++;
    }

    public abstract void k(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3016k != -1) {
            str2 = str2 + "dur(" + this.f3016k + ") ";
        }
        if (this.f3015j != -1) {
            str2 = str2 + "dly(" + this.f3015j + ") ";
        }
        if (this.l != null) {
            str2 = str2 + "interp(" + this.l + ") ";
        }
        if (this.m.size() <= 0 && this.n.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.m.size() > 0) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.m.get(i2);
            }
        }
        if (this.n.size() > 0) {
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.n.get(i3);
            }
        }
        return str3 + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        c.e.a<String, String> aVar;
        m(z);
        if ((this.m.size() <= 0 && this.n.size() <= 0) || (((arrayList = this.o) != null && !arrayList.isEmpty()) || ((arrayList2 = this.p) != null && !arrayList2.isEmpty()))) {
            i(viewGroup, z);
        } else {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.m.get(i2).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z) {
                        k(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f3031c.add(this);
                    j(sVar);
                    if (z) {
                        e(this.x, findViewById, sVar);
                    } else {
                        e(this.y, findViewById, sVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                View view = this.n.get(i3);
                s sVar2 = new s(view);
                if (z) {
                    k(sVar2);
                } else {
                    h(sVar2);
                }
                sVar2.f3031c.add(this);
                j(sVar2);
                if (z) {
                    e(this.x, view, sVar2);
                } else {
                    e(this.y, view, sVar2);
                }
            }
        }
        if (z || (aVar = this.N) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(this.x.f3034d.remove(this.N.i(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.x.f3034d.put(this.N.m(i5), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z) {
        if (z) {
            this.x.a.clear();
            this.x.f3032b.clear();
            this.x.f3033c.c();
        } else {
            this.y.a.clear();
            this.y.f3032b.clear();
            this.y.f3033c.c();
        }
    }

    @Override // 
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.K = new ArrayList<>();
            mVar.x = new t();
            mVar.y = new t();
            mVar.B = null;
            mVar.C = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i2;
        View view;
        Animator animator;
        s sVar;
        Animator animator2;
        s sVar2;
        c.e.a<Animator, d> A = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            s sVar3 = arrayList.get(i3);
            s sVar4 = arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f3031c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f3031c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if (sVar3 == null || sVar4 == null || K(sVar3, sVar4)) {
                    Animator o = o(viewGroup, sVar3, sVar4);
                    if (o != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f3030b;
                            String[] H = H();
                            if (H != null && H.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.a.get(view2);
                                if (sVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < H.length) {
                                        sVar2.a.put(H[i4], sVar5.a.get(H[i4]));
                                        i4++;
                                        o = o;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = o;
                                i2 = size;
                                int size2 = A.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = A.get(A.i(i5));
                                    if (dVar.f3019c != null && dVar.a == view2 && dVar.f3018b.equals(v()) && dVar.f3019c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                i2 = size;
                                animator2 = o;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            i2 = size;
                            view = sVar3.f3030b;
                            animator = o;
                            sVar = null;
                        }
                        if (animator == null) {
                            continue;
                        } else if (this.L == null) {
                            A.put(animator, new d(view, v(), this, c0.d(viewGroup), sVar));
                            this.K.add(animator);
                        } else {
                            throw null;
                        }
                        i3++;
                        size = i2;
                    }
                    i2 = size;
                    i3++;
                    size = i2;
                }
            }
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.K.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((sparseIntArray.valueAt(i6) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        int i2 = this.G - 1;
        this.G = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.J;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.J.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < this.x.f3033c.n(); i4++) {
                View p = this.x.f3033c.p(i4);
                if (p != null) {
                    androidx.core.view.u.s0(p, false);
                }
            }
            for (int i5 = 0; i5 < this.y.f3033c.n(); i5++) {
                View p2 = this.y.f3033c.p(i5);
                if (p2 != null) {
                    androidx.core.view.u.s0(p2, false);
                }
            }
            this.I = true;
        }
    }

    public long r() {
        return this.f3016k;
    }

    public e s() {
        return this.M;
    }

    public TimeInterpolator t() {
        return this.l;
    }

    public String toString() {
        return k0(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s u(View view, boolean z) {
        q qVar = this.z;
        if (qVar != null) {
            return qVar.u(view, z);
        }
        ArrayList<s> arrayList = z ? this.B : this.C;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s sVar = arrayList.get(i3);
            if (sVar == null) {
                return null;
            }
            if (sVar.f3030b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            return (z ? this.C : this.B).get(i2);
        }
        return null;
    }

    public String v() {
        return this.f3014i;
    }

    public g x() {
        return this.O;
    }

    public p y() {
        return this.L;
    }
}
