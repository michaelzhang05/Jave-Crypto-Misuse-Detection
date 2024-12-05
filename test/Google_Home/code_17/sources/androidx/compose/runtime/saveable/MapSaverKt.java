package androidx.compose.runtime.saveable;

import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(InterfaceC1668n interfaceC1668n, Function1 function1) {
        return ListSaverKt.listSaver(new MapSaverKt$mapSaver$1(interfaceC1668n), new MapSaverKt$mapSaver$2(function1));
    }
}
