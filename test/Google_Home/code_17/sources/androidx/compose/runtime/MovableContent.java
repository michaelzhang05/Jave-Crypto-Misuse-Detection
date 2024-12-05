package androidx.compose.runtime;

import a6.InterfaceC1669o;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 2)
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final InterfaceC1669o content;

    public MovableContent(InterfaceC1669o interfaceC1669o) {
        this.content = interfaceC1669o;
    }

    public final InterfaceC1669o getContent() {
        return this.content;
    }
}
