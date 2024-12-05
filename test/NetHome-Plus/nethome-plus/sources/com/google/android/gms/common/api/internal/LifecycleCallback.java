package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleCallback {

    /* renamed from: f, reason: collision with root package name */
    @KeepForSdk
    protected final LifecycleFragment f10603f;

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.f10603f = lifecycleFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public static LifecycleFragment c(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.c()) {
            return zzc.e(lifecycleActivity.b());
        }
        if (lifecycleActivity.d()) {
            return zza.e(lifecycleActivity.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @KeepForSdk
    public Activity b() {
        return this.f10603f.c();
    }

    @KeepForSdk
    public void d(int i2, int i3, Intent intent) {
    }

    @KeepForSdk
    public void e(Bundle bundle) {
    }

    @KeepForSdk
    public void f() {
    }

    @KeepForSdk
    public void g() {
    }

    @KeepForSdk
    public void h(Bundle bundle) {
    }

    @KeepForSdk
    public void i() {
    }

    @KeepForSdk
    public void j() {
    }
}
