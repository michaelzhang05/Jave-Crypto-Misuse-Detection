package com.google.zxing.h.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: X12Encoder.java */
/* loaded from: classes2.dex */
public final class n extends c {
    @Override // com.google.zxing.h.b.c, com.google.zxing.h.b.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c2 = hVar.c();
            hVar.f17051f++;
            c(c2, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f17051f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    @Override // com.google.zxing.h.b.c
    int c(char c2, StringBuilder sb) {
        if (c2 == '\r') {
            sb.append((char) 0);
        } else if (c2 == ' ') {
            sb.append((char) 3);
        } else if (c2 == '*') {
            sb.append((char) 1);
        } else if (c2 == '>') {
            sb.append((char) 2);
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
        } else if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) ((c2 - 'A') + 14));
        } else {
            j.e(c2);
        }
        return 1;
    }

    @Override // com.google.zxing.h.b.c
    public int e() {
        return 3;
    }

    @Override // com.google.zxing.h.b.c
    void f(h hVar, StringBuilder sb) {
        hVar.p();
        int a = hVar.g().a() - hVar.a();
        hVar.f17051f -= sb.length();
        if (hVar.f() > 1 || a > 1 || hVar.f() != a) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
