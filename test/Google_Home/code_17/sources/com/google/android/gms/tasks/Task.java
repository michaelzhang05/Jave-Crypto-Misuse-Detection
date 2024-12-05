package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import q0.InterfaceC3818b;
import q0.InterfaceC3820d;
import q0.InterfaceC3821e;
import q0.InterfaceC3822f;
import q0.InterfaceC3823g;
import q0.InterfaceC3825i;

/* loaded from: classes3.dex */
public abstract class Task {
    public abstract Task a(Executor executor, InterfaceC3820d interfaceC3820d);

    public abstract Task b(Executor executor, InterfaceC3821e interfaceC3821e);

    public abstract Task c(InterfaceC3821e interfaceC3821e);

    public abstract Task d(Executor executor, InterfaceC3822f interfaceC3822f);

    public abstract Task e(Executor executor, InterfaceC3823g interfaceC3823g);

    public abstract Task f(Executor executor, InterfaceC3818b interfaceC3818b);

    public abstract Task g(InterfaceC3818b interfaceC3818b);

    public abstract Task h(Executor executor, InterfaceC3818b interfaceC3818b);

    public abstract Exception i();

    public abstract Object j();

    public abstract Object k(Class cls);

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract Task o(Executor executor, InterfaceC3825i interfaceC3825i);

    public abstract Task p(InterfaceC3825i interfaceC3825i);
}
