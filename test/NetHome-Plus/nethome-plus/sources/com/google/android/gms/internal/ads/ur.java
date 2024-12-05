package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class ur implements zzdka {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12233b;

    /* renamed from: c, reason: collision with root package name */
    private zzdet f12234c;

    /* renamed from: d, reason: collision with root package name */
    private zzddr f12235d;

    /* renamed from: e, reason: collision with root package name */
    private int f12236e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ur(zzdgw zzdgwVar) throws GeneralSecurityException {
        String x = zzdgwVar.x();
        this.a = x;
        if (x.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzdev y = zzdev.y(zzdgwVar.y());
                this.f12234c = (zzdet) zzdcf.n(zzdgwVar);
                this.f12233b = y.x();
                return;
            } catch (zzdok e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        }
        if (x.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzddt B = zzddt.B(zzdgwVar.y());
                this.f12235d = (zzddr) zzdcf.n(zzdgwVar);
                this.f12236e = B.x().x();
                this.f12233b = this.f12236e + B.y().x();
                return;
            } catch (zzdok e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
        String valueOf = String.valueOf(x);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
    }

    @Override // com.google.android.gms.internal.ads.zzdka
    public final zzdbj a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == this.f12233b) {
            if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                return (zzdbj) zzdcf.h(this.a, (zzdet) ((zzdob) zzdet.E().j(this.f12234c).u(zzdmr.T(bArr, 0, this.f12233b)).J()), zzdbj.class);
            }
            if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f12236e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f12236e, this.f12233b);
                zzdeb zzdebVar = (zzdeb) ((zzdob) zzdeb.G().j(this.f12235d.F()).u(zzdmr.V(copyOfRange)).J());
                return (zzdbj) zzdcf.h(this.a, (zzddr) ((zzdob) zzddr.H().x(this.f12235d.x()).u(zzdebVar).v((zzdgl) ((zzdob) zzdgl.F().j(this.f12235d.G()).u(zzdmr.V(copyOfRange2)).J())).J()), zzdbj.class);
            }
            throw new GeneralSecurityException("unknown DEM key type");
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.google.android.gms.internal.ads.zzdka
    public final int b() {
        return this.f12233b;
    }
}
