package T1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private Provider f9971c;

    /* renamed from: d, reason: collision with root package name */
    private Provider f9972d;

    /* renamed from: e, reason: collision with root package name */
    private Provider f9973e;

    public c() {
        this(null, null, null, null, null);
    }

    public Provider d() {
        Provider provider = this.f9972d;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider e() {
        Provider provider = this.f9971c;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider f() {
        Provider provider = this.f9973e;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f9971c = provider2;
        this.f9972d = provider3;
        this.f9973e = provider4;
    }
}
