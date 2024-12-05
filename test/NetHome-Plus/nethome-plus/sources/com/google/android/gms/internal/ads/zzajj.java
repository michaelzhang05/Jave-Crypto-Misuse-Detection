package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzajj extends zzaju<zzalf> implements zzajq, zzajw {

    /* renamed from: h */
    private final zzbjb f12747h;

    /* renamed from: i */
    private zzajx f12748i;

    public zzajj(Context context, zzbai zzbaiVar) throws zzbhj {
        try {
            zzbjb zzbjbVar = new zzbjb(context, new z0(this));
            this.f12747h = zzbjbVar;
            zzbjbVar.setWillNotDraw(true);
            zzbjbVar.addJavascriptInterface(new y0(this), "GoogleJsInterface");
            zzk.zzlg().k(context, zzbaiVar.f13150f, zzbjbVar.getSettings());
            super.r0(this);
        } catch (Throwable th) {
            throw new zzbhj("Init failed.", th);
        }
    }

    public final /* synthetic */ void A0(String str) {
        this.f12747h.k(str);
    }

    public final /* synthetic */ void B0(String str) {
        this.f12747h.loadUrl(str);
    }

    public final /* synthetic */ void C0(String str) {
        this.f12747h.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void T(String str) {
        zzbbm.a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.v0

            /* renamed from: f, reason: collision with root package name */
            private final zzajj f12250f;

            /* renamed from: g, reason: collision with root package name */
            private final String f12251g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12250f = this;
                this.f12251g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12250f.B0(this.f12251g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    public final void X(String str, String str2) {
        zzajr.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void Y(String str, JSONObject jSONObject) {
        zzajr.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void destroy() {
        this.f12747h.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzaji
    public final void j(String str, JSONObject jSONObject) {
        zzajr.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    public final void k(String str) {
        zzbbm.a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.w0

            /* renamed from: f, reason: collision with root package name */
            private final zzajj f12299f;

            /* renamed from: g, reason: collision with root package name */
            private final String f12300g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12299f = this;
                this.f12300g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12299f.A0(this.f12300g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final boolean l() {
        return this.f12747h.l();
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void o0(String str) {
        u0(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void q(zzajx zzajxVar) {
        this.f12748i = zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final zzalg q0() {
        return new zzalh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void u0(String str) {
        zzbbm.a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.u0

            /* renamed from: f, reason: collision with root package name */
            private final zzajj f12207f;

            /* renamed from: g, reason: collision with root package name */
            private final String f12208g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12207f = this;
                this.f12208g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12207f.C0(this.f12208g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final void y(String str, Map map) {
        zzajr.b(this, str, map);
    }
}
