package androidx.compose.foundation.lazy.grid;

import X5.n;
import X5.o;
import X5.p;
import kotlin.jvm.functions.Function1;

@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void a(LazyGridScope lazyGridScope, Object obj, Function1 function1, Object obj2, o oVar, int i8, Object obj3) {
            if (obj3 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                if ((i8 & 2) != 0) {
                    function1 = null;
                }
                if ((i8 & 4) != 0) {
                    obj2 = null;
                }
                lazyGridScope.item(obj, function1, obj2, oVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        public static /* synthetic */ void b(LazyGridScope lazyGridScope, int i8, Function1 function1, n nVar, Function1 function12, p pVar, int i9, Object obj) {
            Function1 function13;
            n nVar2;
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    function13 = null;
                } else {
                    function13 = function1;
                }
                if ((i9 & 4) != 0) {
                    nVar2 = null;
                } else {
                    nVar2 = nVar;
                }
                if ((i9 & 8) != 0) {
                    function12 = LazyGridScope$items$1.INSTANCE;
                }
                lazyGridScope.items(i8, function13, nVar2, function12, pVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
    }

    void item(Object obj, Function1 function1, Object obj2, o oVar);

    void items(int i8, Function1 function1, n nVar, Function1 function12, p pVar);
}
