package com.google.android.gms.common.api.internal;

import P.C1359d;
import Q.AbstractC1400p;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class LifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    protected final P.e f15921a;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(P.e eVar) {
        this.f15921a = eVar;
    }

    protected static P.e c(C1359d c1359d) {
        if (c1359d.d()) {
            return P.D.j(c1359d.b());
        }
        if (c1359d.c()) {
            return P.B.d(c1359d.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static P.e d(Activity activity) {
        return c(new C1359d(activity));
    }

    @Keep
    private static P.e getChimeraLifecycleFragmentImpl(C1359d c1359d) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity f8 = this.f15921a.f();
        AbstractC1400p.l(f8);
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
