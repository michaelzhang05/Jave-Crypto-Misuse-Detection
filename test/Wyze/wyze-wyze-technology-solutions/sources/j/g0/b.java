package j.g0;

import j.f;
import j.i;
import kotlin.jvm.internal.l;

/* compiled from: ByteString.kt */
/* loaded from: classes2.dex */
public final class b {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0068, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g0.b.c(byte[], int):int");
    }

    public static final void d(i iVar, f fVar, int i2, int i3) {
        l.f(iVar, "$this$commonWrite");
        l.f(fVar, "buffer");
        fVar.write(iVar.B(), i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    public static final char[] f() {
        return a;
    }
}
