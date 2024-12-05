package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdpk;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzdbt<P, KeyProto extends zzdpk, KeyFormatProto extends zzdpk> implements zzdbs<P> {
    private final Class<P> a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<KeyProto> f14680b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<KeyFormatProto> f14681c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14682d;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdbt(Class<P> cls, Class<KeyProto> cls2, Class<KeyFormatProto> cls3, String str) {
        this.a = cls;
        this.f14680b = cls2;
        this.f14681c = cls3;
        this.f14682d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <Casted> Casted h(Object obj, String str, Class<Casted> cls) throws GeneralSecurityException {
        if (cls.isInstance(obj)) {
            return obj;
        }
        throw new GeneralSecurityException(str);
    }

    private final P m(KeyProto keyproto) throws GeneralSecurityException {
        j(keyproto);
        return l(keyproto);
    }

    private final KeyProto o(KeyFormatProto keyformatproto) throws GeneralSecurityException {
        k(keyformatproto);
        KeyProto n = n(keyformatproto);
        j(n);
        return n;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final Class<P> a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final String b() {
        return this.f14682d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdbs
    public final zzdpk c(zzdpk zzdpkVar) throws GeneralSecurityException {
        String name = this.f14681c.getName();
        return o((zzdpk) h(zzdpkVar, name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type "), this.f14681c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdbs
    public final P d(zzdpk zzdpkVar) throws GeneralSecurityException {
        String name = this.f14680b.getName();
        return (P) m((zzdpk) h(zzdpkVar, name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type "), this.f14680b));
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final zzdgr e(zzdmr zzdmrVar) throws GeneralSecurityException {
        try {
            return (zzdgr) ((zzdob) zzdgr.F().x(this.f14682d).v(o(q(zzdmrVar)).d()).u(i()).J());
        } catch (zzdok e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final zzdpk f(zzdmr zzdmrVar) throws GeneralSecurityException {
        try {
            return o(q(zzdmrVar));
        } catch (zzdok e2) {
            String name = this.f14681c.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final P g(zzdmr zzdmrVar) throws GeneralSecurityException {
        try {
            return m(p(zzdmrVar));
        } catch (zzdok e2) {
            String name = this.f14680b.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    protected abstract zzdgr.zzb i();

    protected abstract void j(KeyProto keyproto) throws GeneralSecurityException;

    protected abstract void k(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    protected abstract P l(KeyProto keyproto) throws GeneralSecurityException;

    protected abstract KeyProto n(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    protected abstract KeyProto p(zzdmr zzdmrVar) throws zzdok;

    protected abstract KeyFormatProto q(zzdmr zzdmrVar) throws zzdok;
}
