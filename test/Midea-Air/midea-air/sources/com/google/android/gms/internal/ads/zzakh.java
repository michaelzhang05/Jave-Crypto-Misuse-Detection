package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

@zzard
/* loaded from: classes2.dex */
public final class zzakh {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12756b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12757c;

    /* renamed from: d, reason: collision with root package name */
    private final zzbai f12758d;

    /* renamed from: e, reason: collision with root package name */
    private zzayp<zzajw> f12759e;

    /* renamed from: f, reason: collision with root package name */
    private zzayp<zzajw> f12760f;

    /* renamed from: g, reason: collision with root package name */
    private zzala f12761g;

    /* renamed from: h, reason: collision with root package name */
    private int f12762h;

    public zzakh(Context context, zzbai zzbaiVar, String str) {
        this.a = new Object();
        this.f12762h = 1;
        this.f12757c = str;
        this.f12756b = context.getApplicationContext();
        this.f12758d = zzbaiVar;
        this.f12759e = new zzakv();
        this.f12760f = new zzakv();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzala c(final zzdh zzdhVar) {
        final zzala zzalaVar = new zzala(this.f12760f);
        zzbbm.a.execute(new Runnable(this, zzdhVar, zzalaVar) { // from class: com.google.android.gms.internal.ads.i1

            /* renamed from: f, reason: collision with root package name */
            private final zzakh f11558f;

            /* renamed from: g, reason: collision with root package name */
            private final zzdh f11559g;

            /* renamed from: h, reason: collision with root package name */
            private final zzala f11560h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11558f = this;
                this.f11559g = zzdhVar;
                this.f11560h = zzalaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11558f.g(this.f11559g, this.f11560h);
            }
        });
        zzalaVar.d(new s1(this, zzalaVar), new t1(this, zzalaVar));
        return zzalaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzajw zzajwVar) {
        if (zzajwVar.l()) {
            this.f12762h = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(zzala zzalaVar, zzajw zzajwVar) {
        synchronized (this.a) {
            if (zzalaVar.a() != -1 && zzalaVar.a() != 1) {
                zzalaVar.b();
                Executor executor = zzbbm.a;
                zzajwVar.getClass();
                executor.execute(n1.a(zzajwVar));
                zzawz.m("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(zzdh zzdhVar, final zzala zzalaVar) {
        final zzajw zzajyVar;
        try {
            Context context = this.f12756b;
            zzbai zzbaiVar = this.f12758d;
            if (((Boolean) zzyt.e().c(zzacu.Q0)).booleanValue()) {
                zzajyVar = new zzajj(context, zzbaiVar);
            } else {
                zzajyVar = new zzajy(context, zzbaiVar, zzdhVar, null);
            }
            zzajyVar.q(new zzajx(this, zzalaVar, zzajyVar) { // from class: com.google.android.gms.internal.ads.l1
                private final zzakh a;

                /* renamed from: b, reason: collision with root package name */
                private final zzala f11745b;

                /* renamed from: c, reason: collision with root package name */
                private final zzajw f11746c;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                    this.f11745b = zzalaVar;
                    this.f11746c = zzajyVar;
                }

                @Override // com.google.android.gms.internal.ads.zzajx
                public final void a() {
                    final zzakh zzakhVar = this.a;
                    final zzala zzalaVar2 = this.f11745b;
                    final zzajw zzajwVar = this.f11746c;
                    zzaxi.a.postDelayed(new Runnable(zzakhVar, zzalaVar2, zzajwVar) { // from class: com.google.android.gms.internal.ads.m1

                        /* renamed from: f, reason: collision with root package name */
                        private final zzakh f11787f;

                        /* renamed from: g, reason: collision with root package name */
                        private final zzala f11788g;

                        /* renamed from: h, reason: collision with root package name */
                        private final zzajw f11789h;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.f11787f = zzakhVar;
                            this.f11788g = zzalaVar2;
                            this.f11789h = zzajwVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11787f.f(this.f11788g, this.f11789h);
                        }
                    }, u1.f12209b);
                }
            });
            zzajyVar.f("/jsLoaded", new o1(this, zzalaVar, zzajyVar));
            zzazk zzazkVar = new zzazk();
            p1 p1Var = new p1(this, zzdhVar, zzajyVar, zzazkVar);
            zzazkVar.b(p1Var);
            zzajyVar.f("/requestReload", p1Var);
            if (this.f12757c.endsWith(".js")) {
                zzajyVar.o0(this.f12757c);
            } else if (this.f12757c.startsWith("<html>")) {
                zzajyVar.u0(this.f12757c);
            } else {
                zzajyVar.T(this.f12757c);
            }
            zzaxi.a.postDelayed(new q1(this, zzalaVar, zzajyVar), u1.a);
        } catch (Throwable th) {
            zzbad.c("Error creating webview.", th);
            zzk.zzlk().e(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzalaVar.b();
        }
    }

    public final zzakw h(zzdh zzdhVar) {
        synchronized (this.a) {
            synchronized (this.a) {
                if (this.f12761g != null && this.f12762h == 0) {
                    if (((Boolean) zzyt.e().c(zzacu.f12629i)).booleanValue()) {
                        this.f12761g.d(new zzbbv(this) { // from class: com.google.android.gms.internal.ads.j1
                            private final zzakh a;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = this;
                            }

                            @Override // com.google.android.gms.internal.ads.zzbbv
                            public final void a(Object obj) {
                                this.a.e((zzajw) obj);
                            }
                        }, k1.a);
                    }
                }
            }
            zzala zzalaVar = this.f12761g;
            if (zzalaVar != null && zzalaVar.a() != -1) {
                int i2 = this.f12762h;
                if (i2 == 0) {
                    return this.f12761g.g();
                }
                if (i2 == 1) {
                    this.f12762h = 2;
                    c(null);
                    return this.f12761g.g();
                }
                if (i2 == 2) {
                    return this.f12761g.g();
                }
                return this.f12761g.g();
            }
            this.f12762h = 2;
            zzala c2 = c(null);
            this.f12761g = c2;
            return c2.g();
        }
    }

    public zzakh(Context context, zzbai zzbaiVar, String str, zzayp<zzajw> zzaypVar, zzayp<zzajw> zzaypVar2) {
        this(context, zzbaiVar, str);
        this.f12759e = zzaypVar;
        this.f12760f = zzaypVar2;
    }
}
