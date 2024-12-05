package q3;

import java.security.GeneralSecurityException;
import l3.b;
import p3.g;
import p3.i;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0114b f8988b = b.EnumC0114b.f7403b;

    /* renamed from: a, reason: collision with root package name */
    private final i f8989a;

    public c(i iVar) {
        if (!f8988b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f8989a = iVar;
    }
}
