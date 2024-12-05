package Q1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Provider f8172a;

    /* renamed from: b, reason: collision with root package name */
    private SecureRandom f8173b;

    public b() {
        this(null, null);
    }

    public Provider a() {
        return this.f8172a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f8173b;
        if (secureRandom == null) {
            return new SecureRandom();
        }
        return secureRandom;
    }

    public void c(Provider provider) {
        this.f8172a = provider;
    }

    public b(Provider provider, SecureRandom secureRandom) {
        this.f8172a = provider;
        this.f8173b = secureRandom;
    }
}
