package q3;

import java.security.GeneralSecurityException;
import l3.b;
import p3.g;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0114b f8986b = b.EnumC0114b.f7402a;

    /* renamed from: a, reason: collision with root package name */
    private final p3.a f8987a;

    public b(p3.a aVar) {
        if (!f8986b.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f8987a = aVar;
    }
}
