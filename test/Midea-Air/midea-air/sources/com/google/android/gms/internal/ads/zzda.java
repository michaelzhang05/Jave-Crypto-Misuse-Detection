package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzbi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public class zzda {
    private static final ConditionVariable a = new ConditionVariable();

    /* renamed from: b, reason: collision with root package name */
    protected static volatile zzwo f14639b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile Random f14640c = null;

    /* renamed from: d, reason: collision with root package name */
    private zzdy f14641d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile Boolean f14642e;

    public zzda(zzdy zzdyVar) {
        this.f14641d = zzdyVar;
        zzdyVar.r().execute(new ar(this));
    }

    public static int d() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return e().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    private static Random e() {
        if (f14640c == null) {
            synchronized (zzda.class) {
                if (f14640c == null) {
                    f14640c = new Random();
                }
            }
        }
        return f14640c;
    }

    public final void b(int i2, int i3, long j2) {
        c(i2, i3, j2, null);
    }

    public final void c(int i2, int i3, long j2, Exception exc) {
        try {
            a.block();
            if (!this.f14642e.booleanValue() || f14639b == null) {
                return;
            }
            zzbi.zza.C0171zza u = zzbi.zza.G().v(this.f14641d.f15005b.getPackageName()).u(j2);
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzdmb.a(exc, new PrintWriter(stringWriter));
                u.x(stringWriter.toString()).y(exc.getClass().getName());
            }
            zzws a2 = f14639b.a(((zzbi.zza) ((zzdob) u.J())).g());
            a2.b(i2);
            if (i3 != -1) {
                a2.a(i3);
            }
            a2.c();
        } catch (Exception unused) {
        }
    }
}
