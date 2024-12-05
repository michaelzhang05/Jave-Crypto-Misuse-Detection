package h4;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import w2.AbstractC4144k;

/* renamed from: h4.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2922c0 {

    /* renamed from: a, reason: collision with root package name */
    private final n3.i f32579a;

    public C2922c0(n3.i errorReporter) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f32579a = errorReporter;
    }

    public final List a(String str) {
        if (str != null && str.length() != 0) {
            Object a8 = C2926e0.f32590a.a(str);
            Throwable e8 = O5.s.e(a8);
            if (e8 != null) {
                i.b.a(this.f32579a, i.f.f35430n, AbstractC4144k.f40356e.b(e8), null, 4, null);
            }
            if (O5.s.e(a8) != null) {
                a8 = AbstractC1378t.m();
            }
            return (List) a8;
        }
        return AbstractC1378t.m();
    }
}
