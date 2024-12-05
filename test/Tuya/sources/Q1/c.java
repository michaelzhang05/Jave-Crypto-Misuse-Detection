package Q1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private Provider f8174c;

    /* renamed from: d, reason: collision with root package name */
    private Provider f8175d;

    /* renamed from: e, reason: collision with root package name */
    private Provider f8176e;

    public c() {
        this(null, null, null, null, null);
    }

    public Provider d() {
        Provider provider = this.f8175d;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider e() {
        Provider provider = this.f8174c;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider f() {
        Provider provider = this.f8176e;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f8174c = provider2;
        this.f8175d = provider3;
        this.f8176e = provider4;
    }
}
