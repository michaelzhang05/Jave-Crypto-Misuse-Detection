package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i0 implements androidx.lifecycle.g, i0.d, androidx.lifecycle.j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f2892a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.i0 f2893b;

    /* renamed from: c, reason: collision with root package name */
    private f0.b f2894c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.n f2895d = null;

    /* renamed from: e, reason: collision with root package name */
    private i0.c f2896e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Fragment fragment, androidx.lifecycle.i0 i0Var) {
        this.f2892a = fragment;
        this.f2893b = i0Var;
    }

    @Override // androidx.lifecycle.g
    public f0.a a() {
        Application application;
        Context applicationContext = this.f2892a.s1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        f0.d dVar = new f0.d();
        if (application != null) {
            dVar.c(f0.a.f3077g, application);
        }
        dVar.c(androidx.lifecycle.z.f3134a, this.f2892a);
        dVar.c(androidx.lifecycle.z.f3135b, this);
        if (this.f2892a.s() != null) {
            dVar.c(androidx.lifecycle.z.f3136c, this.f2892a.s());
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(h.a aVar) {
        this.f2895d.h(aVar);
    }

    @Override // i0.d
    public androidx.savedstate.a d() {
        e();
        return this.f2896e.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f2895d == null) {
            this.f2895d = new androidx.lifecycle.n(this);
            i0.c a6 = i0.c.a(this);
            this.f2896e = a6;
            a6.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f2895d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        this.f2896e.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Bundle bundle) {
        this.f2896e.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(h.b bVar) {
        this.f2895d.n(bVar);
    }

    @Override // androidx.lifecycle.j0
    public androidx.lifecycle.i0 n() {
        e();
        return this.f2893b;
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.h r() {
        e();
        return this.f2895d;
    }

    @Override // androidx.lifecycle.g
    public f0.b w() {
        Application application;
        f0.b w5 = this.f2892a.w();
        if (!w5.equals(this.f2892a.V)) {
            this.f2894c = w5;
            return w5;
        }
        if (this.f2894c == null) {
            Context applicationContext = this.f2892a.s1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f2892a;
            this.f2894c = new androidx.lifecycle.c0(application, fragment, fragment.s());
        }
        return this.f2894c;
    }
}
