package e4;

import M5.AbstractC1246t;
import java.util.List;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* renamed from: e4.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2602c0 {

    /* renamed from: a, reason: collision with root package name */
    private final k3.i f30658a;

    public C2602c0(k3.i errorReporter) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f30658a = errorReporter;
    }

    public final List a(String str) {
        if (str != null && str.length() != 0) {
            Object a8 = C2606e0.f30669a.a(str);
            Throwable e8 = L5.s.e(a8);
            if (e8 != null) {
                i.b.a(this.f30658a, i.f.f33438n, AbstractC3790k.f38229e.b(e8), null, 4, null);
            }
            if (L5.s.e(a8) != null) {
                a8 = AbstractC1246t.m();
            }
            return (List) a8;
        }
        return AbstractC1246t.m();
    }
}
