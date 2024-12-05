package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClientSupervisor {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f10859f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static GmsClientSupervisor f10860g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static final class zza {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10861b;

        /* renamed from: c, reason: collision with root package name */
        private final ComponentName f10862c = null;

        /* renamed from: d, reason: collision with root package name */
        private final int f10863d;

        public zza(String str, String str2, int i2) {
            this.a = Preconditions.g(str);
            this.f10861b = Preconditions.g(str2);
            this.f10863d = i2;
        }

        public final ComponentName a() {
            return this.f10862c;
        }

        public final String b() {
            return this.f10861b;
        }

        public final Intent c(Context context) {
            if (this.a != null) {
                return new Intent(this.a).setPackage(this.f10861b);
            }
            return new Intent().setComponent(this.f10862c);
        }

        public final int d() {
            return this.f10863d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return Objects.a(this.a, zzaVar.a) && Objects.a(this.f10861b, zzaVar.f10861b) && Objects.a(this.f10862c, zzaVar.f10862c) && this.f10863d == zzaVar.f10863d;
        }

        public final int hashCode() {
            return Objects.b(this.a, this.f10861b, this.f10862c, Integer.valueOf(this.f10863d));
        }

        public final String toString() {
            String str = this.a;
            return str == null ? this.f10862c.flattenToString() : str;
        }
    }

    @KeepForSdk
    public static GmsClientSupervisor a(Context context) {
        synchronized (f10859f) {
            if (f10860g == null) {
                f10860g = new j(context.getApplicationContext());
            }
        }
        return f10860g;
    }

    public final void b(String str, String str2, int i2, ServiceConnection serviceConnection, String str3) {
        d(new zza(str, str2, i2), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(zza zzaVar, ServiceConnection serviceConnection, String str);

    protected abstract void d(zza zzaVar, ServiceConnection serviceConnection, String str);
}
