package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import m0.l;

/* loaded from: classes.dex */
public abstract class n0 extends l {
    private static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    private int J = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7514a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f7515b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f7516c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f7514a = viewGroup;
            this.f7515b = view;
            this.f7516c = view2;
        }

        @Override // m0.m, m0.l.f
        public void c(l lVar) {
            x.a(this.f7514a).c(this.f7515b);
        }

        @Override // m0.l.f
        public void d(l lVar) {
            this.f7516c.setTag(i.f7466a, null);
            x.a(this.f7514a).c(this.f7515b);
            lVar.Q(this);
        }

        @Override // m0.m, m0.l.f
        public void e(l lVar) {
            if (this.f7515b.getParent() == null) {
                x.a(this.f7514a).a(this.f7515b);
            } else {
                n0.this.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f7518a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7519b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f7520c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f7521d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f7522e;

        /* renamed from: f, reason: collision with root package name */
        boolean f7523f = false;

        b(View view, int i6, boolean z5) {
            this.f7518a = view;
            this.f7519b = i6;
            this.f7520c = (ViewGroup) view.getParent();
            this.f7521d = z5;
            g(true);
        }

        private void f() {
            if (!this.f7523f) {
                a0.h(this.f7518a, this.f7519b);
                ViewGroup viewGroup = this.f7520c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z5) {
            ViewGroup viewGroup;
            if (!this.f7521d || this.f7522e == z5 || (viewGroup = this.f7520c) == null) {
                return;
            }
            this.f7522e = z5;
            x.c(viewGroup, z5);
        }

        @Override // m0.l.f
        public void a(l lVar) {
        }

        @Override // m0.l.f
        public void b(l lVar) {
        }

        @Override // m0.l.f
        public void c(l lVar) {
            g(false);
        }

        @Override // m0.l.f
        public void d(l lVar) {
            f();
            lVar.Q(this);
        }

        @Override // m0.l.f
        public void e(l lVar) {
            g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7523f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f7523f) {
                return;
            }
            a0.h(this.f7518a, this.f7519b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f7523f) {
                return;
            }
            a0.h(this.f7518a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f7524a;

        /* renamed from: b, reason: collision with root package name */
        boolean f7525b;

        /* renamed from: c, reason: collision with root package name */
        int f7526c;

        /* renamed from: d, reason: collision with root package name */
        int f7527d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f7528e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f7529f;

        c() {
        }
    }

    private void d0(s sVar) {
        sVar.f7537a.put("android:visibility:visibility", Integer.valueOf(sVar.f7538b.getVisibility()));
        sVar.f7537a.put("android:visibility:parent", sVar.f7538b.getParent());
        int[] iArr = new int[2];
        sVar.f7538b.getLocationOnScreen(iArr);
        sVar.f7537a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r0.f7528e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r0.f7526c == 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private m0.n0.c e0(m0.s r8, m0.s r9) {
        /*
            r7 = this;
            m0.n0$c r0 = new m0.n0$c
            r0.<init>()
            r1 = 0
            r0.f7524a = r1
            r0.f7525b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map r6 = r8.f7537a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r8.f7537a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f7526c = r6
            java.util.Map r6 = r8.f7537a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f7528e = r6
            goto L37
        L33:
            r0.f7526c = r4
            r0.f7528e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map r6 = r9.f7537a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r3 = r9.f7537a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f7527d = r3
            java.util.Map r3 = r9.f7537a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f7529f = r2
            goto L5e
        L5a:
            r0.f7527d = r4
            r0.f7529f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f7526c
            int r9 = r0.f7527d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f7528e
            android.view.ViewGroup r4 = r0.f7529f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f7529f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f7528e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f7527d
            if (r8 != 0) goto L8d
        L88:
            r0.f7525b = r2
        L8a:
            r0.f7524a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f7526c
            if (r8 != 0) goto L96
        L93:
            r0.f7525b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.n0.e0(m0.s, m0.s):m0.n0$c");
    }

    @Override // m0.l
    public String[] E() {
        return K;
    }

    @Override // m0.l
    public boolean G(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f7537a.containsKey("android:visibility:visibility") != sVar.f7537a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c e02 = e0(sVar, sVar2);
        if (e02.f7524a) {
            return e02.f7526c == 0 || e02.f7527d == 0;
        }
        return false;
    }

    public abstract Animator f0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator g0(ViewGroup viewGroup, s sVar, int i6, s sVar2, int i7) {
        if ((this.J & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f7538b.getParent();
            if (e0(u(view, false), F(view, false)).f7524a) {
                return null;
            }
        }
        return f0(viewGroup, sVar2.f7538b, sVar, sVar2);
    }

    @Override // m0.l
    public void h(s sVar) {
        d0(sVar);
    }

    public abstract Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        if (r10.f7493w != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator i0(android.view.ViewGroup r11, m0.s r12, int r13, m0.s r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.n0.i0(android.view.ViewGroup, m0.s, int, m0.s, int):android.animation.Animator");
    }

    public void j0(int i6) {
        if ((i6 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.J = i6;
    }

    @Override // m0.l
    public void k(s sVar) {
        d0(sVar);
    }

    @Override // m0.l
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        c e02 = e0(sVar, sVar2);
        if (!e02.f7524a) {
            return null;
        }
        if (e02.f7528e == null && e02.f7529f == null) {
            return null;
        }
        return e02.f7525b ? g0(viewGroup, sVar, e02.f7526c, sVar2, e02.f7527d) : i0(viewGroup, sVar, e02.f7526c, sVar2, e02.f7527d);
    }
}
