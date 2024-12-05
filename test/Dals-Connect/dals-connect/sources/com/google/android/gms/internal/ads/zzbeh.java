package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzard
/* loaded from: classes2.dex */
public final class zzbeh implements zzjp {
    private InputStream a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13224b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13225c;

    /* renamed from: d, reason: collision with root package name */
    private final zzjp f13226d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<zzbei> f13227e;

    public zzbeh(Context context, zzjp zzjpVar, zzbei zzbeiVar) {
        this.f13225c = context;
        this.f13226d = zzjpVar;
        this.f13227e = new WeakReference<>(zzbeiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long a(zzjq zzjqVar) throws IOException {
        Long l;
        zzjq zzjqVar2 = zzjqVar;
        if (!this.f13224b) {
            this.f13224b = true;
            zzvv z = zzvv.z(zzjqVar2.a);
            if (!((Boolean) zzyt.e().c(zzacu.z3)).booleanValue()) {
                zzvs zzvsVar = null;
                if (z != null) {
                    z.m = zzjqVar2.f15182c;
                    zzvsVar = zzk.zzlm().d(z);
                }
                if (zzvsVar != null && zzvsVar.w()) {
                    this.a = zzvsVar.z();
                    return -1L;
                }
            } else if (z != null) {
                z.m = zzjqVar2.f15182c;
                if (z.l) {
                    l = (Long) zzyt.e().c(zzacu.B3);
                } else {
                    l = (Long) zzyt.e().c(zzacu.A3);
                }
                long longValue = l.longValue();
                long b2 = zzk.zzln().b();
                zzk.zzma();
                Future<InputStream> a = zzwi.a(this.f13225c, z);
                try {
                    try {
                        this.a = a.get(longValue, TimeUnit.MILLISECONDS);
                        long b3 = zzk.zzln().b() - b2;
                        zzbei zzbeiVar = this.f13227e.get();
                        if (zzbeiVar != null) {
                            zzbeiVar.b(true, b3);
                        }
                        StringBuilder sb = new StringBuilder(44);
                        sb.append("Cache connection took ");
                        sb.append(b3);
                        sb.append("ms");
                        zzawz.m(sb.toString());
                        return -1L;
                    } catch (InterruptedException unused) {
                        a.cancel(true);
                        Thread.currentThread().interrupt();
                        long b4 = zzk.zzln().b() - b2;
                        zzbei zzbeiVar2 = this.f13227e.get();
                        if (zzbeiVar2 != null) {
                            zzbeiVar2.b(false, b4);
                        }
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Cache connection took ");
                        sb2.append(b4);
                        sb2.append("ms");
                        zzawz.m(sb2.toString());
                    } catch (ExecutionException | TimeoutException unused2) {
                        a.cancel(true);
                        long b5 = zzk.zzln().b() - b2;
                        zzbei zzbeiVar3 = this.f13227e.get();
                        if (zzbeiVar3 != null) {
                            zzbeiVar3.b(false, b5);
                        }
                        StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Cache connection took ");
                        sb3.append(b5);
                        sb3.append("ms");
                        zzawz.m(sb3.toString());
                    }
                } catch (Throwable th) {
                    long b6 = zzk.zzln().b() - b2;
                    zzbei zzbeiVar4 = this.f13227e.get();
                    if (zzbeiVar4 != null) {
                        zzbeiVar4.b(false, b6);
                    }
                    StringBuilder sb4 = new StringBuilder(44);
                    sb4.append("Cache connection took ");
                    sb4.append(b6);
                    sb4.append("ms");
                    zzawz.m(sb4.toString());
                    throw th;
                }
            }
            if (z != null) {
                zzjqVar2 = new zzjq(Uri.parse(z.f15686f), zzjqVar2.f15181b, zzjqVar2.f15182c, zzjqVar2.f15183d, zzjqVar2.f15184e, zzjqVar2.f15185f);
            }
            return this.f13226d.a(zzjqVar2);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
        if (this.f13224b) {
            this.f13224b = false;
            InputStream inputStream = this.a;
            if (inputStream != null) {
                IOUtils.a(inputStream);
                this.a = null;
                return;
            } else {
                this.f13226d.close();
                return;
            }
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f13224b) {
            InputStream inputStream = this.a;
            if (inputStream != null) {
                return inputStream.read(bArr, i2, i3);
            }
            return this.f13226d.read(bArr, i2, i3);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
