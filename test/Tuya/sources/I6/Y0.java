package i6;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class Y0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC2855x0 f31738a;

    public Y0(String str, InterfaceC2855x0 interfaceC2855x0) {
        super(str);
        this.f31738a = interfaceC2855x0;
    }

    public Y0(String str) {
        this(str, null);
    }
}
