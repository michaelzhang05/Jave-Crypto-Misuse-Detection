package z6;

import L5.C1224h;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class Q extends AbstractC4041a {

    /* renamed from: e, reason: collision with root package name */
    private final String f40536e;

    public Q(String source) {
        AbstractC3159y.i(source, "source");
        this.f40536e = source;
    }

    @Override // z6.AbstractC4041a
    public String E(String keyToMatch, boolean z8) {
        AbstractC3159y.i(keyToMatch, "keyToMatch");
        int i8 = this.f40547a;
        try {
            if (j() == 6 && AbstractC3159y.d(G(z8), keyToMatch)) {
                t();
                if (j() == 5) {
                    return G(z8);
                }
            }
            return null;
        } finally {
            this.f40547a = i8;
            t();
        }
    }

    @Override // z6.AbstractC4041a
    public int H(int i8) {
        if (i8 >= C().length()) {
            return -1;
        }
        return i8;
    }

    @Override // z6.AbstractC4041a
    public int J() {
        char charAt;
        int i8 = this.f40547a;
        if (i8 == -1) {
            return i8;
        }
        while (i8 < C().length() && ((charAt = C().charAt(i8)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i8++;
        }
        this.f40547a = i8;
        return i8;
    }

    @Override // z6.AbstractC4041a
    public boolean M() {
        int J8 = J();
        if (J8 == C().length() || J8 == -1 || C().charAt(J8) != ',') {
            return false;
        }
        this.f40547a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z6.AbstractC4041a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f40536e;
    }

    @Override // z6.AbstractC4041a
    public boolean e() {
        int i8 = this.f40547a;
        if (i8 == -1) {
            return false;
        }
        while (i8 < C().length()) {
            char charAt = C().charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f40547a = i8;
                return D(charAt);
            }
            i8++;
        }
        this.f40547a = i8;
        return false;
    }

    @Override // z6.AbstractC4041a
    public String i() {
        l('\"');
        int i8 = this.f40547a;
        int R8 = g6.n.R(C(), '\"', i8, false, 4, null);
        if (R8 != -1) {
            for (int i9 = i8; i9 < R8; i9++) {
                if (C().charAt(i9) == '\\') {
                    return p(C(), this.f40547a, i9);
                }
            }
            this.f40547a = R8 + 1;
            String substring = C().substring(i8, R8);
            AbstractC3159y.h(substring, "substring(...)");
            return substring;
        }
        q();
        y((byte) 1, false);
        throw new C1224h();
    }

    @Override // z6.AbstractC4041a
    public byte j() {
        byte a8;
        String C8 = C();
        do {
            int i8 = this.f40547a;
            if (i8 != -1 && i8 < C8.length()) {
                int i9 = this.f40547a;
                this.f40547a = i9 + 1;
                a8 = AbstractC4042b.a(C8.charAt(i9));
            } else {
                return (byte) 10;
            }
        } while (a8 == 3);
        return a8;
    }

    @Override // z6.AbstractC4041a
    public void l(char c8) {
        if (this.f40547a == -1) {
            P(c8);
        }
        String C8 = C();
        while (this.f40547a < C8.length()) {
            int i8 = this.f40547a;
            this.f40547a = i8 + 1;
            char charAt = C8.charAt(i8);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c8) {
                    return;
                } else {
                    P(c8);
                }
            }
        }
        this.f40547a = -1;
        P(c8);
    }
}
