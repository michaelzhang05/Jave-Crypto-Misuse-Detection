package androidx.compose.runtime.saveable;

import X5.n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(n nVar, Function1 function1) {
        return ListSaverKt.listSaver(new MapSaverKt$mapSaver$1(nVar), new MapSaverKt$mapSaver$2(function1));
    }
}
