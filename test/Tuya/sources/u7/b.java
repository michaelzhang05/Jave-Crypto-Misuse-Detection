package u7;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import l7.AbstractC3374g;
import s7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3374g f38578a;

    public b(X6.b bVar) {
        a(bVar);
    }

    private void a(X6.b bVar) {
        this.f38578a = (AbstractC3374g) s7.c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            try {
                return E7.a.a(this.f38578a.getEncoded(), ((b) obj).f38578a.getEncoded());
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
            return d.a(this.f38578a).getEncoded();
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
            return E7.a.k(this.f38578a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
