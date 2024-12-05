package c4;

import j$.util.Objects;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2045c f15728a = new C2045c();

    private C2045c() {
    }

    public static final boolean a(Object obj, Object obj2) {
        return AbstractC3255y.d(obj, obj2);
    }

    public static final int b(Object... values) {
        AbstractC3255y.i(values, "values");
        return Objects.hash(Arrays.copyOf(values, values.length));
    }
}
