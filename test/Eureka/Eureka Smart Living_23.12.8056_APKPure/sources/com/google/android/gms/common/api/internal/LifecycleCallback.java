package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import u1.b0;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    protected final u1.e f4556a;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(u1.e eVar) {
        this.f4556a = eVar;
    }

    public static u1.e c(Activity activity) {
        return d(new u1.d(activity));
    }

    protected static u1.e d(u1.d dVar) {
        if (dVar.d()) {
            return b0.I1(dVar.b());
        }
        if (dVar.c()) {
            return u1.z.d(dVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    private static u1.e getChimeraLifecycleFragmentImpl(u1.d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity f6 = this.f4556a.f();
        v1.n.h(f6);
        return f6;
    }

    public void e(int i6, int i7, Intent intent) {
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
