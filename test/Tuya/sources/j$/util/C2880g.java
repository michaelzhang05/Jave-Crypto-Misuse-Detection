package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2880g extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new RuntimeException("Unsupported " + str + " :" + serializable);
    }
}
