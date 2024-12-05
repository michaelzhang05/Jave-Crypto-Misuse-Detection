package androidx.datastore.core;

import P5.d;
import X5.n;
import kotlin.jvm.functions.Function1;
import l6.InterfaceC3358f;

/* loaded from: classes3.dex */
public interface InterProcessCoordinator {
    InterfaceC3358f getUpdateNotifications();

    Object getVersion(d dVar);

    Object incrementAndGetVersion(d dVar);

    <T> Object lock(Function1 function1, d dVar);

    <T> Object tryLock(n nVar, d dVar);
}
