package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o0;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a implements o0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0088a implements o0.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static i1 h(o0 o0Var) {
            return new i1(o0Var);
        }
    }

    private String i(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public byte[] a() {
        try {
            byte[] bArr = new byte[c()];
            k U = k.U(bArr);
            b(U);
            U.c();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(i("byte array"), e6);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public h f() {
        try {
            h.C0089h s5 = h.s(c());
            b(s5.b());
            return s5.a();
        } catch (IOException e6) {
            throw new RuntimeException(i("ByteString"), e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(d1 d1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1 j() {
        return new i1(this);
    }
}
