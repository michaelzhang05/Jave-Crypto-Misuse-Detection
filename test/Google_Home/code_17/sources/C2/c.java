package c2;

/* loaded from: classes4.dex */
public class c extends C2012a {
    public c(String str) {
        super(str);
    }

    public static c d(String str) {
        return e(str.getBytes(m.f15571a));
    }

    public static c e(byte[] bArr) {
        return new c(AbstractC2013b.g(bArr, true));
    }

    public static c f(String str) {
        if (str == null) {
            return null;
        }
        return new c(str);
    }

    @Override // c2.C2012a
    public boolean equals(Object obj) {
        if ((obj instanceof c) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }
}
