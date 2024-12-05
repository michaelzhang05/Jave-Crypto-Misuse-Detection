package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper;

@KeepForSdk
/* loaded from: classes2.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: f, reason: collision with root package name */
    private Fragment f11024f;

    private SupportFragmentWrapper(Fragment fragment) {
        this.f11024f = fragment;
    }

    @KeepForSdk
    public static SupportFragmentWrapper C(Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper B3() {
        return C(this.f11024f.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper G6() {
        return ObjectWrapper.i0(this.f11024f.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper H2() {
        return ObjectWrapper.i0(this.f11024f.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean L0() {
        return this.f11024f.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean N1() {
        return this.f11024f.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O0(boolean z) {
        this.f11024f.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void S3(IObjectWrapper iObjectWrapper) {
        this.f11024f.unregisterForContextMenu((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper V1() {
        return C(this.f11024f.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int X5() {
        return this.f11024f.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void f1(Intent intent) {
        this.f11024f.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void g1(boolean z) {
        this.f11024f.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int getId() {
        return this.f11024f.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String getTag() {
        return this.f11024f.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper h1() {
        return ObjectWrapper.i0(this.f11024f.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean isVisible() {
        return this.f11024f.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean o0() {
        return this.f11024f.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q4() {
        return this.f11024f.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean r4() {
        return this.f11024f.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void r7(boolean z) {
        this.f11024f.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void startActivityForResult(Intent intent, int i2) {
        this.f11024f.startActivityForResult(intent, i2);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean v3() {
        return this.f11024f.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean v4() {
        return this.f11024f.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle w() {
        return this.f11024f.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean w1() {
        return this.f11024f.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void y5(IObjectWrapper iObjectWrapper) {
        this.f11024f.registerForContextMenu((View) ObjectWrapper.R(iObjectWrapper));
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void z0(boolean z) {
        this.f11024f.setHasOptionsMenu(z);
    }
}
