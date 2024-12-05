package androidx.compose.runtime;

import X5.o;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 2)
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final o content;

    public MovableContent(o oVar) {
        this.content = oVar;
    }

    public final o getContent() {
        return this.content;
    }
}
