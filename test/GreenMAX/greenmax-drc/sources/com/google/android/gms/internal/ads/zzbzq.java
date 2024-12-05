package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzbzq implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final zzccj f13759f;

    /* renamed from: g, reason: collision with root package name */
    private final Clock f13760g;

    /* renamed from: h, reason: collision with root package name */
    private zzagd f13761h;

    /* renamed from: i, reason: collision with root package name */
    private zzaho f13762i;

    /* renamed from: j, reason: collision with root package name */
    String f13763j;

    /* renamed from: k, reason: collision with root package name */
    Long f13764k;
    WeakReference<View> l;

    public zzbzq(zzccj zzccjVar, Clock clock) {
        this.f13759f = zzccjVar;
        this.f13760g = clock;
    }

    private final void d() {
        View view;
        this.f13763j = null;
        this.f13764k = null;
        WeakReference<View> weakReference = this.l;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.l = null;
    }

    public final void a() {
        if (this.f13761h == null || this.f13764k == null) {
            return;
        }
        d();
        try {
            this.f13761h.onUnconfirmedClickCancelled();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    public final void b(zzagd zzagdVar) {
        this.f13761h = zzagdVar;
        zzaho<Object> zzahoVar = this.f13762i;
        if (zzahoVar != null) {
            this.f13759f.h("/unconfirmedClick", zzahoVar);
        }
        cg cgVar = new cg(this, zzagdVar);
        this.f13762i = cgVar;
        this.f13759f.d("/unconfirmedClick", cgVar);
    }

    public final zzagd c() {
        return this.f13761h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.l;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f13763j != null && this.f13764k != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, this.f13763j);
            hashMap.put("time_interval", String.valueOf(this.f13760g.a() - this.f13764k.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f13759f.e("sendMessageToNativeJs", hashMap);
        }
        d();
    }
}
