package T1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Provider f9969a;

    /* renamed from: b, reason: collision with root package name */
    private SecureRandom f9970b;

    public b() {
        this(null, null);
    }

    public Provider a() {
        return this.f9969a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f9970b;
        if (secureRandom == null) {
            return new SecureRandom();
        }
        return secureRandom;
    }

    public void c(Provider provider) {
        this.f9969a = provider;
    }

    public b(Provider provider, SecureRandom secureRandom) {
        this.f9969a = provider;
        this.f9970b = secureRandom;
    }
}
