package x7;

import a7.C1678b;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import o7.AbstractC3723g;
import v7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3723g f40762a;

    public b(C1678b c1678b) {
        a(c1678b);
    }

    private void a(C1678b c1678b) {
        this.f40762a = (AbstractC3723g) v7.c.a(c1678b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            try {
                return H7.a.a(this.f40762a.getEncoded(), ((b) obj).f40762a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f40762a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return H7.a.k(this.f40762a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
