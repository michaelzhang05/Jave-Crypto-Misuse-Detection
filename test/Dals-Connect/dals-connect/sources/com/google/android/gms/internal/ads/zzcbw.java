package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzcbw extends zzajb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzadv {

    /* renamed from: f, reason: collision with root package name */
    private View f13848f;

    /* renamed from: g, reason: collision with root package name */
    private zzaar f13849g;

    /* renamed from: h, reason: collision with root package name */
    private zzbyn f13850h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13851i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13852j = false;

    public zzcbw(zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f13848f = zzbytVar.z();
        this.f13849g = zzbytVar.m();
        this.f13850h = zzbynVar;
        if (zzbytVar.A() != null) {
            zzbytVar.A().D(this);
        }
    }

    private static void H7(zzajc zzajcVar, int i2) {
        try {
            zzajcVar.Z1(i2);
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    private final void I7() {
        View view = this.f13848f;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f13848f);
        }
    }

    private final void J7() {
        View view;
        zzbyn zzbynVar = this.f13850h;
        if (zzbynVar == null || (view = this.f13848f) == null) {
            return;
        }
        zzbynVar.u(view, Collections.emptyMap(), Collections.emptyMap(), zzbyn.D(this.f13848f));
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void B5() {
        zzaxi.a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.hh

            /* renamed from: f, reason: collision with root package name */
            private final zzcbw f11533f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11533f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11533f.K7();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final void E6(IObjectWrapper iObjectWrapper, zzajc zzajcVar) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.f13851i) {
            zzbad.g("Instream ad is destroyed already.");
            H7(zzajcVar, 2);
            return;
        }
        View view = this.f13848f;
        if (view != null && this.f13849g != null) {
            if (this.f13852j) {
                zzbad.g("Instream ad should not be used again.");
                H7(zzajcVar, 1);
                return;
            }
            this.f13852j = true;
            I7();
            ((ViewGroup) ObjectWrapper.R(iObjectWrapper)).addView(this.f13848f, new ViewGroup.LayoutParams(-1, -1));
            zzk.zzmd();
            zzbbz.a(this.f13848f, this);
            zzk.zzmd();
            zzbbz.b(this.f13848f, this);
            J7();
            try {
                zzajcVar.C7();
                return;
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
                return;
            }
        }
        String str = view == null ? "can not get video view." : "can not get video controller.";
        zzbad.g(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
        H7(zzajcVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void K7() {
        try {
            destroy();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final void destroy() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        I7();
        zzbyn zzbynVar = this.f13850h;
        if (zzbynVar != null) {
            zzbynVar.a();
        }
        this.f13850h = null;
        this.f13848f = null;
        this.f13849g = null;
        this.f13851i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final zzaar getVideoController() throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.");
        if (this.f13851i) {
            zzbad.g("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.f13849g;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        J7();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        J7();
    }
}
