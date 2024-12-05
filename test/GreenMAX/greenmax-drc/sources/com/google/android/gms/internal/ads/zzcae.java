package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcae implements zzbzb {
    private final zzana a;

    /* renamed from: b, reason: collision with root package name */
    private final zzand f13784b;

    /* renamed from: c, reason: collision with root package name */
    private final zzang f13785c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbrt f13786d;

    /* renamed from: e, reason: collision with root package name */
    private final zzbri f13787e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f13788f;

    /* renamed from: g, reason: collision with root package name */
    private final zzcxm f13789g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbai f13790h;

    /* renamed from: i, reason: collision with root package name */
    private final zzcxv f13791i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13792j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13793k = false;

    public zzcae(zzana zzanaVar, zzand zzandVar, zzang zzangVar, zzbrt zzbrtVar, zzbri zzbriVar, Context context, zzcxm zzcxmVar, zzbai zzbaiVar, zzcxv zzcxvVar) {
        this.a = zzanaVar;
        this.f13784b = zzandVar;
        this.f13785c = zzangVar;
        this.f13786d = zzbrtVar;
        this.f13787e = zzbriVar;
        this.f13788f = context;
        this.f13789g = zzcxmVar;
        this.f13790h = zzbaiVar;
        this.f13791i = zzcxvVar;
    }

    private final void o(View view) {
        try {
            zzang zzangVar = this.f13785c;
            if (zzangVar != null && !zzangVar.z()) {
                this.f13785c.A(ObjectWrapper.i0(view));
                this.f13787e.onAdClicked();
                return;
            }
            zzana zzanaVar = this.a;
            if (zzanaVar != null && !zzanaVar.z()) {
                this.a.A(ObjectWrapper.i0(view));
                this.f13787e.onAdClicked();
                return;
            }
            zzand zzandVar = this.f13784b;
            if (zzandVar == null || zzandVar.z()) {
                return;
            }
            this.f13784b.A(ObjectWrapper.i0(view));
            this.f13787e.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.d("Failed to call handleClick", e2);
        }
    }

    private static HashMap<String, View> p(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void N(zzagd zzagdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void O(zzaak zzaakVar) {
        zzbad.i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void Q() {
        this.f13793k = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper i0 = ObjectWrapper.i0(view);
            HashMap<String, View> p = p(map);
            HashMap<String, View> p2 = p(map2);
            zzang zzangVar = this.f13785c;
            if (zzangVar != null) {
                zzangVar.r(i0, ObjectWrapper.i0(p), ObjectWrapper.i0(p2));
                return;
            }
            zzana zzanaVar = this.a;
            if (zzanaVar != null) {
                zzanaVar.r(i0, ObjectWrapper.i0(p), ObjectWrapper.i0(p2));
                this.a.e0(i0);
                return;
            }
            zzand zzandVar = this.f13784b;
            if (zzandVar != null) {
                zzandVar.r(i0, ObjectWrapper.i0(p), ObjectWrapper.i0(p2));
                this.f13784b.e0(i0);
            }
        } catch (RemoteException e2) {
            zzbad.d("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void c(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void e(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper i0 = ObjectWrapper.i0(view);
            zzang zzangVar = this.f13785c;
            if (zzangVar != null) {
                zzangVar.o(i0);
                return;
            }
            zzana zzanaVar = this.a;
            if (zzanaVar != null) {
                zzanaVar.o(i0);
                return;
            }
            zzand zzandVar = this.f13784b;
            if (zzandVar != null) {
                zzandVar.o(i0);
            }
        } catch (RemoteException e2) {
            zzbad.d("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void f(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void g(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void h(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.f13793k && this.f13789g.D) {
            return;
        }
        o(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            boolean z = this.f13792j;
            if (!z && this.f13789g.z != null) {
                this.f13792j = z | zzk.zzlq().c(this.f13788f, this.f13790h.f13150f, this.f13789g.z.toString(), this.f13791i.f14575f);
            }
            zzang zzangVar = this.f13785c;
            if (zzangVar != null && !zzangVar.q()) {
                this.f13785c.recordImpression();
                this.f13786d.Y();
                return;
            }
            zzana zzanaVar = this.a;
            if (zzanaVar != null && !zzanaVar.q()) {
                this.a.recordImpression();
                this.f13786d.Y();
                return;
            }
            zzand zzandVar = this.f13784b;
            if (zzandVar == null || zzandVar.q()) {
                return;
            }
            this.f13784b.recordImpression();
            this.f13786d.Y();
        } catch (RemoteException e2) {
            zzbad.d("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f13793k) {
            zzbad.i("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f13789g.D) {
            zzbad.i("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        } else {
            o(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void k0(zzaag zzaagVar) {
        zzbad.i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final boolean m(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void n() {
        zzbad.i("Mute This Ad is not supported for 3rd party ads");
    }
}
