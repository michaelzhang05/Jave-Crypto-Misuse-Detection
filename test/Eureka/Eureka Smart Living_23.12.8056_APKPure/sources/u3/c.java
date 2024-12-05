package u3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import l3.b;

/* loaded from: classes.dex */
public final class c implements g3.a {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0114b f9431b = b.EnumC0114b.f7403b;

    /* renamed from: a, reason: collision with root package name */
    private final i3.b f9432a;

    public c(byte[] bArr) {
        if (!f9431b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f9432a = new i3.b(bArr, true);
    }

    @Override // g3.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f9432a.b(p.c(12), bArr, bArr2);
    }

    @Override // g3.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f9432a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
