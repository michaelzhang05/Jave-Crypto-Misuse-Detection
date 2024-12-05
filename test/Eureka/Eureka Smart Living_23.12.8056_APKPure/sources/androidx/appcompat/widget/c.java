package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.b implements b.a {
    RunnableC0012c A;
    private b B;
    final f C;
    int D;

    /* renamed from: k, reason: collision with root package name */
    d f920k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f921l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f922m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f923n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f924o;

    /* renamed from: p, reason: collision with root package name */
    private int f925p;

    /* renamed from: q, reason: collision with root package name */
    private int f926q;

    /* renamed from: r, reason: collision with root package name */
    private int f927r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f928s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f929t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f930u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f931v;

    /* renamed from: w, reason: collision with root package name */
    private int f932w;

    /* renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f933x;

    /* renamed from: y, reason: collision with root package name */
    e f934y;

    /* renamed from: z, reason: collision with root package name */
    a f935z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, d.a.f6122i);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = c.this.f920k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f565i : view2);
            }
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            c cVar = c.this;
            cVar.f935z = null;
            cVar.D = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = c.this.f935z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0012c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private e f938a;

        public RunnableC0012c(e eVar) {
            this.f938a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f559c != null) {
                ((androidx.appcompat.view.menu.b) c.this).f559c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f565i;
            if (view != null && view.getWindowToken() != null && this.f938a.m()) {
                c.this.f934y = this.f938a;
            }
            c.this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends r implements ActionMenuView.a {

        /* loaded from: classes.dex */
        class a extends h2 {

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f941j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f941j = cVar;
            }

            @Override // androidx.appcompat.widget.h2
            public androidx.appcompat.view.menu.p b() {
                e eVar = c.this.f934y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.h2
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.h2
            public boolean d() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, d.a.f6121h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            j3.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i6, int i7, int i8, int i9) {
            boolean frame = super.setFrame(i6, i7, i8, i9);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z5) {
            super(context, gVar, view, z5, d.a.f6122i);
            h(8388613);
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) c.this).f559c != null) {
                ((androidx.appcompat.view.menu.b) c.this).f559c.close();
            }
            c.this.f934y = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z5) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a m6 = c.this.m();
            if (m6 != null) {
                m6.a(gVar, z5);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f559c) {
                return false;
            }
            c.this.D = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a m6 = c.this.m();
            if (m6 != null) {
                return m6.b(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, d.g.f6216c, d.g.f6215b);
        this.f933x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f565i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f920k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f922m) {
            return this.f921l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0012c runnableC0012c = this.A;
        if (runnableC0012c != null && (obj = this.f565i) != null) {
            ((View) obj).removeCallbacks(runnableC0012c);
            this.A = null;
            return true;
        }
        e eVar = this.f934y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f935z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.A != null || E();
    }

    public boolean E() {
        e eVar = this.f934y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f928s) {
            this.f927r = androidx.appcompat.view.a.b(this.f558b).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f559c;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z5) {
        this.f931v = z5;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f565i = actionMenuView;
        actionMenuView.b(this.f559c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f920k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f922m = true;
            this.f921l = drawable;
        }
    }

    public void J(boolean z5) {
        this.f923n = z5;
        this.f924o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f923n || E() || (gVar = this.f559c) == null || this.f565i == null || this.A != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0012c runnableC0012c = new RunnableC0012c(new e(this.f558b, this.f559c, this.f920k, true));
        this.A = runnableC0012c;
        ((View) this.f565i).post(runnableC0012c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z5) {
        y();
        super.a(gVar, z5);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        int i9;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f559c;
        View view = null;
        int i10 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i6 = arrayList.size();
        } else {
            arrayList = null;
            i6 = 0;
        }
        int i11 = cVar.f927r;
        int i12 = cVar.f926q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f565i;
        boolean z5 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i6; i15++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayList.get(i15);
            if (iVar.o()) {
                i13++;
            } else if (iVar.n()) {
                i14++;
            } else {
                z5 = true;
            }
            if (cVar.f931v && iVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (cVar.f923n && (z5 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = cVar.f933x;
        sparseBooleanArray.clear();
        if (cVar.f929t) {
            int i17 = cVar.f932w;
            i8 = i12 / i17;
            i7 = i17 + ((i12 % i17) / i8);
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i6) {
            androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) arrayList.get(i18);
            if (iVar2.o()) {
                View n6 = cVar.n(iVar2, view, viewGroup);
                if (cVar.f929t) {
                    i8 -= ActionMenuView.L(n6, i7, i8, makeMeasureSpec, i10);
                } else {
                    n6.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n6.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i9 = i6;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                boolean z7 = (i16 > 0 || z6) && i12 > 0 && (!cVar.f929t || i8 > 0);
                boolean z8 = z7;
                i9 = i6;
                if (z7) {
                    View n7 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.f929t) {
                        int L = ActionMenuView.L(n7, i7, i8, makeMeasureSpec, 0);
                        i8 -= L;
                        if (L == 0) {
                            z8 = false;
                        }
                    } else {
                        n7.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z9 = z8;
                    int measuredWidth2 = n7.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z7 = z9 & (!cVar.f929t ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z7 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.i iVar3 = (androidx.appcompat.view.menu.i) arrayList.get(i20);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i16++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z7) {
                    i16--;
                }
                iVar2.u(z7);
            } else {
                i9 = i6;
                iVar2.u(false);
                i18++;
                view = null;
                cVar = this;
                i6 = i9;
                i10 = 0;
            }
            i18++;
            view = null;
            cVar = this;
            i6 = i9;
            i10 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void d(Context context, androidx.appcompat.view.menu.g gVar) {
        super.d(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b6 = androidx.appcompat.view.a.b(context);
        if (!this.f924o) {
            this.f923n = b6.f();
        }
        if (!this.f930u) {
            this.f925p = b6.c();
        }
        if (!this.f928s) {
            this.f927r = b6.d();
        }
        int i6 = this.f925p;
        if (this.f923n) {
            if (this.f920k == null) {
                d dVar = new d(this.f557a);
                this.f920k = dVar;
                if (this.f922m) {
                    dVar.setImageDrawable(this.f921l);
                    this.f921l = null;
                    this.f922m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f920k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f920k.getMeasuredWidth();
        } else {
            this.f920k = null;
        }
        this.f926q = i6;
        this.f932w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b
    public void f(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f565i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean i(androidx.appcompat.view.menu.r rVar) {
        boolean z5 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f559c) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View z6 = z(rVar2.getItem());
        if (z6 == null) {
            return false;
        }
        this.D = rVar.getItem().getItemId();
        int size = rVar.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                z5 = true;
                break;
            }
            i6++;
        }
        a aVar = new a(this.f558b, rVar, z6);
        this.f935z = aVar;
        aVar.g(z5);
        this.f935z.k();
        super.i(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void j(boolean z5) {
        super.j(z5);
        ((View) this.f565i).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f559c;
        boolean z6 = false;
        if (gVar != null) {
            ArrayList s5 = gVar.s();
            int size = s5.size();
            for (int i6 = 0; i6 < size; i6++) {
                androidx.core.view.b b6 = ((androidx.appcompat.view.menu.i) s5.get(i6)).b();
                if (b6 != null) {
                    b6.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f559c;
        ArrayList z7 = gVar2 != null ? gVar2.z() : null;
        if (this.f923n && z7 != null) {
            int size2 = z7.size();
            if (size2 == 1) {
                z6 = !((androidx.appcompat.view.menu.i) z7.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z6 = true;
            }
        }
        d dVar = this.f920k;
        if (z6) {
            if (dVar == null) {
                this.f920k = new d(this.f557a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f920k.getParent();
            if (viewGroup != this.f565i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f920k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f565i;
                actionMenuView.addView(this.f920k, actionMenuView.F());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f565i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f920k);
            }
        }
        ((ActionMenuView) this.f565i).setOverflowReserved(this.f923n);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i6) {
        if (viewGroup.getChildAt(i6) == this.f920k) {
            return false;
        }
        return super.l(viewGroup, i6);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f565i;
        androidx.appcompat.view.menu.n o6 = super.o(viewGroup);
        if (nVar != o6) {
            ((ActionMenuView) o6).setPresenter(this);
        }
        return o6;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i6, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
