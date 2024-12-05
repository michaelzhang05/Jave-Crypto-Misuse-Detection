package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.u1;

/* compiled from: MainDispatcherFactory.kt */
/* loaded from: classes2.dex */
public interface MainDispatcherFactory {
    u1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
