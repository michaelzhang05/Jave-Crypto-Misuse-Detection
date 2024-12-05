package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.n2;
import androidx.appcompat.widget.q2;
import androidx.core.view.b1;
import androidx.core.view.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = d.g.f6218e;
    boolean A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f570b;

    /* renamed from: c, reason: collision with root package name */
    private final int f571c;

    /* renamed from: d, reason: collision with root package name */
    private final int f572d;

    /* renamed from: e, reason: collision with root package name */
    private final int f573e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f574f;

    /* renamed from: g, reason: collision with root package name */
    final Handler f575g;

    /* renamed from: o, reason: collision with root package name */
    private View f583o;

    /* renamed from: p, reason: collision with root package name */
    View f584p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f586r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f587s;

    /* renamed from: t, reason: collision with root package name */
    private int f588t;

    /* renamed from: u, reason: collision with root package name */
    private int f589u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f591w;

    /* renamed from: x, reason: collision with root package name */
    private m.a f592x;

    /* renamed from: y, reason: collision with root package name */
    ViewTreeObserver f593y;

    /* renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f594z;

    /* renamed from: h, reason: collision with root package name */
    private final List f576h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final List f577i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f578j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f579k = new b();

    /* renamed from: l, reason: collision with root package name */
    private final n2 f580l = new c();

    /* renamed from: m, reason: collision with root package name */
    private int f581m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f582n = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f590v = false;

    /* renamed from: q, reason: collision with root package name */
    private int f585q = D();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.f577i.size() <= 0 || ((C0010d) d.this.f577i.get(0)).f602a.B()) {
                return;
            }
            View view = d.this.f584p;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator it = d.this.f577i.iterator();
            while (it.hasNext()) {
                ((C0010d) it.next()).f602a.f();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.f593y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f593y = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f593y.removeGlobalOnLayoutListener(dVar.f578j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements n2 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0010d f598a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f599b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f600c;

            a(C0010d c0010d, MenuItem menuItem, g gVar) {
                this.f598a = c0010d;
                this.f599b = menuItem;
                this.f600c = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0010d c0010d = this.f598a;
                if (c0010d != null) {
                    d.this.A = true;
                    c0010d.f603b.e(false);
                    d.this.A = false;
                }
                if (this.f599b.isEnabled() && this.f599b.hasSubMenu()) {
                    this.f600c.L(this.f599b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.n2
        public void e(g gVar, MenuItem menuItem) {
            d.this.f575g.removeCallbacksAndMessages(null);
            int size = d.this.f577i.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i6 = -1;
                    break;
                } else if (gVar == ((C0010d) d.this.f577i.get(i6)).f603b) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 == -1) {
                return;
            }
            int i7 = i6 + 1;
            d.this.f575g.postAtTime(new a(i7 < d.this.f577i.size() ? (C0010d) d.this.f577i.get(i7) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.n2
        public void h(g gVar, MenuItem menuItem) {
            d.this.f575g.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010d {

        /* renamed from: a, reason: collision with root package name */
        public final q2 f602a;

        /* renamed from: b, reason: collision with root package name */
        public final g f603b;

        /* renamed from: c, reason: collision with root package name */
        public final int f604c;

        public C0010d(q2 q2Var, g gVar, int i6) {
            this.f602a = q2Var;
            this.f603b = gVar;
            this.f604c = i6;
        }

        public ListView a() {
            return this.f602a.k();
        }
    }

    public d(Context context, View view, int i6, int i7, boolean z5) {
        this.f570b = context;
        this.f583o = view;
        this.f572d = i6;
        this.f573e = i7;
        this.f574f = z5;
        Resources resources = context.getResources();
        this.f571c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.d.f6150b));
        this.f575g = new Handler();
    }

    private int A(g gVar) {
        int size = this.f577i.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (gVar == ((C0010d) this.f577i.get(i6)).f603b) {
                return i6;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = gVar.getItem(i6);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0010d c0010d, g gVar) {
        f fVar;
        int i6;
        int firstVisiblePosition;
        MenuItem B2 = B(c0010d.f603b, gVar);
        if (B2 == null) {
            return null;
        }
        ListView a6 = c0010d.a();
        ListAdapter adapter = a6.getAdapter();
        int i7 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i6 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i6 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i7 >= count) {
                i7 = -1;
                break;
            }
            if (B2 == fVar.getItem(i7)) {
                break;
            }
            i7++;
        }
        if (i7 != -1 && (firstVisiblePosition = (i7 + i6) - a6.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a6.getChildCount()) {
            return a6.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return b1.E(this.f583o) == 1 ? 0 : 1;
    }

    private int E(int i6) {
        List list = this.f577i;
        ListView a6 = ((C0010d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a6.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f584p.getWindowVisibleDisplayFrame(rect);
        return this.f585q == 1 ? (iArr[0] + a6.getWidth()) + i6 > rect.right ? 0 : 1 : iArr[0] - i6 < 0 ? 1 : 0;
    }

    private void F(g gVar) {
        C0010d c0010d;
        View view;
        int i6;
        int i7;
        int i8;
        LayoutInflater from = LayoutInflater.from(this.f570b);
        f fVar = new f(gVar, from, this.f574f, B);
        if (!b() && this.f590v) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.x(gVar));
        }
        int o6 = k.o(fVar, null, this.f570b, this.f571c);
        q2 z5 = z();
        z5.o(fVar);
        z5.F(o6);
        z5.G(this.f582n);
        if (this.f577i.size() > 0) {
            List list = this.f577i;
            c0010d = (C0010d) list.get(list.size() - 1);
            view = C(c0010d, gVar);
        } else {
            c0010d = null;
            view = null;
        }
        if (view != null) {
            z5.V(false);
            z5.S(null);
            int E = E(o6);
            boolean z6 = E == 1;
            this.f585q = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z5.D(view);
                i7 = 0;
                i6 = 0;
            } else {
                int[] iArr = new int[2];
                this.f583o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f582n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f583o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i6 = iArr2[0] - iArr[0];
                i7 = iArr2[1] - iArr[1];
            }
            if ((this.f582n & 5) == 5) {
                if (!z6) {
                    o6 = view.getWidth();
                    i8 = i6 - o6;
                }
                i8 = i6 + o6;
            } else {
                if (z6) {
                    o6 = view.getWidth();
                    i8 = i6 + o6;
                }
                i8 = i6 - o6;
            }
            z5.a(i8);
            z5.N(true);
            z5.n(i7);
        } else {
            if (this.f586r) {
                z5.a(this.f588t);
            }
            if (this.f587s) {
                z5.n(this.f589u);
            }
            z5.H(n());
        }
        this.f577i.add(new C0010d(z5, gVar, this.f585q));
        z5.f();
        ListView k6 = z5.k();
        k6.setOnKeyListener(this);
        if (c0010d == null && this.f591w && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(d.g.f6225l, (ViewGroup) k6, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            k6.addHeaderView(frameLayout, null, false);
            z5.f();
        }
    }

    private q2 z() {
        q2 q2Var = new q2(this.f570b, null, this.f572d, this.f573e);
        q2Var.U(this.f580l);
        q2Var.L(this);
        q2Var.K(this);
        q2Var.D(this.f583o);
        q2Var.G(this.f582n);
        q2Var.J(true);
        q2Var.I(2);
        return q2Var;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z5) {
        int A = A(gVar);
        if (A < 0) {
            return;
        }
        int i6 = A + 1;
        if (i6 < this.f577i.size()) {
            ((C0010d) this.f577i.get(i6)).f603b.e(false);
        }
        C0010d c0010d = (C0010d) this.f577i.remove(A);
        c0010d.f603b.O(this);
        if (this.A) {
            c0010d.f602a.T(null);
            c0010d.f602a.E(0);
        }
        c0010d.f602a.dismiss();
        int size = this.f577i.size();
        this.f585q = size > 0 ? ((C0010d) this.f577i.get(size - 1)).f604c : D();
        if (size != 0) {
            if (z5) {
                ((C0010d) this.f577i.get(0)).f603b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.f592x;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f593y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f593y.removeGlobalOnLayoutListener(this.f578j);
            }
            this.f593y = null;
        }
        this.f584p.removeOnAttachStateChangeListener(this.f579k);
        this.f594z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.f577i.size() > 0 && ((C0010d) this.f577i.get(0)).f602a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f577i.size();
        if (size > 0) {
            C0010d[] c0010dArr = (C0010d[]) this.f577i.toArray(new C0010d[size]);
            for (int i6 = size - 1; i6 >= 0; i6--) {
                C0010d c0010d = c0010dArr[i6];
                if (c0010d.f602a.b()) {
                    c0010d.f602a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void f() {
        if (b()) {
            return;
        }
        Iterator it = this.f576h.iterator();
        while (it.hasNext()) {
            F((g) it.next());
        }
        this.f576h.clear();
        View view = this.f583o;
        this.f584p = view;
        if (view != null) {
            boolean z5 = this.f593y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f593y = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f578j);
            }
            this.f584p.addOnAttachStateChangeListener(this.f579k);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f592x = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        for (C0010d c0010d : this.f577i) {
            if (rVar == c0010d.f603b) {
                c0010d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.f592x;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z5) {
        Iterator it = this.f577i.iterator();
        while (it.hasNext()) {
            k.y(((C0010d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        if (this.f577i.isEmpty()) {
            return null;
        }
        return ((C0010d) this.f577i.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.f570b);
        if (b()) {
            F(gVar);
        } else {
            this.f576h.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0010d c0010d;
        int size = this.f577i.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                c0010d = null;
                break;
            }
            c0010d = (C0010d) this.f577i.get(i6);
            if (!c0010d.f602a.b()) {
                break;
            } else {
                i6++;
            }
        }
        if (c0010d != null) {
            c0010d.f603b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i6 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        if (this.f583o != view) {
            this.f583o = view;
            this.f582n = w.b(this.f581m, b1.E(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z5) {
        this.f590v = z5;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i6) {
        if (this.f581m != i6) {
            this.f581m = i6;
            this.f582n = w.b(i6, b1.E(this.f583o));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i6) {
        this.f586r = true;
        this.f588t = i6;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f594z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z5) {
        this.f591w = z5;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i6) {
        this.f587s = true;
        this.f589u = i6;
    }
}
