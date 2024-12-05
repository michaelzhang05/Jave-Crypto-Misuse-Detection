package kotlin.reflect.x.internal.l0.f;

import kotlin.jvm.internal.l;
import kotlin.text.Regex;

/* compiled from: NameUtils.kt */
/* loaded from: classes2.dex */
public final class g {
    public static final g a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Regex f20724b = new Regex("[^\\p{L}\\p{Digit}]");

    private g() {
    }

    public static final String a(String str) {
        l.f(str, "name");
        return f20724b.c(str, "_");
    }
}
