package C6;

import O5.C1352h;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class Q extends AbstractC1030a {

    /* renamed from: e, reason: collision with root package name */
    private final String f1654e;

    public Q(String source) {
        AbstractC3255y.i(source, "source");
        this.f1654e = source;
    }

    @Override // C6.AbstractC1030a
    public String E(String keyToMatch, boolean z8) {
        AbstractC3255y.i(keyToMatch, "keyToMatch");
        int i8 = this.f1665a;
        try {
            if (j() == 6 && AbstractC3255y.d(G(z8), keyToMatch)) {
                t();
                if (j() == 5) {
                    return G(z8);
                }
            }
            return null;
        } finally {
            this.f1665a = i8;
            t();
        }
    }

    @Override // C6.AbstractC1030a
    public int H(int i8) {
        if (i8 >= C().length()) {
            return -1;
        }
        return i8;
    }

    @Override // C6.AbstractC1030a
    public int J() {
        char charAt;
        int i8 = this.f1665a;
        if (i8 == -1) {
            return i8;
        }
        while (i8 < C().length() && ((charAt = C().charAt(i8)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i8++;
        }
        this.f1665a = i8;
        return i8;
    }

    @Override // C6.AbstractC1030a
    public boolean M() {
        int J8 = J();
        if (J8 == C().length() || J8 == -1 || C().charAt(J8) != ',') {
            return false;
        }
        this.f1665a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1030a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f1654e;
    }

    @Override // C6.AbstractC1030a
    public boolean e() {
        int i8 = this.f1665a;
        if (i8 == -1) {
            return false;
        }
        while (i8 < C().length()) {
            char charAt = C().charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f1665a = i8;
                return D(charAt);
            }
            i8++;
        }
        this.f1665a = i8;
        return false;
    }

    @Override // C6.AbstractC1030a
    public String i() {
        l('\"');
        int i8 = this.f1665a;
        int R8 = j6.n.R(C(), '\"', i8, false, 4, null);
        if (R8 != -1) {
            for (int i9 = i8; i9 < R8; i9++) {
                if (C().charAt(i9) == '\\') {
                    return p(C(), this.f1665a, i9);
                }
            }
            this.f1665a = R8 + 1;
            String substring = C().substring(i8, R8);
            AbstractC3255y.h(substring, "substring(...)");
            return substring;
        }
        q();
        y((byte) 1, false);
        throw new C1352h();
    }

    @Override // C6.AbstractC1030a
    public byte j() {
        byte a8;
        String C8 = C();
        do {
            int i8 = this.f1665a;
            if (i8 != -1 && i8 < C8.length()) {
                int i9 = this.f1665a;
                this.f1665a = i9 + 1;
                a8 = AbstractC1031b.a(C8.charAt(i9));
            } else {
                return (byte) 10;
            }
        } while (a8 == 3);
        return a8;
    }

    @Override // C6.AbstractC1030a
    public void l(char c8) {
        if (this.f1665a == -1) {
            P(c8);
        }
        String C8 = C();
        while (this.f1665a < C8.length()) {
            int i8 = this.f1665a;
            this.f1665a = i8 + 1;
            char charAt = C8.charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c8) {
                    return;
                } else {
                    P(c8);
                }
            }
        }
        this.f1665a = -1;
        P(c8);
    }
}
