package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import r0.InterfaceC3671b;
import r0.InterfaceC3673d;
import r0.InterfaceC3674e;
import r0.InterfaceC3675f;
import r0.InterfaceC3676g;
import r0.InterfaceC3678i;

/* loaded from: classes3.dex */
public abstract class Task {
    public abstract Task a(Executor executor, InterfaceC3673d interfaceC3673d);

    public abstract Task b(Executor executor, InterfaceC3674e interfaceC3674e);

    public abstract Task c(InterfaceC3674e interfaceC3674e);

    public abstract Task d(Executor executor, InterfaceC3675f interfaceC3675f);

    public abstract Task e(Executor executor, InterfaceC3676g interfaceC3676g);

    public abstract Task f(Executor executor, InterfaceC3671b interfaceC3671b);

    public abstract Task g(InterfaceC3671b interfaceC3671b);

    public abstract Task h(Executor executor, InterfaceC3671b interfaceC3671b);

    public abstract Exception i();

    public abstract Object j();

    public abstract Object k(Class cls);

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract Task o(Executor executor, InterfaceC3678i interfaceC3678i);

    public abstract Task p(InterfaceC3678i interfaceC3678i);
}
