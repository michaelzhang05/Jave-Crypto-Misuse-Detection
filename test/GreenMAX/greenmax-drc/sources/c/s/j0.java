package c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c.s.a;
import c.s.m;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class j0 extends m {
    private static final String[] P = {"android:visibility:visibility", "android:visibility:parent"};
    private int Q = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public class a extends n {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2997b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2998c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.f2997b = view;
            this.f2998c = view2;
        }

        @Override // c.s.n, c.s.m.f
        public void b(m mVar) {
            x.a(this.a).d(this.f2997b);
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            this.f2998c.setTag(j.f2994b, null);
            x.a(this.a).d(this.f2997b);
            mVar.W(this);
        }

        @Override // c.s.n, c.s.m.f
        public void e(m mVar) {
            if (this.f2997b.getParent() == null) {
                x.a(this.a).c(this.f2997b);
            } else {
                j0.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements m.f, a.InterfaceC0083a {
        private final View a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3000b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f3001c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f3002d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3003e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3004f = false;

        b(View view, int i2, boolean z) {
            this.a = view;
            this.f3000b = i2;
            this.f3001c = (ViewGroup) view.getParent();
            this.f3002d = z;
            g(true);
        }

        private void f() {
            if (!this.f3004f) {
                c0.h(this.a, this.f3000b);
                ViewGroup viewGroup = this.f3001c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f3002d || this.f3003e == z || (viewGroup = this.f3001c) == null) {
                return;
            }
            this.f3003e = z;
            x.c(viewGroup, z);
        }

        @Override // c.s.m.f
        public void a(m mVar) {
        }

        @Override // c.s.m.f
        public void b(m mVar) {
            g(false);
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            f();
            mVar.W(this);
        }

        @Override // c.s.m.f
        public void d(m mVar) {
        }

        @Override // c.s.m.f
        public void e(m mVar) {
            g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3004f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, c.s.a.InterfaceC0083a
        public void onAnimationPause(Animator animator) {
            if (this.f3004f) {
                return;
            }
            c0.h(this.a, this.f3000b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, c.s.a.InterfaceC0083a
        public void onAnimationResume(Animator animator) {
            if (this.f3004f) {
                return;
            }
            c0.h(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class c {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        boolean f3005b;

        /* renamed from: c, reason: collision with root package name */
        int f3006c;

        /* renamed from: d, reason: collision with root package name */
        int f3007d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f3008e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f3009f;

        c() {
        }
    }

    private void l0(s sVar) {
        sVar.a.put("android:visibility:visibility", Integer.valueOf(sVar.f3030b.getVisibility()));
        sVar.a.put("android:visibility:parent", sVar.f3030b.getParent());
        int[] iArr = new int[2];
        sVar.f3030b.getLocationOnScreen(iArr);
        sVar.a.put("android:visibility:screenLocation", iArr);
    }

    private c m0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.a = false;
        cVar.f3005b = false;
        if (sVar != null && sVar.a.containsKey("android:visibility:visibility")) {
            cVar.f3006c = ((Integer) sVar.a.get("android:visibility:visibility")).intValue();
            cVar.f3008e = (ViewGroup) sVar.a.get("android:visibility:parent");
        } else {
            cVar.f3006c = -1;
            cVar.f3008e = null;
        }
        if (sVar2 != null && sVar2.a.containsKey("android:visibility:visibility")) {
            cVar.f3007d = ((Integer) sVar2.a.get("android:visibility:visibility")).intValue();
            cVar.f3009f = (ViewGroup) sVar2.a.get("android:visibility:parent");
        } else {
            cVar.f3007d = -1;
            cVar.f3009f = null;
        }
        if (sVar != null && sVar2 != null) {
            int i2 = cVar.f3006c;
            int i3 = cVar.f3007d;
            if (i2 == i3 && cVar.f3008e == cVar.f3009f) {
                return cVar;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    cVar.f3005b = false;
                    cVar.a = true;
                } else if (i3 == 0) {
                    cVar.f3005b = true;
                    cVar.a = true;
                }
            } else if (cVar.f3009f == null) {
                cVar.f3005b = false;
                cVar.a = true;
            } else if (cVar.f3008e == null) {
                cVar.f3005b = true;
                cVar.a = true;
            }
        } else if (sVar == null && cVar.f3007d == 0) {
            cVar.f3005b = true;
            cVar.a = true;
        } else if (sVar2 == null && cVar.f3006c == 0) {
            cVar.f3005b = false;
            cVar.a = true;
        }
        return cVar;
    }

    @Override // c.s.m
    public String[] H() {
        return P;
    }

    @Override // c.s.m
    public boolean K(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.a.containsKey("android:visibility:visibility") != sVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m0 = m0(sVar, sVar2);
        if (m0.a) {
            return m0.f3006c == 0 || m0.f3007d == 0;
        }
        return false;
    }

    @Override // c.s.m
    public void h(s sVar) {
        l0(sVar);
    }

    @Override // c.s.m
    public void k(s sVar) {
        l0(sVar);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // c.s.m
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        c m0 = m0(sVar, sVar2);
        if (!m0.a) {
            return null;
        }
        if (m0.f3008e == null && m0.f3009f == null) {
            return null;
        }
        if (m0.f3005b) {
            return o0(viewGroup, sVar, m0.f3006c, sVar2, m0.f3007d);
        }
        return q0(viewGroup, sVar, m0.f3006c, sVar2, m0.f3007d);
    }

    public Animator o0(ViewGroup viewGroup, s sVar, int i2, s sVar2, int i3) {
        if ((this.Q & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f3030b.getParent();
            if (m0(u(view, false), I(view, false)).a) {
                return null;
            }
        }
        return n0(viewGroup, sVar2.f3030b, sVar, sVar2);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.E != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator q0(android.view.ViewGroup r18, c.s.s r19, int r20, c.s.s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.s.j0.q0(android.view.ViewGroup, c.s.s, int, c.s.s, int):android.animation.Animator");
    }

    public void r0(int i2) {
        if ((i2 & (-4)) == 0) {
            this.Q = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
