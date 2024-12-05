package f4;

import L5.s;
import L5.t;
import P5.d;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2670c implements InterfaceC2669b {

    /* renamed from: b, reason: collision with root package name */
    private final i f31114b;

    public C2670c(i errorReporter) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f31114b = errorReporter;
    }

    @Override // f4.InterfaceC2669b
    public Object a(String str, d dVar) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        i.b.a(this.f31114b, i.f.f33434j, null, null, 6, null);
        s.a aVar = s.f6511b;
        return s.b(t.a(illegalStateException));
    }

    @Override // f4.InterfaceC2669b
    public Object b(String str, String str2, int i8, d dVar) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        i.b.a(this.f31114b, i.f.f33433i, null, null, 6, null);
        s.a aVar = s.f6511b;
        return s.b(t.a(illegalStateException));
    }
}
