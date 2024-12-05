package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@zzard
/* loaded from: classes2.dex */
public final class zzaii implements zzm {
    private volatile zzahz a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12738b;

    public zzaii(Context context) {
        this.f12738b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.a == null) {
            return;
        }
        this.a.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzm
    public final zzp a(zzr<?> zzrVar) throws zzaf {
        zzaia w = zzaia.w(zzrVar);
        long b2 = zzk.zzln().b();
        try {
            zzbbr zzbbrVar = new zzbbr();
            this.a = new zzahz(this.f12738b, zzk.zzlu().b(), new s0(this, zzbbrVar), new t0(this, zzbbrVar));
            this.a.checkAvailabilityAndConnect();
            p0 p0Var = new p0(this, w);
            zzbbl zzbblVar = zzaxg.a;
            zzbbh b3 = zzbar.b(zzbar.c(zzbbrVar, p0Var, zzbblVar), ((Integer) zzyt.e().c(zzacu.E3)).intValue(), TimeUnit.MILLISECONDS, zzaxg.f13078c);
            b3.f(new r0(this), zzbblVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) b3.get();
            long b4 = zzk.zzln().b() - b2;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b4);
            sb.append("ms");
            zzawz.m(sb.toString());
            zzaic zzaicVar = (zzaic) new zzaru(parcelFileDescriptor).w(zzaic.CREATOR);
            if (zzaicVar == null) {
                return null;
            }
            if (!zzaicVar.f12732f) {
                if (zzaicVar.f12736j.length != zzaicVar.f12737k.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                int i2 = 0;
                while (true) {
                    String[] strArr = zzaicVar.f12736j;
                    if (i2 < strArr.length) {
                        hashMap.put(strArr[i2], zzaicVar.f12737k[i2]);
                        i2++;
                    } else {
                        return new zzp(zzaicVar.f12734h, zzaicVar.f12735i, hashMap, zzaicVar.l, zzaicVar.m);
                    }
                }
            } else {
                throw new zzaf(zzaicVar.f12733g);
            }
        } catch (InterruptedException | ExecutionException unused) {
            long b5 = zzk.zzln().b() - b2;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(b5);
            sb2.append("ms");
            zzawz.m(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b6 = zzk.zzln().b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b6);
            sb3.append("ms");
            zzawz.m(sb3.toString());
            throw th;
        }
    }
}
