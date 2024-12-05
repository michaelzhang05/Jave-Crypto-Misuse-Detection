package B5;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f934a;

    /* renamed from: b, reason: collision with root package name */
    public String f935b;

    /* renamed from: c, reason: collision with root package name */
    public String f936c;

    public f(int i8, String provider_name, String policy_url, String domains) {
        AbstractC3255y.i(provider_name, "provider_name");
        AbstractC3255y.i(policy_url, "policy_url");
        AbstractC3255y.i(domains, "domains");
        this.f934a = i8;
        this.f935b = provider_name;
        this.f936c = policy_url;
    }

    public final E6.l a() {
        return new E6.l(this.f934a, this.f935b, null, null, null, null, null, null, null, this.f936c, null, null, 0, false, false, null, null, null, null, null, 914940);
    }
}
