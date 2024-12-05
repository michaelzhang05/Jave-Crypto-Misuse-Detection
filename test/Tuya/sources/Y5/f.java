package y5;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f39890a;

    /* renamed from: b, reason: collision with root package name */
    public String f39891b;

    /* renamed from: c, reason: collision with root package name */
    public String f39892c;

    public f(int i8, String provider_name, String policy_url, String domains) {
        AbstractC3159y.i(provider_name, "provider_name");
        AbstractC3159y.i(policy_url, "policy_url");
        AbstractC3159y.i(domains, "domains");
        this.f39890a = i8;
        this.f39891b = provider_name;
        this.f39892c = policy_url;
    }

    public final B6.l a() {
        return new B6.l(this.f39890a, this.f39891b, null, null, null, null, null, null, null, this.f39892c, null, null, 0, false, false, null, null, null, null, null, 914940);
    }
}
