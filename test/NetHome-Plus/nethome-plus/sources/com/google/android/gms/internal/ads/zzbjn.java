package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class zzbjn {
    private final zzbai a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13313b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f13314c;

    /* loaded from: classes2.dex */
    public static class zza {
        private zzbai a;

        /* renamed from: b, reason: collision with root package name */
        private Context f13315b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<Context> f13316c;

        public final zza b(zzbai zzbaiVar) {
            this.a = zzbaiVar;
            return this;
        }

        public final zza d(Context context) {
            this.f13316c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f13315b = context;
            return this;
        }
    }

    private zzbjn(zza zzaVar) {
        this.a = zzaVar.a;
        this.f13313b = zzaVar.f13315b;
        this.f13314c = zzaVar.f13316c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.f13313b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context b() {
        if (this.f13314c.get() != null) {
            return this.f13314c.get();
        }
        return this.f13313b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbai c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return zzk.zzlg().g0(this.f13313b, this.a.f13150f);
    }
}
