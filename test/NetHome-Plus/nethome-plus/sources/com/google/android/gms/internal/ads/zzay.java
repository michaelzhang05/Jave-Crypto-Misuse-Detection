package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzay implements zzba {
    private static Logger a = Logger.getLogger(zzay.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private ThreadLocal<ByteBuffer> f13086b = new z5(this);

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbd a(zzdsw zzdswVar, zzbe zzbeVar) throws IOException {
        int read;
        long size;
        long H = zzdswVar.H();
        this.f13086b.get().rewind().limit(8);
        do {
            read = zzdswVar.read(this.f13086b.get());
            if (read == 8) {
                this.f13086b.get().rewind();
                long b2 = zzbc.b(this.f13086b.get());
                byte[] bArr = null;
                if (b2 < 8 && b2 > 1) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(b2);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                String g2 = zzbc.g(this.f13086b.get());
                if (b2 == 1) {
                    this.f13086b.get().limit(16);
                    zzdswVar.read(this.f13086b.get());
                    this.f13086b.get().position(8);
                    size = zzbc.d(this.f13086b.get()) - 16;
                } else {
                    size = b2 == 0 ? zzdswVar.size() - zzdswVar.H() : b2 - 8;
                }
                if ("uuid".equals(g2)) {
                    this.f13086b.get().limit(this.f13086b.get().limit() + 16);
                    zzdswVar.read(this.f13086b.get());
                    bArr = new byte[16];
                    for (int position = this.f13086b.get().position() - 16; position < this.f13086b.get().position(); position++) {
                        bArr[position - (this.f13086b.get().position() - 16)] = this.f13086b.get().get(position);
                    }
                    size -= 16;
                }
                long j2 = size;
                zzbd b3 = b(g2, bArr, zzbeVar instanceof zzbd ? ((zzbd) zzbeVar).getType() : HttpUrl.FRAGMENT_ENCODE_SET);
                b3.f(zzbeVar);
                this.f13086b.get().rewind();
                b3.a(zzdswVar, this.f13086b.get(), j2, this);
                return b3;
            }
        } while (read >= 0);
        zzdswVar.j0(H);
        throw new EOFException();
    }

    public abstract zzbd b(String str, byte[] bArr, String str2);
}
