package l6;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class Y0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC3390x0 f34590a;

    public Y0(String str, InterfaceC3390x0 interfaceC3390x0) {
        super(str);
        this.f34590a = interfaceC3390x0;
    }

    public Y0(String str) {
        this(str, null);
    }
}
