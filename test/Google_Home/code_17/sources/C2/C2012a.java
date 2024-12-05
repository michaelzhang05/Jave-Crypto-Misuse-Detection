package c2;

import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2012a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f15569a;

    public C2012a(String str) {
        if (str != null) {
            this.f15569a = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    public byte[] a() {
        return AbstractC2013b.c(this.f15569a);
    }

    public BigInteger b() {
        return new BigInteger(1, a());
    }

    public String c() {
        return new String(a(), m.f15571a);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C2012a) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f15569a.hashCode();
    }

    public String toString() {
        return this.f15569a;
    }
}
