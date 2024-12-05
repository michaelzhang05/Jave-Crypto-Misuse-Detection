package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.w2;
import androidx.core.view.x2;
import androidx.core.view.y2;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f497c;

    /* renamed from: d, reason: collision with root package name */
    x2 f498d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f499e;

    /* renamed from: b, reason: collision with root package name */
    private long f496b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final y2 f500f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f495a = new ArrayList();

    /* loaded from: classes.dex */
    class a extends y2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f501a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f502b = 0;

        a() {
        }

        @Override // androidx.core.view.x2
        public void a(View view) {
            int i6 = this.f502b + 1;
            this.f502b = i6;
            if (i6 == h.this.f495a.size()) {
                x2 x2Var = h.this.f498d;
                if (x2Var != null) {
                    x2Var.a(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.y2, androidx.core.view.x2
        public void b(View view) {
            if (this.f501a) {
                return;
            }
            this.f501a = true;
            x2 x2Var = h.this.f498d;
            if (x2Var != null) {
                x2Var.b(null);
            }
        }

        void d() {
            this.f502b = 0;
            this.f501a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f499e) {
            Iterator it = this.f495a.iterator();
            while (it.hasNext()) {
                ((w2) it.next()).c();
            }
            this.f499e = false;
        }
    }

    void b() {
        this.f499e = false;
    }

    public h c(w2 w2Var) {
        if (!this.f499e) {
            this.f495a.add(w2Var);
        }
        return this;
    }

    public h d(w2 w2Var, w2 w2Var2) {
        this.f495a.add(w2Var);
        w2Var2.j(w2Var.d());
        this.f495a.add(w2Var2);
        return this;
    }

    public h e(long j6) {
        if (!this.f499e) {
            this.f496b = j6;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f499e) {
            this.f497c = interpolator;
        }
        return this;
    }

    public h g(x2 x2Var) {
        if (!this.f499e) {
            this.f498d = x2Var;
        }
        return this;
    }

    public void h() {
        if (this.f499e) {
            return;
        }
        Iterator it = this.f495a.iterator();
        while (it.hasNext()) {
            w2 w2Var = (w2) it.next();
            long j6 = this.f496b;
            if (j6 >= 0) {
                w2Var.f(j6);
            }
            Interpolator interpolator = this.f497c;
            if (interpolator != null) {
                w2Var.g(interpolator);
            }
            if (this.f498d != null) {
                w2Var.h(this.f500f);
            }
            w2Var.l();
        }
        this.f499e = true;
    }
}
