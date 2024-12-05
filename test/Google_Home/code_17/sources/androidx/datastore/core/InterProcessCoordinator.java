package androidx.datastore.core;

import S5.d;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public interface InterProcessCoordinator {
    InterfaceC3706f getUpdateNotifications();

    Object getVersion(d dVar);

    Object incrementAndGetVersion(d dVar);

    <T> Object lock(Function1 function1, d dVar);

    <T> Object tryLock(InterfaceC1668n interfaceC1668n, d dVar);
}
