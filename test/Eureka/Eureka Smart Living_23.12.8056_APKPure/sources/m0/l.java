package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {
    private static final int[] G = {2, 1, 3, 4};
    private static final g H = new a();
    private static ThreadLocal I = new ThreadLocal();
    private e D;
    private l.a E;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f7490t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f7491u;

    /* renamed from: a, reason: collision with root package name */
    private String f7471a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    private long f7472b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f7473c = -1;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f7474d = null;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f7475e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    ArrayList f7476f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f7477g = null;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f7478h = null;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f7479i = null;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f7480j = null;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f7481k = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f7482l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f7483m = null;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f7484n = null;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList f7485o = null;

    /* renamed from: p, reason: collision with root package name */
    private t f7486p = new t();

    /* renamed from: q, reason: collision with root package name */
    private t f7487q = new t();

    /* renamed from: r, reason: collision with root package name */
    p f7488r = null;

    /* renamed from: s, reason: collision with root package name */
    private int[] f7489s = G;

    /* renamed from: v, reason: collision with root package name */
    private ViewGroup f7492v = null;

    /* renamed from: w, reason: collision with root package name */
    boolean f7493w = false;

    /* renamed from: x, reason: collision with root package name */
    ArrayList f7494x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private int f7495y = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7496z = false;
    private boolean A = false;
    private ArrayList B = null;
    private ArrayList C = new ArrayList();
    private g F = H;

    /* loaded from: classes.dex */
    static class a extends g {
        a() {
        }

        @Override // m0.g
        public Path a(float f6, float f7, float f8, float f9) {
            Path path = new Path();
            path.moveTo(f6, f7);
            path.lineTo(f8, f9);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f7497a;

        b(l.a aVar) {
            this.f7497a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7497a.remove(animator);
            l.this.f7494x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.f7494x.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.q();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        View f7500a;

        /* renamed from: b, reason: collision with root package name */
        String f7501b;

        /* renamed from: c, reason: collision with root package name */
        s f7502c;

        /* renamed from: d, reason: collision with root package name */
        p0 f7503d;

        /* renamed from: e, reason: collision with root package name */
        l f7504e;

        d(View view, String str, l lVar, p0 p0Var, s sVar) {
            this.f7500a = view;
            this.f7501b = str;
            this.f7502c = sVar;
            this.f7503d = p0Var;
            this.f7504e = lVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);

        void e(l lVar);
    }

    private static boolean I(s sVar, s sVar2, String str) {
        Object obj = sVar.f7537a.get(str);
        Object obj2 = sVar2.f7537a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void J(l.a aVar, l.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) sparseArray.valueAt(i6);
            if (view2 != null && H(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i6))) != null && H(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f7490t.add(sVar);
                    this.f7491u.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void K(l.a aVar, l.a aVar2) {
        s sVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.i(size);
            if (view != null && H(view) && (sVar = (s) aVar2.remove(view)) != null && H(sVar.f7538b)) {
                this.f7490t.add((s) aVar.k(size));
                this.f7491u.add(sVar);
            }
        }
    }

    private void L(l.a aVar, l.a aVar2, l.d dVar, l.d dVar2) {
        View view;
        int m6 = dVar.m();
        for (int i6 = 0; i6 < m6; i6++) {
            View view2 = (View) dVar.n(i6);
            if (view2 != null && H(view2) && (view = (View) dVar2.e(dVar.i(i6))) != null && H(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f7490t.add(sVar);
                    this.f7491u.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void M(l.a aVar, l.a aVar2, l.a aVar3, l.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) aVar3.m(i6);
            if (view2 != null && H(view2) && (view = (View) aVar4.get(aVar3.i(i6))) != null && H(view)) {
                s sVar = (s) aVar.get(view2);
                s sVar2 = (s) aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f7490t.add(sVar);
                    this.f7491u.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void N(t tVar, t tVar2) {
        l.a aVar = new l.a(tVar.f7540a);
        l.a aVar2 = new l.a(tVar2.f7540a);
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7489s;
            if (i6 >= iArr.length) {
                c(aVar, aVar2);
                return;
            }
            int i7 = iArr[i6];
            if (i7 == 1) {
                K(aVar, aVar2);
            } else if (i7 == 2) {
                M(aVar, aVar2, tVar.f7543d, tVar2.f7543d);
            } else if (i7 == 3) {
                J(aVar, aVar2, tVar.f7541b, tVar2.f7541b);
            } else if (i7 == 4) {
                L(aVar, aVar2, tVar.f7542c, tVar2.f7542c);
            }
            i6++;
        }
    }

    private void T(Animator animator, l.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(l.a aVar, l.a aVar2) {
        for (int i6 = 0; i6 < aVar.size(); i6++) {
            s sVar = (s) aVar.m(i6);
            if (H(sVar.f7538b)) {
                this.f7490t.add(sVar);
                this.f7491u.add(null);
            }
        }
        for (int i7 = 0; i7 < aVar2.size(); i7++) {
            s sVar2 = (s) aVar2.m(i7);
            if (H(sVar2.f7538b)) {
                this.f7491u.add(sVar2);
                this.f7490t.add(null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f7540a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f7541b.indexOfKey(id) >= 0) {
                tVar.f7541b.put(id, null);
            } else {
                tVar.f7541b.put(id, view);
            }
        }
        String M = b1.M(view);
        if (M != null) {
            if (tVar.f7543d.containsKey(M)) {
                tVar.f7543d.put(M, null);
            } else {
                tVar.f7543d.put(M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f7542c.h(itemIdAtPosition) < 0) {
                    b1.z0(view, true);
                    tVar.f7542c.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tVar.f7542c.e(itemIdAtPosition);
                if (view2 != null) {
                    b1.z0(view2, false);
                    tVar.f7542c.j(itemIdAtPosition, null);
                }
            }
        }
    }

    private void i(View view, boolean z5) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f7479i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f7480j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f7481k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (((Class) this.f7481k.get(i6)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z5) {
                        k(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f7539c.add(this);
                    j(sVar);
                    d(z5 ? this.f7486p : this.f7487q, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f7483m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f7484n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f7485o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    if (((Class) this.f7485o.get(i7)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                                i(viewGroup.getChildAt(i8), z5);
                            }
                        }
                    }
                }
            }
        }
    }

    private static l.a y() {
        l.a aVar = (l.a) I.get();
        if (aVar != null) {
            return aVar;
        }
        l.a aVar2 = new l.a();
        I.set(aVar2);
        return aVar2;
    }

    public List A() {
        return this.f7475e;
    }

    public List B() {
        return this.f7477g;
    }

    public List C() {
        return this.f7478h;
    }

    public List D() {
        return this.f7476f;
    }

    public String[] E() {
        return null;
    }

    public s F(View view, boolean z5) {
        p pVar = this.f7488r;
        if (pVar != null) {
            return pVar.F(view, z5);
        }
        return (s) (z5 ? this.f7486p : this.f7487q).f7540a.get(view);
    }

    public boolean G(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] E = E();
        if (E == null) {
            Iterator it = sVar.f7537a.keySet().iterator();
            while (it.hasNext()) {
                if (I(sVar, sVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : E) {
            if (!I(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f7479i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f7480j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f7481k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((Class) this.f7481k.get(i6)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f7482l != null && b1.M(view) != null && this.f7482l.contains(b1.M(view))) {
            return false;
        }
        if ((this.f7475e.size() == 0 && this.f7476f.size() == 0 && (((arrayList = this.f7478h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7477g) == null || arrayList2.isEmpty()))) || this.f7475e.contains(Integer.valueOf(id)) || this.f7476f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f7477g;
        if (arrayList6 != null && arrayList6.contains(b1.M(view))) {
            return true;
        }
        if (this.f7478h != null) {
            for (int i7 = 0; i7 < this.f7478h.size(); i7++) {
                if (((Class) this.f7478h.get(i7)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void O(View view) {
        if (this.A) {
            return;
        }
        l.a y5 = y();
        int size = y5.size();
        p0 d6 = a0.d(view);
        for (int i6 = size - 1; i6 >= 0; i6--) {
            d dVar = (d) y5.m(i6);
            if (dVar.f7500a != null && d6.equals(dVar.f7503d)) {
                m0.a.b((Animator) y5.i(i6));
            }
        }
        ArrayList arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((f) arrayList2.get(i7)).c(this);
            }
        }
        this.f7496z = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(ViewGroup viewGroup) {
        d dVar;
        this.f7490t = new ArrayList();
        this.f7491u = new ArrayList();
        N(this.f7486p, this.f7487q);
        l.a y5 = y();
        int size = y5.size();
        p0 d6 = a0.d(viewGroup);
        for (int i6 = size - 1; i6 >= 0; i6--) {
            Animator animator = (Animator) y5.i(i6);
            if (animator != null && (dVar = (d) y5.get(animator)) != null && dVar.f7500a != null && d6.equals(dVar.f7503d)) {
                s sVar = dVar.f7502c;
                View view = dVar.f7500a;
                s F = F(view, true);
                s u5 = u(view, true);
                if (F == null && u5 == null) {
                    u5 = (s) this.f7487q.f7540a.get(view);
                }
                if (!(F == null && u5 == null) && dVar.f7504e.G(sVar, u5)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        y5.remove(animator);
                    }
                }
            }
        }
        p(viewGroup, this.f7486p, this.f7487q, this.f7490t, this.f7491u);
        U();
    }

    public l Q(f fVar) {
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public l R(View view) {
        this.f7476f.remove(view);
        return this;
    }

    public void S(View view) {
        if (this.f7496z) {
            if (!this.A) {
                l.a y5 = y();
                int size = y5.size();
                p0 d6 = a0.d(view);
                for (int i6 = size - 1; i6 >= 0; i6--) {
                    d dVar = (d) y5.m(i6);
                    if (dVar.f7500a != null && d6.equals(dVar.f7503d)) {
                        m0.a.c((Animator) y5.i(i6));
                    }
                }
                ArrayList arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((f) arrayList2.get(i7)).e(this);
                    }
                }
            }
            this.f7496z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U() {
        b0();
        l.a y5 = y();
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (y5.containsKey(animator)) {
                b0();
                T(animator, y5);
            }
        }
        this.C.clear();
        q();
    }

    public l V(long j6) {
        this.f7473c = j6;
        return this;
    }

    public void W(e eVar) {
        this.D = eVar;
    }

    public l X(TimeInterpolator timeInterpolator) {
        this.f7474d = timeInterpolator;
        return this;
    }

    public void Y(g gVar) {
        if (gVar == null) {
            gVar = H;
        }
        this.F = gVar;
    }

    public void Z(o oVar) {
    }

    public l a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(fVar);
        return this;
    }

    public l a0(long j6) {
        this.f7472b = j6;
        return this;
    }

    public l b(View view) {
        this.f7476f.add(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0() {
        if (this.f7495y == 0) {
            ArrayList arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((f) arrayList2.get(i6)).a(this);
                }
            }
            this.A = false;
        }
        this.f7495y++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f7473c != -1) {
            str2 = str2 + "dur(" + this.f7473c + ") ";
        }
        if (this.f7472b != -1) {
            str2 = str2 + "dly(" + this.f7472b + ") ";
        }
        if (this.f7474d != null) {
            str2 = str2 + "interp(" + this.f7474d + ") ";
        }
        if (this.f7475e.size() <= 0 && this.f7476f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f7475e.size() > 0) {
            for (int i6 = 0; i6 < this.f7475e.size(); i6++) {
                if (i6 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f7475e.get(i6);
            }
        }
        if (this.f7476f.size() > 0) {
            for (int i7 = 0; i7 < this.f7476f.size(); i7++) {
                if (i7 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f7476f.get(i7);
            }
        }
        return str3 + ")";
    }

    protected void e(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (z() >= 0) {
            animator.setStartDelay(z() + animator.getStartDelay());
        }
        if (t() != null) {
            animator.setInterpolator(t());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        for (int size = this.f7494x.size() - 1; size >= 0; size--) {
            ((Animator) this.f7494x.get(size)).cancel();
        }
        ArrayList arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ((f) arrayList2.get(i6)).b(this);
        }
    }

    public abstract void h(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(s sVar) {
    }

    public abstract void k(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(ViewGroup viewGroup, boolean z5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        l.a aVar;
        m(z5);
        if ((this.f7475e.size() > 0 || this.f7476f.size() > 0) && (((arrayList = this.f7477g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7478h) == null || arrayList2.isEmpty()))) {
            for (int i6 = 0; i6 < this.f7475e.size(); i6++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f7475e.get(i6)).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z5) {
                        k(sVar);
                    } else {
                        h(sVar);
                    }
                    sVar.f7539c.add(this);
                    j(sVar);
                    d(z5 ? this.f7486p : this.f7487q, findViewById, sVar);
                }
            }
            for (int i7 = 0; i7 < this.f7476f.size(); i7++) {
                View view = (View) this.f7476f.get(i7);
                s sVar2 = new s(view);
                if (z5) {
                    k(sVar2);
                } else {
                    h(sVar2);
                }
                sVar2.f7539c.add(this);
                j(sVar2);
                d(z5 ? this.f7486p : this.f7487q, view, sVar2);
            }
        } else {
            i(viewGroup, z5);
        }
        if (z5 || (aVar = this.E) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList3.add(this.f7486p.f7543d.remove((String) this.E.i(i8)));
        }
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) arrayList3.get(i9);
            if (view2 != null) {
                this.f7486p.f7543d.put((String) this.E.m(i9), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z5) {
        t tVar;
        if (z5) {
            this.f7486p.f7540a.clear();
            this.f7486p.f7541b.clear();
            tVar = this.f7486p;
        } else {
            this.f7487q.f7540a.clear();
            this.f7487q.f7541b.clear();
            tVar = this.f7487q;
        }
        tVar.f7542c.b();
    }

    @Override // 
    /* renamed from: n */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.C = new ArrayList();
            lVar.f7486p = new t();
            lVar.f7487q = new t();
            lVar.f7490t = null;
            lVar.f7491u = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        s sVar;
        int i6;
        Animator animator2;
        s sVar2;
        l.a y5 = y();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            s sVar3 = (s) arrayList.get(i7);
            s sVar4 = (s) arrayList2.get(i7);
            if (sVar3 != null && !sVar3.f7539c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f7539c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if (sVar3 == null || sVar4 == null || G(sVar3, sVar4)) {
                    Animator o6 = o(viewGroup, sVar3, sVar4);
                    if (o6 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f7538b;
                            String[] E = E();
                            if (E != null && E.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = (s) tVar2.f7540a.get(view2);
                                if (sVar5 != null) {
                                    int i8 = 0;
                                    while (i8 < E.length) {
                                        Map map = sVar2.f7537a;
                                        Animator animator3 = o6;
                                        String str = E[i8];
                                        map.put(str, sVar5.f7537a.get(str));
                                        i8++;
                                        o6 = animator3;
                                        E = E;
                                    }
                                }
                                Animator animator4 = o6;
                                int size2 = y5.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size2) {
                                        animator2 = animator4;
                                        break;
                                    }
                                    d dVar = (d) y5.get((Animator) y5.i(i9));
                                    if (dVar.f7502c != null && dVar.f7500a == view2 && dVar.f7501b.equals(v()) && dVar.f7502c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                animator2 = o6;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            view = sVar3.f7538b;
                            animator = o6;
                            sVar = null;
                        }
                        if (animator != null) {
                            i6 = size;
                            y5.put(animator, new d(view, v(), this, a0.d(viewGroup), sVar));
                            this.C.add(animator);
                            i7++;
                            size = i6;
                        }
                        i6 = size;
                        i7++;
                        size = i6;
                    }
                    i6 = size;
                    i7++;
                    size = i6;
                }
            }
            i6 = size;
            i7++;
            size = i6;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                Animator animator5 = (Animator) this.C.get(sparseIntArray.keyAt(i10));
                animator5.setStartDelay((sparseIntArray.valueAt(i10) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        int i6 = this.f7495y - 1;
        this.f7495y = i6;
        if (i6 == 0) {
            ArrayList arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((f) arrayList2.get(i7)).d(this);
                }
            }
            for (int i8 = 0; i8 < this.f7486p.f7542c.m(); i8++) {
                View view = (View) this.f7486p.f7542c.n(i8);
                if (view != null) {
                    b1.z0(view, false);
                }
            }
            for (int i9 = 0; i9 < this.f7487q.f7542c.m(); i9++) {
                View view2 = (View) this.f7487q.f7542c.n(i9);
                if (view2 != null) {
                    b1.z0(view2, false);
                }
            }
            this.A = true;
        }
    }

    public long r() {
        return this.f7473c;
    }

    public e s() {
        return this.D;
    }

    public TimeInterpolator t() {
        return this.f7474d;
    }

    public String toString() {
        return c0("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s u(View view, boolean z5) {
        p pVar = this.f7488r;
        if (pVar != null) {
            return pVar.u(view, z5);
        }
        ArrayList arrayList = z5 ? this.f7490t : this.f7491u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i6);
            if (sVar == null) {
                return null;
            }
            if (sVar.f7538b == view) {
                break;
            }
            i6++;
        }
        if (i6 >= 0) {
            return (s) (z5 ? this.f7491u : this.f7490t).get(i6);
        }
        return null;
    }

    public String v() {
        return this.f7471a;
    }

    public g w() {
        return this.F;
    }

    public o x() {
        return null;
    }

    public long z() {
        return this.f7472b;
    }
}
