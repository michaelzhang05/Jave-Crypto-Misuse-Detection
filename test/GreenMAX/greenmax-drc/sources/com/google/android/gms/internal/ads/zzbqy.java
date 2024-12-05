package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class zzbqy {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcxv f13529b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13530c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f13531d;

    /* loaded from: classes2.dex */
    public static class zza {
        private Context a;

        /* renamed from: b, reason: collision with root package name */
        private zzcxv f13532b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f13533c;

        /* renamed from: d, reason: collision with root package name */
        private String f13534d;

        public final zza b(zzcxv zzcxvVar) {
            this.f13532b = zzcxvVar;
            return this;
        }

        public final zzbqy c() {
            return new zzbqy(this);
        }

        public final zza e(Context context) {
            this.a = context;
            return this;
        }

        public final zza h(Bundle bundle) {
            this.f13533c = bundle;
            return this;
        }

        public final zza i(String str) {
            this.f13534d = str;
            return this;
        }
    }

    private zzbqy(zza zzaVar) {
        this.a = zzaVar.a;
        this.f13529b = zzaVar.f13532b;
        this.f13531d = zzaVar.f13533c;
        this.f13530c = zzaVar.f13534d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zza a() {
        return new zza().e(this.a).b(this.f13529b).i(this.f13530c).h(this.f13531d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcxv b() {
        return this.f13529b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle c() {
        return this.f13531d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.f13530c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context e(Context context) {
        return this.f13530c != null ? context : this.a;
    }
}
