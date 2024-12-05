package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzard
/* loaded from: classes2.dex */
public final class zzbex implements zzrv {
    private InputStream a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13232b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13233c;

    /* renamed from: d, reason: collision with root package name */
    private final zzrv f13234d;

    /* renamed from: e, reason: collision with root package name */
    private final zzsj<zzrv> f13235e;

    /* renamed from: f, reason: collision with root package name */
    private final zzbey f13236f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f13237g;

    public zzbex(Context context, zzrv zzrvVar, zzsj<zzrv> zzsjVar, zzbey zzbeyVar) {
        this.f13233c = context;
        this.f13234d = zzrvVar;
        this.f13235e = zzsjVar;
        this.f13236f = zzbeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final long a(zzry zzryVar) throws IOException {
        Long l;
        zzry zzryVar2 = zzryVar;
        if (!this.f13232b) {
            this.f13232b = true;
            this.f13237g = zzryVar2.a;
            zzsj<zzrv> zzsjVar = this.f13235e;
            if (zzsjVar != null) {
                zzsjVar.n(this, zzryVar2);
            }
            zzvv z = zzvv.z(zzryVar2.a);
            if (!((Boolean) zzyt.e().c(zzacu.z3)).booleanValue()) {
                zzvs zzvsVar = null;
                if (z != null) {
                    z.m = zzryVar2.f15509d;
                    zzvsVar = zzk.zzlm().d(z);
                }
                if (zzvsVar != null && zzvsVar.w()) {
                    this.a = zzvsVar.z();
                    return -1L;
                }
            } else if (z != null) {
                z.m = zzryVar2.f15509d;
                if (z.l) {
                    l = (Long) zzyt.e().c(zzacu.B3);
                } else {
                    l = (Long) zzyt.e().c(zzacu.A3);
                }
                long longValue = l.longValue();
                long b2 = zzk.zzln().b();
                zzk.zzma();
                Future<InputStream> a = zzwi.a(this.f13233c, z);
                try {
                    try {
                        this.a = a.get(longValue, TimeUnit.MILLISECONDS);
                        long b3 = zzk.zzln().b() - b2;
                        this.f13236f.b(true, b3);
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
                        this.f13236f.b(false, b4);
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Cache connection took ");
                        sb2.append(b4);
                        sb2.append("ms");
                        zzawz.m(sb2.toString());
                    } catch (ExecutionException | TimeoutException unused2) {
                        a.cancel(true);
                        long b5 = zzk.zzln().b() - b2;
                        this.f13236f.b(false, b5);
                        StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Cache connection took ");
                        sb3.append(b5);
                        sb3.append("ms");
                        zzawz.m(sb3.toString());
                    }
                } catch (Throwable th) {
                    long b6 = zzk.zzln().b() - b2;
                    this.f13236f.b(false, b6);
                    StringBuilder sb4 = new StringBuilder(44);
                    sb4.append("Cache connection took ");
                    sb4.append(b6);
                    sb4.append("ms");
                    zzawz.m(sb4.toString());
                    throw th;
                }
            }
            if (z != null) {
                zzryVar2 = new zzry(Uri.parse(z.f15686f), zzryVar2.f15507b, zzryVar2.f15508c, zzryVar2.f15509d, zzryVar2.f15510e, zzryVar2.f15511f, zzryVar2.f15512g);
            }
            return this.f13234d.a(zzryVar2);
        }
        throw new IOException("Attempt to open an already open CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void close() throws IOException {
        if (this.f13232b) {
            this.f13232b = false;
            this.f13237g = null;
            InputStream inputStream = this.a;
            if (inputStream != null) {
                IOUtils.a(inputStream);
                this.a = null;
            } else {
                this.f13234d.close();
            }
            zzsj<zzrv> zzsjVar = this.f13235e;
            if (zzsjVar != null) {
                zzsjVar.d(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final Uri n0() {
        return this.f13237g;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int read;
        if (this.f13232b) {
            InputStream inputStream = this.a;
            if (inputStream != null) {
                read = inputStream.read(bArr, i2, i3);
            } else {
                read = this.f13234d.read(bArr, i2, i3);
            }
            zzsj<zzrv> zzsjVar = this.f13235e;
            if (zzsjVar != null) {
                zzsjVar.o(this, read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
