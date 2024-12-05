package com.google.android.gms.common.api.internal;

import Q.C1303d;
import R.AbstractC1319p;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class LifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    protected final Q.e f15120a;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(Q.e eVar) {
        this.f15120a = eVar;
    }

    protected static Q.e c(C1303d c1303d) {
        if (c1303d.d()) {
            return Q.D.j(c1303d.b());
        }
        if (c1303d.c()) {
            return Q.B.d(c1303d.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static Q.e d(Activity activity) {
        return c(new C1303d(activity));
    }

    @Keep
    private static Q.e getChimeraLifecycleFragmentImpl(C1303d c1303d) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity f8 = this.f15120a.f();
        AbstractC1319p.l(f8);
        return f8;
    }

    public void e(int i8, int i9, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
